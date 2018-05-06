
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteCellGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCellGetWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellID" type="{http://Airspan.Netspan.WebServices}EnbCellNumber"/>
 *         &lt;element name="CellIdentity28Bit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhysicalLayerCellGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhysicalLayerIdentity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhysicalCellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TrackingAreaCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PrachFreqOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RadioProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilityProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCellGetWs", propOrder = {
    "cellID",
    "cellIdentity28Bit",
    "physicalLayerCellGroup",
    "physicalLayerIdentity",
    "physicalCellId",
    "trackingAreaCode",
    "prachFreqOffset",
    "radioProfile",
    "mobilityProfile",
    "isEnabled"
})
public class LteCellGetWs {

    @XmlElement(name = "CellID", required = true, nillable = true)
    protected String cellID;
    @XmlElement(name = "CellIdentity28Bit", required = true, type = Integer.class, nillable = true)
    protected Integer cellIdentity28Bit;
    @XmlElement(name = "PhysicalLayerCellGroup", required = true, type = Integer.class, nillable = true)
    protected Integer physicalLayerCellGroup;
    @XmlElement(name = "PhysicalLayerIdentity", required = true, type = Integer.class, nillable = true)
    protected Integer physicalLayerIdentity;
    @XmlElement(name = "PhysicalCellId", required = true, type = Integer.class, nillable = true)
    protected Integer physicalCellId;
    @XmlElement(name = "TrackingAreaCode", required = true, type = Integer.class, nillable = true)
    protected Integer trackingAreaCode;
    @XmlElement(name = "PrachFreqOffset", required = true, type = Integer.class, nillable = true)
    protected Integer prachFreqOffset;
    @XmlElement(name = "RadioProfile")
    protected String radioProfile;
    @XmlElement(name = "MobilityProfile")
    protected String mobilityProfile;
    @XmlElement(name = "IsEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean isEnabled;

    /**
     * Gets the value of the cellID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellID() {
        return cellID;
    }

    /**
     * Sets the value of the cellID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellID(String value) {
        this.cellID = value;
    }

    /**
     * Gets the value of the cellIdentity28Bit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellIdentity28Bit() {
        return cellIdentity28Bit;
    }

    /**
     * Sets the value of the cellIdentity28Bit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellIdentity28Bit(Integer value) {
        this.cellIdentity28Bit = value;
    }

    /**
     * Gets the value of the physicalLayerCellGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhysicalLayerCellGroup() {
        return physicalLayerCellGroup;
    }

    /**
     * Sets the value of the physicalLayerCellGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhysicalLayerCellGroup(Integer value) {
        this.physicalLayerCellGroup = value;
    }

    /**
     * Gets the value of the physicalLayerIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhysicalLayerIdentity() {
        return physicalLayerIdentity;
    }

    /**
     * Sets the value of the physicalLayerIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhysicalLayerIdentity(Integer value) {
        this.physicalLayerIdentity = value;
    }

    /**
     * Gets the value of the physicalCellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhysicalCellId() {
        return physicalCellId;
    }

    /**
     * Sets the value of the physicalCellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhysicalCellId(Integer value) {
        this.physicalCellId = value;
    }

    /**
     * Gets the value of the trackingAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrackingAreaCode() {
        return trackingAreaCode;
    }

    /**
     * Sets the value of the trackingAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrackingAreaCode(Integer value) {
        this.trackingAreaCode = value;
    }

    /**
     * Gets the value of the prachFreqOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrachFreqOffset() {
        return prachFreqOffset;
    }

    /**
     * Sets the value of the prachFreqOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrachFreqOffset(Integer value) {
        this.prachFreqOffset = value;
    }

    /**
     * Gets the value of the radioProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioProfile() {
        return radioProfile;
    }

    /**
     * Sets the value of the radioProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioProfile(String value) {
        this.radioProfile = value;
    }

    /**
     * Gets the value of the mobilityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilityProfile() {
        return mobilityProfile;
    }

    /**
     * Sets the value of the mobilityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilityProfile(String value) {
        this.mobilityProfile = value;
    }

    /**
     * Gets the value of the isEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

}
