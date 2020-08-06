
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbsdCpiDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbsdCpiDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CbrsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CpiDataRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CpiDataExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CbsdState" type="{http://Airspan.Netspan.WebServices}CbsdStates"/&gt;
 *         &lt;element name="FccId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="HorizontalAccuracy" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="VerticalAccuracy" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IndoorDeployment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AntennaAzimuth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AntennaDowntilt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AntennaGain" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EirpCapability" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AntennaBeamwidth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AntennaModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CpiDetails" type="{http://Airspan.Netspan.WebServices}CpiDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbsdCpiDetails", propOrder = {
    "cbrsEnabled",
    "cpiDataRequired",
    "cpiDataExists",
    "cbsdState",
    "fccId",
    "serialNumber",
    "latitude",
    "longitude",
    "height",
    "horizontalAccuracy",
    "verticalAccuracy",
    "indoorDeployment",
    "antennaAzimuth",
    "antennaDowntilt",
    "antennaGain",
    "eirpCapability",
    "antennaBeamwidth",
    "antennaModel",
    "cpiDetails"
})
public class CbsdCpiDetails {

    @XmlElement(name = "CbrsEnabled")
    protected boolean cbrsEnabled;
    @XmlElement(name = "CpiDataRequired")
    protected boolean cpiDataRequired;
    @XmlElement(name = "CpiDataExists")
    protected boolean cpiDataExists;
    @XmlElement(name = "CbsdState", required = true)
    @XmlSchemaType(name = "string")
    protected CbsdStates cbsdState;
    @XmlElement(name = "FccId")
    protected String fccId;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "Height")
    protected double height;
    @XmlElement(name = "HorizontalAccuracy")
    protected double horizontalAccuracy;
    @XmlElement(name = "VerticalAccuracy")
    protected double verticalAccuracy;
    @XmlElement(name = "IndoorDeployment")
    protected boolean indoorDeployment;
    @XmlElement(name = "AntennaAzimuth")
    protected int antennaAzimuth;
    @XmlElement(name = "AntennaDowntilt")
    protected int antennaDowntilt;
    @XmlElement(name = "AntennaGain")
    protected int antennaGain;
    @XmlElement(name = "EirpCapability")
    protected int eirpCapability;
    @XmlElement(name = "AntennaBeamwidth")
    protected int antennaBeamwidth;
    @XmlElement(name = "AntennaModel")
    protected String antennaModel;
    @XmlElement(name = "CpiDetails")
    protected CpiDetails cpiDetails;

    /**
     * Gets the value of the cbrsEnabled property.
     * 
     */
    public boolean isCbrsEnabled() {
        return cbrsEnabled;
    }

    /**
     * Sets the value of the cbrsEnabled property.
     * 
     */
    public void setCbrsEnabled(boolean value) {
        this.cbrsEnabled = value;
    }

    /**
     * Gets the value of the cpiDataRequired property.
     * 
     */
    public boolean isCpiDataRequired() {
        return cpiDataRequired;
    }

    /**
     * Sets the value of the cpiDataRequired property.
     * 
     */
    public void setCpiDataRequired(boolean value) {
        this.cpiDataRequired = value;
    }

    /**
     * Gets the value of the cpiDataExists property.
     * 
     */
    public boolean isCpiDataExists() {
        return cpiDataExists;
    }

    /**
     * Sets the value of the cpiDataExists property.
     * 
     */
    public void setCpiDataExists(boolean value) {
        this.cpiDataExists = value;
    }

    /**
     * Gets the value of the cbsdState property.
     * 
     * @return
     *     possible object is
     *     {@link CbsdStates }
     *     
     */
    public CbsdStates getCbsdState() {
        return cbsdState;
    }

    /**
     * Sets the value of the cbsdState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsdStates }
     *     
     */
    public void setCbsdState(CbsdStates value) {
        this.cbsdState = value;
    }

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
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Gets the value of the horizontalAccuracy property.
     * 
     */
    public double getHorizontalAccuracy() {
        return horizontalAccuracy;
    }

    /**
     * Sets the value of the horizontalAccuracy property.
     * 
     */
    public void setHorizontalAccuracy(double value) {
        this.horizontalAccuracy = value;
    }

    /**
     * Gets the value of the verticalAccuracy property.
     * 
     */
    public double getVerticalAccuracy() {
        return verticalAccuracy;
    }

    /**
     * Sets the value of the verticalAccuracy property.
     * 
     */
    public void setVerticalAccuracy(double value) {
        this.verticalAccuracy = value;
    }

    /**
     * Gets the value of the indoorDeployment property.
     * 
     */
    public boolean isIndoorDeployment() {
        return indoorDeployment;
    }

    /**
     * Sets the value of the indoorDeployment property.
     * 
     */
    public void setIndoorDeployment(boolean value) {
        this.indoorDeployment = value;
    }

    /**
     * Gets the value of the antennaAzimuth property.
     * 
     */
    public int getAntennaAzimuth() {
        return antennaAzimuth;
    }

    /**
     * Sets the value of the antennaAzimuth property.
     * 
     */
    public void setAntennaAzimuth(int value) {
        this.antennaAzimuth = value;
    }

    /**
     * Gets the value of the antennaDowntilt property.
     * 
     */
    public int getAntennaDowntilt() {
        return antennaDowntilt;
    }

    /**
     * Sets the value of the antennaDowntilt property.
     * 
     */
    public void setAntennaDowntilt(int value) {
        this.antennaDowntilt = value;
    }

    /**
     * Gets the value of the antennaGain property.
     * 
     */
    public int getAntennaGain() {
        return antennaGain;
    }

    /**
     * Sets the value of the antennaGain property.
     * 
     */
    public void setAntennaGain(int value) {
        this.antennaGain = value;
    }

    /**
     * Gets the value of the eirpCapability property.
     * 
     */
    public int getEirpCapability() {
        return eirpCapability;
    }

    /**
     * Sets the value of the eirpCapability property.
     * 
     */
    public void setEirpCapability(int value) {
        this.eirpCapability = value;
    }

    /**
     * Gets the value of the antennaBeamwidth property.
     * 
     */
    public int getAntennaBeamwidth() {
        return antennaBeamwidth;
    }

    /**
     * Sets the value of the antennaBeamwidth property.
     * 
     */
    public void setAntennaBeamwidth(int value) {
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

}
