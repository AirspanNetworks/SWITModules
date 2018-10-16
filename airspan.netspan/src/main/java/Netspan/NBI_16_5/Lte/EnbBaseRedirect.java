
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.SnmpAgentVersion;


/**
 * <p>Java class for EnbBaseRedirect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbBaseRedirect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SnmpVersion" type="{http://Airspan.Netspan.WebServices}SnmpAgentVersion" minOccurs="0"/&gt;
 *         &lt;element name="SnmpPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbBaseRedirect", propOrder = {
    "hardwareId",
    "snmpIpAddress",
    "snmpPort",
    "snmpVersion",
    "snmpPassword"
})
@XmlSeeAlso({
    EnbRedirectDetailWs.class
})
public abstract class EnbBaseRedirect {

    @XmlElement(name = "HardwareId")
    protected String hardwareId;
    @XmlElement(name = "SnmpIpAddress")
    protected String snmpIpAddress;
    @XmlElementRef(name = "SnmpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> snmpPort;
    @XmlElementRef(name = "SnmpVersion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SnmpAgentVersion> snmpVersion;
    @XmlElement(name = "SnmpPassword")
    protected String snmpPassword;

    /**
     * Gets the value of the hardwareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareId() {
        return hardwareId;
    }

    /**
     * Sets the value of the hardwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareId(String value) {
        this.hardwareId = value;
    }

    /**
     * Gets the value of the snmpIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpIpAddress() {
        return snmpIpAddress;
    }

    /**
     * Sets the value of the snmpIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpIpAddress(String value) {
        this.snmpIpAddress = value;
    }

    /**
     * Gets the value of the snmpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSnmpPort() {
        return snmpPort;
    }

    /**
     * Sets the value of the snmpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSnmpPort(JAXBElement<Integer> value) {
        this.snmpPort = value;
    }

    /**
     * Gets the value of the snmpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}
     *     
     */
    public JAXBElement<SnmpAgentVersion> getSnmpVersion() {
        return snmpVersion;
    }

    /**
     * Sets the value of the snmpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}
     *     
     */
    public void setSnmpVersion(JAXBElement<SnmpAgentVersion> value) {
        this.snmpVersion = value;
    }

    /**
     * Gets the value of the snmpPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpPassword() {
        return snmpPassword;
    }

    /**
     * Sets the value of the snmpPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpPassword(String value) {
        this.snmpPassword = value;
    }

}
