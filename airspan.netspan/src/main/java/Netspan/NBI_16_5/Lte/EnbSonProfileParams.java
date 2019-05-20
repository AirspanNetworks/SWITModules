
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;
import Netspan.API.Enums.PnpModes;
import Netspan.API.Enums.SonAnrStates;
import Netspan.API.Lte.LteSonDynIcic;


/**
 * <p>Java class for EnbSonProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbSonProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SonCommissioningEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PnpMode" type="{http://Airspan.Netspan.WebServices}PnpModes" minOccurs="0"/&gt;
 *         &lt;element name="PciEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PciCollisionHandling" type="{http://Airspan.Netspan.WebServices}PciConflictHandlingValues" minOccurs="0"/&gt;
 *         &lt;element name="PciConfusionHandling" type="{http://Airspan.Netspan.WebServices}PciConflictHandlingValues" minOccurs="0"/&gt;
 *         &lt;element name="PciPolicyViolationHandling" type="{http://Airspan.Netspan.WebServices}PciConflictHandlingValues" minOccurs="0"/&gt;
 *         &lt;element name="PciRangeList" type="{http://Airspan.Netspan.WebServices}PciRangeListContainer" minOccurs="0"/&gt;
 *         &lt;element name="AnrState" type="{http://Airspan.Netspan.WebServices}SonAnrStates" minOccurs="0"/&gt;
 *         &lt;element name="X2AnrModeEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IntraFrequencyAnrEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinAllowedHoSuccessRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AnrFrequencyList" type="{http://Airspan.Netspan.WebServices}AnrFreqListContainer" minOccurs="0"/&gt;
 *         &lt;element name="AnrEnbPciMode" type="{http://Airspan.Netspan.WebServices}SonAnrEnbPciModes" minOccurs="0"/&gt;
 *         &lt;element name="AnrMacroPciRangeList" type="{http://Airspan.Netspan.WebServices}PciRangeListContainer" minOccurs="0"/&gt;
 *         &lt;element name="InterRatAnrMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InterRatAnrUtranEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InterRatAnrUtranList" type="{http://Airspan.Netspan.WebServices}InterRatAnrUtranListContainer" minOccurs="0"/&gt;
 *         &lt;element name="RsiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RsiRangeList" type="{http://Airspan.Netspan.WebServices}RsiRangeListContainer" minOccurs="0"/&gt;
 *         &lt;element name="CSon" type="{http://Airspan.Netspan.WebServices}LteSonCSonWs" minOccurs="0"/&gt;
 *         &lt;element name="OptimizationMode" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="DynamicIcic" type="{http://Airspan.Netspan.WebServices}LteSonDynIcic" minOccurs="0"/&gt;
 *         &lt;element name="TpmMode" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TpmMoMode" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbSonProfileParams", propOrder = {
    "sonCommissioningEnabled",
    "pnpMode",
    "pciEnabled",
    "pciCollisionHandling",
    "pciConfusionHandling",
    "pciPolicyViolationHandling",
    "pciRangeList",
    "anrState",
    "x2AnrModeEnabled",
    "intraFrequencyAnrEnabled",
    "minAllowedHoSuccessRate",
    "anrFrequencyList",
    "anrEnbPciMode",
    "anrMacroPciRangeList",
    "interRatAnrMode",
    "interRatAnrUtranEnabled",
    "interRatAnrUtranList",
    "rsiEnabled",
    "rsiRangeList",
    "cSon",
    "optimizationMode",
    "dynamicIcic",
    "tpmMode",
    "tpmMoMode"
})
@XmlSeeAlso({
    EnbSonProfile.class
})
public class EnbSonProfileParams {

    @XmlElementRef(name = "SonCommissioningEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sonCommissioningEnabled;
    @XmlElementRef(name = "PnpMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PnpModes> pnpMode;
    @XmlElementRef(name = "PciEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pciEnabled;
    @XmlElementRef(name = "PciCollisionHandling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PciConflictHandlingValues> pciCollisionHandling;
    @XmlElementRef(name = "PciConfusionHandling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PciConflictHandlingValues> pciConfusionHandling;
    @XmlElementRef(name = "PciPolicyViolationHandling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PciConflictHandlingValues> pciPolicyViolationHandling;
    @XmlElement(name = "PciRangeList")
    protected PciRangeListContainer pciRangeList;
    @XmlElementRef(name = "AnrState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SonAnrStates> anrState;
    @XmlElementRef(name = "X2AnrModeEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> x2AnrModeEnabled;
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
    @XmlElementRef(name = "InterRatAnrMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> interRatAnrMode;
    @XmlElementRef(name = "InterRatAnrUtranEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> interRatAnrUtranEnabled;
    @XmlElement(name = "InterRatAnrUtranList")
    protected InterRatAnrUtranListContainer interRatAnrUtranList;
    @XmlElementRef(name = "RsiEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rsiEnabled;
    @XmlElement(name = "RsiRangeList")
    protected RsiRangeListContainer rsiRangeList;
    @XmlElement(name = "CSon")
    protected LteSonCSonWs cSon;
    @XmlElementRef(name = "OptimizationMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> optimizationMode;
    @XmlElement(name = "DynamicIcic")
    protected LteSonDynIcic dynamicIcic;
    @XmlElementRef(name = "TpmMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> tpmMode;
    @XmlElementRef(name = "TpmMoMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> tpmMoMode;

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
     * Gets the value of the pciCollisionHandling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PciConflictHandlingValues }{@code >}
     *     
     */
    public JAXBElement<PciConflictHandlingValues> getPciCollisionHandling() {
        return pciCollisionHandling;
    }

    /**
     * Sets the value of the pciCollisionHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PciConflictHandlingValues }{@code >}
     *     
     */
    public void setPciCollisionHandling(JAXBElement<PciConflictHandlingValues> value) {
        this.pciCollisionHandling = value;
    }

    /**
     * Gets the value of the pciConfusionHandling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PciConflictHandlingValues }{@code >}
     *     
     */
    public JAXBElement<PciConflictHandlingValues> getPciConfusionHandling() {
        return pciConfusionHandling;
    }

    /**
     * Sets the value of the pciConfusionHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PciConflictHandlingValues }{@code >}
     *     
     */
    public void setPciConfusionHandling(JAXBElement<PciConflictHandlingValues> value) {
        this.pciConfusionHandling = value;
    }

    /**
     * Gets the value of the pciPolicyViolationHandling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PciConflictHandlingValues }{@code >}
     *     
     */
    public JAXBElement<PciConflictHandlingValues> getPciPolicyViolationHandling() {
        return pciPolicyViolationHandling;
    }

    /**
     * Sets the value of the pciPolicyViolationHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PciConflictHandlingValues }{@code >}
     *     
     */
    public void setPciPolicyViolationHandling(JAXBElement<PciConflictHandlingValues> value) {
        this.pciPolicyViolationHandling = value;
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
     * Gets the value of the x2AnrModeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getX2AnrModeEnabled() {
        return x2AnrModeEnabled;
    }

    /**
     * Sets the value of the x2AnrModeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setX2AnrModeEnabled(JAXBElement<Boolean> value) {
        this.x2AnrModeEnabled = value;
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
     * Gets the value of the interRatAnrMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInterRatAnrMode() {
        return interRatAnrMode;
    }

    /**
     * Sets the value of the interRatAnrMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInterRatAnrMode(JAXBElement<Boolean> value) {
        this.interRatAnrMode = value;
    }

    /**
     * Gets the value of the interRatAnrUtranEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInterRatAnrUtranEnabled() {
        return interRatAnrUtranEnabled;
    }

    /**
     * Sets the value of the interRatAnrUtranEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInterRatAnrUtranEnabled(JAXBElement<Boolean> value) {
        this.interRatAnrUtranEnabled = value;
    }

    /**
     * Gets the value of the interRatAnrUtranList property.
     * 
     * @return
     *     possible object is
     *     {@link InterRatAnrUtranListContainer }
     *     
     */
    public InterRatAnrUtranListContainer getInterRatAnrUtranList() {
        return interRatAnrUtranList;
    }

    /**
     * Sets the value of the interRatAnrUtranList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterRatAnrUtranListContainer }
     *     
     */
    public void setInterRatAnrUtranList(InterRatAnrUtranListContainer value) {
        this.interRatAnrUtranList = value;
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

    /**
     * Gets the value of the optimizationMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getOptimizationMode() {
        return optimizationMode;
    }

    /**
     * Sets the value of the optimizationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setOptimizationMode(JAXBElement<EnabledStates> value) {
        this.optimizationMode = value;
    }

    /**
     * Gets the value of the dynamicIcic property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonDynIcic }
     *     
     */
    public LteSonDynIcic getDynamicIcic() {
        return dynamicIcic;
    }

    /**
     * Sets the value of the dynamicIcic property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonDynIcic }
     *     
     */
    public void setDynamicIcic(LteSonDynIcic value) {
        this.dynamicIcic = value;
    }

    /**
     * Gets the value of the tpmMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getTpmMode() {
        return tpmMode;
    }

    /**
     * Sets the value of the tpmMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setTpmMode(JAXBElement<EnabledStates> value) {
        this.tpmMode = value;
    }

    /**
     * Gets the value of the tpmMoMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getTpmMoMode() {
        return tpmMoMode;
    }

    /**
     * Sets the value of the tpmMoMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setTpmMoMode(JAXBElement<EnabledStates> value) {
        this.tpmMoMode = value;
    }

}
