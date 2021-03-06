package Netspan.NBI_14_0.API.Inventory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2015-07-05T12:19:08.843+03:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://Airspan.Netspan.WebServices", name = "InventorySoap")
@XmlSeeAlso({ObjectFactory.class})
public interface InventorySoap {

    /**
     * Returns list of Discovery Tasks. Requires NBIF Extensions Licence.
     */
    @WebResult(name = "DiscoveryTaskListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "DiscoveryTaskList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.DiscoveryTaskList")
    @WebMethod(operationName = "DiscoveryTaskList", action = "http://Airspan.Netspan.WebServices/DiscoveryTaskList")
    @ResponseWrapper(localName = "DiscoveryTaskListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.DiscoveryTaskListResponse")
    public Netspan.NBI_14_0.API.Inventory.NameResult discoveryTaskList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Reset one or more Nodes.  Requires NBIF Extensions Licence.
     */
    @WebResult(name = "NodeResetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "NodeReset", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeReset")
    @WebMethod(operationName = "NodeReset", action = "http://Airspan.Netspan.WebServices/NodeReset")
    @ResponseWrapper(localName = "NodeResetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeResetResponse")
    public Netspan.NBI_14_0.API.Inventory.NodeActionResult nodeReset(
        @WebParam(name = "NodeName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeName,
        @WebParam(name = "NodeId", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeId,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Delete one or more Nodes.  Requires NBIF Extensions Licence.
     */
    @WebResult(name = "NodeDeleteResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "NodeDelete", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeDelete")
    @WebMethod(operationName = "NodeDelete", action = "http://Airspan.Netspan.WebServices/NodeDelete")
    @ResponseWrapper(localName = "NodeDeleteResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeDeleteResponse")
    public Netspan.NBI_14_0.API.Inventory.NodeActionResult nodeDelete(
        @WebParam(name = "NodeName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeName,
        @WebParam(name = "NodeId", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeId,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Delete one or more Discovery Tasks.  Requires NBIF Extensions Licence.
     */
    @WebResult(name = "DiscoveryTaskDeleteResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "DiscoveryTaskDelete", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.DiscoveryTaskDelete")
    @WebMethod(operationName = "DiscoveryTaskDelete", action = "http://Airspan.Netspan.WebServices/DiscoveryTaskDelete")
    @ResponseWrapper(localName = "DiscoveryTaskDeleteResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.DiscoveryTaskDeleteResponse")
    public Netspan.NBI_14_0.API.Inventory.DiscoveryTaskActionResult discoveryTaskDelete(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> name,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Renames specified Node. Requires NBIF Extensions Licence.
     */
    @WebResult(name = "NodeRenameResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "NodeRename", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeRename")
    @WebMethod(operationName = "NodeRename", action = "http://Airspan.Netspan.WebServices/NodeRename")
    @ResponseWrapper(localName = "NodeRenameResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeRenameResponse")
    public Netspan.NBI_14_0.API.Inventory.WsResponse nodeRename(
        @WebParam(name = "NodeNameOld", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String nodeNameOld,
        @WebParam(name = "NodeNameNew", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String nodeNameNew,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Forced reset one or more Nodes.  Requires NBIF Extensions Licence.
     */
    @WebResult(name = "NodeResetForcedResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "NodeResetForced", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeResetForced")
    @WebMethod(operationName = "NodeResetForced", action = "http://Airspan.Netspan.WebServices/NodeResetForced")
    @ResponseWrapper(localName = "NodeResetForcedResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeResetForcedResponse")
    public Netspan.NBI_14_0.API.Inventory.NodeActionResult nodeResetForced(
        @WebParam(name = "NodeName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeName,
        @WebParam(name = "NodeId", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeId,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns Node info.  Requires NBIF Extensions Licence.
     */
    @WebResult(name = "NodeInfoGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "NodeInfoGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeInfoGet")
    @WebMethod(operationName = "NodeInfoGet", action = "http://Airspan.Netspan.WebServices/NodeInfoGet")
    @ResponseWrapper(localName = "NodeInfoGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeInfoGetResponse")
    public Netspan.NBI_14_0.API.Inventory.NodeDetailGetResult nodeInfoGet(
        @WebParam(name = "NodeName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeName,
        @WebParam(name = "NodeId", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeId,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Add an SNMPv2 Discovery Task. Requires NBIF Extensions Licence.
     */
    @WebResult(name = "DiscoveryTaskAddSnmpV2Result", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "DiscoveryTaskAddSnmpV2", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.DiscoveryTaskAddSnmpV2")
    @WebMethod(operationName = "DiscoveryTaskAddSnmpV2", action = "http://Airspan.Netspan.WebServices/DiscoveryTaskAddSnmpV2")
    @ResponseWrapper(localName = "DiscoveryTaskAddSnmpV2Response", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.DiscoveryTaskAddSnmpV2Response")
    public Netspan.NBI_14_0.API.Inventory.WsResponse discoveryTaskAddSnmpV2(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String name,
        @WebParam(name = "IpAddress", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String ipAddress,
        @WebParam(name = "Port", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.Integer port,
        @WebParam(name = "ReadCommunity", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String readCommunity,
        @WebParam(name = "WriteCommunity", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String writeCommunity,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Add an SNMPv3 Discovery Task. Requires NBIF Extensions Licence.
     */
    @WebResult(name = "DiscoveryTaskAddSnmpV3Result", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "DiscoveryTaskAddSnmpV3", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.DiscoveryTaskAddSnmpV3")
    @WebMethod(operationName = "DiscoveryTaskAddSnmpV3", action = "http://Airspan.Netspan.WebServices/DiscoveryTaskAddSnmpV3")
    @ResponseWrapper(localName = "DiscoveryTaskAddSnmpV3Response", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.DiscoveryTaskAddSnmpV3Response")
    public Netspan.NBI_14_0.API.Inventory.WsResponse discoveryTaskAddSnmpV3(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String name,
        @WebParam(name = "IpAddress", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String ipAddress,
        @WebParam(name = "Port", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.Integer port,
        @WebParam(name = "SnmpUsername", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_14_0.API.Inventory.Snmpv3UserNames snmpUsername,
        @WebParam(name = "SnmpPassword", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String snmpPassword,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list Nodes.  Requires NBIF Extensions Licence.
     */
    @WebResult(name = "NodeListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "NodeList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeList")
    @WebMethod(operationName = "NodeList", action = "http://Airspan.Netspan.WebServices/NodeList")
    @ResponseWrapper(localName = "NodeListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeListResponse")
    public Netspan.NBI_14_0.API.Inventory.NodeListResult nodeList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Reprovision one or more Nodes.  Requires NBIF Extensions Licence.
     */
    @WebResult(name = "NodeReprovisionResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    @RequestWrapper(localName = "NodeReprovision", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeReprovision")
    @WebMethod(operationName = "NodeReprovision", action = "http://Airspan.Netspan.WebServices/NodeReprovision")
    @ResponseWrapper(localName = "NodeReprovisionResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_14_0.API.Inventory.NodeReprovisionResponse")
    public Netspan.NBI_14_0.API.Inventory.NodeActionResult nodeReprovision(
        @WebParam(name = "NodeName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeName,
        @WebParam(name = "NodeId", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeId,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );
}
