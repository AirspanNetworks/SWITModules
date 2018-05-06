package Entities;

public class LoadParam {
	double load;
	char qci;
	int UEnum;
	LoadUnit unit;
	Integer frameSize;

	public LoadParam(double load, char qci, int UEnum, LoadUnit unit, Integer frameSize){
		this.load = load;
		this.qci = qci;
		this.UEnum = UEnum;
		this.unit = unit;
		this.frameSize = frameSize;
	}
	
	public double getLoad() {
		return load;
	}

	public void setLoad(double load) {
		this.load = load;
	}

	public char getQci() {
		return qci;
	}

	public void setQci(char qci) {
		this.qci = qci;
	}

	public int getUEnum() {
		return UEnum;
	}

	public void setUEnum(int uEnum) {
		UEnum = uEnum;
	}

	public LoadUnit getUnit() {
		return unit;
	}

	public void setUnit(LoadUnit unit) {
		this.unit = unit;
	}
	
	public Integer getFrameSize() {
		return frameSize;
	}

	public void setFrameSize(Integer frameSize) {
		this.frameSize = frameSize;
	}
	
	public enum LoadUnit{
		PERCENT_LINE_RATE,
		FRAMES_PER_SECOND,
		INTER_BURST_GAP,
		INTER_BURST_GAP_IN_MILLISECONDS,
		INTER_BURST_GAP_IN_NANOSECONDS,
		BITS_PER_SECOND,
		KILOBITS_PER_SECOND,
		MEGABITS_PER_SECOND,
		L2_RATE
		;
	}
}
