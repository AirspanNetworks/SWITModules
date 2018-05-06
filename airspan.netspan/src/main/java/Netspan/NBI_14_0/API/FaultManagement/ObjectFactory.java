
package Netspan.NBI_14_0.API.FaultManagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_14_0.API.FaultManagement package. 
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_14_0.API.FaultManagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlarmListNode }
     * 
     */
    public AlarmListNode createAlarmListNode() {
        return new AlarmListNode();
    }

    /**
     * Create an instance of {@link AlarmUnacknowledgeResponse }
     * 
     */
    public AlarmUnacknowledgeResponse createAlarmUnacknowledgeResponse() {
        return new AlarmUnacknowledgeResponse();
    }

    /**
     * Create an instance of {@link AlarmActionResult }
     * 
     */
    public AlarmActionResult createAlarmActionResult() {
        return new AlarmActionResult();
    }

    /**
     * Create an instance of {@link AlarmReleaseResponse }
     * 
     */
    public AlarmReleaseResponse createAlarmReleaseResponse() {
        return new AlarmReleaseResponse();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link AlarmDelete }
     * 
     */
    public AlarmDelete createAlarmDelete() {
        return new AlarmDelete();
    }

    /**
     * Create an instance of {@link AlarmAcknowledgeResponse }
     * 
     */
    public AlarmAcknowledgeResponse createAlarmAcknowledgeResponse() {
        return new AlarmAcknowledgeResponse();
    }

    /**
     * Create an instance of {@link AlarmDeleteResponse }
     * 
     */
    public AlarmDeleteResponse createAlarmDeleteResponse() {
        return new AlarmDeleteResponse();
    }

    /**
     * Create an instance of {@link AlarmListChanged }
     * 
     */
    public AlarmListChanged createAlarmListChanged() {
        return new AlarmListChanged();
    }

    /**
     * Create an instance of {@link AlarmUnacknowledge }
     * 
     */
    public AlarmUnacknowledge createAlarmUnacknowledge() {
        return new AlarmUnacknowledge();
    }

    /**
     * Create an instance of {@link AlarmListChangedResponse }
     * 
     */
    public AlarmListChangedResponse createAlarmListChangedResponse() {
        return new AlarmListChangedResponse();
    }

    /**
     * Create an instance of {@link AlarmResultList }
     * 
     */
    public AlarmResultList createAlarmResultList() {
        return new AlarmResultList();
    }

    /**
     * Create an instance of {@link AlarmAcknowledge }
     * 
     */
    public AlarmAcknowledge createAlarmAcknowledge() {
        return new AlarmAcknowledge();
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
     * Create an instance of {@link AlarmListNodeResponse }
     * 
     */
    public AlarmListNodeResponse createAlarmListNodeResponse() {
        return new AlarmListNodeResponse();
    }

    /**
     * Create an instance of {@link AlarmRelease }
     * 
     */
    public AlarmRelease createAlarmRelease() {
        return new AlarmRelease();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link AlarmResult }
     * 
     */
    public AlarmResult createAlarmResult() {
        return new AlarmResult();
    }

    /**
     * Create an instance of {@link Alarm }
     * 
     */
    public Alarm createAlarm() {
        return new Alarm();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Credentials")
    public JAXBElement<Credentials> createCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, null, value);
    }

}
