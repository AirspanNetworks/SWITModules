
package Netspan.NBI_16_5.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CtsGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CtsGetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Protocol" type="{http://Airspan.Netspan.WebServices}Protocols" minOccurs="0"/&gt;
 *         &lt;element name="Fqdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SnmpVersion" type="{http://Airspan.Netspan.WebServices}AgentVersion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtsGetWs", propOrder = {
    "name",
    "protocol",
    "fqdn",
    "snmpIpAddress",
    "snmpPort",
    "snmpVersion"
})
public class CtsGetWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "Protocol", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Protocols> protocol;
    @XmlElement(name = "Fqdn")
    protected String fqdn;
    @XmlElement(name = "SnmpIpAddress")
    protected String snmpIpAddress;
    @XmlElementRef(name = "SnmpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> snmpPort;
    @XmlElementRef(name = "SnmpVersion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AgentVersion> snmpVersion;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Protocols }{@code >}
     *     
     */
    public JAXBElement<Protocols> getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Protocols }{@code >}
     *     
     */
    public void setProtocol(JAXBElement<Protocols> value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the fqdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFqdn() {
        return fqdn;
    }

    /**
     * Sets the value of the fqdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFqdn(String value) {
        this.fqdn = value;
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
     *     {@link JAXBElement }{@code <}{@link AgentVersion }{@code >}
     *     
     */
    public JAXBElement<AgentVersion> getSnmpVersion() {
        return snmpVersion;
    }

    /**
     * Sets the value of the snmpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AgentVersion }{@code >}
     *     
     */
    public void setSnmpVersion(JAXBElement<AgentVersion> value) {
        this.snmpVersion = value;
    }

}
