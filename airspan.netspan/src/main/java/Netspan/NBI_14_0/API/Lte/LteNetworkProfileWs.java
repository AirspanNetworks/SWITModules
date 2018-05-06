
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for LteNetworkProfileWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteNetworkProfileWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte"/>
 *         &lt;element name="IsStandardVoLTECodec" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CodecType" type="{http://Airspan.Netspan.WebServices}VoLTECodecType"/>
 *         &lt;element name="CodecMode" type="{http://Airspan.Netspan.WebServices}VoLTECodecMode"/>
 *         &lt;element name="PacketSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PacketPeriodicity" type="{http://Airspan.Netspan.WebServices}VoLTEPeriodicity"/>
 *         &lt;element name="IsRohcProfilesQci1Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PlmnList" type="{http://Airspan.Netspan.WebServices}PlmnListContainer" minOccurs="0"/>
 *         &lt;element name="S1X2List" type="{http://Airspan.Netspan.WebServices}S1ListContainer" minOccurs="0"/>
 *         &lt;element name="CSONConfig" type="{http://Airspan.Netspan.WebServices}LteCSonEntryWs" minOccurs="0"/>
 *         &lt;element name="UlPktDataPriorityList" type="{http://Airspan.Netspan.WebServices}UlPktDataPriorityListContainer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteNetworkProfileWs", propOrder = {
    "name",
    "hardwareCategory",
    "isStandardVoLTECodec",
    "codecType",
    "codecMode",
    "packetSize",
    "packetPeriodicity",
    "isRohcProfilesQci1Enabled",
    "plmnList",
    "s1X2List",
    "csonConfig",
    "ulPktDataPriorityList"
})
public class LteNetworkProfileWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "HardwareCategory", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CategoriesLte hardwareCategory;
    @XmlElement(name = "IsStandardVoLTECodec", required = true, type = Boolean.class, nillable = true)
    protected Boolean isStandardVoLTECodec;
    @XmlElement(name = "CodecType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected VoLTECodecType codecType;
    @XmlElement(name = "CodecMode", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected VoLTECodecMode codecMode;
    @XmlElement(name = "PacketSize", required = true, type = Integer.class, nillable = true)
    protected Integer packetSize;
    @XmlElement(name = "PacketPeriodicity", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected VoLTEPeriodicity packetPeriodicity;
    @XmlElement(name = "IsRohcProfilesQci1Enabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean isRohcProfilesQci1Enabled;
    @XmlElement(name = "PlmnList")
    protected PlmnListContainer plmnList;
    @XmlElement(name = "S1X2List")
    protected S1ListContainer s1X2List;
    @XmlElement(name = "CSONConfig")
    protected LteCSonEntryWs csonConfig;
    @XmlElement(name = "UlPktDataPriorityList")
    protected UlPktDataPriorityListContainer ulPktDataPriorityList;

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
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriesLte }
     *     
     */
    public CategoriesLte getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriesLte }
     *     
     */
    public void setHardwareCategory(CategoriesLte value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the isStandardVoLTECodec property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStandardVoLTECodec() {
        return isStandardVoLTECodec;
    }

    /**
     * Sets the value of the isStandardVoLTECodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStandardVoLTECodec(Boolean value) {
        this.isStandardVoLTECodec = value;
    }

    /**
     * Gets the value of the codecType property.
     * 
     * @return
     *     possible object is
     *     {@link VoLTECodecType }
     *     
     */
    public VoLTECodecType getCodecType() {
        return codecType;
    }

    /**
     * Sets the value of the codecType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoLTECodecType }
     *     
     */
    public void setCodecType(VoLTECodecType value) {
        this.codecType = value;
    }

    /**
     * Gets the value of the codecMode property.
     * 
     * @return
     *     possible object is
     *     {@link VoLTECodecMode }
     *     
     */
    public VoLTECodecMode getCodecMode() {
        return codecMode;
    }

    /**
     * Sets the value of the codecMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoLTECodecMode }
     *     
     */
    public void setCodecMode(VoLTECodecMode value) {
        this.codecMode = value;
    }

    /**
     * Gets the value of the packetSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPacketSize() {
        return packetSize;
    }

    /**
     * Sets the value of the packetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPacketSize(Integer value) {
        this.packetSize = value;
    }

    /**
     * Gets the value of the packetPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link VoLTEPeriodicity }
     *     
     */
    public VoLTEPeriodicity getPacketPeriodicity() {
        return packetPeriodicity;
    }

    /**
     * Sets the value of the packetPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoLTEPeriodicity }
     *     
     */
    public void setPacketPeriodicity(VoLTEPeriodicity value) {
        this.packetPeriodicity = value;
    }

    /**
     * Gets the value of the isRohcProfilesQci1Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRohcProfilesQci1Enabled() {
        return isRohcProfilesQci1Enabled;
    }

    /**
     * Sets the value of the isRohcProfilesQci1Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRohcProfilesQci1Enabled(Boolean value) {
        this.isRohcProfilesQci1Enabled = value;
    }

    /**
     * Gets the value of the plmnList property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnListContainer }
     *     
     */
    public PlmnListContainer getPlmnList() {
        return plmnList;
    }

    /**
     * Sets the value of the plmnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnListContainer }
     *     
     */
    public void setPlmnList(PlmnListContainer value) {
        this.plmnList = value;
    }

    /**
     * Gets the value of the s1X2List property.
     * 
     * @return
     *     possible object is
     *     {@link S1ListContainer }
     *     
     */
    public S1ListContainer getS1X2List() {
        return s1X2List;
    }

    /**
     * Sets the value of the s1X2List property.
     * 
     * @param value
     *     allowed object is
     *     {@link S1ListContainer }
     *     
     */
    public void setS1X2List(S1ListContainer value) {
        this.s1X2List = value;
    }

    /**
     * Gets the value of the csonConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LteCSonEntryWs }
     *     
     */
    public LteCSonEntryWs getCSONConfig() {
        return csonConfig;
    }

    /**
     * Sets the value of the csonConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteCSonEntryWs }
     *     
     */
    public void setCSONConfig(LteCSonEntryWs value) {
        this.csonConfig = value;
    }

    /**
     * Gets the value of the ulPktDataPriorityList property.
     * 
     * @return
     *     possible object is
     *     {@link UlPktDataPriorityListContainer }
     *     
     */
    public UlPktDataPriorityListContainer getUlPktDataPriorityList() {
        return ulPktDataPriorityList;
    }

    /**
     * Sets the value of the ulPktDataPriorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UlPktDataPriorityListContainer }
     *     
     */
    public void setUlPktDataPriorityList(UlPktDataPriorityListContainer value) {
        this.ulPktDataPriorityList = value;
    }

}
