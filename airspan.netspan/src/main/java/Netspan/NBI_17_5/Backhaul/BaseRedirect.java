
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseRedirect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRedirect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelayHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelaySnmpIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelaySnmpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RelaySnmpVersion" type="{http://Airspan.Netspan.WebServices}SnmpAgentVersion" minOccurs="0"/&gt;
 *         &lt;element name="RelaySnmpPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRedirect", propOrder = {
    "relayHardwareId",
    "relaySnmpIpAddress",
    "relaySnmpPort",
    "relaySnmpVersion",
    "relaySnmpPassword"
})
@XmlSeeAlso({
    RelayRedirectDetailWs.class,
    RelayEnbErrorDetailWs.class
})
public abstract class BaseRedirect {

    @XmlElement(name = "RelayHardwareId")
    protected String relayHardwareId;
    @XmlElement(name = "RelaySnmpIpAddress")
    protected String relaySnmpIpAddress;
    @XmlElementRef(name = "RelaySnmpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> relaySnmpPort;
    @XmlElementRef(name = "RelaySnmpVersion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SnmpAgentVersion> relaySnmpVersion;
    @XmlElement(name = "RelaySnmpPassword")
    protected String relaySnmpPassword;

    /**
     * Gets the value of the relayHardwareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayHardwareId() {
        return relayHardwareId;
    }

    /**
     * Sets the value of the relayHardwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayHardwareId(String value) {
        this.relayHardwareId = value;
    }

    /**
     * Gets the value of the relaySnmpIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaySnmpIpAddress() {
        return relaySnmpIpAddress;
    }

    /**
     * Sets the value of the relaySnmpIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaySnmpIpAddress(String value) {
        this.relaySnmpIpAddress = value;
    }

    /**
     * Gets the value of the relaySnmpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRelaySnmpPort() {
        return relaySnmpPort;
    }

    /**
     * Sets the value of the relaySnmpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRelaySnmpPort(JAXBElement<Integer> value) {
        this.relaySnmpPort = value;
    }

    /**
     * Gets the value of the relaySnmpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}
     *     
     */
    public JAXBElement<SnmpAgentVersion> getRelaySnmpVersion() {
        return relaySnmpVersion;
    }

    /**
     * Sets the value of the relaySnmpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}
     *     
     */
    public void setRelaySnmpVersion(JAXBElement<SnmpAgentVersion> value) {
        this.relaySnmpVersion = value;
    }

    /**
     * Gets the value of the relaySnmpPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaySnmpPassword() {
        return relaySnmpPassword;
    }

    /**
     * Sets the value of the relaySnmpPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaySnmpPassword(String value) {
        this.relaySnmpPassword = value;
    }

}
