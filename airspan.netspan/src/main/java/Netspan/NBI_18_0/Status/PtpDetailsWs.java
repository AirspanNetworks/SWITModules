
package Netspan.NBI_18_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PtpDetailsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtpDetailsWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MasterConnectivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveMasterStatus" type="{http://Airspan.Netspan.WebServices}ActivePtpTypesWs" minOccurs="0"/&gt;
 *         &lt;element name="CurrentGrandMasterClockClass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CurrentUtcOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtpDetailsWs", propOrder = {
    "masterConnectivity",
    "activeMasterStatus",
    "currentGrandMasterClockClass",
    "currentUtcOffset"
})
public class PtpDetailsWs {

    @XmlElement(name = "MasterConnectivity")
    protected String masterConnectivity;
    @XmlElementRef(name = "ActiveMasterStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ActivePtpTypesWs> activeMasterStatus;
    @XmlElementRef(name = "CurrentGrandMasterClockClass", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> currentGrandMasterClockClass;
    @XmlElementRef(name = "CurrentUtcOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> currentUtcOffset;

    /**
     * Gets the value of the masterConnectivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterConnectivity() {
        return masterConnectivity;
    }

    /**
     * Sets the value of the masterConnectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterConnectivity(String value) {
        this.masterConnectivity = value;
    }

    /**
     * Gets the value of the activeMasterStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivePtpTypesWs }{@code >}
     *     
     */
    public JAXBElement<ActivePtpTypesWs> getActiveMasterStatus() {
        return activeMasterStatus;
    }

    /**
     * Sets the value of the activeMasterStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivePtpTypesWs }{@code >}
     *     
     */
    public void setActiveMasterStatus(JAXBElement<ActivePtpTypesWs> value) {
        this.activeMasterStatus = value;
    }

    /**
     * Gets the value of the currentGrandMasterClockClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCurrentGrandMasterClockClass() {
        return currentGrandMasterClockClass;
    }

    /**
     * Sets the value of the currentGrandMasterClockClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCurrentGrandMasterClockClass(JAXBElement<Integer> value) {
        this.currentGrandMasterClockClass = value;
    }

    /**
     * Gets the value of the currentUtcOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCurrentUtcOffset() {
        return currentUtcOffset;
    }

    /**
     * Sets the value of the currentUtcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCurrentUtcOffset(JAXBElement<Integer> value) {
        this.currentUtcOffset = value;
    }

}
