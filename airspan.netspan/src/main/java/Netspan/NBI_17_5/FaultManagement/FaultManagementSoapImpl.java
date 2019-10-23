
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package Netspan.NBI_17_5.FaultManagement;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2019-10-15T09:13:39.919+03:00
 * Generated source version: 3.2.6
 *
 */

@javax.jws.WebService(
                      serviceName = "FaultManagement",
                      portName = "FaultManagementSoap",
                      targetNamespace = "http://Airspan.Netspan.WebServices",
                      wsdlLocation = "http://192.168.58.34/ws/17.5/FaultManagement.asmx?WSDL",
                      endpointInterface = "Netspan.NBI_17_5.FaultManagement.FaultManagementSoap")

public class FaultManagementSoapImpl implements FaultManagementSoap {

    private static final Logger LOG = Logger.getLogger(FaultManagementSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#alarmUnacknowledge(java.util.List<java.math.BigInteger> alarmID, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.AlarmActionResult alarmUnacknowledge(java.util.List<java.math.BigInteger> alarmID, Credentials credentials) {
        LOG.info("Executing operation alarmUnacknowledge");
        System.out.println(alarmID);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.AlarmActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#eventListNode(java.util.List<java.lang.String> nodeName, java.util.List<java.lang.String> nodeId, javax.xml.datatype.XMLGregorianCalendar startDate, javax.xml.datatype.XMLGregorianCalendar endDate, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.EventResultList eventListNode(java.util.List<java.lang.String> nodeName, java.util.List<java.lang.String> nodeId, javax.xml.datatype.XMLGregorianCalendar startDate, javax.xml.datatype.XMLGregorianCalendar endDate, Credentials credentials) {
        LOG.info("Executing operation eventListNode");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(startDate);
        System.out.println(endDate);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.EventResultList _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#alarmListNode(java.util.List<java.lang.String> nodeName, java.util.List<java.lang.String> nodeId, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.AlarmResultList alarmListNode(java.util.List<java.lang.String> nodeName, java.util.List<java.lang.String> nodeId, Credentials credentials) {
        LOG.info("Executing operation alarmListNode");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.AlarmResultList _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#alarmAcknowledge(java.util.List<java.math.BigInteger> alarmID, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.AlarmActionResult alarmAcknowledge(java.util.List<java.math.BigInteger> alarmID, Credentials credentials) {
        LOG.info("Executing operation alarmAcknowledge");
        System.out.println(alarmID);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.AlarmActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#eventList(javax.xml.datatype.XMLGregorianCalendar startDate, javax.xml.datatype.XMLGregorianCalendar endDate, java.util.List<java.lang.String> eventType, java.util.List<java.lang.String> sourceType, java.util.List<java.lang.String> eventTypeId, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.EventResultList eventList(javax.xml.datatype.XMLGregorianCalendar startDate, javax.xml.datatype.XMLGregorianCalendar endDate, java.util.List<java.lang.String> eventType, java.util.List<java.lang.String> sourceType, java.util.List<java.lang.String> eventTypeId, Credentials credentials) {
        LOG.info("Executing operation eventList");
        System.out.println(startDate);
        System.out.println(endDate);
        System.out.println(eventType);
        System.out.println(sourceType);
        System.out.println(eventTypeId);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.EventResultList _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#externalServerEvent(Netspan.NBI_17_5.FaultManagement.ExternalEventType eventType, java.lang.String statusInfo, Netspan.NBI_17_5.FaultManagement.NodeActionStatus alarmStatus, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.NodeActionResult externalServerEvent(Netspan.NBI_17_5.FaultManagement.ExternalEventType eventType, java.lang.String statusInfo, Netspan.NBI_17_5.FaultManagement.NodeActionStatus alarmStatus, Credentials credentials) {
        LOG.info("Executing operation externalServerEvent");
        System.out.println(eventType);
        System.out.println(statusInfo);
        System.out.println(alarmStatus);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#netspanSFNodeConfigError(java.util.List<java.lang.String> nodeName, Netspan.NBI_17_5.FaultManagement.NetspanAlarmStatus alarmStatus, java.lang.String alarmStatusInfo, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.NodeAlarmResult netspanSFNodeConfigError(java.util.List<java.lang.String> nodeName, Netspan.NBI_17_5.FaultManagement.NetspanAlarmStatus alarmStatus, java.lang.String alarmStatusInfo, Credentials credentials) {
        LOG.info("Executing operation netspanSFNodeConfigError");
        System.out.println(nodeName);
        System.out.println(alarmStatus);
        System.out.println(alarmStatusInfo);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.NodeAlarmResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#alarmHistoryList(javax.xml.datatype.XMLGregorianCalendar startDate, javax.xml.datatype.XMLGregorianCalendar endDate, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.AlarmHistoryResultList alarmHistoryList(javax.xml.datatype.XMLGregorianCalendar startDate, javax.xml.datatype.XMLGregorianCalendar endDate, Credentials credentials) {
        LOG.info("Executing operation alarmHistoryList");
        System.out.println(startDate);
        System.out.println(endDate);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.AlarmHistoryResultList _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#externalNodeEvent(java.lang.String nodeNameOrId, Netspan.NBI_17_5.FaultManagement.ExternalEventType eventType, java.lang.String statusInfo, Netspan.NBI_17_5.FaultManagement.NodeActionStatus alarmStatus, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.NodeActionResult externalNodeEvent(java.lang.String nodeNameOrId, Netspan.NBI_17_5.FaultManagement.ExternalEventType eventType, java.lang.String statusInfo, Netspan.NBI_17_5.FaultManagement.NodeActionStatus alarmStatus, Credentials credentials) {
        LOG.info("Executing operation externalNodeEvent");
        System.out.println(nodeNameOrId);
        System.out.println(eventType);
        System.out.println(statusInfo);
        System.out.println(alarmStatus);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.NodeActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#alarmList(Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.AlarmResultList alarmList(Credentials credentials) {
        LOG.info("Executing operation alarmList");
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.AlarmResultList _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#netspanSFServerError(Netspan.NBI_17_5.FaultManagement.NetspanAlarmStatus alarmStatus, java.lang.String alarmStatusInfo, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.NodeAlarmResult netspanSFServerError(Netspan.NBI_17_5.FaultManagement.NetspanAlarmStatus alarmStatus, java.lang.String alarmStatusInfo, Credentials credentials) {
        LOG.info("Executing operation netspanSFServerError");
        System.out.println(alarmStatus);
        System.out.println(alarmStatusInfo);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.NodeAlarmResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#alarmHistoryListNode(java.util.List<java.lang.String> nodeName, java.util.List<java.lang.String> nodeId, javax.xml.datatype.XMLGregorianCalendar startDate, javax.xml.datatype.XMLGregorianCalendar endDate, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.AlarmHistoryResultList alarmHistoryListNode(java.util.List<java.lang.String> nodeName, java.util.List<java.lang.String> nodeId, javax.xml.datatype.XMLGregorianCalendar startDate, javax.xml.datatype.XMLGregorianCalendar endDate, Credentials credentials) {
        LOG.info("Executing operation alarmHistoryListNode");
        System.out.println(nodeName);
        System.out.println(nodeId);
        System.out.println(startDate);
        System.out.println(endDate);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.AlarmHistoryResultList _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#alarmListChanged(javax.xml.datatype.XMLGregorianCalendar startDate, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.AlarmResultList alarmListChanged(javax.xml.datatype.XMLGregorianCalendar startDate, Credentials credentials) {
        LOG.info("Executing operation alarmListChanged");
        System.out.println(startDate);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.AlarmResultList _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#alarmRelease(java.util.List<java.math.BigInteger> alarmID, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.AlarmActionResult alarmRelease(java.util.List<java.math.BigInteger> alarmID, Credentials credentials) {
        LOG.info("Executing operation alarmRelease");
        System.out.println(alarmID);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.AlarmActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see Netspan.NBI_17_5.FaultManagement.FaultManagementSoap#alarmDelete(java.util.List<java.math.BigInteger> alarmID, Netspan.NBI_17_5.FaultManagement.Credentials credentials)*
     */
    public Netspan.NBI_17_5.FaultManagement.AlarmActionResult alarmDelete(java.util.List<java.math.BigInteger> alarmID, Credentials credentials) {
        LOG.info("Executing operation alarmDelete");
        System.out.println(alarmID);
        System.out.println(credentials);
        try {
            Netspan.NBI_17_5.FaultManagement.AlarmActionResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
