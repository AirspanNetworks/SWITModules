
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.PnpModes;
import Netspan.API.Enums.SonAnrStates;


/**
 * <p>Java class for EnbSonProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbSonProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/&gt;
 *         &lt;element name="SonCommissioningEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PnpMode" type="{http://Airspan.Netspan.WebServices}PnpModes" minOccurs="0"/&gt;
 *         &lt;element name="PciEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PciRangeList" type="{http://Airspan.Netspan.WebServices}PciRangeListContainer" minOccurs="0"/&gt;
 *         &lt;element name="AnrState" type="{http://Airspan.Netspan.WebServices}SonAnrStates" minOccurs="0"/&gt;
 *         &lt;element name="IntraFrequencyAnrEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinAllowedHoSuccessRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AnrFrequencyList" type="{http://Airspan.Netspan.WebServices}AnrFreqListContainer" minOccurs="0"/&gt;
 *         &lt;element name="AnrEnbPciMode" type="{http://Airspan.Netspan.WebServices}SonAnrEnbPciModes" minOccurs="0"/&gt;
 *         &lt;element name="AnrMacroPciRangeList" type="{http://Airspan.Netspan.WebServices}PciRangeListContainer" minOccurs="0"/&gt;
 *         &lt;element name="RsiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RsiRangeList" type="{http://Airspan.Netspan.WebServices}RsiRangeListContainer" minOccurs="0"/&gt;
 *         &lt;element name="CSon" type="{http://Airspan.Netspan.WebServices}LteSonCSonWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbSonProfile", propOrder = {
    "name",
    "hardwareCategory",
    "sonCommissioningEnabled",
    "pnpMode",
    "pciEnabled",
    "pciRangeList",
    "anrState",
    "intraFrequencyAnrEnabled",
    "minAllowedHoSuccessRate",
    "anrFrequencyList",
    "anrEnbPciMode",
    "anrMacroPciRangeList",
    "rsiEnabled",
    "rsiRangeList",
    "cSon"
})
public class EnbSonProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElementRef(name = "SonCommissioningEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sonCommissioningEnabled;
    @XmlElementRef(name = "PnpMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PnpModes> pnpMode;
    @XmlElementRef(name = "PciEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pciEnabled;
    @XmlElement(name = "PciRangeList")
    protected PciRangeListContainer pciRangeList;
    @XmlElementRef(name = "AnrState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SonAnrStates> anrState;
    @XmlElementRef(name = "IntraFrequencyAnrEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> intraFrequencyAnrEnabled;
    @XmlElementRef(name = "MinAllowedHoSuccessRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minAllowedHoSuccessRate;
    @XmlElement(name = "AnrFrequencyList")
    protected AnrFreqListContainer anrFrequencyList;
    @XmlElementRef(name = "AnrEnbPciMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SonAnrEnbPciModes> anrEnbPciMode;
    @XmlElement(name = "AnrMacroPciRangeList")
    protected PciRangeListContainer anrMacroPciRangeList;
    @XmlElementRef(name = "RsiEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rsiEnabled;
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
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public JAXBElement<CategoriesLte> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesLte> value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the sonCommissioningEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSonCommissioningEnabled() {
        return sonCommissioningEnabled;
    }

    /**
     * Sets the value of the sonCommissioningEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSonCommissioningEnabled(JAXBElement<Boolean> value) {
        this.sonCommissioningEnabled = value;
    }

    /**
     * Gets the value of the pnpMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PnpModes }{@code >}
     *     
     */
    public JAXBElement<PnpModes> getPnpMode() {
        return pnpMode;
    }

    /**
     * Sets the value of the pnpMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PnpModes }{@code >}
     *     
     */
    public void setPnpMode(JAXBElement<PnpModes> value) {
        this.pnpMode = value;
    }

    /**
     * Gets the value of the pciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPciEnabled() {
        return pciEnabled;
    }

    /**
     * Sets the value of the pciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPciEnabled(JAXBElement<Boolean> value) {
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
     * Gets the value of the anrState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SonAnrStates }{@code >}
     *     
     */
    public JAXBElement<SonAnrStates> getAnrState() {
        return anrState;
    }

    /**
     * Sets the value of the anrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SonAnrStates }{@code >}
     *     
     */
    public void setAnrState(JAXBElement<SonAnrStates> value) {
        this.anrState = value;
    }

    /**
     * Gets the value of the intraFrequencyAnrEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIntraFrequencyAnrEnabled() {
        return intraFrequencyAnrEnabled;
    }

    /**
     * Sets the value of the intraFrequencyAnrEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIntraFrequencyAnrEnabled(JAXBElement<Boolean> value) {
        this.intraFrequencyAnrEnabled = value;
    }

    /**
     * Gets the value of the minAllowedHoSuccessRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinAllowedHoSuccessRate() {
        return minAllowedHoSuccessRate;
    }

    /**
     * Sets the value of the minAllowedHoSuccessRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinAllowedHoSuccessRate(JAXBElement<Integer> value) {
        this.minAllowedHoSuccessRate = value;
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
     *     {@link JAXBElement }{@code <}{@link SonAnrEnbPciModes }{@code >}
     *     
     */
    public JAXBElement<SonAnrEnbPciModes> getAnrEnbPciMode() {
        return anrEnbPciMode;
    }

    /**
     * Sets the value of the anrEnbPciMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SonAnrEnbPciModes }{@code >}
     *     
     */
    public void setAnrEnbPciMode(JAXBElement<SonAnrEnbPciModes> value) {
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
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRsiEnabled() {
        return rsiEnabled;
    }

    /**
     * Sets the value of the rsiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRsiEnabled(JAXBElement<Boolean> value) {
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
