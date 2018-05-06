package Entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by iagmon on 30-Nov-16.
 */
public class STCStreamBlock implements Comparable<STCStreamBlock> {

	private String app_name;
	private HashMap<String, HashMap> resultSet;
	private String blockName;
	private boolean activeState;
	private int pageNum;
	private int frameSize;

	public STCStreamBlock(String app_name, String blockName, boolean activeState, int pageNum) {
		this.app_name = app_name.replaceAll("\"", "");
		this.blockName = blockName.replaceAll("\"", "");
		this.activeState = activeState;
		this.pageNum = pageNum;
	}

	public void setResultSet(HashMap<String, HashMap> resultSet) {
		this.resultSet = resultSet;
	}
	
	public boolean isActive() {
		return this.activeState;
	}

	public int compareTo(STCStreamBlock toCompare){
		return pageNum-toCompare.getPageNum();
	}
	
	public void setActiveState(boolean activeState){
		System.out.println(app_name+" stream set state : "+activeState);
		this.activeState = activeState;
	}

	public String getApp_name() {
		return app_name;
	}

	public HashMap getResultSet() {
		return resultSet;
	}

	public String getProfileNames() {
		return "stream name: " + app_name + ", stream block name: " + blockName;
	}

	public int getPageNum() {
		return pageNum;
	}
	
	public String getBlockName() {
		return blockName;
	}

	public int getFrameSize() {
		return this.frameSize;
	}

	public void setFrameSize(int frameSize) {
		this.frameSize = frameSize;
	}
}
