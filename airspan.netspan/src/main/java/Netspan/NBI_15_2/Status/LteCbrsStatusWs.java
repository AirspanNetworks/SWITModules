
package Netspan.NBI_15_2.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteCbrsStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCbrsStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CbrsEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="CbsdState" type="{http://Airspan.Netspan.WebServices}CbrsStates" minOccurs="0"/>
 *         &lt;element name="CbrsAssignedFrequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CbrsAssignedBandwidth" type="{http://Airspan.Netspan.WebServices}CbrsBandwidths" minOccurs="0"/>
 *         &lt;element name="CbrsAssignedTxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GrantExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransmissionExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCbrsStatusWs", propOrder = {
    "cbrsEnabled",
    "cbsdState",
    "cbrsAssignedFrequency",
    "cbrsAssignedBandwidth",
    "cbrsAssignedTxPower",
    "grantExpiryTime",
    "transmissionExpiryTime"
})
public class LteCbrsStatusWs {

    @XmlElementRef(name = "CbrsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> cbrsEnabled;
    @XmlElementRef(name = "CbsdState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CbrsStates> cbsdState;
    @XmlElementRef(name = "CbrsAssignedFrequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbrsAssignedFrequency;
    @XmlElementRef(name = "CbrsAssignedBandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cbrsAssignedBandwidth;
    @XmlElementRef(name = "CbrsAssignedTxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbrsAssignedTxPower;
    @XmlElementRef(name = "GrantExpiryTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> grantExpiryTime;
    @XmlElementRef(name = "TransmissionExpiryTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> transmissionExpiryTime;

    /**
     * Gets the value of the cbrsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getCbrsEnabled() {
        return cbrsEnabled;
    }

    /**
     * Sets the value of the cbrsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setCbrsEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.cbrsEnabled = value;
    }

    /**
     * Gets the value of the cbsdState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CbrsStates }{@code >}
     *     
     */
    public JAXBElement<CbrsStates> getCbsdState() {
        return cbsdState;
    }

    /**
     * Sets the value of the cbsdState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CbrsStates }{@code >}
     *     
     */
    public void setCbsdState(JAXBElement<CbrsStates> value) {
        this.cbsdState = value;
    }

    /**
     * Gets the value of the cbrsAssignedFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbrsAssignedFrequency() {
        return cbrsAssignedFrequency;
    }

    /**
     * Sets the value of the cbrsAssignedFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbrsAssignedFrequency(JAXBElement<Integer> value) {
        this.cbrsAssignedFrequency = value;
    }

    /**
     * Gets the value of the cbrsAssignedBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCbrsAssignedBandwidth() {
        return cbrsAssignedBandwidth;
    }

    /**
     * Sets the value of the cbrsAssignedBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCbrsAssignedBandwidth(JAXBElement<String> value) {
        this.cbrsAssignedBandwidth = value;
    }

    /**
     * Gets the value of the cbrsAssignedTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbrsAssignedTxPower() {
        return cbrsAssignedTxPower;
    }

    /**
     * Sets the value of the cbrsAssignedTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbrsAssignedTxPower(JAXBElement<Integer> value) {
        this.cbrsAssignedTxPower = value;
    }

    /**
     * Gets the value of the grantExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGrantExpiryTime() {
        return grantExpiryTime;
    }

    /**
     * Sets the value of the grantExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGrantExpiryTime(JAXBElement<XMLGregorianCalendar> value) {
        this.grantExpiryTime = value;
    }

    /**
     * Gets the value of the transmissionExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTransmissionExpiryTime() {
        return transmissionExpiryTime;
    }

    /**
     * Sets the value of the transmissionExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTransmissionExpiryTime(JAXBElement<XMLGregorianCalendar> value) {
        this.transmissionExpiryTime = value;
    }

}
