package Netspan.API.Lte;

import javax.xml.bind.JAXBElement;

public class NodeInfo {
	public String productCode = "";
	public String hardwareType = "";
	public JAXBElement<Integer> snmpPort;
	public String nodeID = "";
}
