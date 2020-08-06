
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.PnpModes;
import Netspan.API.Enums.SonAnrStates;


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
 *         &lt;element name="OptimizationMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="DynamicIcic" type="{http://Airspan.Netspan.WebServices}LteSonDynIcic" minOccurs="0"/&gt;
 *         &lt;element name="TpmMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TpmMoMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="IsDynamicAcBarringIndicatorCpuLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDynamicAcBarringIndicatorS1Load" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDynamicAcBarringIndicatorGbrPrbLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDynamicAcBarringIndicatorNonGbrPrbLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDynamicAcBarringIndicatorTotalPrbLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDynamicAcBarringIndicatorCompositeLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDynamicAcBarringIndicatorVolteLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDynamicAcBarringIndicatorRrcFailureRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDynamicAcBarringIndicatorConnectedUesLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringSampleInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringStartTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringStopTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringCpuLoadHigh" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringCpuLoadMedium" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringS1LoadHigh" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringS1LoadMedium" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringGbrPrbLoadHigh" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringGbrPrbLoadMedium" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringNonGbrPrbLoadHigh" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringNonGbrPrbLoadMedium" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringTotalPrbLoadHigh" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringTotalPrbLoadMedium" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringCompositeLoadHigh" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringCompositeLoadMedium" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringVolteLoadHigh" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringVolteLoadMedium" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringRrcFailureRateHigh" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringRrcFailureRateMedium" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringConnectedUesLoadHigh" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringConnectedUesLoadMedium" type="{http://Airspan.Netspan.WebServices}DacbIndicatorLoadsWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringPropertiesList" type="{http://Airspan.Netspan.WebServices}DynamicAcBarringPropertiesListContainer" minOccurs="0"/&gt;
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
    "tpmMoMode",
    "isDynamicAcBarringIndicatorCpuLoad",
    "isDynamicAcBarringIndicatorS1Load",
    "isDynamicAcBarringIndicatorGbrPrbLoad",
    "isDynamicAcBarringIndicatorNonGbrPrbLoad",
    "isDynamicAcBarringIndicatorTotalPrbLoad",
    "isDynamicAcBarringIndicatorCompositeLoad",
    "isDynamicAcBarringIndicatorVolteLoad",
    "isDynamicAcBarringIndicatorRrcFailureRate",
    "isDynamicAcBarringIndicatorConnectedUesLoad",
    "dynamicAcBarringSampleInterval",
    "dynamicAcBarringStartTimer",
    "dynamicAcBarringStopTimer",
    "dynamicAcBarringCpuLoadHigh",
    "dynamicAcBarringCpuLoadMedium",
    "dynamicAcBarringS1LoadHigh",
    "dynamicAcBarringS1LoadMedium",
    "dynamicAcBarringGbrPrbLoadHigh",
    "dynamicAcBarringGbrPrbLoadMedium",
    "dynamicAcBarringNonGbrPrbLoadHigh",
    "dynamicAcBarringNonGbrPrbLoadMedium",
    "dynamicAcBarringTotalPrbLoadHigh",
    "dynamicAcBarringTotalPrbLoadMedium",
    "dynamicAcBarringCompositeLoadHigh",
    "dynamicAcBarringCompositeLoadMedium",
    "dynamicAcBarringVolteLoadHigh",
    "dynamicAcBarringVolteLoadMedium",
    "dynamicAcBarringRrcFailureRateHigh",
    "dynamicAcBarringRrcFailureRateMedium",
    "dynamicAcBarringConnectedUesLoadHigh",
    "dynamicAcBarringConnectedUesLoadMedium",
    "dynamicAcBarringPropertiesList"
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
    protected JAXBElement<EnabledDisabledStates> optimizationMode;
    @XmlElement(name = "DynamicIcic")
    protected LteSonDynIcic dynamicIcic;
    @XmlElementRef(name = "TpmMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> tpmMode;
    @XmlElementRef(name = "TpmMoMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> tpmMoMode;
    @XmlElementRef(name = "IsDynamicAcBarringIndicatorCpuLoad", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDynamicAcBarringIndicatorCpuLoad;
    @XmlElementRef(name = "IsDynamicAcBarringIndicatorS1Load", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDynamicAcBarringIndicatorS1Load;
    @XmlElementRef(name = "IsDynamicAcBarringIndicatorGbrPrbLoad", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDynamicAcBarringIndicatorGbrPrbLoad;
    @XmlElementRef(name = "IsDynamicAcBarringIndicatorNonGbrPrbLoad", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDynamicAcBarringIndicatorNonGbrPrbLoad;
    @XmlElementRef(name = "IsDynamicAcBarringIndicatorTotalPrbLoad", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDynamicAcBarringIndicatorTotalPrbLoad;
    @XmlElementRef(name = "IsDynamicAcBarringIndicatorCompositeLoad", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDynamicAcBarringIndicatorCompositeLoad;
    @XmlElementRef(name = "IsDynamicAcBarringIndicatorVolteLoad", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDynamicAcBarringIndicatorVolteLoad;
    @XmlElementRef(name = "IsDynamicAcBarringIndicatorRrcFailureRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDynamicAcBarringIndicatorRrcFailureRate;
    @XmlElementRef(name = "IsDynamicAcBarringIndicatorConnectedUesLoad", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDynamicAcBarringIndicatorConnectedUesLoad;
    @XmlElementRef(name = "DynamicAcBarringSampleInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dynamicAcBarringSampleInterval;
    @XmlElementRef(name = "DynamicAcBarringStartTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dynamicAcBarringStartTimer;
    @XmlElementRef(name = "DynamicAcBarringStopTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dynamicAcBarringStopTimer;
    @XmlElementRef(name = "DynamicAcBarringCpuLoadHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringCpuLoadHigh;
    @XmlElementRef(name = "DynamicAcBarringCpuLoadMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringCpuLoadMedium;
    @XmlElementRef(name = "DynamicAcBarringS1LoadHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringS1LoadHigh;
    @XmlElementRef(name = "DynamicAcBarringS1LoadMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringS1LoadMedium;
    @XmlElementRef(name = "DynamicAcBarringGbrPrbLoadHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringGbrPrbLoadHigh;
    @XmlElementRef(name = "DynamicAcBarringGbrPrbLoadMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringGbrPrbLoadMedium;
    @XmlElementRef(name = "DynamicAcBarringNonGbrPrbLoadHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringNonGbrPrbLoadHigh;
    @XmlElementRef(name = "DynamicAcBarringNonGbrPrbLoadMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringNonGbrPrbLoadMedium;
    @XmlElementRef(name = "DynamicAcBarringTotalPrbLoadHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringTotalPrbLoadHigh;
    @XmlElementRef(name = "DynamicAcBarringTotalPrbLoadMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringTotalPrbLoadMedium;
    @XmlElementRef(name = "DynamicAcBarringCompositeLoadHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringCompositeLoadHigh;
    @XmlElementRef(name = "DynamicAcBarringCompositeLoadMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringCompositeLoadMedium;
    @XmlElementRef(name = "DynamicAcBarringVolteLoadHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringVolteLoadHigh;
    @XmlElementRef(name = "DynamicAcBarringVolteLoadMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringVolteLoadMedium;
    @XmlElementRef(name = "DynamicAcBarringRrcFailureRateHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringRrcFailureRateHigh;
    @XmlElementRef(name = "DynamicAcBarringRrcFailureRateMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringRrcFailureRateMedium;
    @XmlElementRef(name = "DynamicAcBarringConnectedUesLoadHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringConnectedUesLoadHigh;
    @XmlElementRef(name = "DynamicAcBarringConnectedUesLoadMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dynamicAcBarringConnectedUesLoadMedium;
    @XmlElement(name = "DynamicAcBarringPropertiesList")
    protected DynamicAcBarringPropertiesListContainer dynamicAcBarringPropertiesList;

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
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getOptimizationMode() {
        return optimizationMode;
    }

    /**
     * Sets the value of the optimizationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setOptimizationMode(JAXBElement<EnabledDisabledStates> value) {
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
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getTpmMode() {
        return tpmMode;
    }

    /**
     * Sets the value of the tpmMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setTpmMode(JAXBElement<EnabledDisabledStates> value) {
        this.tpmMode = value;
    }

    /**
     * Gets the value of the tpmMoMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getTpmMoMode() {
        return tpmMoMode;
    }

    /**
     * Sets the value of the tpmMoMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setTpmMoMode(JAXBElement<EnabledDisabledStates> value) {
        this.tpmMoMode = value;
    }

    /**
     * Gets the value of the isDynamicAcBarringIndicatorCpuLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDynamicAcBarringIndicatorCpuLoad() {
        return isDynamicAcBarringIndicatorCpuLoad;
    }

    /**
     * Sets the value of the isDynamicAcBarringIndicatorCpuLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDynamicAcBarringIndicatorCpuLoad(JAXBElement<Boolean> value) {
        this.isDynamicAcBarringIndicatorCpuLoad = value;
    }

    /**
     * Gets the value of the isDynamicAcBarringIndicatorS1Load property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDynamicAcBarringIndicatorS1Load() {
        return isDynamicAcBarringIndicatorS1Load;
    }

    /**
     * Sets the value of the isDynamicAcBarringIndicatorS1Load property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDynamicAcBarringIndicatorS1Load(JAXBElement<Boolean> value) {
        this.isDynamicAcBarringIndicatorS1Load = value;
    }

    /**
     * Gets the value of the isDynamicAcBarringIndicatorGbrPrbLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDynamicAcBarringIndicatorGbrPrbLoad() {
        return isDynamicAcBarringIndicatorGbrPrbLoad;
    }

    /**
     * Sets the value of the isDynamicAcBarringIndicatorGbrPrbLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDynamicAcBarringIndicatorGbrPrbLoad(JAXBElement<Boolean> value) {
        this.isDynamicAcBarringIndicatorGbrPrbLoad = value;
    }

    /**
     * Gets the value of the isDynamicAcBarringIndicatorNonGbrPrbLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDynamicAcBarringIndicatorNonGbrPrbLoad() {
        return isDynamicAcBarringIndicatorNonGbrPrbLoad;
    }

    /**
     * Sets the value of the isDynamicAcBarringIndicatorNonGbrPrbLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDynamicAcBarringIndicatorNonGbrPrbLoad(JAXBElement<Boolean> value) {
        this.isDynamicAcBarringIndicatorNonGbrPrbLoad = value;
    }

    /**
     * Gets the value of the isDynamicAcBarringIndicatorTotalPrbLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDynamicAcBarringIndicatorTotalPrbLoad() {
        return isDynamicAcBarringIndicatorTotalPrbLoad;
    }

    /**
     * Sets the value of the isDynamicAcBarringIndicatorTotalPrbLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDynamicAcBarringIndicatorTotalPrbLoad(JAXBElement<Boolean> value) {
        this.isDynamicAcBarringIndicatorTotalPrbLoad = value;
    }

    /**
     * Gets the value of the isDynamicAcBarringIndicatorCompositeLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDynamicAcBarringIndicatorCompositeLoad() {
        return isDynamicAcBarringIndicatorCompositeLoad;
    }

    /**
     * Sets the value of the isDynamicAcBarringIndicatorCompositeLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDynamicAcBarringIndicatorCompositeLoad(JAXBElement<Boolean> value) {
        this.isDynamicAcBarringIndicatorCompositeLoad = value;
    }

    /**
     * Gets the value of the isDynamicAcBarringIndicatorVolteLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDynamicAcBarringIndicatorVolteLoad() {
        return isDynamicAcBarringIndicatorVolteLoad;
    }

    /**
     * Sets the value of the isDynamicAcBarringIndicatorVolteLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDynamicAcBarringIndicatorVolteLoad(JAXBElement<Boolean> value) {
        this.isDynamicAcBarringIndicatorVolteLoad = value;
    }

    /**
     * Gets the value of the isDynamicAcBarringIndicatorRrcFailureRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDynamicAcBarringIndicatorRrcFailureRate() {
        return isDynamicAcBarringIndicatorRrcFailureRate;
    }

    /**
     * Sets the value of the isDynamicAcBarringIndicatorRrcFailureRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDynamicAcBarringIndicatorRrcFailureRate(JAXBElement<Boolean> value) {
        this.isDynamicAcBarringIndicatorRrcFailureRate = value;
    }

    /**
     * Gets the value of the isDynamicAcBarringIndicatorConnectedUesLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDynamicAcBarringIndicatorConnectedUesLoad() {
        return isDynamicAcBarringIndicatorConnectedUesLoad;
    }

    /**
     * Sets the value of the isDynamicAcBarringIndicatorConnectedUesLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDynamicAcBarringIndicatorConnectedUesLoad(JAXBElement<Boolean> value) {
        this.isDynamicAcBarringIndicatorConnectedUesLoad = value;
    }

    /**
     * Gets the value of the dynamicAcBarringSampleInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDynamicAcBarringSampleInterval() {
        return dynamicAcBarringSampleInterval;
    }

    /**
     * Sets the value of the dynamicAcBarringSampleInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDynamicAcBarringSampleInterval(JAXBElement<Integer> value) {
        this.dynamicAcBarringSampleInterval = value;
    }

    /**
     * Gets the value of the dynamicAcBarringStartTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDynamicAcBarringStartTimer() {
        return dynamicAcBarringStartTimer;
    }

    /**
     * Sets the value of the dynamicAcBarringStartTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDynamicAcBarringStartTimer(JAXBElement<Integer> value) {
        this.dynamicAcBarringStartTimer = value;
    }

    /**
     * Gets the value of the dynamicAcBarringStopTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDynamicAcBarringStopTimer() {
        return dynamicAcBarringStopTimer;
    }

    /**
     * Sets the value of the dynamicAcBarringStopTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDynamicAcBarringStopTimer(JAXBElement<Integer> value) {
        this.dynamicAcBarringStopTimer = value;
    }

    /**
     * Gets the value of the dynamicAcBarringCpuLoadHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringCpuLoadHigh() {
        return dynamicAcBarringCpuLoadHigh;
    }

    /**
     * Sets the value of the dynamicAcBarringCpuLoadHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringCpuLoadHigh(JAXBElement<String> value) {
        this.dynamicAcBarringCpuLoadHigh = value;
    }

    /**
     * Gets the value of the dynamicAcBarringCpuLoadMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringCpuLoadMedium() {
        return dynamicAcBarringCpuLoadMedium;
    }

    /**
     * Sets the value of the dynamicAcBarringCpuLoadMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringCpuLoadMedium(JAXBElement<String> value) {
        this.dynamicAcBarringCpuLoadMedium = value;
    }

    /**
     * Gets the value of the dynamicAcBarringS1LoadHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringS1LoadHigh() {
        return dynamicAcBarringS1LoadHigh;
    }

    /**
     * Sets the value of the dynamicAcBarringS1LoadHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringS1LoadHigh(JAXBElement<String> value) {
        this.dynamicAcBarringS1LoadHigh = value;
    }

    /**
     * Gets the value of the dynamicAcBarringS1LoadMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringS1LoadMedium() {
        return dynamicAcBarringS1LoadMedium;
    }

    /**
     * Sets the value of the dynamicAcBarringS1LoadMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringS1LoadMedium(JAXBElement<String> value) {
        this.dynamicAcBarringS1LoadMedium = value;
    }

    /**
     * Gets the value of the dynamicAcBarringGbrPrbLoadHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringGbrPrbLoadHigh() {
        return dynamicAcBarringGbrPrbLoadHigh;
    }

    /**
     * Sets the value of the dynamicAcBarringGbrPrbLoadHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringGbrPrbLoadHigh(JAXBElement<String> value) {
        this.dynamicAcBarringGbrPrbLoadHigh = value;
    }

    /**
     * Gets the value of the dynamicAcBarringGbrPrbLoadMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringGbrPrbLoadMedium() {
        return dynamicAcBarringGbrPrbLoadMedium;
    }

    /**
     * Sets the value of the dynamicAcBarringGbrPrbLoadMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringGbrPrbLoadMedium(JAXBElement<String> value) {
        this.dynamicAcBarringGbrPrbLoadMedium = value;
    }

    /**
     * Gets the value of the dynamicAcBarringNonGbrPrbLoadHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringNonGbrPrbLoadHigh() {
        return dynamicAcBarringNonGbrPrbLoadHigh;
    }

    /**
     * Sets the value of the dynamicAcBarringNonGbrPrbLoadHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringNonGbrPrbLoadHigh(JAXBElement<String> value) {
        this.dynamicAcBarringNonGbrPrbLoadHigh = value;
    }

    /**
     * Gets the value of the dynamicAcBarringNonGbrPrbLoadMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringNonGbrPrbLoadMedium() {
        return dynamicAcBarringNonGbrPrbLoadMedium;
    }

    /**
     * Sets the value of the dynamicAcBarringNonGbrPrbLoadMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringNonGbrPrbLoadMedium(JAXBElement<String> value) {
        this.dynamicAcBarringNonGbrPrbLoadMedium = value;
    }

    /**
     * Gets the value of the dynamicAcBarringTotalPrbLoadHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringTotalPrbLoadHigh() {
        return dynamicAcBarringTotalPrbLoadHigh;
    }

    /**
     * Sets the value of the dynamicAcBarringTotalPrbLoadHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringTotalPrbLoadHigh(JAXBElement<String> value) {
        this.dynamicAcBarringTotalPrbLoadHigh = value;
    }

    /**
     * Gets the value of the dynamicAcBarringTotalPrbLoadMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringTotalPrbLoadMedium() {
        return dynamicAcBarringTotalPrbLoadMedium;
    }

    /**
     * Sets the value of the dynamicAcBarringTotalPrbLoadMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringTotalPrbLoadMedium(JAXBElement<String> value) {
        this.dynamicAcBarringTotalPrbLoadMedium = value;
    }

    /**
     * Gets the value of the dynamicAcBarringCompositeLoadHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringCompositeLoadHigh() {
        return dynamicAcBarringCompositeLoadHigh;
    }

    /**
     * Sets the value of the dynamicAcBarringCompositeLoadHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringCompositeLoadHigh(JAXBElement<String> value) {
        this.dynamicAcBarringCompositeLoadHigh = value;
    }

    /**
     * Gets the value of the dynamicAcBarringCompositeLoadMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringCompositeLoadMedium() {
        return dynamicAcBarringCompositeLoadMedium;
    }

    /**
     * Sets the value of the dynamicAcBarringCompositeLoadMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringCompositeLoadMedium(JAXBElement<String> value) {
        this.dynamicAcBarringCompositeLoadMedium = value;
    }

    /**
     * Gets the value of the dynamicAcBarringVolteLoadHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringVolteLoadHigh() {
        return dynamicAcBarringVolteLoadHigh;
    }

    /**
     * Sets the value of the dynamicAcBarringVolteLoadHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringVolteLoadHigh(JAXBElement<String> value) {
        this.dynamicAcBarringVolteLoadHigh = value;
    }

    /**
     * Gets the value of the dynamicAcBarringVolteLoadMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringVolteLoadMedium() {
        return dynamicAcBarringVolteLoadMedium;
    }

    /**
     * Sets the value of the dynamicAcBarringVolteLoadMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringVolteLoadMedium(JAXBElement<String> value) {
        this.dynamicAcBarringVolteLoadMedium = value;
    }

    /**
     * Gets the value of the dynamicAcBarringRrcFailureRateHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringRrcFailureRateHigh() {
        return dynamicAcBarringRrcFailureRateHigh;
    }

    /**
     * Sets the value of the dynamicAcBarringRrcFailureRateHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringRrcFailureRateHigh(JAXBElement<String> value) {
        this.dynamicAcBarringRrcFailureRateHigh = value;
    }

    /**
     * Gets the value of the dynamicAcBarringRrcFailureRateMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringRrcFailureRateMedium() {
        return dynamicAcBarringRrcFailureRateMedium;
    }

    /**
     * Sets the value of the dynamicAcBarringRrcFailureRateMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringRrcFailureRateMedium(JAXBElement<String> value) {
        this.dynamicAcBarringRrcFailureRateMedium = value;
    }

    /**
     * Gets the value of the dynamicAcBarringConnectedUesLoadHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringConnectedUesLoadHigh() {
        return dynamicAcBarringConnectedUesLoadHigh;
    }

    /**
     * Sets the value of the dynamicAcBarringConnectedUesLoadHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringConnectedUesLoadHigh(JAXBElement<String> value) {
        this.dynamicAcBarringConnectedUesLoadHigh = value;
    }

    /**
     * Gets the value of the dynamicAcBarringConnectedUesLoadMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicAcBarringConnectedUesLoadMedium() {
        return dynamicAcBarringConnectedUesLoadMedium;
    }

    /**
     * Sets the value of the dynamicAcBarringConnectedUesLoadMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicAcBarringConnectedUesLoadMedium(JAXBElement<String> value) {
        this.dynamicAcBarringConnectedUesLoadMedium = value;
    }

    /**
     * Gets the value of the dynamicAcBarringPropertiesList property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicAcBarringPropertiesListContainer }
     *     
     */
    public DynamicAcBarringPropertiesListContainer getDynamicAcBarringPropertiesList() {
        return dynamicAcBarringPropertiesList;
    }

    /**
     * Sets the value of the dynamicAcBarringPropertiesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicAcBarringPropertiesListContainer }
     *     
     */
    public void setDynamicAcBarringPropertiesList(DynamicAcBarringPropertiesListContainer value) {
        this.dynamicAcBarringPropertiesList = value;
    }

}
