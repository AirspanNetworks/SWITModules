
package Netspan.NBI_16_5.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CsgModes;
import Netspan.API.Enums.EnbTypes;


/**
 * <p>Java class for Enb3rdParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Enb3rdParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnbType" type="{http://Airspan.Netspan.WebServices}EnbTypes" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalLayerCellGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalLayerIdentity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Tac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellIdentity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnbId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DlEarfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Bandwidth" type="{http://Airspan.Netspan.WebServices}Bandwidths" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CsgMode" type="{http://Airspan.Netspan.WebServices}CsgModes" minOccurs="0"/&gt;
 *         &lt;element name="CsgId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MvnoPlmnList" type="{http://Airspan.Netspan.WebServices}PlmnListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enb3rdParty", propOrder = {
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
    "latitude",
    "csgMode",
    "csgId",
    "mvnoPlmnList"
})
public class Enb3RdParty {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElementRef(name = "EnbType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnbTypes> enbType;
    @XmlElementRef(name = "PhysicalLayerCellGroup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalLayerCellGroup;
    @XmlElementRef(name = "PhysicalLayerIdentity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalLayerIdentity;
    @XmlElementRef(name = "Tac", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tac;
    @XmlElementRef(name = "CellIdentity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellIdentity;
    @XmlElementRef(name = "EnbId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> enbId;
    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElementRef(name = "DlEarfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlEarfcn;
    @XmlElementRef(name = "Bandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bandwidth;
    @XmlElementRef(name = "Longitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> longitude;
    @XmlElementRef(name = "Latitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> latitude;
    @XmlElementRef(name = "CsgMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CsgModes> csgMode;
    @XmlElementRef(name = "CsgId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csgId;
    @XmlElement(name = "MvnoPlmnList")
    protected PlmnListContainer mvnoPlmnList;

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
     *     {@link JAXBElement }{@code <}{@link EnbTypes }{@code >}
     *     
     */
    public JAXBElement<EnbTypes> getEnbType() {
        return enbType;
    }

    /**
     * Sets the value of the enbType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnbTypes }{@code >}
     *     
     */
    public void setEnbType(JAXBElement<EnbTypes> value) {
        this.enbType = value;
    }

    /**
     * Gets the value of the physicalLayerCellGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhysicalLayerCellGroup() {
        return physicalLayerCellGroup;
    }

    /**
     * Sets the value of the physicalLayerCellGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhysicalLayerCellGroup(JAXBElement<Integer> value) {
        this.physicalLayerCellGroup = value;
    }

    /**
     * Gets the value of the physicalLayerIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhysicalLayerIdentity() {
        return physicalLayerIdentity;
    }

    /**
     * Sets the value of the physicalLayerIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhysicalLayerIdentity(JAXBElement<Integer> value) {
        this.physicalLayerIdentity = value;
    }

    /**
     * Gets the value of the tac property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTac() {
        return tac;
    }

    /**
     * Sets the value of the tac property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTac(JAXBElement<Integer> value) {
        this.tac = value;
    }

    /**
     * Gets the value of the cellIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellIdentity() {
        return cellIdentity;
    }

    /**
     * Sets the value of the cellIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellIdentity(JAXBElement<Integer> value) {
        this.cellIdentity = value;
    }

    /**
     * Gets the value of the enbId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEnbId() {
        return enbId;
    }

    /**
     * Sets the value of the enbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEnbId(JAXBElement<Integer> value) {
        this.enbId = value;
    }

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellId(JAXBElement<Integer> value) {
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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlEarfcn() {
        return dlEarfcn;
    }

    /**
     * Sets the value of the dlEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlEarfcn(JAXBElement<Integer> value) {
        this.dlEarfcn = value;
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBandwidth(JAXBElement<String> value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<BigDecimal> value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<BigDecimal> value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the csgMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CsgModes }{@code >}
     *     
     */
    public JAXBElement<CsgModes> getCsgMode() {
        return csgMode;
    }

    /**
     * Sets the value of the csgMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CsgModes }{@code >}
     *     
     */
    public void setCsgMode(JAXBElement<CsgModes> value) {
        this.csgMode = value;
    }

    /**
     * Gets the value of the csgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsgId() {
        return csgId;
    }

    /**
     * Sets the value of the csgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsgId(JAXBElement<Integer> value) {
        this.csgId = value;
    }

    /**
     * Gets the value of the mvnoPlmnList property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnListContainer }
     *     
     */
    public PlmnListContainer getMvnoPlmnList() {
        return mvnoPlmnList;
    }

    /**
     * Sets the value of the mvnoPlmnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnListContainer }
     *     
     */
    public void setMvnoPlmnList(PlmnListContainer value) {
        this.mvnoPlmnList = value;
    }

}
