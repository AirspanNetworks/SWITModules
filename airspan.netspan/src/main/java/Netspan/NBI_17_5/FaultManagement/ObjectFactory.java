
package Netspan.NBI_17_5.FaultManagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_17_5.FaultManagement package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Credentials_QNAME = new QName("http://Airspan.Netspan.WebServices", "Credentials");
    private final static QName _AlarmHistoryAlarmId_QNAME = new QName("http://Airspan.Netspan.WebServices", "AlarmId");
    private final static QName _AlarmHistoryAlarmTypeId_QNAME = new QName("http://Airspan.Netspan.WebServices", "AlarmTypeId");
    private final static QName _AlarmHistorySourceType_QNAME = new QName("http://Airspan.Netspan.WebServices", "SourceType");
    private final static QName _AlarmHistorySourceIfIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "SourceIfIndex");
    private final static QName _AlarmHistoryChangeTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "ChangeTime");
    private final static QName _EventEventId_QNAME = new QName("http://Airspan.Netspan.WebServices", "EventId");
    private final static QName _EventEventTypeId_QNAME = new QName("http://Airspan.Netspan.WebServices", "EventTypeId");
    private final static QName _EventReceivedTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReceivedTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_17_5.FaultManagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlarmList }
     * 
     */
    public AlarmList createAlarmList() {
        return new AlarmList();
    }

    /**
     * Create an instance of {@link AlarmListResponse }
     * 
     */
    public AlarmListResponse createAlarmListResponse() {
        return new AlarmListResponse();
    }

    /**
     * Create an instance of {@link AlarmResultList }
     * 
     */
    public AlarmResultList createAlarmResultList() {
        return new AlarmResultList();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link AlarmListNode }
     * 
     */
    public AlarmListNode createAlarmListNode() {
        return new AlarmListNode();
    }

    /**
     * Create an instance of {@link AlarmListNodeResponse }
     * 
     */
    public AlarmListNodeResponse createAlarmListNodeResponse() {
        return new AlarmListNodeResponse();
    }

    /**
     * Create an instance of {@link AlarmListChanged }
     * 
     */
    public AlarmListChanged createAlarmListChanged() {
        return new AlarmListChanged();
    }

    /**
     * Create an instance of {@link AlarmListChangedResponse }
     * 
     */
    public AlarmListChangedResponse createAlarmListChangedResponse() {
        return new AlarmListChangedResponse();
    }

    /**
     * Create an instance of {@link AlarmAcknowledge }
     * 
     */
    public AlarmAcknowledge createAlarmAcknowledge() {
        return new AlarmAcknowledge();
    }

    /**
     * Create an instance of {@link AlarmAcknowledgeResponse }
     * 
     */
    public AlarmAcknowledgeResponse createAlarmAcknowledgeResponse() {
        return new AlarmAcknowledgeResponse();
    }

    /**
     * Create an instance of {@link AlarmActionResult }
     * 
     */
    public AlarmActionResult createAlarmActionResult() {
        return new AlarmActionResult();
    }

    /**
     * Create an instance of {@link AlarmRelease }
     * 
     */
    public AlarmRelease createAlarmRelease() {
        return new AlarmRelease();
    }

    /**
     * Create an instance of {@link AlarmReleaseResponse }
     * 
     */
    public AlarmReleaseResponse createAlarmReleaseResponse() {
        return new AlarmReleaseResponse();
    }

    /**
     * Create an instance of {@link AlarmUnacknowledge }
     * 
     */
    public AlarmUnacknowledge createAlarmUnacknowledge() {
        return new AlarmUnacknowledge();
    }

    /**
     * Create an instance of {@link AlarmUnacknowledgeResponse }
     * 
     */
    public AlarmUnacknowledgeResponse createAlarmUnacknowledgeResponse() {
        return new AlarmUnacknowledgeResponse();
    }

    /**
     * Create an instance of {@link AlarmDelete }
     * 
     */
    public AlarmDelete createAlarmDelete() {
        return new AlarmDelete();
    }

    /**
     * Create an instance of {@link AlarmDeleteResponse }
     * 
     */
    public AlarmDeleteResponse createAlarmDeleteResponse() {
        return new AlarmDeleteResponse();
    }

    /**
     * Create an instance of {@link NetspanSFNodeConfigError }
     * 
     */
    public NetspanSFNodeConfigError createNetspanSFNodeConfigError() {
        return new NetspanSFNodeConfigError();
    }

    /**
     * Create an instance of {@link NetspanSFNodeConfigErrorResponse }
     * 
     */
    public NetspanSFNodeConfigErrorResponse createNetspanSFNodeConfigErrorResponse() {
        return new NetspanSFNodeConfigErrorResponse();
    }

    /**
     * Create an instance of {@link NodeAlarmResult }
     * 
     */
    public NodeAlarmResult createNodeAlarmResult() {
        return new NodeAlarmResult();
    }

    /**
     * Create an instance of {@link NetspanSFServerError }
     * 
     */
    public NetspanSFServerError createNetspanSFServerError() {
        return new NetspanSFServerError();
    }

    /**
     * Create an instance of {@link NetspanSFServerErrorResponse }
     * 
     */
    public NetspanSFServerErrorResponse createNetspanSFServerErrorResponse() {
        return new NetspanSFServerErrorResponse();
    }

    /**
     * Create an instance of {@link EventList }
     * 
     */
    public EventList createEventList() {
        return new EventList();
    }

    /**
     * Create an instance of {@link EventListResponse }
     * 
     */
    public EventListResponse createEventListResponse() {
        return new EventListResponse();
    }

    /**
     * Create an instance of {@link EventResultList }
     * 
     */
    public EventResultList createEventResultList() {
        return new EventResultList();
    }

    /**
     * Create an instance of {@link EventListNode }
     * 
     */
    public EventListNode createEventListNode() {
        return new EventListNode();
    }

    /**
     * Create an instance of {@link EventListNodeResponse }
     * 
     */
    public EventListNodeResponse createEventListNodeResponse() {
        return new EventListNodeResponse();
    }

    /**
     * Create an instance of {@link ExternalNodeEvent }
     * 
     */
    public ExternalNodeEvent createExternalNodeEvent() {
        return new ExternalNodeEvent();
    }

    /**
     * Create an instance of {@link ExternalNodeEventResponse }
     * 
     */
    public ExternalNodeEventResponse createExternalNodeEventResponse() {
        return new ExternalNodeEventResponse();
    }

    /**
     * Create an instance of {@link NodeActionResult }
     * 
     */
    public NodeActionResult createNodeActionResult() {
        return new NodeActionResult();
    }

    /**
     * Create an instance of {@link ExternalServerEvent }
     * 
     */
    public ExternalServerEvent createExternalServerEvent() {
        return new ExternalServerEvent();
    }

    /**
     * Create an instance of {@link ExternalServerEventResponse }
     * 
     */
    public ExternalServerEventResponse createExternalServerEventResponse() {
        return new ExternalServerEventResponse();
    }

    /**
     * Create an instance of {@link AlarmHistoryList }
     * 
     */
    public AlarmHistoryList createAlarmHistoryList() {
        return new AlarmHistoryList();
    }

    /**
     * Create an instance of {@link AlarmHistoryListResponse }
     * 
     */
    public AlarmHistoryListResponse createAlarmHistoryListResponse() {
        return new AlarmHistoryListResponse();
    }

    /**
     * Create an instance of {@link AlarmHistoryResultList }
     * 
     */
    public AlarmHistoryResultList createAlarmHistoryResultList() {
        return new AlarmHistoryResultList();
    }

    /**
     * Create an instance of {@link AlarmHistoryListNode }
     * 
     */
    public AlarmHistoryListNode createAlarmHistoryListNode() {
        return new AlarmHistoryListNode();
    }

    /**
     * Create an instance of {@link AlarmHistoryListNodeResponse }
     * 
     */
    public AlarmHistoryListNodeResponse createAlarmHistoryListNodeResponse() {
        return new AlarmHistoryListNodeResponse();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link Alarm }
     * 
     */
    public Alarm createAlarm() {
        return new Alarm();
    }

    /**
     * Create an instance of {@link AlarmResult }
     * 
     */
    public AlarmResult createAlarmResult() {
        return new AlarmResult();
    }

    /**
     * Create an instance of {@link NodeResult }
     * 
     */
    public NodeResult createNodeResult() {
        return new NodeResult();
    }

    /**
     * Create an instance of {@link NodeSimple }
     * 
     */
    public NodeSimple createNodeSimple() {
        return new NodeSimple();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link AlarmHistory }
     * 
     */
    public AlarmHistory createAlarmHistory() {
        return new AlarmHistory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Credentials")
    public JAXBElement<Credentials> createCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AlarmId", scope = AlarmHistory.class)
    public JAXBElement<Integer> createAlarmHistoryAlarmId(Integer value) {
        return new JAXBElement<Integer>(_AlarmHistoryAlarmId_QNAME, Integer.class, AlarmHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AlarmTypeId", scope = AlarmHistory.class)
    public JAXBElement<Integer> createAlarmHistoryAlarmTypeId(Integer value) {
        return new JAXBElement<Integer>(_AlarmHistoryAlarmTypeId_QNAME, Integer.class, AlarmHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceType", scope = AlarmHistory.class)
    public JAXBElement<String> createAlarmHistorySourceType(String value) {
        return new JAXBElement<String>(_AlarmHistorySourceType_QNAME, String.class, AlarmHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceIfIndex", scope = AlarmHistory.class)
    public JAXBElement<Integer> createAlarmHistorySourceIfIndex(Integer value) {
        return new JAXBElement<Integer>(_AlarmHistorySourceIfIndex_QNAME, Integer.class, AlarmHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ChangeTime", scope = AlarmHistory.class)
    public JAXBElement<XMLGregorianCalendar> createAlarmHistoryChangeTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AlarmHistoryChangeTime_QNAME, XMLGregorianCalendar.class, AlarmHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventId", scope = Event.class)
    public JAXBElement<Integer> createEventEventId(Integer value) {
        return new JAXBElement<Integer>(_EventEventId_QNAME, Integer.class, Event.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventTypeId", scope = Event.class)
    public JAXBElement<Integer> createEventEventTypeId(Integer value) {
        return new JAXBElement<Integer>(_EventEventTypeId_QNAME, Integer.class, Event.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceIfIndex", scope = Event.class)
    public JAXBElement<Integer> createEventSourceIfIndex(Integer value) {
        return new JAXBElement<Integer>(_AlarmHistorySourceIfIndex_QNAME, Integer.class, Event.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReceivedTime", scope = Event.class)
    public JAXBElement<XMLGregorianCalendar> createEventReceivedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EventReceivedTime_QNAME, XMLGregorianCalendar.class, Event.class, value);
    }

}
