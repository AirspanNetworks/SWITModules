
package Netspan.NBI_14_0.API.Lte;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnbTypes;


/**
 * <p>Java class for Lte3rdPartyWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lte3rdPartyWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnbType" type="{http://Airspan.Netspan.WebServices}EnbTypes"/>
 *         &lt;element name="PhysicalLayerCellGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhysicalLayerIdentity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tac" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CellIdentity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EnbId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DlEarfcn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Bandwidth" type="{http://Airspan.Netspan.WebServices}Bandwidths"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lte3rdPartyWs", propOrder = {
    "name",
    "ipAddress",
    "enbType",
    "physicalLayerCellGroup",
    "physicalLayerIdentity",
    "tac",
    "cellIdentity",
    "enbId",
    "cellId",
    "mcc",
    "mnc",
    "dlEarfcn",
    "bandwidth",
    "longitude",
    "latitude"
})
public class Lte3RdPartyWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "EnbType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnbTypes enbType;
    @XmlElement(name = "PhysicalLayerCellGroup", required = true, type = Integer.class, nillable = true)
    protected Integer physicalLayerCellGroup;
    @XmlElement(name = "PhysicalLayerIdentity", required = true, type = Integer.class, nillable = true)
    protected Integer physicalLayerIdentity;
    @XmlElement(name = "Tac", required = true, type = Integer.class, nillable = true)
    protected Integer tac;
    @XmlElement(name = "CellIdentity", required = true, type = Integer.class, nillable = true)
    protected Integer cellIdentity;
    @XmlElement(name = "EnbId", required = true, type = Integer.class, nillable = true)
    protected Integer enbId;
    @XmlElement(name = "CellId", required = true, type = Integer.class, nillable = true)
    protected Integer cellId;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElement(name = "DlEarfcn", required = true, type = Integer.class, nillable = true)
    protected Integer dlEarfcn;
    @XmlElement(name = "Bandwidth", required = true, nillable = true)
    protected String bandwidth;
    @XmlElement(name = "Longitude", required = true, nillable = true)
    protected BigDecimal longitude;
    @XmlElement(name = "Latitude", required = true, nillable = true)
    protected BigDecimal latitude;

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
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the enbType property.
     * 
     * @return
     *     possible object is
     *     {@link EnbTypes }
     *     
     */
    public EnbTypes getEnbType() {
        return enbType;
    }

    /**
     * Sets the value of the enbType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbTypes }
     *     
     */
    public void setEnbType(EnbTypes value) {
        this.enbType = value;
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
     * Gets the value of the tac property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTac() {
        return tac;
    }

    /**
     * Sets the value of the tac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTac(Integer value) {
        this.tac = value;
    }

    /**
     * Gets the value of the cellIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellIdentity() {
        return cellIdentity;
    }

    /**
     * Sets the value of the cellIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellIdentity(Integer value) {
        this.cellIdentity = value;
    }

    /**
     * Gets the value of the enbId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnbId() {
        return enbId;
    }

    /**
     * Sets the value of the enbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnbId(Integer value) {
        this.enbId = value;
    }

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellId(Integer value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcc(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the mnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnc() {
        return mnc;
    }

    /**
     * Sets the value of the mnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnc(String value) {
        this.mnc = value;
    }

    /**
     * Gets the value of the dlEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDlEarfcn() {
        return dlEarfcn;
    }

    /**
     * Sets the value of the dlEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDlEarfcn(Integer value) {
        this.dlEarfcn = value;
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
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

}
