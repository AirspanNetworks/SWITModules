package Entities;

import Entities.ITrafficGenerator.CounterUnit;

/**
 * 
 * @author Shahaf Shuhamy
 * holds Stream details for test
 * boolean active
 * long rxRate
 * long txRate
 * recoveryStates recoveryStatus
 * String name
 *
 */
public class StreamParams {
	private boolean atonmentUser;
	private Long atunmentTimeStart;
	private boolean active;
	private long rxRate;
	private long rxMinRate = 0;
	private long rxMaxRate = 0;
	private long txRate = 0;
	//private recoveryStates recoveryStatus = recoveryStates.streamFirst;
	private String name;
	private Integer packetSize;
	private long timeStamp;
	private CounterUnit unit;
	private double rxRateDouble;
	
	//Constructors
	/**
	 * empty Constructor
	 */
	public StreamParams() {
		super();
	}
	
	/**
	 * Initializes StreamParams with Name and true if its active
	 * @param String name
	 * @param boolean active
	 */
	public StreamParams(String name, boolean active) {
		this();
		this.name = name;
		this.active = active;
	}
	
	public double getRxRateDouble() {
		return rxRateDouble;
	}

	public void setRxRateDouble(double rxRateDouble) {
		this.rxRateDouble = rxRateDouble;
	}

	/*
	 * Standard Getters and Setters.
	 */
	public long getRxRate() {
		return rxRate;
	}

	public void setRxRate(long rxRate) {	
		this.rxRate = rxRate;
	}

	public long getTxRate() {
		return txRate;
	}

	public void setTxRate(long txRate) {
		this.txRate = txRate;
	}

	/*public recoveryStates getRecoveryStatus() {
		return recoveryStatus;
	}

	public void setRecoveryStatus(recoveryStates recoveryStatus) {
		this.recoveryStatus = recoveryStatus;
	}*/
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString()
	{
		return "name:"+this.name+" active:"+this.active;
	}

	public Integer getPacketSize() {
		return packetSize;
	}

	public void setPacketSize(Integer packetSize) {
		if(packetSize != this.packetSize){
			this.packetSize = packetSize;
		}
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public long getRxMaxRate() {
		return rxMaxRate;
	}

	public void setRxMaxRate(long rxMaxRate) {
		this.rxMaxRate = rxMaxRate;
	}

	public long getRxMinRate() {
		return rxMinRate;
	}

	public void setRxMinRate(long rxMinRate) {
		this.rxMinRate = rxMinRate;
	}

	public boolean isAtonmentUser() {
		return atonmentUser;
	}

	public void setAtonmentUser(boolean atonmentUser) {
		this.atonmentUser = atonmentUser;
	}

	public Long getAtunmentTimeStart() {
		return atunmentTimeStart;
	}

	public void setAtunmentTimeStart(Long atunmentTimeStart) {
		this.atunmentTimeStart = atunmentTimeStart;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof StreamParams){
			if(this.name.equals(((StreamParams) o).getName())){
			return true;
			}
		}
		return false;
	}

	public CounterUnit getUnit() {
		return unit;
	}

	public void setUnit(CounterUnit unit) {
		this.unit = unit;
	}
	
}
