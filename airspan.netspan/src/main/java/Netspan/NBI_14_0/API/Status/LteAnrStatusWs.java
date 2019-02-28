
package Netspan.NBI_14_0.API.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.HandoverType;
import Netspan.API.Enums.HoControlStateTypes;
import Netspan.API.Enums.X2ControlStateTypes;


/**
 * <p>Java class for LteAnrStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteAnrStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pci" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EnbType" type="{http://Airspan.Netspan.WebServices}EnbTypes"/>
 *         &lt;element name="EnbId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CellIdentity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tac" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DownlinkEarfcn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoControlStatus" type="{http://Airspan.Netspan.WebServices}HoControlStateTypes"/>
 *         &lt;element name="X2ControlStatus" type="{http://Airspan.Netspan.WebServices}X2ControlStateTypes"/>
 *         &lt;element name="HandoverType" type="{http://Airspan.Netspan.WebServices}HandoverType"/>
 *         &lt;element name="DiscoveredBy" type="{http://Airspan.Netspan.WebServices}DiscoveredByValues"/>
 *         &lt;element name="IsStaticNeighbour" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteAnrStatusWs", propOrder = {
    "name",
    "ipAddress",
    "pci",
    "enbType",
    "enbId",
    "cellId",
    "cellIdentity",
    "tac",
    "downlinkEarfcn",
    "mcc",
    "mnc",
    "hoControlStatus",
    "x2ControlStatus",
    "handoverType",
    "discoveredBy",
    "isStaticNeighbour"
})
public class LteAnrStatusWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "Pci", required = true, type = Integer.class, nillable = true)
    protected Integer pci;
    @XmlElement(name = "EnbType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnbTypes enbType;
    @XmlElement(name = "EnbId")
    protected String enbId;
    @XmlElement(name = "CellId", required = true, type = Integer.class, nillable = true)
    protected Integer cellId;
    @XmlElement(name = "CellIdentity", required = true, type = Integer.class, nillable = true)
    protected Integer cellIdentity;
    @XmlElement(name = "Tac", required = true, type = Integer.class, nillable = true)
    protected Integer tac;
    @XmlElement(name = "DownlinkEarfcn", required = true, type = Integer.class, nillable = true)
    protected Integer downlinkEarfcn;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElement(name = "HoControlStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected HoControlStateTypes hoControlStatus;
    @XmlElement(name = "X2ControlStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected X2ControlStateTypes x2ControlStatus;
    @XmlElement(name = "HandoverType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected HandoverType handoverType;
    @XmlElement(name = "DiscoveredBy", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected DiscoveredByValues discoveredBy;
    @XmlElement(name = "IsStaticNeighbour", required = true, type = Boolean.class, nillable = true)
    protected Boolean isStaticNeighbour;

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
     * Gets the value of the pci property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPci() {
        return pci;
    }

    /**
     * Sets the value of the pci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPci(Integer value) {
        this.pci = value;
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
     * Gets the value of the enbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnbId() {
        return enbId;
    }

    /**
     * Sets the value of the enbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnbId(String value) {
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
     * Gets the value of the downlinkEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDownlinkEarfcn() {
        return downlinkEarfcn;
    }

    /**
     * Sets the value of the downlinkEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDownlinkEarfcn(Integer value) {
        this.downlinkEarfcn = value;
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
     * Gets the value of the hoControlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HoControlStateTypes }
     *     
     */
    public HoControlStateTypes getHoControlStatus() {
        return hoControlStatus;
    }

    /**
     * Sets the value of the hoControlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoControlStateTypes }
     *     
     */
    public void setHoControlStatus(HoControlStateTypes value) {
        this.hoControlStatus = value;
    }

    /**
     * Gets the value of the x2ControlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link X2ControlStateTypes }
     *     
     */
    public X2ControlStateTypes getX2ControlStatus() {
        return x2ControlStatus;
    }

    /**
     * Sets the value of the x2ControlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link X2ControlStateTypes }
     *     
     */
    public void setX2ControlStatus(X2ControlStateTypes value) {
        this.x2ControlStatus = value;
    }

    /**
     * Gets the value of the handoverType property.
     * 
     * @return
     *     possible object is
     *     {@link HandoverType }
     *     
     */
    public HandoverType getHandoverType() {
        return handoverType;
    }

    /**
     * Sets the value of the handoverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandoverType }
     *     
     */
    public void setHandoverType(HandoverType value) {
        this.handoverType = value;
    }

    /**
     * Gets the value of the discoveredBy property.
     * 
     * @return
     *     possible object is
     *     {@link DiscoveredByValues }
     *     
     */
    public DiscoveredByValues getDiscoveredBy() {
        return discoveredBy;
    }

    /**
     * Sets the value of the discoveredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoveredByValues }
     *     
     */
    public void setDiscoveredBy(DiscoveredByValues value) {
        this.discoveredBy = value;
    }

    /**
     * Gets the value of the isStaticNeighbour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStaticNeighbour() {
        return isStaticNeighbour;
    }

    /**
     * Sets the value of the isStaticNeighbour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStaticNeighbour(Boolean value) {
        this.isStaticNeighbour = value;
    }

}
