package DMTool.UeClientImpl;

import DMTool.UeClient;
import DMTool.sqnCellMeasReport;

public class UeClientImpl extends UeClient{
	private sqnCellMeasReport sqnCellMeasReportValue;
	
	@Override
	public void CellMeasReport (final sqnCellMeasReport report) {
			sqnCellMeasReportValue = report;
	}
	
	public sqnCellMeasReport getSqnCellMeasReportValue() {
		return sqnCellMeasReportValue;
	}
}
