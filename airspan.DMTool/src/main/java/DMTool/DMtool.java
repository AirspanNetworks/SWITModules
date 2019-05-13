package DMTool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.python.modules.re;

import DMTool.Events.EventListener;
import DMTool.Measurement.MeasurementCfg;
import DMTool.Measurement.MeasurementCfgObject;
import DMTool.Measurement.MeasurementCfgReport;
import DMTool.Measurement.TriggerEvents;
import DMTool.UeClientImpl.UeClientImpl;
import jsystem.framework.report.Reporter;
import jsystem.framework.system.SystemObjectImpl;

public class DMtool extends SystemObjectImpl {
	
	
	private boolean initialize = false;
	private boolean started = false;
	private DccStdOut out;
	private DeviceController dc;
	private UeClientImpl uec;
	private DbgClient dbg;
	private EvtClient evc;
	private Evt evt;
	private int PORT = 7772;
	private String ueIP;

	@Override
	public void init() throws Exception {
		if (ueIP == null) {
			throw new Exception("ueIP==null");
		}
		init(5000);
	}

	public void init(int waitTime) {
		try {
			super.init();
			DccInitConfig dccinit = new DccInitConfig();
			out = new DccStdOut();
			dccinit.serverIp = ueIP;
			dccinit.serverPort = PORT;
			dccinit.consoleOutput = out;
			uec = new UeClientImpl();
			dc = new DeviceController(dccinit, true, this);
			evt = new Evt();
			evt.EvtInitialize(evc);
			Ue.UeInitialize(uec);
			Dbg.DbgInitialize(dbg);
			dc.startDc();
			Thread.sleep(waitTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
		initialize = true;
		started = true;
	}

	public void enableEvents(int[] eventIndexes) {
		evt.SetEnable(eventIndexes, true);
	}
	
	public void disableEvents() {
		evt.DisableAll();
	}

	private synchronized void reconnect() {
		if (started && initialize) {
			return;
		} else if (!started) {
			init(5000);
		} else {
			System.out.println(String.format("Reconnecting DM to %s", ueIP));
			close();
			init(500);
			System.out.println(String.format("Finished reconnecting DM to %s", ueIP));
		}
	}

	private synchronized void forcedReconnect() {
		System.out.println(String.format("Reconnecting DM to %s", ueIP));
		close();
		init(500);
		System.out.println(String.format("Finished reconnecting DM to %s", ueIP));
	}

	public boolean isInitialize() {
		return initialize;
	}

	public void setInitialize(boolean initialize) {
		this.initialize = initialize;
	}

	public sqnCellReselectionInfo getSibStatus() {
		reconnect();
		OutValue<sqnCellReselectionInfo> info = new OutValue<sqnCellReselectionInfo>(new sqnCellReselectionInfo());
		agscUeImpl.GetCellReselectionInfo(info);
		return info._value;
	}

	public sqnCellMeasReport getMeas() throws Exception { // showMeas
		reconnect();
		sqnCellMeasReport tmpSqnCellMeasReport = uec.getSqnCellMeasReportValue();
		for (int i = 1; i <= 3; i++) {
			if (tmpSqnCellMeasReport != null) {
				break;
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				report.report("Failed Thread.sleep DMtool getMeas", Reporter.WARNING);
				e.printStackTrace();
			}
			tmpSqnCellMeasReport = uec.getSqnCellMeasReportValue();
		}
		if (tmpSqnCellMeasReport == null) {
			tmpSqnCellMeasReport = new sqnCellMeasReport();
		}
		return tmpSqnCellMeasReport;
	}

	public String cli(String command) throws Exception {
		reconnect();
		OutValue<Integer> status = new OutValue<Integer>(0);
		OutValue<String> result = new OutValue<String>();
		agscDbgImpl.Cli(command, status, result);
		return result._value;
	}

	public void addEventListener(EventListener lis) {
		evc = lis;
		evt.EvtInitialize(evc);
	}

	private HashMap<String, String> getSibViaCli(int sibNumber) throws Exception {
		reconnect();
		HashMap<String, String> sibMap = new HashMap<>();
		String sibStr = null;
		sibStr = cli("showSiConfig");
		sibStr = sibStr.substring(sibStr.indexOf("= SIB " + sibNumber + " ="));
		sibStr = sibStr.substring(sibStr.indexOf("\n"));
		sibStr = sibStr.substring(1, sibStr.indexOf("==="));
		String[] sibStrParmas = sibStr.split("\n");
		for (String line : sibStrParmas) {
			String[] lineParams = line.split(":");
			if (lineParams.length == 1) {
				continue;
			}
			sibMap.put(lineParams[0].trim(), lineParams[1].trim());
		}
		return sibMap;
	}

	public Sib2 getSib2() {
		reconnect();
		HashMap<String, String> sib2Map;
		try {
			sib2Map = getSibViaCli(2);
			Sib2 sib2 = new Sib2(sib2Map);
			return sib2;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public class Sib2 {
		public String acBarringForEmergency;
		public String acBarringForMoSignal;
		public String acBarringForMoData;
		public String nbOfRaPreambles;
		public String sizeOfRaPreamblesGroupA;
		public String msgSizeGroupA;
		public String stepDb;
		public String preambleInitRcvPower;
		public String preambleTxMaxQty;
		public String RaRspWindowSize;
		public String macContResTimer;
		public String harqMsg3TxMaxQty;
		public String modifPeriodCoeff;
		public String dftPagingCycle;
		public String nB;
		public String rootSequenceIndex;
		public String prachConfigIndex;
		public String highSpeedFlag;
		public String zeroCorrelationZoneConfig;
		public String prachFreqOffset;
		public String refSignalPower;
		public String p_B;
		public String nSB;
		public String hoppingMode;
		public String hoppingOffset;
		public String _64QamEnabled;
		public String groupHoppingEnabled;
		public String groupAssignment;
		public String sequenceHoppingEnabled;
		public String cyclicShift;
		public String deltaShift;
		public String nRB_CQI;
		public String nCS_AN;
		public String nlPUCCH_AN;
		public String p0_NominalPUSCH;
		public String alpha_x10;
		public String p0_NominalPUCCH;
		public String delta_PUCCH_Format1;
		public String delta_PUCCH_Format1b;
		public String delta_PUCCH_Format2;
		public String delta_PUCCH_Format2a;
		public String delta_PUCCH_Format2b;
		public String deltaPreambleMsg3;
		public String ulCyclicPrefixLength;
		public String srs_Bandwidth;
		public String srs_Subframe;
		public String ackNackSRS_SimultaneousTransmis;
		public String srs_MaxUpPts;
		public String t300;
		public String t301;
		public String t310;
		public String t311;
		public String n310;
		public String n311;
		public String ul_CarrierFreq;
		public String ul_Bandwidth;
		public String additionalSpectrumEm;

		Sib2(HashMap<String, String> sib2Map) {
			acBarringForEmergency = sib2Map.get(".ac-Barring for emergency");
			acBarringForMoSignal = sib2Map.get(".ac-Barring for MO signal");
			acBarringForMoData = sib2Map.get(".ac-Barring for MO data");
			nbOfRaPreambles = sib2Map.get(".nb of RA preambles");
			sizeOfRaPreamblesGroupA = sib2Map.get(".size of RA preambles group A");
			msgSizeGroupA = sib2Map.get(".msg size group A");
			stepDb = sib2Map.get(".step(dB)");
			preambleInitRcvPower = sib2Map.get(".preamble init rcv power");
			preambleTxMaxQty = sib2Map.get(".preamble tx max qty");
			RaRspWindowSize = sib2Map.get(".RA rsp window size");
			macContResTimer = sib2Map.get(".mac cont. res. timer");
			harqMsg3TxMaxQty = sib2Map.get("HARQ msg3 tx max qty");
			modifPeriodCoeff = sib2Map.get(".modif period coeff");
			dftPagingCycle = sib2Map.get(".dft paging cycle");
			nB = sib2Map.get(".nB");
			rootSequenceIndex = sib2Map.get(".root sequence index");
			prachConfigIndex = sib2Map.get(".prach config index");
			highSpeedFlag = sib2Map.get(".high speed flag");
			zeroCorrelationZoneConfig = sib2Map.get(".zero correlation zone config");
			prachFreqOffset = sib2Map.get(".prach freq offset");
			refSignalPower = sib2Map.get(".ref. signal power");
			p_B = sib2Map.get(".p_B");
			nSB = sib2Map.get(".n-SB");
			hoppingMode = sib2Map.get(".hopping mode");
			hoppingOffset = sib2Map.get(".hopping offset");
			_64QamEnabled = sib2Map.get(".64QAM enabled");
			groupHoppingEnabled = sib2Map.get(".group hopping enabled");
			groupAssignment = sib2Map.get(".group assignment");
			sequenceHoppingEnabled = sib2Map.get(".sequence hopping enabled");
			cyclicShift = sib2Map.get(".cyclic shift");
			deltaShift = sib2Map.get(".delta shift");
			nRB_CQI = sib2Map.get(".nRB-CQI");
			nCS_AN = sib2Map.get(".nCS-AN");
			nlPUCCH_AN = sib2Map.get(".nlPUCCH-AN");
			p0_NominalPUSCH = sib2Map.get(".p0-NominalPUSCH");
			alpha_x10 = sib2Map.get(".alpha(x10)");
			p0_NominalPUCCH = sib2Map.get(".p0-NominalPUCCH");
			delta_PUCCH_Format1 = sib2Map.get(".delta-PUCCH-Format1");
			delta_PUCCH_Format1b = sib2Map.get(".delta-PUCCH-Format1b");
			delta_PUCCH_Format2 = sib2Map.get(".delta-PUCCH-Format2");
			delta_PUCCH_Format2a = sib2Map.get(".delta-PUCCH-Format2a");
			delta_PUCCH_Format2b = sib2Map.get(".delta-PUCCH-Format2b");
			deltaPreambleMsg3 = sib2Map.get(".delta preamble msg3");
			ulCyclicPrefixLength = sib2Map.get("UL Cyclic Prefix Length");
			srs_Bandwidth = sib2Map.get(".srs-Bandwidth");
			srs_Subframe = sib2Map.get(".srs-Subframe");
			ackNackSRS_SimultaneousTransmis = sib2Map.get(".ackNackSRS-SimultaneousTransmis");
			srs_MaxUpPts = sib2Map.get(".srs-MaxUpPts");
			t300 = sib2Map.get(".t300");
			t301 = sib2Map.get(".t301");
			t310 = sib2Map.get(".t310");
			t311 = sib2Map.get(".t311");
			n310 = sib2Map.get(".n310");
			n311 = sib2Map.get(".n311");
			ul_CarrierFreq = sib2Map.get(".ul-CarrierFreq");
			ul_Bandwidth = sib2Map.get(".ul-Bandwidth");
			additionalSpectrumEm = sib2Map.get(".additional spectrum em");
		}
	}

	@Override
	public void close() {
		System.out.println("Starting to close DM Tool");
		dc.stopDc();
		initialize = false;
		super.close();
		System.out.println("Finished to close DM Tool");
	}

	public int getPORT() {
		return PORT;
	}

	public void setPORT(int port) {
		this.PORT = port;
	}

	public String getUeIP() {
		return ueIP;
	}

	public void setUeIP(String ueIP) {
		this.ueIP = ueIP;
	}

	public ArrayList<MeasurementCfgObject> getMeasurementCfgObject() {
		ArrayList<MeasurementCfgObject> returnArray = new ArrayList<MeasurementCfgObject>();
		String answer = "";
		for (int i = 0; i < 3; i++) {
			try {
				answer = cli("showMeasCfgObject");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception in sending cli command to DM Tool");
			}
			if (answer != null && answer != "") {
				break;
			}
			try {
				forcedReconnect();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception in reconnecting to DM Tool");
			}
		}
		if (answer != null) {
			if (!answer.equals("")) {
				System.out.println(answer);
				String[] response = answer.split("\n");
				String[] lineInResponse;
				if (response.length >= 5) {
					for (int i = 4; i < response.length - 1; i++) {
						if (response[i].contains("unit")) {
							break;
						}
						lineInResponse = (response[i]).trim().split("\\|");
						int id = Integer.parseInt(lineInResponse[1].trim());
						int earfcn = Integer.parseInt(lineInResponse[2].trim());
						int measBw = Integer.parseInt(lineInResponse[3].trim());
						int offset = Integer.parseInt(lineInResponse[4].trim());
						String ant1 = lineInResponse[5].trim();
						String cellCfg = lineInResponse[6].trim();
						MeasurementCfgObject temp = new MeasurementCfgObject(id, earfcn, measBw, offset, ant1, cellCfg);
						returnArray.add(temp);
					}
				}
			} else {
				report.report("Received empty table from UE while getting Measurement Cfg Object Table");
			}
		} else {
			report.report("Received null from UE while getting Measurement Cfg Object Table");
		}
		return returnArray;
	}

	public ArrayList<MeasurementCfgReport> getMeasurementCfgReport() {
		ArrayList<MeasurementCfgReport> returnArray = new ArrayList<MeasurementCfgReport>();
		String answer = "";
		for (int i = 0; i < 3; i++) {
			try {
				answer = cli("showMeasCfgReport");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception in sending cli command to DM Tool");
			}
			if (answer != null && answer != "") {
				break;
			}
			try {
				forcedReconnect();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception in reconnecting to DM Tool");
			}
		}
		if (answer != null) {
			if (!answer.equals("")) {
				System.out.println(answer);
				String[] response = answer.split("\n");
				String[] lineInResponse;
				if (response.length >= 5) {
					for (int i = 4; i < response.length - 1; i++) {
						if (response[i].contains("PERIODIC")) {
							response[i] = response[i].replace("PERIODIC", "PERIODIC | ");
						}
						lineInResponse = (response[i]).trim().split("\\|");
						int id = Integer.parseInt(lineInResponse[1].trim());
						TriggerEvents event_trigger = TriggerEvents.fromValue(lineInResponse[2].trim());
						String info_trigger = lineInResponse[3].trim() + ", " + lineInResponse[4].trim();
						String qty = lineInResponse[5].trim();
						int max = Integer.parseInt(lineInResponse[6].trim());
						String interval = lineInResponse[7].trim();
						String amount = lineInResponse[8].trim();
						String sI = lineInResponse[9].trim();
						String rx_tx = lineInResponse[10].trim();
						MeasurementCfgReport temp = new MeasurementCfgReport(id, event_trigger, info_trigger, qty, max,
								interval, amount, sI, rx_tx);
						returnArray.add(temp);
					}
				}
			} else {
				report.report("Received empty table from UE while getting Measurement Cfg Report Table");
			}
		} else {
			report.report("Received null from UE while getting Measurement Cfg Report Table");
		}
		return returnArray;
	}

	public ArrayList<MeasurementCfg> getMeasurementCfg() {
		ArrayList<MeasurementCfg> returnArray = new ArrayList<MeasurementCfg>();
		String answer = "";
		for (int i = 0; i < 3; i++) {
			try {
				answer = cli("showMeasCfg");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception in sending cli command to DM Tool");
			}
			if (answer != null && answer != "") {
				break;
			}
			try {
				forcedReconnect();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception in reconnecting to DM Tool");
			}
		}
		if (answer != null) {
			if (!answer.equals("")) {
				System.out.println(answer);
				String[] response = answer.split("\n");
				String[] lineInResponse;
				if (response.length >= 5) {
					for (int i = 4; i < response.length - 1; i++) {

						lineInResponse = (response[i]).trim().split("\\|");
						int id = Integer.parseInt(lineInResponse[1].trim());
						int object_id = Integer.parseInt(lineInResponse[2].trim());
						int report_id = Integer.parseInt(lineInResponse[3].trim());
						MeasurementCfg temp = new MeasurementCfg(id, object_id, report_id);
						returnArray.add(temp);
					}
				}
			} else {
				report.report("Received empty table from UE while getting Measurement Cfg Table");
			}
		} else {
			report.report("Received null from UE while getting Measurement Cfg Table");
		}
		return returnArray;
	}

	public boolean isCdrxConfigured() throws Exception {
		String answer = "";
		for (int i = 0; i < 3; i++) {
			try {
				answer = cli("getdrxConfig");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception in sending cli command to DM Tool");
			}
			if (answer != null && answer != "") {
				break;
			}
			try {
				reconnect();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception in reconnecting to DM Tool");
			}
		}
		if (answer != null) {
			if (answer.equals("")) {
				throw new Exception("Failed to get information from DMTool");
			}
			if (answer.contains("NOT_CONFIGURED")) {
				return false;
			} else {
				return true;
			}
		} else {
			throw new Exception("Failed to get information from DMTool");
		}
	}

	public HashMap<String, PlmnData> getPLMNs() {
		HashMap<String, PlmnData> PLMNs = new HashMap<String, PlmnData>();
		String str = "";
		try {
			str = (cli("showPlmn"));
			if (str == null) {
				report.report("Couldn't get information from DM tool - retrying");
				str = (cli("showPlmn"));
				if (str == null) {
					return null;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		String pattern = "([a-z]+)\\s*\\((\\d+)\\,(\\d+)";
		Matcher m = Pattern.compile(pattern).matcher(str);
		while (m.find()) {
			PlmnData plmn = new PlmnData();
			plmn.setMCC(m.group(2));
			plmn.setMNC(m.group(3));
			PLMNs.put(m.group(1), plmn);

		}
		return PLMNs;
	}

}
