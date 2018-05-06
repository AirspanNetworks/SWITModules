
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.PnpModes;


/**
 * <p>Java class for LteSonProfileWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSonProfileWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte"/>
 *         &lt;element name="SonCommissioningEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PnpMode" type="{http://Airspan.Netspan.WebServices}PnpModes"/>
 *         &lt;element name="PciEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PciRangeList" type="{http://Airspan.Netspan.WebServices}PciRangeListContainer" minOccurs="0"/>
 *         &lt;element name="AnrEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AnrFrequencyList" type="{http://Airspan.Netspan.WebServices}AnrFreqListContainer" minOccurs="0"/>
 *         &lt;element name="AnrEnbPciMode" type="{http://Airspan.Netspan.WebServices}SonAnrEnbPciModes"/>
 *         &lt;element name="AnrMacroPciRangeList" type="{http://Airspan.Netspan.WebServices}PciRangeListContainer" minOccurs="0"/>
 *         &lt;element name="RsiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RsiRangeList" type="{http://Airspan.Netspan.WebServices}RsiRangeListContainer" minOccurs="0"/>
 *         &lt;element name="CSon" type="{http://Airspan.Netspan.WebServices}LteSonCSonWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSonProfileWs", propOrder = {
    "name",
    "hardwareCategory",
    "sonCommissioningEnabled",
    "pnpMode",
    "pciEnabled",
    "pciRangeList",
    "anrEnabled",
    "anrFrequencyList",
    "anrEnbPciMode",
    "anrMacroPciRangeList",
    "rsiEnabled",
    "rsiRangeList",
    "cSon"
})
public class LteSonProfileWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "HardwareCategory", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CategoriesLte hardwareCategory;
    @XmlElement(name = "SonCommissioningEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean sonCommissioningEnabled;
    @XmlElement(name = "PnpMode", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected PnpModes pnpMode;
    @XmlElement(name = "PciEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean pciEnabled;
    @XmlElement(name = "PciRangeList")
    protected PciRangeListContainer pciRangeList;
    @XmlElement(name = "AnrEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean anrEnabled;
    @XmlElement(name = "AnrFrequencyList")
    protected AnrFreqListContainer anrFrequencyList;
    @XmlElement(name = "AnrEnbPciMode", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected SonAnrEnbPciModes anrEnbPciMode;
    @XmlElement(name = "AnrMacroPciRangeList")
    protected PciRangeListContainer anrMacroPciRangeList;
    @XmlElement(name = "RsiEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean rsiEnabled;
    @XmlElement(name = "RsiRangeList")
    protected RsiRangeListContainer rsiRangeList;
    @XmlElement(name = "CSon")
    protected LteSonCSonWs cSon;

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
     * Gets the value of the sonCommissioningEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSonCommissioningEnabled() {
        return sonCommissioningEnabled;
    }

    /**
     * Sets the value of the sonCommissioningEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSonCommissioningEnabled(Boolean value) {
        this.sonCommissioningEnabled = value;
    }

    /**
     * Gets the value of the pnpMode property.
     * 
     * @return
     *     possible object is
     *     {@link PnpModes }
     *     
     */
    public PnpModes getPnpMode() {
        return pnpMode;
    }

    /**
     * Sets the value of the pnpMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnpModes }
     *     
     */
    public void setPnpMode(PnpModes value) {
        this.pnpMode = value;
    }

    /**
     * Gets the value of the pciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPciEnabled() {
        return pciEnabled;
    }

    /**
     * Sets the value of the pciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPciEnabled(Boolean value) {
        this.pciEnabled = value;
    }

    /**
     * Gets the value of the pciRangeList property.
     * 
     * @return
     *     possible object is
     *     {@link PciRangeListContainer }
     *     
     */
    public PciRangeListContainer getPciRangeList() {
        return pciRangeList;
    }

    /**
     * Sets the value of the pciRangeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PciRangeListContainer }
     *     
     */
    public void setPciRangeList(PciRangeListContainer value) {
        this.pciRangeList = value;
    }

    /**
     * Gets the value of the anrEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnrEnabled() {
        return anrEnabled;
    }

    /**
     * Sets the value of the anrEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnrEnabled(Boolean value) {
        this.anrEnabled = value;
    }

    /**
     * Gets the value of the anrFrequencyList property.
     * 
     * @return
     *     possible object is
     *     {@link AnrFreqListContainer }
     *     
     */
    public AnrFreqListContainer getAnrFrequencyList() {
        return anrFrequencyList;
    }

    /**
     * Sets the value of the anrFrequencyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnrFreqListContainer }
     *     
     */
    public void setAnrFrequencyList(AnrFreqListContainer value) {
        this.anrFrequencyList = value;
    }

    /**
     * Gets the value of the anrEnbPciMode property.
     * 
     * @return
     *     possible object is
     *     {@link SonAnrEnbPciModes }
     *     
     */
    public SonAnrEnbPciModes getAnrEnbPciMode() {
        return anrEnbPciMode;
    }

    /**
     * Sets the value of the anrEnbPciMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonAnrEnbPciModes }
     *     
     */
    public void setAnrEnbPciMode(SonAnrEnbPciModes value) {
        this.anrEnbPciMode = value;
    }

    /**
     * Gets the value of the anrMacroPciRangeList property.
     * 
     * @return
     *     possible object is
     *     {@link PciRangeListContainer }
     *     
     */
    public PciRangeListContainer getAnrMacroPciRangeList() {
        return anrMacroPciRangeList;
    }

    /**
     * Sets the value of the anrMacroPciRangeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PciRangeListContainer }
     *     
     */
    public void setAnrMacroPciRangeList(PciRangeListContainer value) {
        this.anrMacroPciRangeList = value;
    }

    /**
     * Gets the value of the rsiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRsiEnabled() {
        return rsiEnabled;
    }

    /**
     * Sets the value of the rsiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRsiEnabled(Boolean value) {
        this.rsiEnabled = value;
    }

    /**
     * Gets the value of the rsiRangeList property.
     * 
     * @return
     *     possible object is
     *     {@link RsiRangeListContainer }
     *     
     */
    public RsiRangeListContainer getRsiRangeList() {
        return rsiRangeList;
    }

    /**
     * Sets the value of the rsiRangeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsiRangeListContainer }
     *     
     */
    public void setRsiRangeList(RsiRangeListContainer value) {
        this.rsiRangeList = value;
    }

    /**
     * Gets the value of the cSon property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonCSonWs }
     *     
     */
    public LteSonCSonWs getCSon() {
        return cSon;
    }

    /**
     * Sets the value of the cSon property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonCSonWs }
     *     
     */
    public void setCSon(LteSonCSonWs value) {
        this.cSon = value;
    }

}
