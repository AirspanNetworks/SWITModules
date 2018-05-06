
package Netspan.NBI_14_0.API.Lte;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.ConnectedModeEventTypes;
import Netspan.API.Enums.TriggerQuantityTypes;


/**
 * <p>Java class for MobilityConnectedModeFreq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedModeFreq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{http://Airspan.Netspan.WebServices}ConnectedModeEventTypes"/>
 *         &lt;element name="TriggerQuantity" type="{http://Airspan.Netspan.WebServices}TriggerQuantityTypes"/>
 *         &lt;element name="RsrpEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RsrpEventThreshold2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="A3Offset" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Hysteresis" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TimeToTrigger" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedModeFreq", propOrder = {
    "eventType",
    "triggerQuantity",
    "rsrpEventThreshold1",
    "rsrpEventThreshold2",
    "a3Offset",
    "hysteresis",
    "timeToTrigger"
})
public class MobilityConnectedModeFreq {

    @XmlElement(name = "EventType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ConnectedModeEventTypes eventType;
    @XmlElement(name = "TriggerQuantity", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TriggerQuantityTypes triggerQuantity;
    @XmlElement(name = "RsrpEventThreshold1", required = true, type = Integer.class, nillable = true)
    protected Integer rsrpEventThreshold1;
    @XmlElement(name = "RsrpEventThreshold2", required = true, type = Integer.class, nillable = true)
    protected Integer rsrpEventThreshold2;
    @XmlElement(name = "A3Offset", required = true, nillable = true)
    protected BigDecimal a3Offset;
    @XmlElement(name = "Hysteresis", required = true, nillable = true)
    protected BigDecimal hysteresis;
    @XmlElement(name = "TimeToTrigger", required = true, nillable = true)
    protected String timeToTrigger;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectedModeEventTypes }
     *     
     */
    public ConnectedModeEventTypes getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectedModeEventTypes }
     *     
     */
    public void setEventType(ConnectedModeEventTypes value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the triggerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerQuantityTypes }
     *     
     */
    public TriggerQuantityTypes getTriggerQuantity() {
        return triggerQuantity;
    }

    /**
     * Sets the value of the triggerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerQuantityTypes }
     *     
     */
    public void setTriggerQuantity(TriggerQuantityTypes value) {
        this.triggerQuantity = value;
    }

    /**
     * Gets the value of the rsrpEventThreshold1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsrpEventThreshold1() {
        return rsrpEventThreshold1;
    }

    /**
     * Sets the value of the rsrpEventThreshold1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsrpEventThreshold1(Integer value) {
        this.rsrpEventThreshold1 = value;
    }

    /**
     * Gets the value of the rsrpEventThreshold2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsrpEventThreshold2() {
        return rsrpEventThreshold2;
    }

    /**
     * Sets the value of the rsrpEventThreshold2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsrpEventThreshold2(Integer value) {
        this.rsrpEventThreshold2 = value;
    }

    /**
     * Gets the value of the a3Offset property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getA3Offset() {
        return a3Offset;
    }

    /**
     * Sets the value of the a3Offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setA3Offset(BigDecimal value) {
        this.a3Offset = value;
    }

    /**
     * Gets the value of the hysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHysteresis() {
        return hysteresis;
    }

    /**
     * Sets the value of the hysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHysteresis(BigDecimal value) {
        this.hysteresis = value;
    }

    /**
     * Gets the value of the timeToTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeToTrigger() {
        return timeToTrigger;
    }

    /**
     * Sets the value of the timeToTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeToTrigger(String value) {
        this.timeToTrigger = value;
    }

}
