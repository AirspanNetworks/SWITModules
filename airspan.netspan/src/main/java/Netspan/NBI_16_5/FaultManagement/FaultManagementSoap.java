package Netspan.NBI_16_5.FaultManagement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-10-14T13:43:13.228+03:00
 * Generated source version: 3.2.6
 *
 */
@WebService(targetNamespace = "http://Airspan.Netspan.WebServices", name = "FaultManagementSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface FaultManagementSoap {

    /**
     * Unacknowledge one or more alarms.
     */
    @WebMethod(operationName = "AlarmUnacknowledge", action = "http://Airspan.Netspan.WebServices/AlarmUnacknowledge")
    @RequestWrapper(localName = "AlarmUnacknowledge", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmUnacknowledge")
    @ResponseWrapper(localName = "AlarmUnacknowledgeResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmUnacknowledgeResponse")
    @WebResult(name = "AlarmUnacknowledgeResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.AlarmActionResult alarmUnacknowledge(
        @WebParam(name = "AlarmID", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.math.BigInteger> alarmID,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of events for the specified date range and node.
     */
    @WebMethod(operationName = "EventListNode", action = "http://Airspan.Netspan.WebServices/EventListNode")
    @RequestWrapper(localName = "EventListNode", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.EventListNode")
    @ResponseWrapper(localName = "EventListNodeResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.EventListNodeResponse")
    @WebResult(name = "EventListNodeResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.EventResultList eventListNode(
        @WebParam(name = "NodeName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeName,
        @WebParam(name = "NodeId", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeId,
        @WebParam(name = "StartDate", targetNamespace = "http://Airspan.Netspan.WebServices")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://Airspan.Netspan.WebServices")
        javax.xml.datatype.XMLGregorianCalendar endDate,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of Active Alarms for the specified Nodes.
     */
    @WebMethod(operationName = "AlarmListNode", action = "http://Airspan.Netspan.WebServices/AlarmListNode")
    @RequestWrapper(localName = "AlarmListNode", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmListNode")
    @ResponseWrapper(localName = "AlarmListNodeResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmListNodeResponse")
    @WebResult(name = "AlarmListNodeResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.AlarmResultList alarmListNode(
        @WebParam(name = "NodeName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeName,
        @WebParam(name = "NodeId", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeId,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Acknowledge one or more alarms.
     */
    @WebMethod(operationName = "AlarmAcknowledge", action = "http://Airspan.Netspan.WebServices/AlarmAcknowledge")
    @RequestWrapper(localName = "AlarmAcknowledge", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmAcknowledge")
    @ResponseWrapper(localName = "AlarmAcknowledgeResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmAcknowledgeResponse")
    @WebResult(name = "AlarmAcknowledgeResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.AlarmActionResult alarmAcknowledge(
        @WebParam(name = "AlarmID", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.math.BigInteger> alarmID,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of events for the specified date range with optional filters for Event Type, Source Type and Event Type Id
     */
    @WebMethod(operationName = "EventList", action = "http://Airspan.Netspan.WebServices/EventList")
    @RequestWrapper(localName = "EventList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.EventList")
    @ResponseWrapper(localName = "EventListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.EventListResponse")
    @WebResult(name = "EventListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.EventResultList eventList(
        @WebParam(name = "StartDate", targetNamespace = "http://Airspan.Netspan.WebServices")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://Airspan.Netspan.WebServices")
        javax.xml.datatype.XMLGregorianCalendar endDate,
        @WebParam(name = "EventType", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> eventType,
        @WebParam(name = "SourceType", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> sourceType,
        @WebParam(name = "EventTypeId", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> eventTypeId,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Raises Netspan event and alarm when NetspanSF Node Config Error occurs. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NetspanSFNodeConfigError", action = "http://Airspan.Netspan.WebServices/NetspanSFNodeConfigError")
    @RequestWrapper(localName = "NetspanSFNodeConfigError", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.NetspanSFNodeConfigError")
    @ResponseWrapper(localName = "NetspanSFNodeConfigErrorResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.NetspanSFNodeConfigErrorResponse")
    @WebResult(name = "NetspanSFNodeConfigErrorResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.NodeAlarmResult netspanSFNodeConfigError(
        @WebParam(name = "NodeName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeName,
        @WebParam(name = "AlarmStatus", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_16_5.FaultManagement.NetspanAlarmStatus alarmStatus,
        @WebParam(name = "AlarmStatusInfo", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String alarmStatusInfo,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of alarmahistory for the specified date range.
     */
    @WebMethod(operationName = "AlarmHistoryList", action = "http://Airspan.Netspan.WebServices/AlarmHistoryList")
    @RequestWrapper(localName = "AlarmHistoryList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmHistoryList")
    @ResponseWrapper(localName = "AlarmHistoryListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmHistoryListResponse")
    @WebResult(name = "AlarmHistoryListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.AlarmHistoryResultList alarmHistoryList(
        @WebParam(name = "StartDate", targetNamespace = "http://Airspan.Netspan.WebServices")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://Airspan.Netspan.WebServices")
        javax.xml.datatype.XMLGregorianCalendar endDate,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of Active Alarms.
     */
    @WebMethod(operationName = "AlarmList", action = "http://Airspan.Netspan.WebServices/AlarmList")
    @RequestWrapper(localName = "AlarmList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmList")
    @ResponseWrapper(localName = "AlarmListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmListResponse")
    @WebResult(name = "AlarmListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.AlarmResultList alarmList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Raises Netspan event and alarm when NetspanSF Server Error occurs. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NetspanSFServerError", action = "http://Airspan.Netspan.WebServices/NetspanSFServerError")
    @RequestWrapper(localName = "NetspanSFServerError", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.NetspanSFServerError")
    @ResponseWrapper(localName = "NetspanSFServerErrorResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.NetspanSFServerErrorResponse")
    @WebResult(name = "NetspanSFServerErrorResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.NodeAlarmResult netspanSFServerError(
        @WebParam(name = "AlarmStatus", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_16_5.FaultManagement.NetspanAlarmStatus alarmStatus,
        @WebParam(name = "AlarmStatusInfo", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String alarmStatusInfo,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of alarmahistory for the specified date range and node.
     */
    @WebMethod(operationName = "AlarmHistoryListNode", action = "http://Airspan.Netspan.WebServices/AlarmHistoryListNode")
    @RequestWrapper(localName = "AlarmHistoryListNode", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmHistoryListNode")
    @ResponseWrapper(localName = "AlarmHistoryListNodeResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmHistoryListNodeResponse")
    @WebResult(name = "AlarmHistoryListNodeResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.AlarmHistoryResultList alarmHistoryListNode(
        @WebParam(name = "NodeName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeName,
        @WebParam(name = "NodeId", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> nodeId,
        @WebParam(name = "StartDate", targetNamespace = "http://Airspan.Netspan.WebServices")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://Airspan.Netspan.WebServices")
        javax.xml.datatype.XMLGregorianCalendar endDate,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of Active Alarms changed since the specified time.
     */
    @WebMethod(operationName = "AlarmListChanged", action = "http://Airspan.Netspan.WebServices/AlarmListChanged")
    @RequestWrapper(localName = "AlarmListChanged", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmListChanged")
    @ResponseWrapper(localName = "AlarmListChangedResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmListChangedResponse")
    @WebResult(name = "AlarmListChangedResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.AlarmResultList alarmListChanged(
        @WebParam(name = "StartDate", targetNamespace = "http://Airspan.Netspan.WebServices")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Unacknowledge one or more alarms [Deprecated: Use AlarmUnacknowledge].
     */
    @WebMethod(operationName = "AlarmRelease", action = "http://Airspan.Netspan.WebServices/AlarmRelease")
    @RequestWrapper(localName = "AlarmRelease", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmRelease")
    @ResponseWrapper(localName = "AlarmReleaseResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmReleaseResponse")
    @WebResult(name = "AlarmReleaseResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.AlarmActionResult alarmRelease(
        @WebParam(name = "AlarmID", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.math.BigInteger> alarmID,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Delete one or more alarms.
     */
    @WebMethod(operationName = "AlarmDelete", action = "http://Airspan.Netspan.WebServices/AlarmDelete")
    @RequestWrapper(localName = "AlarmDelete", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmDelete")
    @ResponseWrapper(localName = "AlarmDeleteResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_16_5.FaultManagement.AlarmDeleteResponse")
    @WebResult(name = "AlarmDeleteResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_16_5.FaultManagement.AlarmActionResult alarmDelete(
        @WebParam(name = "AlarmID", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.math.BigInteger> alarmID,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );
}
