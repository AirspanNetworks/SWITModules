
package Netspan.NBI_17_5.FaultManagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventType" type="{http://Airspan.Netspan.WebServices}ExternalEventType"/&gt;
 *         &lt;element name="StatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlarmStatus" type="{http://Airspan.Netspan.WebServices}NodeActionStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventType",
    "statusInfo",
    "alarmStatus"
})
@XmlRootElement(name = "ExternalServerEvent")
public class ExternalServerEvent {

    @XmlElement(name = "EventType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ExternalEventType eventType;
    @XmlElement(name = "StatusInfo")
    protected String statusInfo;
    @XmlElement(name = "AlarmStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected NodeActionStatus alarmStatus;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalEventType }
     *     
     */
    public ExternalEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalEventType }
     *     
     */
    public void setEventType(ExternalEventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusInfo(String value) {
        this.statusInfo = value;
    }

    /**
     * Gets the value of the alarmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionStatus }
     *     
     */
    public NodeActionStatus getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * Sets the value of the alarmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionStatus }
     *     
     */
    public void setAlarmStatus(NodeActionStatus value) {
        this.alarmStatus = value;
    }

}
