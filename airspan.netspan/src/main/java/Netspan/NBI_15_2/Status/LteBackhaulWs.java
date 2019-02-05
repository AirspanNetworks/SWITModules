
package Netspan.NBI_15_2.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteBackhaulWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteBackhaulWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EthernetDuplex" type="{http://Airspan.Netspan.WebServices}DuplexType" minOccurs="0"/&gt;
 *         &lt;element name="EthernetRate" type="{http://Airspan.Netspan.WebServices}EthernetRateType" minOccurs="0"/&gt;
 *         &lt;element name="PortType" type="{http://Airspan.Netspan.WebServices}PortTypes" minOccurs="0"/&gt;
 *         &lt;element name="AutoNegConfig" type="{http://Airspan.Netspan.WebServices}EnabledDisabled" minOccurs="0"/&gt;
 *         &lt;element name="PortStatus" type="{http://Airspan.Netspan.WebServices}PortOperationalStatus" minOccurs="0"/&gt;
 *         &lt;element name="PortSpeed" type="{http://Airspan.Netspan.WebServices}EthernetRateType" minOccurs="0"/&gt;
 *         &lt;element name="FlowControlStatus" type="{http://Airspan.Netspan.WebServices}EnabledDisabled" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteBackhaulWs", propOrder = {
    "name",
    "ethernetDuplex",
    "ethernetRate",
    "portType",
    "autoNegConfig",
    "portStatus",
    "portSpeed",
    "flowControlStatus"
})
public class LteBackhaulWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "EthernetDuplex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DuplexType> ethernetDuplex;
    @XmlElementRef(name = "EthernetRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ethernetRate;
    @XmlElementRef(name = "PortType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portType;
    @XmlElementRef(name = "AutoNegConfig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabled> autoNegConfig;
    @XmlElementRef(name = "PortStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portStatus;
    @XmlElementRef(name = "PortSpeed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portSpeed;
    @XmlElementRef(name = "FlowControlStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabled> flowControlStatus;

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
     * Gets the value of the ethernetDuplex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DuplexType }{@code >}
     *     
     */
    public JAXBElement<DuplexType> getEthernetDuplex() {
        return ethernetDuplex;
    }

    /**
     * Sets the value of the ethernetDuplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DuplexType }{@code >}
     *     
     */
    public void setEthernetDuplex(JAXBElement<DuplexType> value) {
        this.ethernetDuplex = value;
    }

    /**
     * Gets the value of the ethernetRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEthernetRate() {
        return ethernetRate;
    }

    /**
     * Sets the value of the ethernetRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEthernetRate(JAXBElement<String> value) {
        this.ethernetRate = value;
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortType(JAXBElement<String> value) {
        this.portType = value;
    }

    /**
     * Gets the value of the autoNegConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabled }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabled> getAutoNegConfig() {
        return autoNegConfig;
    }

    /**
     * Sets the value of the autoNegConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabled }{@code >}
     *     
     */
    public void setAutoNegConfig(JAXBElement<EnabledDisabled> value) {
        this.autoNegConfig = value;
    }

    /**
     * Gets the value of the portStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortStatus() {
        return portStatus;
    }

    /**
     * Sets the value of the portStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortStatus(JAXBElement<String> value) {
        this.portStatus = value;
    }

    /**
     * Gets the value of the portSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortSpeed() {
        return portSpeed;
    }

    /**
     * Sets the value of the portSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortSpeed(JAXBElement<String> value) {
        this.portSpeed = value;
    }

    /**
     * Gets the value of the flowControlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabled }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabled> getFlowControlStatus() {
        return flowControlStatus;
    }

    /**
     * Sets the value of the flowControlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabled }{@code >}
     *     
     */
    public void setFlowControlStatus(JAXBElement<EnabledDisabled> value) {
        this.flowControlStatus = value;
    }

}
