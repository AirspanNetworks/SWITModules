
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuPnpSnmpDetailWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuPnpSnmpDetailWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SnmpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SnmpTimeoutInMilliSec" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SnmpVersion" type="{http://Airspan.Netspan.WebServices}SnmpAgentVersion" minOccurs="0"/>
 *         &lt;element name="SnmpReadContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SnmpWriteContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Snmpv3Access" type="{http://Airspan.Netspan.WebServices}Snmpv3AccessTypes" minOccurs="0"/>
 *         &lt;element name="Snmpv3Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuPnpSnmpDetailWs", propOrder = {
    "snmpPort",
    "snmpTimeoutInMilliSec",
    "snmpVersion",
    "snmpReadContext",
    "snmpWriteContext",
    "snmpv3Access",
    "snmpv3Password"
})
public class AuPnpSnmpDetailWs {

    @XmlElementRef(name = "SnmpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> snmpPort;
    @XmlElementRef(name = "SnmpTimeoutInMilliSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snmpTimeoutInMilliSec;
    @XmlElementRef(name = "SnmpVersion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SnmpAgentVersion> snmpVersion;
    @XmlElement(name = "SnmpReadContext")
    protected String snmpReadContext;
    @XmlElement(name = "SnmpWriteContext")
    protected String snmpWriteContext;
    @XmlElementRef(name = "Snmpv3Access", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Snmpv3AccessTypes> snmpv3Access;
    @XmlElement(name = "Snmpv3Password")
    protected String snmpv3Password;

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
     * Gets the value of the snmpTimeoutInMilliSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnmpTimeoutInMilliSec() {
        return snmpTimeoutInMilliSec;
    }

    /**
     * Sets the value of the snmpTimeoutInMilliSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnmpTimeoutInMilliSec(JAXBElement<Double> value) {
        this.snmpTimeoutInMilliSec = value;
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
     * Gets the value of the snmpReadContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpReadContext() {
        return snmpReadContext;
    }

    /**
     * Sets the value of the snmpReadContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpReadContext(String value) {
        this.snmpReadContext = value;
    }

    /**
     * Gets the value of the snmpWriteContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpWriteContext() {
        return snmpWriteContext;
    }

    /**
     * Sets the value of the snmpWriteContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpWriteContext(String value) {
        this.snmpWriteContext = value;
    }

    /**
     * Gets the value of the snmpv3Access property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}
     *     
     */
    public JAXBElement<Snmpv3AccessTypes> getSnmpv3Access() {
        return snmpv3Access;
    }

    /**
     * Sets the value of the snmpv3Access property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}
     *     
     */
    public void setSnmpv3Access(JAXBElement<Snmpv3AccessTypes> value) {
        this.snmpv3Access = value;
    }

    /**
     * Gets the value of the snmpv3Password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpv3Password() {
        return snmpv3Password;
    }

    /**
     * Sets the value of the snmpv3Password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpv3Password(String value) {
        this.snmpv3Password = value;
    }

}
