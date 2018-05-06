package DMTool.Measurement;

import java.util.ArrayList;

public class TableManager {
	ArrayList<MeasurementCfg> cfgTable;
	ArrayList<MeasurementCfgObject> objectTable;
	ArrayList<MeasurementCfgReport> reportTable;
	
	public TableManager(){
		initTables();
	}
	
	private void initTables(){
		cfgTable = new ArrayList<MeasurementCfg>();
		objectTable = new ArrayList<MeasurementCfgObject>();
		reportTable = new ArrayList<MeasurementCfgReport>();
	}
	
	public void setCFGTable(ArrayList<MeasurementCfg> incomeCfgTable){
		cfgTable = incomeCfgTable;
	}
	
	public void setObejctTable(ArrayList<MeasurementCfgObject> incomeObjectTable){
		objectTable = incomeObjectTable;
	}
	
	public void setReportTable(ArrayList<MeasurementCfgReport> incomeReportTable){
		reportTable = incomeReportTable;
	}
	
	public ArrayList<MeasurementCfg> getCfgTable(){
		return cfgTable;
	}
	
	public ArrayList<MeasurementCfgObject> getObjectTable(){
		return objectTable;
	}
	
	public ArrayList<MeasurementCfgReport> getReportTable(){
		return reportTable;
	}
	
	public void setCfgQuery(int id, int object_id, int report_id){
		MeasurementCfg measurementCfg = new MeasurementCfg(id,object_id,report_id);
		cfgTable.add(measurementCfg);
	}
	
	public void setObjectQuery(int id, int earfcn, int measBw, int offset, String ant1, String cellCfg){
		MeasurementCfgObject measurementCfgObject = new MeasurementCfgObject(id,earfcn,measBw,offset,ant1,cellCfg);
		objectTable.add(measurementCfgObject);
	}
	
	public void setReportQuery(int id, TriggerEvents event_trigger, String info_trigger, String qty, int max, String interval, String amount, String sI,String rx_tx){
		MeasurementCfgReport measurementCfgReport = new MeasurementCfgReport(id,event_trigger,info_trigger,qty,max,interval,amount,sI,rx_tx);
		reportTable.add(measurementCfgReport);
	}
	
	public void resetTables(){
		initTables();
	}
}
