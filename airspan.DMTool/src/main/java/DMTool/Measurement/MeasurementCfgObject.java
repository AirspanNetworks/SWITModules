package DMTool.Measurement;

public class MeasurementCfgObject {

	private int id;
	private int earfcn;
	private int measBw;
	private int offset;
	private String ant1;
	private String cellCfg;
	
	public MeasurementCfgObject(int id, int earfcn, int measBw, int offset, String ant1, String cellCfg){
		setId(id);
		setEarfcn(earfcn);
		setMeasBw(measBw);
		setOffset(offset);
		setAnt1(ant1);
		setCellCfg(cellCfg);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEarfcn() {
		return earfcn;
	}

	public void setEarfcn(int earfcn) {
		this.earfcn = earfcn;
	}

	public int getMeasBw() {
		return measBw;
	}

	public void setMeasBw(int measBw) {
		this.measBw = measBw;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getAnt1() {
		return ant1;
	}

	public void setAnt1(String ant1) {
		this.ant1 = ant1;
	}

	public String getCellCfg() {
		return cellCfg;
	}

	public void setCellCfg(String cellCfg) {
		this.cellCfg = cellCfg;
	}
	
	
}
