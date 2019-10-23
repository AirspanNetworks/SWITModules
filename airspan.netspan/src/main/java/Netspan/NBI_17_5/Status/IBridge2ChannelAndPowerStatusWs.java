
package Netspan.NBI_17_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2ChannelAndPowerStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2ChannelAndPowerStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegulatoryDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutoChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ChannelWidthMHz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CenterFrequencyMhz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BaseAntennaGainDbi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TermAntennaGainDbi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoPowerMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxPowerDbm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2ChannelAndPowerStatusWs", propOrder = {
    "regulatoryDomain",
    "autoChannel",
    "channelWidthMHz",
    "centerFrequencyMhz",
    "baseAntennaGainDbi",
    "termAntennaGainDbi",
    "autoPowerMode",
    "txPowerDbm"
})
public class IBridge2ChannelAndPowerStatusWs {

    @XmlElement(name = "RegulatoryDomain")
    protected String regulatoryDomain;
    @XmlElementRef(name = "AutoChannel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> autoChannel;
    @XmlElement(name = "ChannelWidthMHz")
    protected String channelWidthMHz;
    @XmlElementRef(name = "CenterFrequencyMhz", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> centerFrequencyMhz;
    @XmlElementRef(name = "BaseAntennaGainDbi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> baseAntennaGainDbi;
    @XmlElementRef(name = "TermAntennaGainDbi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> termAntennaGainDbi;
    @XmlElementRef(name = "AutoPowerMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoPowerMode;
    @XmlElementRef(name = "TxPowerDbm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPowerDbm;

    /**
     * Gets the value of the regulatoryDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatoryDomain() {
        return regulatoryDomain;
    }

    /**
     * Sets the value of the regulatoryDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatoryDomain(String value) {
        this.regulatoryDomain = value;
    }

    /**
     * Gets the value of the autoChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutoChannel() {
        return autoChannel;
    }

    /**
     * Sets the value of the autoChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutoChannel(JAXBElement<Boolean> value) {
        this.autoChannel = value;
    }

    /**
     * Gets the value of the channelWidthMHz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelWidthMHz() {
        return channelWidthMHz;
    }

    /**
     * Sets the value of the channelWidthMHz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelWidthMHz(String value) {
        this.channelWidthMHz = value;
    }

    /**
     * Gets the value of the centerFrequencyMhz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCenterFrequencyMhz() {
        return centerFrequencyMhz;
    }

    /**
     * Sets the value of the centerFrequencyMhz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCenterFrequencyMhz(JAXBElement<Integer> value) {
        this.centerFrequencyMhz = value;
    }

    /**
     * Gets the value of the baseAntennaGainDbi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBaseAntennaGainDbi() {
        return baseAntennaGainDbi;
    }

    /**
     * Sets the value of the baseAntennaGainDbi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBaseAntennaGainDbi(JAXBElement<Integer> value) {
        this.baseAntennaGainDbi = value;
    }

    /**
     * Gets the value of the termAntennaGainDbi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTermAntennaGainDbi() {
        return termAntennaGainDbi;
    }

    /**
     * Sets the value of the termAntennaGainDbi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTermAntennaGainDbi(JAXBElement<Integer> value) {
        this.termAntennaGainDbi = value;
    }

    /**
     * Gets the value of the autoPowerMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoPowerMode() {
        return autoPowerMode;
    }

    /**
     * Sets the value of the autoPowerMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoPowerMode(JAXBElement<Integer> value) {
        this.autoPowerMode = value;
    }

    /**
     * Gets the value of the txPowerDbm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxPowerDbm() {
        return txPowerDbm;
    }

    /**
     * Sets the value of the txPowerDbm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxPowerDbm(JAXBElement<Integer> value) {
        this.txPowerDbm = value;
    }

}
