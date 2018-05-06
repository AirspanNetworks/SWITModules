
package Netspan.NBI_15_1.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayRedirectDetailWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayRedirectDetailWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelayHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelaySnmpIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelaySnmpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelaySnmpVersion" type="{http://Airspan.Netspan.WebServices}SnmpAgentVersion" minOccurs="0"/>
 *         &lt;element name="RelaySnmpPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NmsSnmpServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NmsSnmpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayRedirectDetailWs", propOrder = {
    "relayHardwareId",
    "relaySnmpIpAddress",
    "relaySnmpPort",
    "relaySnmpVersion",
    "relaySnmpPassword",
    "nmsSnmpServer",
    "nmsSnmpPort"
})
public class RelayRedirectDetailWs {

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
    @XmlElement(name = "NmsSnmpServer")
    protected String nmsSnmpServer;
    @XmlElementRef(name = "NmsSnmpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nmsSnmpPort;

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

    /**
     * Gets the value of the nmsSnmpServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmsSnmpServer() {
        return nmsSnmpServer;
    }

    /**
     * Sets the value of the nmsSnmpServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmsSnmpServer(String value) {
        this.nmsSnmpServer = value;
    }

    /**
     * Gets the value of the nmsSnmpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNmsSnmpPort() {
        return nmsSnmpPort;
    }

    /**
     * Sets the value of the nmsSnmpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNmsSnmpPort(JAXBElement<Integer> value) {
        this.nmsSnmpPort = value;
    }

}
