package Entities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by iagmon on 09-Nov-16.
 */
public interface ITrafficGenerator {
	public static enum TransmitDirection{
		DL("DL"),
		UL("UL"),
		BOTH("DL_UL");
		
		public String value;

		TransmitDirection(String v) {
			value = v;
		}
	}
	
	public static enum CounterUnit{
		FRAMES_PER_SECOND(""),
		BITS_PER_SECOND("L1BitRate"),
		FRAME_COUNT("FrameCount"),
		DROPPED_FRAME_COUNT("DroppedFrameCount"),
		DROPPED_FRAME_PERCENT("DroppedFramePercent"),
		DROPPED_FRAME_PERCENT_RATE("DroppedFramePercentRate"),
		SHORT_TERM_AVG_LATENCY("ShortTermAvgLatency"),
		SHORT_TERM_AVG_JITTER("ShortTermAvgJitter"),
		RFC_4689_ABSOLUTE_AVG_JITTER("Rfc4689AbsoluteAvgJitter"),
		AVG_JITTER("AvgJitter");
		
		public String value;

		CounterUnit(String v) {
			value = v;
		}
	}
	
	public static enum Protocol{
		//The String value is mandatory for IPerf.
		UDP("-u"),
		TCP("");
		
		public String value;
		Protocol(String value){
			this.value = value;
		}
	}
	
	boolean isConnected();
	
	/**
     * Connect to the Traffic generator over IP
     * @throws Exception 
     */
    void Connect() throws Exception;

    /**
     * Disconnects from the TG
     */
    void Disconnect() throws Exception;

    /**
     * Starts all traffic
     */
    void StartTrafficOnAllPorts() throws Exception;
    
    public void SetAllStreamActiveState(boolean state) throws Exception;

    /**
     * Ends all traffic
     */
    void StopTrafficOnAllPorts() throws Exception;

    void SubscribeToCounter(CounterUnit counterUnit) throws Exception;

    void readAllCounters();

    String getDefultConfigFile();
    
    void setCurrentConfigFile(String nameToConfig);
    
    public String getUploadedConfigFile();
    
    public boolean arpNdStart() throws Exception;
    
    public void printArpInfo();

	boolean configPortLoad(double dl, double ul);
	
	boolean clearStreamsResults();
		
	public void setLoadStreamDLPort(ArrayList<LoadParam> load);

	public void setLoadStreamULPort(ArrayList<LoadParam> load);
	
	public ArrayList<ArrayList<String>> disableStreamsByUeNameQciAndPortDirectionAndEnableTheRest(Protocol protocol,ArrayList<String> ueNamesNotAllowdInTest,
			ArrayList<Character> qciListNotAllowdInTest, 
			TransmitDirection transmitDirection);
	
	public ArrayList<ArrayList<String>> enableStreamsByUeNameQciAndPortDirectionAndDisableTheRest(Protocol protocol,ArrayList<String> ueNamesAllowdInTest,
			ArrayList<Character> qciListAllowdInTest, 
			TransmitDirection transmitDirection);

	public void setFrameSize(Integer frameSize)throws IOException;
	
	public void setNumberParallelStreams(Integer numberParallel);
	
	public void setWindowSizeInKbs(Double windowSizeInKbs);

	public ArrayList<ArrayList<StreamParams>> getActiveStreamCurrentSample(ArrayList<CounterUnit> counterUnitList, TransmitDirection transmitDirection);

	public void setActiveState(ArrayList<StreamParams> streams, boolean state);

	public void recoveryConnection();

	public void setFrameSizeStreamDLPort(ArrayList<LoadParam> load) throws IOException;

	public void setFrameSizeStreamULPort(ArrayList<LoadParam> load) throws IOException;
	
	public ArrayList<String> enableStreamsByUeNameQciAndPortDirection(Protocol protocol,ArrayList<String> ueNamesAllowdInTest,
			ArrayList<Character> qciListAllowdInTest, 
			TransmitDirection transmitDirection);

	public boolean setProtocol(Protocol protocol);
	
	public ArrayList<File> getResultFiles();
	
	public boolean closeAllConnections();
	
	public String setConfigFileWithHOPrefix(String TrafficFile);
	
	public abstract boolean enableExtraCounter(CounterUnit counterUnit);

	void takeActionAfterFoundHaltStream();

	ArrayList<File> getTransmitOutputFiles();

	ArrayList<File> getCommandFiles();
	
	public void initStreams(Protocol protocol,ArrayList<String> ues,ArrayList<Character> qciListAllowdInTest, 
			TransmitDirection transmitDirection, Integer runTime) throws Exception;

	public void stopTraffic(ArrayList<String> streamList);

	public ArrayList<ArrayList<StreamParams>> getAllStreamsResults(ArrayList<String> streamList);

	public void resetIperfList();

	public void getResultFilesByList(ArrayList<String> streamList);
}
