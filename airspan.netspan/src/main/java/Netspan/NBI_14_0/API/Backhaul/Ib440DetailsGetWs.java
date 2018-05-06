
package Netspan.NBI_14_0.API.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib440DetailsGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440DetailsGetWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hardware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagedMode" type="{http://Airspan.Netspan.WebServices}NodeManagementModeType"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigMode" type="{http://Airspan.Netspan.WebServices}ConfigNames"/>
 *         &lt;element name="WirelessProtocol" type="{http://Airspan.Netspan.WebServices}WirelessProtocolTypes"/>
 *         &lt;element name="Band" type="{http://Airspan.Netspan.WebServices}BandValues"/>
 *         &lt;element name="HtSupportedMcs" type="{http://Airspan.Netspan.WebServices}HtSupportedMcsTypes"/>
 *         &lt;element name="VhtSupportedMcs" type="{http://Airspan.Netspan.WebServices}VhtSupportedMcsTypes"/>
 *         &lt;element name="CellRadiusRange" type="{http://Airspan.Netspan.WebServices}CellRadiusRanges"/>
 *         &lt;element name="GuardInterval" type="{http://Airspan.Netspan.WebServices}GuardIntervalTypes"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Bandwidth" type="{http://Airspan.Netspan.WebServices}BsIb11acBandwidthValues"/>
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440DetailsGetWs", propOrder = {
    "name",
    "hardware",
    "description",
    "managedMode",
    "site",
    "region",
    "configMode",
    "wirelessProtocol",
    "band",
    "htSupportedMcs",
    "vhtSupportedMcs",
    "cellRadiusRange",
    "guardInterval",
    "frequency",
    "bandwidth",
    "txPower"
})
public class Ib440DetailsGetWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Hardware")
    protected String hardware;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ManagedMode", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected NodeManagementModeType managedMode;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "ConfigMode", required = true)
    @XmlSchemaType(name = "string")
    protected ConfigNames configMode;
    @XmlElement(name = "WirelessProtocol", required = true)
    @XmlSchemaType(name = "string")
    protected WirelessProtocolTypes wirelessProtocol;
    @XmlElement(name = "Band", required = true)
    protected String band;
    @XmlElement(name = "HtSupportedMcs", required = true)
    @XmlSchemaType(name = "string")
    protected HtSupportedMcsTypes htSupportedMcs;
    @XmlElement(name = "VhtSupportedMcs", required = true)
    @XmlSchemaType(name = "string")
    protected VhtSupportedMcsTypes vhtSupportedMcs;
    @XmlElement(name = "CellRadiusRange", required = true)
    @XmlSchemaType(name = "string")
    protected CellRadiusRanges cellRadiusRange;
    @XmlElement(name = "GuardInterval", required = true)
    @XmlSchemaType(name = "string")
    protected GuardIntervalTypes guardInterval;
    @XmlElement(name = "Frequency", required = true, type = Integer.class, nillable = true)
    protected Integer frequency;
    @XmlElement(name = "Bandwidth", required = true, nillable = true)
    protected String bandwidth;
    @XmlElement(name = "TxPower", required = true, type = Integer.class, nillable = true)
    protected Integer txPower;

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
     * Gets the value of the hardware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardware() {
        return hardware;
    }

    /**
     * Sets the value of the hardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardware(String value) {
        this.hardware = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the managedMode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementModeType }
     *     
     */
    public NodeManagementModeType getManagedMode() {
        return managedMode;
    }

    /**
     * Sets the value of the managedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementModeType }
     *     
     */
    public void setManagedMode(NodeManagementModeType value) {
        this.managedMode = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the configMode property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigNames }
     *     
     */
    public ConfigNames getConfigMode() {
        return configMode;
    }

    /**
     * Sets the value of the configMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigNames }
     *     
     */
    public void setConfigMode(ConfigNames value) {
        this.configMode = value;
    }

    /**
     * Gets the value of the wirelessProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link WirelessProtocolTypes }
     *     
     */
    public WirelessProtocolTypes getWirelessProtocol() {
        return wirelessProtocol;
    }

    /**
     * Sets the value of the wirelessProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link WirelessProtocolTypes }
     *     
     */
    public void setWirelessProtocol(WirelessProtocolTypes value) {
        this.wirelessProtocol = value;
    }

    /**
     * Gets the value of the band property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBand() {
        return band;
    }

    /**
     * Sets the value of the band property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBand(String value) {
        this.band = value;
    }

    /**
     * Gets the value of the htSupportedMcs property.
     * 
     * @return
     *     possible object is
     *     {@link HtSupportedMcsTypes }
     *     
     */
    public HtSupportedMcsTypes getHtSupportedMcs() {
        return htSupportedMcs;
    }

    /**
     * Sets the value of the htSupportedMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HtSupportedMcsTypes }
     *     
     */
    public void setHtSupportedMcs(HtSupportedMcsTypes value) {
        this.htSupportedMcs = value;
    }

    /**
     * Gets the value of the vhtSupportedMcs property.
     * 
     * @return
     *     possible object is
     *     {@link VhtSupportedMcsTypes }
     *     
     */
    public VhtSupportedMcsTypes getVhtSupportedMcs() {
        return vhtSupportedMcs;
    }

    /**
     * Sets the value of the vhtSupportedMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VhtSupportedMcsTypes }
     *     
     */
    public void setVhtSupportedMcs(VhtSupportedMcsTypes value) {
        this.vhtSupportedMcs = value;
    }

    /**
     * Gets the value of the cellRadiusRange property.
     * 
     * @return
     *     possible object is
     *     {@link CellRadiusRanges }
     *     
     */
    public CellRadiusRanges getCellRadiusRange() {
        return cellRadiusRange;
    }

    /**
     * Sets the value of the cellRadiusRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellRadiusRanges }
     *     
     */
    public void setCellRadiusRange(CellRadiusRanges value) {
        this.cellRadiusRange = value;
    }

    /**
     * Gets the value of the guardInterval property.
     * 
     * @return
     *     possible object is
     *     {@link GuardIntervalTypes }
     *     
     */
    public GuardIntervalTypes getGuardInterval() {
        return guardInterval;
    }

    /**
     * Sets the value of the guardInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuardIntervalTypes }
     *     
     */
    public void setGuardInterval(GuardIntervalTypes value) {
        this.guardInterval = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequency(Integer value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidth(String value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the txPower property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTxPower() {
        return txPower;
    }

    /**
     * Sets the value of the txPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTxPower(Integer value) {
        this.txPower = value;
    }

}
