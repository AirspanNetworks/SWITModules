package STCImp;

import Entities.ITrafficGenerator;
import Entities.LoadParam;
import Entities.RestException;
import Entities.STCPort;
import Entities.STCStreamBlock;
import Entities.StreamParams;
import Entities.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jsystem.framework.report.ListenerstManager;
import jsystem.framework.report.Reporter;
import jsystem.framework.system.SystemObjectImpl;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Zahi on 09-Nov-16.
 */
public class STCChassis extends SystemObjectImpl implements ITrafficGenerator {

	String RestAPIMachine;
	
	private final String CONNECTION_MANAGEMENT = "%s/connections/%s";
	private final String SESSION_MANAGEMENT = "%s/sessions/%s";
	private final String FILES_MANAGEMENT = "%s/files/%s";
	private final String API_PREFIX = "stcapi";
	private final String APPLY = "%s/apply";
	private final String OBJECTS = "%s/objects/%s";
	private final String PERFORM = "%s/perform";
	private final String arpNdCommand = "ArpNdStart";

	RESTLibrary restClient;
	private String userID = "admin";
	private String chassisHost = "192.168.58.150";
	private String machineName = null;
	private String restMachineIP;
	private String restMachineAlts;
	private ArrayList<String> restMachineIPs;
	private String defultConfigFile;
	private String currentConfigFile;
	private Reporter report = ListenerstManager.getInstance();
	
	String project;
	List<STCPort> ports;

	@Override
	public void init() throws Exception {
		super.init();
		RestAPIMachine = restMachineIP;
		restClient = new RESTLibrary(RestAPIMachine);
		try {
			String jenkinsSlavePrefix = getLocalSlaveJenkinsReference();
			if(!jenkinsSlavePrefix.equals("")){
				jenkinsSlavePrefix = "--"+jenkinsSlavePrefix;
			}
			machineName = InetAddress.getLocalHost().getHostName().toString()+jenkinsSlavePrefix;
		} catch (Exception e) {
			machineName = "defaultSession";
		}
	}

	private String getLocalSlaveJenkinsReference(){
		Utils restUtils = new Utils();
		String result = "";
		try{
			result = restUtils.getTagFromAFile("C:\\jenkins\\jenkins-slave.xml", "<arguments>(.*)</arguments>");
			if(!result.equals("")){
				Pattern pattern = Pattern.compile("computer/(.*)/");
				Matcher matcher = pattern.matcher(result);
				if(matcher.find()){
					String jenkinsSlaveName = matcher.group(1);
					System.out.println("Jenkins Slave Name : "+jenkinsSlaveName);
					return jenkinsSlaveName;
					}else{
						System.out.println("did not found slave name in String returning empty");
						result = "";
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		return result;
	}
	
	
	
	public synchronized String getSessionID() {
		return machineName + " - " + getUserID();
	}

	/**
	 * last modification 02/01/2018
	 * @author sshahaf
	 */
	public void Connect() throws Exception {
		try{
			createSession();
		}catch(RestException restExpResponse){
			switch(restExpResponse.getCode()){
			//Conflict
			case 409:
				recoveryConnection();
				break;
			//internal Server Error
			case 500:
				switchServer(restMachineIPs);	
				break;
			default:		
				exceptionHandle(restExpResponse);
			}
		}
		
		System.out.println("Loading Config file to STC");
		String configFile = getCurrentConfigFile();
		System.out.println("Loading file to stc: "+configFile);
		LoadConfigFile(configFile);
		System.out.println("Done Loading Config file to STC");
		
		System.out.println("trying to reserve ports");
		ReservePorts();
		System.out.println("done to reserve ports");
	}
	
	private boolean createSession() throws Exception{
			BasicNameValuePair[] body = new BasicNameValuePair[2];
			body[0] = new BasicNameValuePair("userid", getUserID());
			body[1] = new BasicNameValuePair("sessionname", machineName);
			List<String> response = restClient.Post(String.format(SESSION_MANAGEMENT, API_PREFIX, ""), 201, null, body);
			return true;
	}

	private void switchServer(ArrayList<String> restMachineIPs) throws Exception {
		report.report("Switching Servers to Alternative");
		boolean creationResult = false;
		if(restMachineIPs.size() < 1){
			report.report("No Alternative IPS! , Failing Process");
		}
		
		for(String ip : restMachineIPs){
			report.report("Trying Alternative Server : "+ip);
			creationResult = tryCreateSession(ip);
			ArrayList<String> restMachineIPsAlts =  (ArrayList<String>) restMachineIPs.clone();
			restMachineIPsAlts.remove(ip);
			this.restMachineIPs = restMachineIPsAlts;
			if(creationResult){
				report.report("Found Alternative Server! : "+ip);
				this.restMachineIP = ip;
				return;
			}
		}
		System.out.println("Did not find Any Alternative Server");
		throw new RuntimeException("All Alternative Servers did not managed to create a Session!");
	}

	private boolean tryCreateSession(String ip) {
		boolean createResult = true;
		restClient.setIP(ip);
		try{
			createSession();
		}catch(Exception e){
			createResult = false;
		}
		return createResult;
	}

	private void exceptionHandle(Exception e) throws Exception{
		e.printStackTrace();
		throw new Exception("unknown initial Connection to chassis " + restMachineIP);
	}

	/**
	 * last modification 02/01/2018
	 * @author sshahaf
	 */
	public void Disconnect() throws Exception {
		ReleasePorts();
		if (restClient == null)
			throw new Exception("Rest client was not initalized, please verify use of connect before disconnect");
		BasicNameValuePair[] body = new BasicNameValuePair[1];
		BasicNameValuePair[] headers = new BasicNameValuePair[1];
		try {
			headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
			restClient.Delete(String.format(SESSION_MANAGEMENT, API_PREFIX, getSessionID().replaceAll(" ", "%20")), 204,
					headers);
			System.out.println("waiting 5 seconds");
			Thread.sleep(5 * 1000);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("could not delete session from chassis server " + restMachineIP);
		}

	}

	public void SubscribeToCounter(CounterUnit counterUnit) throws IOException {
		switch (counterUnit) {
		case BITS_PER_SECOND:
			perform("SubscribeResultsViewCommand", new NameValuePair[] { new BasicNameValuePair("TemplateUri", STCChassis.ECOUNTERS_NAME.AGG_STREAM_BLOCK.getCounter()),
					new BasicNameValuePair("RecordsPerPage", "256") });
			break;
		default:
			break;
		}
		
	}

	//// Current work
	public HashMap<String, HashMap> readCountersForStream(String streamName) throws IOException {
		// checking stream page Number.
		int currentPage = getCurrentPage();
		int streamPageNum = genratePageNumStream(streamName);
		System.out.println(
				"for stream - " + streamName + ": stream PNum = " + streamPageNum + " ,page Num = " + currentPage);
		if (currentPage != streamPageNum) {
			setPage(streamPageNum);
		}

		NameValuePair[] headers = new NameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		// 1. Query the stream object for result objects

		List<String> resultStringToSplit = restClient.Get(String.format(OBJECTS, API_PREFIX, streamName + "?resultchild-Targets"), 200, headers);
		System.out.println("Result child targets: "+resultStringToSplit.toString());
		if(resultStringToSplit == null || resultStringToSplit.isEmpty()){
			System.out.println("Result child targets was null or empty");
			return null;
		}
		String toSplit = resultStringToSplit.get(0).replaceAll("\"", "");
		if (StringUtils.isBlank(toSplit))
			return null;
		String[] listOfresults = toSplit.split(" ");

		HashMap<String, HashMap> results = new HashMap<String, HashMap>();
		// 2. For each of them, getting the result json, and converting it to
		// hash
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {
		};
		for (String jsonResult : listOfresults) {
			String jsonCounters = restClient.Get(String.format(OBJECTS, API_PREFIX, jsonResult), 200, headers).get(0);

			HashMap<String, Object> result = mapper.readValue(jsonCounters, typeRef);
			results.put(jsonResult.replaceAll("[0-9]", ""), result);
		}
		return results;

	}

	/**
	 * setting pageNumber to every dataResult object in Rest.
	 * 
	 * @param streamPageNum
	 */
	private void setPage(int streamPageNum) {
		String resultToSplit = getObjectField("project1", "children-resultdataset");
		String[] resultDataSets = resultToSplit.split(" ");
		for (String dataSet : resultDataSets) {
			dataSet = cleanString(dataSet);
			try {
				SetPutObjectField(dataSet, "pageNumber", String.valueOf(streamPageNum));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			Apply();
		} catch (Exception d) {
			d.printStackTrace();
		}
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param someString
	 * @return clean String without those symbols : " [ ] .
	 */
	private String cleanString(String someString) {
		someString = someString.replaceAll("\"", "");
		someString = someString.replaceAll("\\]", "");
		someString = someString.replaceAll("\\[", "");
		return someString;
	}

	private int genratePageNumStream(String streamName) {
		String withoutLetters = streamName.replaceAll("[^\\d.]", "");
		int num = Integer.valueOf(withoutLetters);
		int resultnum = num / 256;
		// stream 256 is in page 1,stream 512 is in page 2.
		if (num % 256 != 0) {
			resultnum++;
		}
		return resultnum;
	}

	private int getCurrentPage() {
		String dataSets = getObjectField("project1", "children-resultdataset");
		String[] dataSetsList = dataSets.split(" ");
		String dataSetZero = dataSetsList[0];
		dataSetZero = cleanString(dataSetZero);
		String pageNumber = getObjectField(dataSetZero, "pageNumber");
		pageNumber = cleanString(pageNumber);
		return Integer.valueOf(pageNumber);
	}

	/**
	 * Generates a new configuration file as xml and retrieves its content
	 * 
	 * @return
	 * @throws Exception
	 */
	public String generateXmlConfigFile() throws Exception {
		// 1. Run perform command to save the current configuration

		List<String> res = perform("SaveAsXml");
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<HashMap<String, String>> typeRef = new TypeReference<HashMap<String, String>>() {
		};
		HashMap<String, String> jsonRes = mapper.readValue(res.get(0), typeRef);

		// 2. retrieving the file content
		NameValuePair[] headers = new NameValuePair[2];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		headers[1] = new BasicNameValuePair("Accept", "application/octet-stream");

		List<String> res1 = restClient
				.Get(String.format(FILES_MANAGEMENT, API_PREFIX, "Untitled/" + jsonRes.get("FileName")), 200, headers);
		return StringUtils.join(res1);
	}

	public void LoadConfigFile(String file) throws IOException {
		// First, upload file to TCC
		BasicNameValuePair[] headers = new BasicNameValuePair[2];
		headers[0] = new BasicNameValuePair("content-disposition", "attachment; filename=myconfig.tcc");
		headers[1] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		restClient.PostFile(String.format(FILES_MANAGEMENT, API_PREFIX, ""), 201, Files.readAllBytes(Paths.get(file)),
				headers);
		// Now, order STC to load it using command

		NameValuePair[] commandParams = new NameValuePair[1];
		commandParams[0] = new BasicNameValuePair("DatabaseConnectionString", "myconfig.tcc");
		perform(EPERFORM_COMMANDS.LOAD_FROM_DATABASE.getCommand(), commandParams);
		project = getProjectName();
		ports = getPortList();

		Apply();
	}

	public void ReservePorts(String... ports) throws IOException {
		NameValuePair[] commandParams = new NameValuePair[3];
		String portsInString = "";
		if (ports != null && ports.length > 0) {
			for (String port : ports)
				portsInString += port + " ";
		} else {
			for (STCPort port : this.ports)
				portsInString += port.port + " ";
		}
		commandParams[0] = new BasicNameValuePair("portList", portsInString);
		commandParams[1] = new BasicNameValuePair("autoConnect", "TRUE");
		commandParams[2] = new BasicNameValuePair("RevokeOwner", "TRUE");
		perform(EPERFORM_COMMANDS.ATTACH_PORTS.getCommand(), commandParams);
		Apply();
	}

	public void ReleasePorts(String... ports) throws IOException {
		NameValuePair[] commandParams = new NameValuePair[1];
		String portsInString = "";
		if (ports != null && ports.length > 0) {
			for (String port : ports)
				portsInString += port + " ";
		} else {
			if (this.ports == null || this.ports.size() == 0)
				return;
			for (STCPort port : this.ports)
				portsInString += port.port + " ";
		}
		commandParams[0] = new BasicNameValuePair("portList", portsInString);
		perform(EPERFORM_COMMANDS.RELEASE_PORTS.getCommand(), commandParams);
	}

	public void StartTrafficOnAllPorts() throws IOException {

		perform(EPERFORM_COMMANDS.GENERATOR_START.getCommand());

	}

	public String[] GetPortStreams(String port) throws IOException {
		BasicNameValuePair[] headers = new BasicNameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		String resu = restClient.Get(String.format(OBJECTS, API_PREFIX, port + "?children-streamblock"), 200, headers)
				.get(0).replaceAll("\"", "");
		return resu.split(" ");
	}

	public void Apply() throws IOException {
		BasicNameValuePair[] headers = new BasicNameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		restClient.Put(String.format(APPLY, API_PREFIX), 202, headers);
	}

	public void StopTrafficOnAllPorts() throws IOException {
		perform(EPERFORM_COMMANDS.GENERATOR_STOP.getCommand());
	}

	public void SetActiveStreams(STCPort portToChangeStreamStatus, boolean isActive) {
		// We need to separate the active streams from all the rest
		// HashSet<String> changePortStatus = portToChangeStreamStatus.streams;

	}

	public List<STCPort> getAllPorts() {
		return ports;
	}

	/**
	 * gets all sessions must make sure that session is ACTIVE in order to get
	 * sessions.
	 * 
	 * @author Shahaf Shuhamy
	 * @since 18/12/16
	 * @return
	 */
	public List<String> getAllSession() {
		List<String> response = new ArrayList<String>();
		try {
			response = restClient.Get(String.format(SESSION_MANAGEMENT, API_PREFIX, ""), 200, null);
			System.out.println("Sessions List : "+response);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	private String getProjectName() throws IOException {
		NameValuePair[] headers = new NameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		return restClient.Get(String.format(OBJECTS, API_PREFIX, "system1?children-project"), 200, headers).get(0)
				.replaceAll("\"", "");
	}

	private List<STCPort> getPortList() throws IOException {
		NameValuePair[] headers = new NameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		List<STCPort> portsList = new ArrayList<STCPort>();
		String[] portNumbers = restClient
				.Get(String.format(OBJECTS, API_PREFIX, project + "?children-port"), 200, headers).get(0)
				.replaceAll("\"", "").split(" ");

		for (String stringPort : portNumbers) {
			List<String> portRawData = restClient.Get(String.format(OBJECTS, API_PREFIX, stringPort), 200, headers);

			STCPort port = new STCPort();
			port.setRawDataMapObject(portRawData);
			port.port = stringPort;
			String[] streams = GetPortStreams(stringPort);
			port.streams = new ArrayList<STCStreamBlock>();
			for (String stream : streams) {
				String streamAppName = restClient
						.Get(String.format(OBJECTS, API_PREFIX, stream + "?Name"), 200, headers).get(0);
				int page = genratePageNumStream(stream.replaceAll("\"", ""));
				String streamState = restClient
						.Get(String.format(OBJECTS, API_PREFIX, stream + "?Active"), 200, headers).get(0);
				streamState = streamState.toUpperCase();
				boolean streamStateBol = streamState.equals("TRUE") ? true : false;
				port.streams.add(new STCStreamBlock(streamAppName, stream, streamStateBol, page));
			}
			portsList.add(port);
		}
		return portsList;
	}
	
	public void SetObjectField(String objectName, String field, String value) throws IOException {
		NameValuePair[] headers = new NameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		NameValuePair[] body = new NameValuePair[1];
		body[0] = new BasicNameValuePair(field, value);

		restClient.Post(String.format(OBJECTS, API_PREFIX, objectName), 204, headers, body);
	}

	// TODO: check method new useage
	public void SetPutObjectField(String objectName, String field, String value) throws IOException {
		BasicNameValuePair[] headers = new BasicNameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		BasicNameValuePair[] body = new BasicNameValuePair[1];
		body[0] = new BasicNameValuePair(field, value);

		restClient.Put(String.format(OBJECTS, API_PREFIX, objectName), 204, body, headers);
	}

	private List<String> perform(String command, NameValuePair... params) throws IOException {
		NameValuePair[] body = new NameValuePair[1];
		NameValuePair[] headers = new NameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		body[0] = new BasicNameValuePair("command", command);
		if (params != null && params.length > 0)
			body = ArrayUtils.addAll(body, params);
		return restClient.Post(String.format(PERFORM, API_PREFIX), 200, headers, body);
	}

	public void SetAllStreamActiveState(boolean state) throws Exception {
		for (STCPort port : ports) {
			for(STCStreamBlock stream : port.streams){
				setActiveState(stream, state);
			}
		}
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getChassisHost() {
		return chassisHost;
	}

	public void setChassisHost(String chassisHost) {
		this.chassisHost = chassisHost;
	}

	public String getRestMachineIP() {
		return restMachineIP;
	}

	public void setRestMachineIP(String restMachineIP) {
		this.restMachineIP = restMachineIP;
	}
	
	public void setRestMachineAlts(String restMachineAlts){
		System.out.println("rest Machine Alternatives : "+restMachineAlts);
		if(restMachineAlts.contains(",")){
			String[] ips = restMachineAlts.split(",");
			restMachineIPs = new ArrayList<String>(Arrays.asList(ips));
		}else{
			restMachineIPs = new ArrayList<String>();
			restMachineIPs.add(restMachineAlts);
		}
		this.restMachineAlts = restMachineAlts;
	}
	
	public String getRestMachineAlts(){
		return this.restMachineAlts;
	}

	public String getDefultConfigFile() {
		return defultConfigFile;
	}

	public void setDefultConfigFile(String defultConfigFile) {
		this.defultConfigFile = defultConfigFile;
	}

	public String getCurrentConfigFile() {
		if(currentConfigFile == null){
			return defultConfigFile;
		}
		return currentConfigFile;
	}

	public void setCurrentConfigFile(String currentConfigFile) {
		this.currentConfigFile = currentConfigFile;
	}
	
	public static enum EPERFORM_COMMANDS {

		LOAD_FROM_DATABASE("LoadFromDatabaseCommand"), ATTACH_PORTS("attachPorts"), RELEASE_PORTS(
				"detachPorts"), ARP_START_ALL_DEVICES("ArpNdStartOnAllDevicesCommand"), GENERATOR_START(
						"generatorStart"), GENERATOR_STOP(
								"generatorStop"), CLEAR_ALL_RESULTS("ResultClearAllTrafficCommand");

		String command;

		EPERFORM_COMMANDS(String command) {
			this.command = command;
		}

		public String getCommand() {
			return command;
		}
	}

	public static enum ECOUNTERS_NAME {

		AGG_STREAM_BLOCK("Result%20Views%2FStream%20Results%2FDetailed%20Stream%20Results.xml"), BASIC_TRAFFIC(
				"Result%20Views%2FPort%20Traffic%2FBasic%20Traffic%20Results.xml");

		private String fileName;

		ECOUNTERS_NAME(String fileName) {
			this.fileName = fileName;
		}

		public String getCounter() {
			return fileName;
		}
	}

	public STCStreamBlock findStream(String name) {
		List<STCPort> ports = this.getAllPorts();
		for (STCPort port : ports) {
			for (STCStreamBlock itrafficStream : port.streams) {
				if (itrafficStream.getApp_name().equals(name))
					return itrafficStream;
			}
		}
		return null;
	}

	//@Override
	public String getUserId() {
		return this.userID;
	}

	//@Override
	public String getObjectField(String objectName, String field) {
		NameValuePair[] headers = new NameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());

		List<String> ret = null;
		try {
			ret = restClient.Get(String.format(OBJECTS, API_PREFIX, objectName + "?" + field), 200, headers);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (ret != null && ret.size() >= 1)
			return ret.get(0);
		else
			return "";

	}

	//@Override
	public void setSessionName(String name) {
		this.userID = name;
	}

	@Override
	public boolean arpNdStart() throws Exception {
		boolean stateResult = false;
		List<String> arpResponse = perform(arpNdCommand);
		for (String header : arpResponse) {
			String[] headers = header.split(",");
			for (String innerHeader : headers) {
				System.out.println(innerHeader);
				if (innerHeader.contains("SUCCESS")) {
					return true;
				}
			}
		}
		return stateResult;
	}

	/**
	 * @return Basic Info about the Current Session.
	 * @author Shahaf Shuhamy
	 */
	//@Override
	public List<String> getSessionBasicInfo() {
		List<String> result = new ArrayList<String>();
		try {
			result = restClient.Get(getSessionID(), 200, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public Map<String, String> getPortInfo(STCPort port) {
		HashMap<String, String> result = new HashMap<String, String>();
		try {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<HashMap<String, String>> typeRef = new TypeReference<HashMap<String, String>>() {
			};
			String jsonCounters = getObjectField(port.port, "");
			result = mapper.readValue(jsonCounters, typeRef);

			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	//@Override
	public Map<String, Object> getArpInfo(STCPort port) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		Map<String, String> portInfo = new HashMap<String, String>();
		portInfo = getPortInfo(port);

		// extract "children" values from portMap and validation check
		String childrenKey = portInfo.get("children");
		if (childrenKey == null) {
			System.out.println("no children in port info object!");
			return result;
		}

		// looking inside "children" values for arNdReport object
		String[] childrenValues = childrenKey.split(" ");
		String arpStr = "";
		for (String value : childrenValues) {
			if (value.contains("arpndreport")) {
				arpStr = value;
				break;
			}
		}

		if (arpStr.equals("")) {
			System.out.println("No Arp report in port object!");
			return result;
		}

		try {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {
			};
			String jsonCounters = getObjectField(arpStr, "");
			result = mapper.readValue(jsonCounters, typeRef);

			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	//@Override
	public String getSessionName() {
		return getSessionID();
	}

	@Override
	public String getUploadedConfigFile() {
		// get files.

		NameValuePair[] headers = new NameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		BasicNameValuePair[] body = new BasicNameValuePair[1];
		body[0] = new BasicNameValuePair("command", "SaveAsXmlCommand");
		try {
			List<String> response = restClient.Post(String.format(PERFORM, API_PREFIX, ""), 200, headers, body);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		String files = getFilesForSession();
		if (files == null) {
			return null;
		}

		String[] filesArr = files.split(",");
		String fileToDownLoad = null;
		for (String str : filesArr) {
			if (str.contains("SAL_ID-0000000000-myconfig")) {
				fileToDownLoad = cleanString(str);
			}
		}
		if (fileToDownLoad == null) {
			System.out.println("There is no requested File in Files List");
			return null;
		}

		// get request with my file and accept header.
		headers = new NameValuePair[2];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		headers[1] = new BasicNameValuePair("Accept", "application/octet-stream");
		StringBuilder result = new StringBuilder();
		try {
			List<String> fileAsString = restClient.Get(String.format(FILES_MANAGEMENT, API_PREFIX, fileToDownLoad), 200,
					headers);
			for (String file : fileAsString) {
				if (file != null && !(file.isEmpty())) {
					result.append(file);
				}
			}
		} catch (Exception d) {
			d.printStackTrace();
		}

		return result.toString();
	}

	private String getFilesForSession() {
		List<String> filesInSession = new ArrayList<String>();
		String filesInSessionStr = "";
		try {
			NameValuePair[] headers = new NameValuePair[1];
			headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
			filesInSession = restClient.Get(String.format(FILES_MANAGEMENT, API_PREFIX, ""), 200, headers);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		for (String str : filesInSession) {
			if (str != null && !(str.isEmpty())) {
				filesInSessionStr = str;
			}
			System.out.println("files in session : " + str);
		}

		if (filesInSessionStr.equals("")) {
			System.out.println("there are no files in session!");
			return null;
		}
		return filesInSessionStr;

	}
	
	@Override
	public boolean configPortLoad(double dl, double ul) {
		boolean flagDL = configPortLoadDL(dl);
		boolean flagUL = configPortLoadUL(ul);

		if(flagDL && flagUL)
			return true;
		else
			return false;
	}
	
	//@Override
	public boolean configPortLoadDL(double dl) {
		try {
			for (STCPort portName : ports) {
				String portLogicName = portName.getPortName();
				if (portLogicName == null) {
					return false;
				}
				if (portLogicName.equals("DL")) {
					portLoadSequence(dl, portName.getName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error in configPortLoadDL method!@!@#!");
			return false;
		}
		return true;
	}
	
	//@Override
	public boolean configPortLoadUL(double ul) {
		try {
			for (STCPort portName : ports) {
				String portLogicName = portName.getPortName();
				if (portLogicName == null) {
					return false;
				}
				if (portLogicName.equals("UL")) {
					portLoadSequence(ul, portName.getName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error in configPortLoadUL method!@!@#!");
			return false;
		}
		return true;
	}

	private boolean portLoadSequence(double portLoadTraffic, String portName) {
		List<String> generators = new ArrayList<String>();
		List<String> genConfigs = new ArrayList<String>();
		try {
			generators = getGeneratorForPort(portName);
			String gen = generators.get(0).replaceAll("\"", "");

			genConfigs = getGeneratorConfig(gen);
			String genConf = genConfigs.get(0).replaceAll("\"", "");

			SetPutObjectField(genConf, "SchedulingMode", "0");
			SetPutObjectField(genConf, "LoadUnit", "KILOBITS_PER_SECOND");
			SetPutObjectField(genConf, "FixedLoad", String.valueOf(portLoadTraffic));
			Apply();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("portLoadSequence had an error in inner method.");
			return false;
		}
		return true;
	}

	private List<String> getGeneratorForPort(String portName) {
		List<String> generators = new ArrayList<String>();
		try {
			NameValuePair[] headers = new NameValuePair[1];
			headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
			generators = restClient.Get(String.format(OBJECTS, API_PREFIX, portName + "?children-generator"), 200,
					headers);
		} catch (Exception e) {
			System.out.println("Error in getGeneratorForPort method");
			e.printStackTrace();
		}
		return generators;
	}

	private List<String> getGeneratorConfig(String genName) {
		List<String> configs = new ArrayList<String>();
		try {
			NameValuePair[] headers = new NameValuePair[1];
			headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
			configs = restClient.Get(String.format(OBJECTS, API_PREFIX, genName + "?children-generatorconfig"), 200,
					headers);
		} catch (Exception e) {
			System.out.println("Error in getGeneratorConfig method");
			e.printStackTrace();
		}
		return configs;
	}

	public boolean clearStreamsResults() {
		BasicNameValuePair[] headers = new BasicNameValuePair[1];
		headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
		try {
			perform(EPERFORM_COMMANDS.CLEAR_ALL_RESULTS.getCommand());
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private List<String> getStreamBlockProfile(String blockName) {
		List<String> configs = new ArrayList<String>();
		try {
			NameValuePair[] headers = new NameValuePair[1];
			headers[0] = new BasicNameValuePair("X-STC-API-Session", getSessionID());
			configs = restClient.Get(String.format(OBJECTS, API_PREFIX, blockName + "?affiliationstreamblockloadprofile-Targets"), 200,
					headers);
		} catch (Exception e) {
			System.out.println("Error in getGeneratorConfig method");
			e.printStackTrace();
		}
		return configs;
	}

	//@Override
	public void setLoadStreamPerStream(String blockName, String load, LoadParam.LoadUnit unit) {
		List<String> streamBlock = getStreamBlockProfile(blockName);
		String block = streamBlock.get(0).replaceAll("\"", "");
		
		try {
			SetPutObjectField(block, "LoadUnit", String.valueOf(unit.ordinal()));
			SetPutObjectField(block, "Load", load);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("setLoadStream had an error in inner method.");
		}
	}
	
	@Override
	public void setLoadStreamDLPort(ArrayList<LoadParam> load){
		configStreamBasedDLPort();
		setLoadStreamPerStream(TransmitDirection.DL,load);
	}

	@Override
	public void setLoadStreamULPort(ArrayList<LoadParam> load){
		configStreamBasedULPort();
		setLoadStreamPerStream(TransmitDirection.UL,load);
	}
	
	private void setLoadStreamPerStream(TransmitDirection td, ArrayList<LoadParam> load){
		List<STCPort> portsInstance = new ArrayList(ports);
		for (STCPort port : portsInstance) {
			String portLogicName = port.getPortName();
			if (portLogicName == null) {
				return;
			}
			if ((td.value).contains(portLogicName)) {
				for(STCStreamBlock stream : port.streams){
					int a = getIndexUE(stream.getApp_name(),load);
					if(a!=-1){
						setLoadStreamPerStream(stream.getBlockName(),String.valueOf(load.get(a).getLoad()),load.get(a).getUnit());												
					}
				}
			}
		}
		try {
			Apply();
		} catch (IOException e) {
			e.printStackTrace();
			report.report("setLoadStreamPerPort had an error in inner method.");
		}
	}
	
	@Override
	public void setFrameSizeStreamDLPort(ArrayList<LoadParam> load) throws IOException{
		configStreamBasedDLPort();
		setFrameSizePerStream(TransmitDirection.DL,load);
	}

	@Override
	public void setFrameSizeStreamULPort(ArrayList<LoadParam> load) throws IOException{
		configStreamBasedULPort();
		setFrameSizePerStream(TransmitDirection.UL,load);
	}
	
	private void setFrameSizePerStream(TransmitDirection td, ArrayList<LoadParam> load) throws IOException{
		List<STCPort> portsInstance = new ArrayList(ports);
		for (STCPort port : portsInstance) {
			String portLogicName = port.getPortName();
			if (portLogicName == null) {
				return;
			}
			if ((td.value).contains(portLogicName)) {
				for(STCStreamBlock stream : port.streams){
					int a = getIndexUE(stream.getApp_name(),load);
					if(a!=-1){
						setFrameSize(stream,load.get(a).getFrameSize());
					}
				}
			}
		}
		try {
			Apply();
		} catch (IOException e) {
			e.printStackTrace();
			report.report("setLoadStreamPerPort had an error in inner method.");
		}
	}
	
	 private int getIndexUE(String appName, ArrayList<LoadParam> load){
	    	for(int i=0;i<load.size();i++){
	    		String temp = appName.replaceAll("\\D+", "").trim();
	    		LoadParam lp = load.get(i);
	    		String toComp = String.valueOf(lp.getUEnum())+lp.getQci();
	    		if(temp.equals(toComp)){
	    			return i;
	    		}
	    	}
	    	return -1;
	    }
	
	private void configStreamBasedDLPort(){
		configStreamBased("DL");
	}
	
	private void configStreamBasedULPort(){
		configStreamBased("UL");
	}
	
	private void configStreamBased(String dl_ul){
		for (STCPort portName : ports) {
			String portLogicName = portName.getPortName();
			if (portLogicName == null) {
				return;
			}
			if (portLogicName.equals(dl_ul)) {
				configureStreamBasedForPort(portName.getName());
			}
		}
	}
	
	private boolean configureStreamBasedForPort(String portName) {
		List<String> generators = new ArrayList<String>();
		List<String> genConfigs = new ArrayList<String>();
		try {
			generators = getGeneratorForPort(portName);
			String gen = generators.get(0).replaceAll("\"", "");

			genConfigs = getGeneratorConfig(gen);
			String genConf = genConfigs.get(0).replaceAll("\"", "");

			SetPutObjectField(genConf, "SchedulingMode", "1");
			//Apply();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("configureLoadPerStream had an error in inner method.");
			return false;
		}
		return true;
	}
	
	public ArrayList<ArrayList<String>> disableStreamsByUeNameQciAndPortDirectionAndEnableTheRest(ArrayList<String> ueNamesNotAllowdInTest,
			ArrayList<Character> qciListNotAllowdInTest, 
			TransmitDirection transmitDirection){
		return setStreamsState(ueNamesNotAllowdInTest, qciListNotAllowdInTest, transmitDirection, false);
	}
	
	public ArrayList<ArrayList<String>> enableStreamsByUeNameQciAndPortDirectionAndDisableTheRest(ArrayList<String> ueNamesAllowdInTest,
			ArrayList<Character> qciListAllowdInTest, 
			TransmitDirection transmitDirection){
		return setStreamsState(ueNamesAllowdInTest, qciListAllowdInTest, transmitDirection, true);
	}
	
	private ArrayList<ArrayList<String>> setStreamsState(ArrayList<String> ueNameList,
			ArrayList<Character> qciList, 
			TransmitDirection transmitDirection,
			boolean state){
		ArrayList<String> notStateStreamList = new ArrayList<String>();
		ArrayList<String> stateStreamList = new ArrayList<String>();
		
		report.report("Disabling Un-needed UEs and QCIs");
		
		for(STCPort port : getAllPorts()){
			for(STCStreamBlock stream : port.streams){
				//transmit direction from stram
				String transmitDirectionFromSTC = stream.getApp_name().substring(0,2);
				//qci from stram
				char qciFromSTC = stream.getApp_name().charAt(stream.getApp_name().length() - 1); 
				//UE name form STC (UE_)
				String ueNameFromSTC = stream.getApp_name().substring(3,stream.getApp_name().length()-1);
				//check if the stream's Transmit Direction is NOT in transmitDirection 
				if(!transmitDirection.value.contains(transmitDirectionFromSTC)){
					notStateStreamList.add(stream.getApp_name());
					System.out.println("Stream: "+stream.getApp_name()+" isActive set to "+!state+" for transmit direction");
					setActiveState(stream, !state);
				}//check if the QCI is NOT in QCI list
				else if(!qciList.contains(qciFromSTC)){
					notStateStreamList.add(stream.getApp_name());
					System.out.println("Stream : "+stream.getApp_name()+" isActive set to "+!state+" for QCI");
					setActiveState(stream, !state);
				}//check if UE Name is NOT in Test UE Name List
				else if(!ueNameList.contains(ueNameFromSTC)){
					notStateStreamList.add(stream.getApp_name());
					System.out.println("Stream : "+stream.getApp_name()+" isActive set to "+!state+" for UE");
					setActiveState(stream, !state);
				}else{
					stateStreamList.add(stream.getApp_name());
					System.out.println("Stream : "+stream.getApp_name()+" isActive set to "+state);
					setActiveState(stream, state);
				}
			}
		}
		try{
			Apply();
		}catch(Exception e){
			e.printStackTrace();
		}
		ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
		if(state){
			temp.add(stateStreamList);
			temp.add(notStateStreamList);
		}else{
			temp.add(notStateStreamList);
			temp.add(stateStreamList);
		}
		return temp;
	}
	
	public ArrayList<String> enableStreamsByUeNameQciAndPortDirection(ArrayList<String> ueNamesAllowdInTest,
			ArrayList<Character> qciListAllowdInTest, 
			TransmitDirection transmitDirection){
		return setStreamsStateWithoutChangingOtherStreams(ueNamesAllowdInTest, qciListAllowdInTest, transmitDirection, true);
	}
	
	private ArrayList<String> setStreamsStateWithoutChangingOtherStreams(ArrayList<String> ueNameList,
			ArrayList<Character> qciList, 
			TransmitDirection transmitDirection,
			boolean state){
		
		report.report((state?"Enabling ":"Disabling ")+"wanted UEs and QCIs");
		ArrayList<String> streamsListChanged = new ArrayList<String>();
		
		for(STCPort port : getAllPorts()){
			for(STCStreamBlock stream : port.streams){
				//transmit direction from stram
				String transmitDirectionFromSTC = stream.getApp_name().substring(0,2);
				//qci from stram
				char qciFromSTC = stream.getApp_name().charAt(stream.getApp_name().length() - 1); 
				//UE name form STC (UE_)
				String ueNameFromSTC = stream.getApp_name().substring(3,stream.getApp_name().length()-1);
				if(transmitDirection.value.contains(transmitDirectionFromSTC) && qciList.contains(qciFromSTC) && ueNameList.contains(ueNameFromSTC)){
					System.out.println("Stream : "+stream.getApp_name()+" isActive set to "+state);
					setActiveState(stream, state);
					streamsListChanged.add(stream.getApp_name());
				}
			}
		}
		try{
			Apply();
		}catch(Exception e){
			e.printStackTrace();
		}
		return streamsListChanged;
	}
	
	
	private void setActiveState(STCStreamBlock stream, boolean state) {
		stream.setActiveState(state);
		try {
			SetPutObjectField(stream.getBlockName(), "Active", String.valueOf(state));
		} catch (IOException e) {
			report.report("FAILED to activate stream" + stream.getApp_name(), Reporter.WARNING);
			e.printStackTrace();
		}
	}
	
	private boolean checkIfStreamNeedToBeActive(String name, ArrayList<String> ueNameListStc){
		// check find the stream in the streams list and check if its Forbidden
		// ueName = "UEXX"
		for (String ueName : ueNameListStc) {
			if(name.equals(ueName)){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isConnected() {
		List<String> sessions = getAllSession();
		sessions = selectAllSessionsWithTheExactName(sessions);
		if(sessions.size() < 1){
			return false;
		}
		return true;
	}

	@Override
	public void readAllCounters(){
		try{
		for (STCPort port : ports) {
			for(STCStreamBlock stream : port.streams){
				System.out.println("Reading counters for stream "+stream.getApp_name()+"("+stream.getBlockName()+")");
				HashMap<String, HashMap> resultSet = readCountersForStream(stream.getBlockName());
				if (resultSet == null){
					resultSet = readCountersForStream(stream.getBlockName());
				}
				stream.setResultSet(resultSet);
			}
		}
		}catch(Exception e){
			report.report("FAILED to read counters.", Reporter.WARNING);
			e.printStackTrace();
		}
	}

	@Override
	public void printArpInfo() {
		for(STCPort port : ports){
			try{
				Map<String,Object> arpInfo = getArpInfo(port);
				
				for(String key : arpInfo.keySet()){
					report.report(key+": "+arpInfo.get(key));
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public void setFrameSize(Integer frameSize) throws IOException {
		for(STCPort port : ports){
			for(STCStreamBlock stream : port.streams){
				setFrameSize(stream, frameSize);
			}
		}
	}

	private void setFrameSize(STCStreamBlock stream, int frameSize) throws IOException{
		SetPutObjectField(stream.getBlockName(), "FixedFrameLength", String.valueOf(frameSize));
		stream.setFrameSize(frameSize);
	}
	
	@Override
	public ArrayList<ArrayList<StreamParams>> getActiveStreamCurrentSample(ArrayList<CounterUnit> counterUnitList, TransmitDirection transmitDirection) {
		ArrayList<StreamParams> streamParamsArray = new ArrayList<StreamParams>();
		for(STCPort port : ports){
			String portLogicName = port.getPortName();
			if((transmitDirection == TransmitDirection.BOTH) || (portLogicName != null && portLogicName.equals(transmitDirection.value))){
				for(STCStreamBlock stream : port.streams){
					if (stream != null && stream.isActive()) {
						HashMap<String, Object> resultSet = stream.getResultSet();
						HashMap<String, Object> txstreamresults = (HashMap<String, Object>) resultSet.get("txstreamresults");
						HashMap<String, Object>	rxstreamsummaryresults = (HashMap<String, Object>) resultSet.get("rxstreamsummaryresults");
						for(CounterUnit counterUnit : counterUnitList){
							long txStreamCounter = -1;
							if(txstreamresults.get(counterUnit.value)!=null){
								txStreamCounter = Long.valueOf(txstreamresults.get(counterUnit.value).toString());								
							}
							
							long rxStreamCounter = -1;
							double rxStreamCounterDouble = -1;
							if(rxstreamsummaryresults.get(counterUnit.value)!=null){
								Classifiers classifiedType = classifyCounterType(counterUnit);
								if(classifiedType==Classifiers.DOUBLE){
									try{
										rxStreamCounterDouble = Double.valueOf(rxstreamsummaryresults.get(counterUnit.value).toString());										
									}catch(Exception e){
										e.printStackTrace();
										System.out.println("For stream: "+stream.getApp_name()+", counter: "+counterUnit.value+
												", the value was: "+rxstreamsummaryresults.get(counterUnit.value).toString());
										rxStreamCounterDouble = 0;
									}
								}else{
									try{
										rxStreamCounter = Long.valueOf(rxstreamsummaryresults.get(counterUnit.value).toString());																											
									}catch(Exception e){
										e.printStackTrace();
										System.out.println("For stream: "+stream.getApp_name()+", counter: "+counterUnit.value+
												", the value was: "+rxstreamsummaryresults.get(counterUnit.value).toString());
										rxStreamCounter = 0;
									}
								}
							}
							StreamParams tempParams = new StreamParams();
							tempParams.setName(stream.getApp_name());
							tempParams.setTimeStamp(System.currentTimeMillis());
							tempParams.setActive(true);
							tempParams.setUnit(counterUnit);
							tempParams.setRxRate(rxStreamCounter);
							tempParams.setTxRate(txStreamCounter);
							tempParams.setRxRateDouble(rxStreamCounterDouble);
							tempParams.setPacketSize(stream.getFrameSize());
							streamParamsArray.add(tempParams);
						}
					}
				}
			}
		}
		ArrayList<ArrayList<StreamParams>> sampleArrayList = new ArrayList<ArrayList<StreamParams>>();
		sampleArrayList.add(streamParamsArray);
		return sampleArrayList;
	}

	private Classifiers classifyCounterType(CounterUnit counter){
		switch(counter){
			case DROPPED_FRAME_PERCENT:
			case DROPPED_FRAME_PERCENT_RATE:
			case SHORT_TERM_AVG_LATENCY:
			case SHORT_TERM_AVG_JITTER:
			case RFC_4689_ABSOLUTE_AVG_JITTER:
			case AVG_JITTER:
				return Classifiers.DOUBLE;
			default:
				return Classifiers.LONG;
		}
	}
	
	private enum Classifiers{
		DOUBLE,LONG;
	}
	
	@Override
	public void setActiveState(ArrayList<StreamParams> streamParams, boolean state) {
		for (STCPort port : ports) {
			for (STCStreamBlock stream : port.streams) {
				for (StreamParams streamParam : streamParams) {
					if (stream.getApp_name().equals(streamParam.getName())) {
						setActiveState(stream, state);
						report.report("stream :" + streamParam.getName() + "'s Active State has been set to " + state,Reporter.WARNING);
					}
				}
			}
		}
	}
	
	public void recoveryConnection() {
		report.report("Could not connect to REST session with current Session Name -  Recovery!");
		String currentSessionName = /*trafficGenerator.*/getUserId();
		System.out.println("!REST API Debug Start!");
		System.out.println("current Session Name: "+currentSessionName);
		
		//try and get session info - in case we get 409 = no connection
		//no connetion - try connect
		boolean sessionState = false;
		try{
			sessionState = checkFieldInSessionTest("TestSessionState");
			System.out.println(getAllSession());
		}catch(Exception e){
			System.out.println("Exception in getting sessionState");
		}
		
		if(currentSessionName.contains("_2")){
			System.out.println("there are already at least 2 sessions open");
			return;
		}
		
		if(currentSessionName.contains("_1")){
			currentSessionName = removeLast2CharactersPrefix(currentSessionName);
			if(connectAltSession(currentSessionName+"_2")){
				report.report("created Session with the _2 prefix");
			}
			return;
		}
		
		if(currentSessionName.equals("admin")){
			if(connectAltSession(currentSessionName+"_1")){
				report.report("created Session with the _1 prefix");
			}
			return;
		}
		System.out.println("!REST API Debug End!");
	}
	
	private String removeLast2CharactersPrefix(String currentSessionName) {
		String result = currentSessionName.substring(0,currentSessionName.length()-2);
		return result;
	}

	private boolean checkFieldInSessionTest(String ...strings ) {
		List<String> result = getSessionBasicInfo();
		for(String field : strings){
			for(String string : result){
				String[] resultArr = string.split(",");
				for(String arrStr : resultArr){
					if(arrStr.contains(field)){
						System.out.println("found interesting String: " +arrStr);
						arrStr = arrStr.toUpperCase();
					
						if(arrStr.contains("UNKNOWN_ERROR")){
							System.out.println("Unknown Error in Session Info!!");
							return false;
						}else{
							System.out.println("Test Session State is: "+arrStr);
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	private boolean connectAltSession(String sessionId){
		String newSessionName = sessionId;
		setSessionName(newSessionName);
		try{
			System.out.println("trying to connect session with the sufix of : "+newSessionName);
			createSession();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean setProtocol(Protocol protocol) {
		if(protocol == Protocol.TCP){
			report.report("Rest STC NOT supporting TCP", Reporter.FAIL);
			return false;
		}
		return true;
	}

	@Override
	public ArrayList<File> getResultFiles() {
		System.out.println("Rest STC doesn't use TP result files.");
		ArrayList<File> resultFiles = new ArrayList<File>();
		return resultFiles;
	}

	@Override
	public boolean closeAllConnections() {
		List<String> sessions = getAllSession();
		List<String> sessionsWithPcName = selectAllSessionsWithTheSameMachineName(sessions);
		for(String sessionName : sessionsWithPcName){
			try{
				disconnectWithCustomSession(sessionName);
			}catch(SocketTimeoutException d){
				System.out.println("Socket timeout exception while trying close All Connections");
				return false;
			}
			catch(Exception e){
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	private List<String> selectAllSessionsWithTheExactName(List<String> sessions) {
		List<String> result = new ArrayList<>();
		String[] sessionsList;
		if(sessions.get(0) != null){
				sessionsList = sessions.get(0).split(",");
			for(String sessionName : sessionsList){
				sessionName = sessionName.replaceAll("^[a-zA-Z0-9_-]", "");
				sessionName = sessionName.replaceAll("\\]","");
				sessionName = sessionName.replaceAll("\\[","");
				sessionName = sessionName.replaceAll("\"","");
				System.out.println("session from List : "+sessionName +" is Equals to : "+machineName+" - "+getUserId());
				if(sessionName.equals(machineName+" - "+getUserId())){
					System.out.println("found session : "+sessionName);
					result.add(sessionName);
				}
			}
		}
		return result;
	}
	
	private List<String> selectAllSessionsWithTheSameMachineName(List<String> sessions) {
		List<String> result = new ArrayList<>();
		String[] sessionsList;
		if(sessions.get(0) != null){
				sessionsList = sessions.get(0).split(",");
			for(String sessionName : sessionsList){
				sessionName = sessionName.replaceAll("^[a-zA-Z0-9_\\-]", "");
				sessionName = sessionName.replaceAll("\\]","");
				sessionName = sessionName.replaceAll("\\[","");
				sessionName = sessionName.replaceAll("\"","");
				System.out.println("session from List : "+sessionName +" is Equals to : "+machineName+" - "+getUserId());
				if(sessionName.contains(machineName+" - ")){
					System.out.println("found session : "+sessionName);
					result.add(sessionName);
				}
			}
		}
		return result;
	}

	private void disconnectWithCustomSession(String sessionName) throws Exception {
		String[] sessionNameAndUserId = sessionName.split(" - ");
		String sessionNameClear = sessionNameAndUserId[0].replaceAll("\\]","");
		sessionNameClear = sessionNameClear.replaceAll("\\[","");
		sessionNameClear = sessionNameClear.replaceAll("\"", "");
		
		String clearSession = sessionName.replaceAll("\\]","");
		clearSession = clearSession.replaceAll("\\[","");
		clearSession = clearSession.replaceAll("\"","");
		
//		ReleasePorts();
		if (restClient == null)
			throw new Exception("Rest client was not initalized, please verify use of connect before disconnect");
		BasicNameValuePair[] body = new BasicNameValuePair[1];
		BasicNameValuePair[] headers = new BasicNameValuePair[1];
		try {
			headers[0] = new BasicNameValuePair("X-STC-API-Session", sessionNameClear);
			restClient.Delete(String.format(SESSION_MANAGEMENT, API_PREFIX, clearSession.replaceAll(" ", "%20")), 204,
					headers);
			System.out.println("waiting 5 seconds");
			Thread.sleep(5 * 1000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("could not delete session from chassis server " + restMachineIP);
		}

	}

	@Override
	public String setConfigFileWithHOPrefix(String TrafficFile) {
		int lastDot = TrafficFile.lastIndexOf('.');
		String HOTrafficFile = TrafficFile.substring(0, lastDot) + "_HO" + TrafficFile.substring(lastDot);
		setCurrentConfigFile(HOTrafficFile);
		return HOTrafficFile;
	}

	@Override
	public boolean enableExtraCounter(CounterUnit counterUnit) {
		switch(counterUnit){
			case RFC_4689_ABSOLUTE_AVG_JITTER:
				return enableLatencyJitter();
			default:
				return false;
		}
	}
	
	private boolean enableLatencyJitter(){
		String resultToSplit = getObjectField("project1", "children-resultoptions");
		String[] temp = resultToSplit.split(" ");
		boolean result = true;
		for(String str : temp){
			try {
				SetPutObjectField(str.replaceAll("\"", ""), "ResultViewMode", "LATENCY_JITTER");
				String resultViewMode = getObjectField(str.replaceAll("\"", ""), "ResultViewMode");
				System.out.println("Result option for "+str+": "+resultViewMode);
				if(!resultViewMode.contains("LATENCY_JITTER")){
					result = false;
				}
			} catch (IOException e) {
				e.printStackTrace();
				result = false;
			}
		}
		return result;
	}

	@Override
	public void takeActionAfterFoundHaltStream() {
		System.out.println("Unimplemented method: takeActionAfterFoundHaltStream");
	}

	@Override
	public ArrayList<File> getTransmitOutputFiles() {
		System.out.println("Rest STC doesn't use Transmit Output Files.");
		ArrayList<File> transmitOutputFiles = new ArrayList<File>();
		return transmitOutputFiles;
	}

	@Override
	public void setNumberParallelStreams(Integer numberParallel) {
		System.out.println("Function \'setNumberParallelStreams\' not implemented in STCChassis");
	}

	@Override
	public void setWindowSizeInKbs(Double windowSizeInKbs) {
		System.out.println("Function \'setWindowSizeInKbs\' not implemented in STCChassis");
	}
}