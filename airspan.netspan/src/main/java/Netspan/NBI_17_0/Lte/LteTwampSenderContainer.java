
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteTwampSenderContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteTwampSenderContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://Airspan.Netspan.WebServices}TwampSenderModeValues" minOccurs="0"/&gt;
 *         &lt;element name="UdpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TcpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PacketTxRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DvCalculationMode" type="{http://Airspan.Netspan.WebServices}TwampSenderDvCalculationModeValues" minOccurs="0"/&gt;
 *         &lt;element name="TestDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SkipDiscardUnsyncedReflectorTestPackets" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxReflectorUdpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxSenderTcpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinReflectorUdpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinSenderTcpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PacketSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReflectorServerFqdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteTwampSenderContainer", propOrder = {
    "mode",
    "udpPort",
    "tcpPort",
    "packetTxRate",
    "dvCalculationMode",
    "testDuration",
    "skipDiscardUnsyncedReflectorTestPackets",
    "ipAddress",
    "port",
    "maxReflectorUdpPort",
    "maxSenderTcpPort",
    "minReflectorUdpPort",
    "minSenderTcpPort",
    "packetSize",
    "reflectorServerFqdn"
})
public class LteTwampSenderContainer {

    @XmlElementRef(name = "Mode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TwampSenderModeValues> mode;
    @XmlElementRef(name = "UdpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> udpPort;
    @XmlElementRef(name = "TcpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tcpPort;
    @XmlElementRef(name = "PacketTxRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packetTxRate;
    @XmlElementRef(name = "DvCalculationMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TwampSenderDvCalculationModeValues> dvCalculationMode;
    @XmlElementRef(name = "TestDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> testDuration;
    @XmlElementRef(name = "SkipDiscardUnsyncedReflectorTestPackets", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> skipDiscardUnsyncedReflectorTestPackets;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElementRef(name = "Port", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> port;
    @XmlElementRef(name = "MaxReflectorUdpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxReflectorUdpPort;
    @XmlElementRef(name = "MaxSenderTcpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxSenderTcpPort;
    @XmlElementRef(name = "MinReflectorUdpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minReflectorUdpPort;
    @XmlElementRef(name = "MinSenderTcpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minSenderTcpPort;
    @XmlElementRef(name = "PacketSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packetSize;
    @XmlElement(name = "ReflectorServerFqdn")
    protected String reflectorServerFqdn;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TwampSenderModeValues }{@code >}
     *     
     */
    public JAXBElement<TwampSenderModeValues> getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TwampSenderModeValues }{@code >}
     *     
     */
    public void setMode(JAXBElement<TwampSenderModeValues> value) {
        this.mode = value;
    }

    /**
     * Gets the value of the udpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUdpPort() {
        return udpPort;
    }

    /**
     * Sets the value of the udpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUdpPort(JAXBElement<Integer> value) {
        this.udpPort = value;
    }

    /**
     * Gets the value of the tcpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTcpPort() {
        return tcpPort;
    }

    /**
     * Sets the value of the tcpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTcpPort(JAXBElement<Integer> value) {
        this.tcpPort = value;
    }

    /**
     * Gets the value of the packetTxRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPacketTxRate() {
        return packetTxRate;
    }

    /**
     * Sets the value of the packetTxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPacketTxRate(JAXBElement<Integer> value) {
        this.packetTxRate = value;
    }

    /**
     * Gets the value of the dvCalculationMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TwampSenderDvCalculationModeValues }{@code >}
     *     
     */
    public JAXBElement<TwampSenderDvCalculationModeValues> getDvCalculationMode() {
        return dvCalculationMode;
    }

    /**
     * Sets the value of the dvCalculationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TwampSenderDvCalculationModeValues }{@code >}
     *     
     */
    public void setDvCalculationMode(JAXBElement<TwampSenderDvCalculationModeValues> value) {
        this.dvCalculationMode = value;
    }

    /**
     * Gets the value of the testDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTestDuration() {
        return testDuration;
    }

    /**
     * Sets the value of the testDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTestDuration(JAXBElement<Integer> value) {
        this.testDuration = value;
    }

    /**
     * Gets the value of the skipDiscardUnsyncedReflectorTestPackets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSkipDiscardUnsyncedReflectorTestPackets() {
        return skipDiscardUnsyncedReflectorTestPackets;
    }

    /**
     * Sets the value of the skipDiscardUnsyncedReflectorTestPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSkipDiscardUnsyncedReflectorTestPackets(JAXBElement<EnabledDisabledStates> value) {
        this.skipDiscardUnsyncedReflectorTestPackets = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPort(JAXBElement<Integer> value) {
        this.port = value;
    }

    /**
     * Gets the value of the maxReflectorUdpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxReflectorUdpPort() {
        return maxReflectorUdpPort;
    }

    /**
     * Sets the value of the maxReflectorUdpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxReflectorUdpPort(JAXBElement<Integer> value) {
        this.maxReflectorUdpPort = value;
    }

    /**
     * Gets the value of the maxSenderTcpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxSenderTcpPort() {
        return maxSenderTcpPort;
    }

    /**
     * Sets the value of the maxSenderTcpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxSenderTcpPort(JAXBElement<Integer> value) {
        this.maxSenderTcpPort = value;
    }

    /**
     * Gets the value of the minReflectorUdpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinReflectorUdpPort() {
        return minReflectorUdpPort;
    }

    /**
     * Sets the value of the minReflectorUdpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinReflectorUdpPort(JAXBElement<Integer> value) {
        this.minReflectorUdpPort = value;
    }

    /**
     * Gets the value of the minSenderTcpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinSenderTcpPort() {
        return minSenderTcpPort;
    }

    /**
     * Sets the value of the minSenderTcpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinSenderTcpPort(JAXBElement<Integer> value) {
        this.minSenderTcpPort = value;
    }

    /**
     * Gets the value of the packetSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPacketSize() {
        return packetSize;
    }

    /**
     * Sets the value of the packetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPacketSize(JAXBElement<Integer> value) {
        this.packetSize = value;
    }

    /**
     * Gets the value of the reflectorServerFqdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReflectorServerFqdn() {
        return reflectorServerFqdn;
    }

    /**
     * Sets the value of the reflectorServerFqdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReflectorServerFqdn(String value) {
        this.reflectorServerFqdn = value;
    }

}
