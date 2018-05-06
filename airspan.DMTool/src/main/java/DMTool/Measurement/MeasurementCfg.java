package DMTool.Measurement;

public class MeasurementCfg {
	
	private int id;
	private int object_id;
	private int report_id;
	
	public MeasurementCfg(int id, int object_id, int report_id) {
		setId(id);	
		setObject_id(object_id);
		setReport_id(report_id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getObject_id() {
		return object_id;
	}
	public void setObject_id(int object_id) {
		this.object_id = object_id;
	}
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}

}
