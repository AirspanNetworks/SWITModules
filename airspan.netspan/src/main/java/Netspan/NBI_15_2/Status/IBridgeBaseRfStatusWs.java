
package Netspan.NBI_15_2.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeBaseRfStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeBaseRfStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalCombinedConfiguredTxPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfiguredEirpDbm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FemStatusInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TiltStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TiltAngle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaImbalanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaImbalanceStatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaTxMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaMotorAzimuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RxNulling" type="{http://Airspan.Netspan.WebServices}IBridgeBaseRxNulling" minOccurs="0"/>
 *         &lt;element name="AutoAlignMode" type="{http://Airspan.Netspan.WebServices}AutoAlignModes" minOccurs="0"/>
 *         &lt;element name="AutoAlignAzimuth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OptimalAzimuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectorHarmonicMean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculationStatus" type="{http://Airspan.Netspan.WebServices}CalculationStatusValues" minOccurs="0"/>
 *         &lt;element name="AutoAlignStatus" type="{http://Airspan.Netspan.WebServices}AutoAlignStatusValues" minOccurs="0"/>
 *         &lt;element name="AutoAlignStatusInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FineAlignStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FineAlignStatusInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RfStatusPath" type="{http://Airspan.Netspan.WebServices}IBridgeBaseRfPathInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AutoAlignSectorHarmonicMeanList" type="{http://Airspan.Netspan.WebServices}AutoAlignShmResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FineAlignSectorHarmonicMeanList" type="{http://Airspan.Netspan.WebServices}FineAlignShmResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeBaseRfStatusWs", propOrder = {
    "totalCombinedConfiguredTxPower",
    "configuredEirpDbm",
    "femStatus",
    "femStatusInformation",
    "tiltStatus",
    "tiltAngle",
    "antennaType",
    "antennaImbalanceStatus",
    "antennaImbalanceStatusInfo",
    "antennaTxMode",
    "antennaMotorAzimuth",
    "rxNulling",
    "autoAlignMode",
    "autoAlignAzimuth",
    "optimalAzimuth",
    "sectorHarmonicMean",
    "calculationStatus",
    "autoAlignStatus",
    "autoAlignStatusInformation",
    "fineAlignStatus",
    "fineAlignStatusInformation",
    "rfStatusPath",
    "autoAlignSectorHarmonicMeanList",
    "fineAlignSectorHarmonicMeanList"
})
public class IBridgeBaseRfStatusWs {

    @XmlElement(name = "TotalCombinedConfiguredTxPower")
    protected String totalCombinedConfiguredTxPower;
    @XmlElementRef(name = "ConfiguredEirpDbm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> configuredEirpDbm;
    @XmlElement(name = "FemStatus")
    protected String femStatus;
    @XmlElement(name = "FemStatusInformation")
    protected String femStatusInformation;
    @XmlElement(name = "TiltStatus")
    protected String tiltStatus;
    @XmlElement(name = "TiltAngle")
    protected String tiltAngle;
    @XmlElement(name = "AntennaType")
    protected String antennaType;
    @XmlElement(name = "AntennaImbalanceStatus")
    protected String antennaImbalanceStatus;
    @XmlElement(name = "AntennaImbalanceStatusInfo")
    protected String antennaImbalanceStatusInfo;
    @XmlElement(name = "AntennaTxMode")
    protected String antennaTxMode;
    @XmlElement(name = "AntennaMotorAzimuth")
    protected String antennaMotorAzimuth;
    @XmlElement(name = "RxNulling")
    protected IBridgeBaseRxNulling rxNulling;
    @XmlElementRef(name = "AutoAlignMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AutoAlignModes> autoAlignMode;
    @XmlElementRef(name = "AutoAlignAzimuth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoAlignAzimuth;
    @XmlElement(name = "OptimalAzimuth")
    protected String optimalAzimuth;
    @XmlElement(name = "SectorHarmonicMean")
    protected String sectorHarmonicMean;
    @XmlElementRef(name = "CalculationStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CalculationStatusValues> calculationStatus;
    @XmlElementRef(name = "AutoAlignStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AutoAlignStatusValues> autoAlignStatus;
    @XmlElement(name = "AutoAlignStatusInformation")
    protected String autoAlignStatusInformation;
    @XmlElement(name = "FineAlignStatus")
    protected String fineAlignStatus;
    @XmlElement(name = "FineAlignStatusInformation")
    protected String fineAlignStatusInformation;
    @XmlElement(name = "RfStatusPath")
    protected List<IBridgeBaseRfPathInfo> rfStatusPath;
    @XmlElement(name = "AutoAlignSectorHarmonicMeanList")
    protected List<AutoAlignShmResult> autoAlignSectorHarmonicMeanList;
    @XmlElement(name = "FineAlignSectorHarmonicMeanList")
    protected List<FineAlignShmResult> fineAlignSectorHarmonicMeanList;

    /**
     * Gets the value of the totalCombinedConfiguredTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCombinedConfiguredTxPower() {
        return totalCombinedConfiguredTxPower;
    }

    /**
     * Sets the value of the totalCombinedConfiguredTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCombinedConfiguredTxPower(String value) {
        this.totalCombinedConfiguredTxPower = value;
    }

    /**
     * Gets the value of the configuredEirpDbm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConfiguredEirpDbm() {
        return configuredEirpDbm;
    }

    /**
     * Sets the value of the configuredEirpDbm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConfiguredEirpDbm(JAXBElement<Integer> value) {
        this.configuredEirpDbm = value;
    }

    /**
     * Gets the value of the femStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFemStatus() {
        return femStatus;
    }

    /**
     * Sets the value of the femStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFemStatus(String value) {
        this.femStatus = value;
    }

    /**
     * Gets the value of the femStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFemStatusInformation() {
        return femStatusInformation;
    }

    /**
     * Sets the value of the femStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFemStatusInformation(String value) {
        this.femStatusInformation = value;
    }

    /**
     * Gets the value of the tiltStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiltStatus() {
        return tiltStatus;
    }

    /**
     * Sets the value of the tiltStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiltStatus(String value) {
        this.tiltStatus = value;
    }

    /**
     * Gets the value of the tiltAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiltAngle() {
        return tiltAngle;
    }

    /**
     * Sets the value of the tiltAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiltAngle(String value) {
        this.tiltAngle = value;
    }

    /**
     * Gets the value of the antennaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaType() {
        return antennaType;
    }

    /**
     * Sets the value of the antennaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaType(String value) {
        this.antennaType = value;
    }

    /**
     * Gets the value of the antennaImbalanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaImbalanceStatus() {
        return antennaImbalanceStatus;
    }

    /**
     * Sets the value of the antennaImbalanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaImbalanceStatus(String value) {
        this.antennaImbalanceStatus = value;
    }

    /**
     * Gets the value of the antennaImbalanceStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaImbalanceStatusInfo() {
        return antennaImbalanceStatusInfo;
    }

    /**
     * Sets the value of the antennaImbalanceStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaImbalanceStatusInfo(String value) {
        this.antennaImbalanceStatusInfo = value;
    }

    /**
     * Gets the value of the antennaTxMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaTxMode() {
        return antennaTxMode;
    }

    /**
     * Sets the value of the antennaTxMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaTxMode(String value) {
        this.antennaTxMode = value;
    }

    /**
     * Gets the value of the antennaMotorAzimuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaMotorAzimuth() {
        return antennaMotorAzimuth;
    }

    /**
     * Sets the value of the antennaMotorAzimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaMotorAzimuth(String value) {
        this.antennaMotorAzimuth = value;
    }

    /**
     * Gets the value of the rxNulling property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeBaseRxNulling }
     *     
     */
    public IBridgeBaseRxNulling getRxNulling() {
        return rxNulling;
    }

    /**
     * Sets the value of the rxNulling property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeBaseRxNulling }
     *     
     */
    public void setRxNulling(IBridgeBaseRxNulling value) {
        this.rxNulling = value;
    }

    /**
     * Gets the value of the autoAlignMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutoAlignModes }{@code >}
     *     
     */
    public JAXBElement<AutoAlignModes> getAutoAlignMode() {
        return autoAlignMode;
    }

    /**
     * Sets the value of the autoAlignMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutoAlignModes }{@code >}
     *     
     */
    public void setAutoAlignMode(JAXBElement<AutoAlignModes> value) {
        this.autoAlignMode = value;
    }

    /**
     * Gets the value of the autoAlignAzimuth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoAlignAzimuth() {
        return autoAlignAzimuth;
    }

    /**
     * Sets the value of the autoAlignAzimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoAlignAzimuth(JAXBElement<Integer> value) {
        this.autoAlignAzimuth = value;
    }

    /**
     * Gets the value of the optimalAzimuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptimalAzimuth() {
        return optimalAzimuth;
    }

    /**
     * Sets the value of the optimalAzimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptimalAzimuth(String value) {
        this.optimalAzimuth = value;
    }

    /**
     * Gets the value of the sectorHarmonicMean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorHarmonicMean() {
        return sectorHarmonicMean;
    }

    /**
     * Sets the value of the sectorHarmonicMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorHarmonicMean(String value) {
        this.sectorHarmonicMean = value;
    }

    /**
     * Gets the value of the calculationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CalculationStatusValues }{@code >}
     *     
     */
    public JAXBElement<CalculationStatusValues> getCalculationStatus() {
        return calculationStatus;
    }

    /**
     * Sets the value of the calculationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CalculationStatusValues }{@code >}
     *     
     */
    public void setCalculationStatus(JAXBElement<CalculationStatusValues> value) {
        this.calculationStatus = value;
    }

    /**
     * Gets the value of the autoAlignStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutoAlignStatusValues }{@code >}
     *     
     */
    public JAXBElement<AutoAlignStatusValues> getAutoAlignStatus() {
        return autoAlignStatus;
    }

    /**
     * Sets the value of the autoAlignStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutoAlignStatusValues }{@code >}
     *     
     */
    public void setAutoAlignStatus(JAXBElement<AutoAlignStatusValues> value) {
        this.autoAlignStatus = value;
    }

    /**
     * Gets the value of the autoAlignStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoAlignStatusInformation() {
        return autoAlignStatusInformation;
    }

    /**
     * Sets the value of the autoAlignStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoAlignStatusInformation(String value) {
        this.autoAlignStatusInformation = value;
    }

    /**
     * Gets the value of the fineAlignStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFineAlignStatus() {
        return fineAlignStatus;
    }

    /**
     * Sets the value of the fineAlignStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFineAlignStatus(String value) {
        this.fineAlignStatus = value;
    }

    /**
     * Gets the value of the fineAlignStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFineAlignStatusInformation() {
        return fineAlignStatusInformation;
    }

    /**
     * Sets the value of the fineAlignStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFineAlignStatusInformation(String value) {
        this.fineAlignStatusInformation = value;
    }

    /**
     * Gets the value of the rfStatusPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfStatusPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfStatusPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeBaseRfPathInfo }
     * 
     * 
     */
    public List<IBridgeBaseRfPathInfo> getRfStatusPath() {
        if (rfStatusPath == null) {
            rfStatusPath = new ArrayList<IBridgeBaseRfPathInfo>();
        }
        return this.rfStatusPath;
    }

    /**
     * Gets the value of the autoAlignSectorHarmonicMeanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoAlignSectorHarmonicMeanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoAlignSectorHarmonicMeanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoAlignShmResult }
     * 
     * 
     */
    public List<AutoAlignShmResult> getAutoAlignSectorHarmonicMeanList() {
        if (autoAlignSectorHarmonicMeanList == null) {
            autoAlignSectorHarmonicMeanList = new ArrayList<AutoAlignShmResult>();
        }
        return this.autoAlignSectorHarmonicMeanList;
    }

    /**
     * Gets the value of the fineAlignSectorHarmonicMeanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fineAlignSectorHarmonicMeanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFineAlignSectorHarmonicMeanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FineAlignShmResult }
     * 
     * 
     */
    public List<FineAlignShmResult> getFineAlignSectorHarmonicMeanList() {
        if (fineAlignSectorHarmonicMeanList == null) {
            fineAlignSectorHarmonicMeanList = new ArrayList<FineAlignShmResult>();
        }
        return this.fineAlignSectorHarmonicMeanList;
    }

}
