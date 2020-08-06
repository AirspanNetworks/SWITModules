
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbsdDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbsdDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FccId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://Airspan.Netspan.WebServices}CbsdCategory" minOccurs="0"/&gt;
 *         &lt;element name="CbsdGroupParametersList" type="{http://Airspan.Netspan.WebServices}CbsdGroupParametersListContainer" minOccurs="0"/&gt;
 *         &lt;element name="IsInstallParams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCpiSignatureData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HorizontalAccuracy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VerticalAccuracy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IndoorDeployment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AntennaAzimuth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AntennaDowntilt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AntennaGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AntennaBeamwidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AntennaModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CpiDetails" type="{http://Airspan.Netspan.WebServices}CpiDetails" minOccurs="0"/&gt;
 *         &lt;element name="IsMeasurementCapability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementReportType" type="{http://Airspan.Netspan.WebServices}CbsdMeasReportTypes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbsdDetails", propOrder = {
    "fccId",
    "callSign",
    "category",
    "cbsdGroupParametersList",
    "isInstallParams",
    "isCpiSignatureData",
    "horizontalAccuracy",
    "verticalAccuracy",
    "indoorDeployment",
    "antennaAzimuth",
    "antennaDowntilt",
    "antennaGain",
    "antennaBeamwidth",
    "antennaModel",
    "cpiDetails",
    "isMeasurementCapability",
    "measurementReportType"
})
public class CbsdDetails {

    @XmlElement(name = "FccId")
    protected String fccId;
    @XmlElement(name = "CallSign")
    protected String callSign;
    @XmlElementRef(name = "Category", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CbsdCategory> category;
    @XmlElement(name = "CbsdGroupParametersList")
    protected CbsdGroupParametersListContainer cbsdGroupParametersList;
    @XmlElementRef(name = "IsInstallParams", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isInstallParams;
    @XmlElementRef(name = "IsCpiSignatureData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCpiSignatureData;
    @XmlElementRef(name = "HorizontalAccuracy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> horizontalAccuracy;
    @XmlElementRef(name = "VerticalAccuracy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> verticalAccuracy;
    @XmlElementRef(name = "IndoorDeployment", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> indoorDeployment;
    @XmlElementRef(name = "AntennaAzimuth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> antennaAzimuth;
    @XmlElementRef(name = "AntennaDowntilt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> antennaDowntilt;
    @XmlElementRef(name = "AntennaGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> antennaGain;
    @XmlElementRef(name = "AntennaBeamwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> antennaBeamwidth;
    @XmlElement(name = "AntennaModel")
    protected String antennaModel;
    @XmlElement(name = "CpiDetails")
    protected CpiDetails cpiDetails;
    @XmlElementRef(name = "IsMeasurementCapability", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isMeasurementCapability;
    @XmlElementRef(name = "MeasurementReportType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CbsdMeasReportTypes> measurementReportType;

    /**
     * Gets the value of the fccId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFccId() {
        return fccId;
    }

    /**
     * Sets the value of the fccId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFccId(String value) {
        this.fccId = value;
    }

    /**
     * Gets the value of the callSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallSign() {
        return callSign;
    }

    /**
     * Sets the value of the callSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallSign(String value) {
        this.callSign = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CbsdCategory }{@code >}
     *     
     */
    public JAXBElement<CbsdCategory> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CbsdCategory }{@code >}
     *     
     */
    public void setCategory(JAXBElement<CbsdCategory> value) {
        this.category = value;
    }

    /**
     * Gets the value of the cbsdGroupParametersList property.
     * 
     * @return
     *     possible object is
     *     {@link CbsdGroupParametersListContainer }
     *     
     */
    public CbsdGroupParametersListContainer getCbsdGroupParametersList() {
        return cbsdGroupParametersList;
    }

    /**
     * Sets the value of the cbsdGroupParametersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsdGroupParametersListContainer }
     *     
     */
    public void setCbsdGroupParametersList(CbsdGroupParametersListContainer value) {
        this.cbsdGroupParametersList = value;
    }

    /**
     * Gets the value of the isInstallParams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsInstallParams() {
        return isInstallParams;
    }

    /**
     * Sets the value of the isInstallParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsInstallParams(JAXBElement<Boolean> value) {
        this.isInstallParams = value;
    }

    /**
     * Gets the value of the isCpiSignatureData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCpiSignatureData() {
        return isCpiSignatureData;
    }

    /**
     * Sets the value of the isCpiSignatureData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCpiSignatureData(JAXBElement<Boolean> value) {
        this.isCpiSignatureData = value;
    }

    /**
     * Gets the value of the horizontalAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHorizontalAccuracy() {
        return horizontalAccuracy;
    }

    /**
     * Sets the value of the horizontalAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHorizontalAccuracy(JAXBElement<Integer> value) {
        this.horizontalAccuracy = value;
    }

    /**
     * Gets the value of the verticalAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVerticalAccuracy() {
        return verticalAccuracy;
    }

    /**
     * Sets the value of the verticalAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVerticalAccuracy(JAXBElement<Integer> value) {
        this.verticalAccuracy = value;
    }

    /**
     * Gets the value of the indoorDeployment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIndoorDeployment() {
        return indoorDeployment;
    }

    /**
     * Sets the value of the indoorDeployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIndoorDeployment(JAXBElement<Boolean> value) {
        this.indoorDeployment = value;
    }

    /**
     * Gets the value of the antennaAzimuth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAntennaAzimuth() {
        return antennaAzimuth;
    }

    /**
     * Sets the value of the antennaAzimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAntennaAzimuth(JAXBElement<Integer> value) {
        this.antennaAzimuth = value;
    }

    /**
     * Gets the value of the antennaDowntilt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAntennaDowntilt() {
        return antennaDowntilt;
    }

    /**
     * Sets the value of the antennaDowntilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAntennaDowntilt(JAXBElement<Integer> value) {
        this.antennaDowntilt = value;
    }

    /**
     * Gets the value of the antennaGain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAntennaGain() {
        return antennaGain;
    }

    /**
     * Sets the value of the antennaGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAntennaGain(JAXBElement<Integer> value) {
        this.antennaGain = value;
    }

    /**
     * Gets the value of the antennaBeamwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAntennaBeamwidth() {
        return antennaBeamwidth;
    }

    /**
     * Sets the value of the antennaBeamwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAntennaBeamwidth(JAXBElement<Integer> value) {
        this.antennaBeamwidth = value;
    }

    /**
     * Gets the value of the antennaModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaModel() {
        return antennaModel;
    }

    /**
     * Sets the value of the antennaModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaModel(String value) {
        this.antennaModel = value;
    }

    /**
     * Gets the value of the cpiDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CpiDetails }
     *     
     */
    public CpiDetails getCpiDetails() {
        return cpiDetails;
    }

    /**
     * Sets the value of the cpiDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpiDetails }
     *     
     */
    public void setCpiDetails(CpiDetails value) {
        this.cpiDetails = value;
    }

    /**
     * Gets the value of the isMeasurementCapability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsMeasurementCapability() {
        return isMeasurementCapability;
    }

    /**
     * Sets the value of the isMeasurementCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsMeasurementCapability(JAXBElement<Boolean> value) {
        this.isMeasurementCapability = value;
    }

    /**
     * Gets the value of the measurementReportType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CbsdMeasReportTypes }{@code >}
     *     
     */
    public JAXBElement<CbsdMeasReportTypes> getMeasurementReportType() {
        return measurementReportType;
    }

    /**
     * Sets the value of the measurementReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CbsdMeasReportTypes }{@code >}
     *     
     */
    public void setMeasurementReportType(JAXBElement<CbsdMeasReportTypes> value) {
        this.measurementReportType = value;
    }

}
