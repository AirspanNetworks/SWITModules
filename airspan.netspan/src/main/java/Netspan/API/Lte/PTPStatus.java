package Netspan.API.Lte;

import javax.xml.bind.JAXBElement;

public class PTPStatus {
	public String enbName = null;
	public String nodeId = null;
	public String masterConnectivity = null;
	public String syncStatus = null;
	public String holdover = null;
	public JAXBElement<Integer> holdExpiredTime = null;
	public String holdoverExpired = null;
	public String activeMasterStatus = null; //None or Primary or Secondary
	
	public boolean isMasterConnectivity() {
 		if (this.masterConnectivity == null)
 			return false;
 		if (this.masterConnectivity.contains("Not Connected"))
 			return false;
 		return true;
 	}
	
 	public boolean isSyncStatus() {
 		if (this.syncStatus == null)
 			return false;
 		if (this.syncStatus.contains("Locked"))
 			return true;
 		return false;
 	}
}
