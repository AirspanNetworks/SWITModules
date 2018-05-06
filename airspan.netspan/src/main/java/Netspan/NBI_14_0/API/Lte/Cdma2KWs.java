
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cdma2kWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cdma2kWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pci" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cdma2kType" type="{http://Airspan.Netspan.WebServices}Cdma2kTypes"/>
 *         &lt;element name="BandClass" type="{http://Airspan.Netspan.WebServices}BandClasses"/>
 *         &lt;element name="Arfcn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SectorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SwitchNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SectorNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cdma2kWs", propOrder = {
    "name",
    "pci",
    "cdma2KType",
    "bandClass",
    "arfcn",
    "sectorId",
    "marketId",
    "switchNumber",
    "cellId",
    "sectorNumber"
})
public class Cdma2KWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Pci", required = true, type = Integer.class, nillable = true)
    protected Integer pci;
    @XmlElement(name = "Cdma2kType", required = true, nillable = true)
    protected String cdma2KType;
    @XmlElement(name = "BandClass", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected BandClasses bandClass;
    @XmlElement(name = "Arfcn", required = true, type = Integer.class, nillable = true)
    protected Integer arfcn;
    @XmlElement(name = "SectorId")
    protected String sectorId;
    @XmlElement(name = "MarketId", required = true, type = Integer.class, nillable = true)
    protected Integer marketId;
    @XmlElement(name = "SwitchNumber", required = true, type = Integer.class, nillable = true)
    protected Integer switchNumber;
    @XmlElement(name = "CellId", required = true, type = Integer.class, nillable = true)
    protected Integer cellId;
    @XmlElement(name = "SectorNumber", required = true, type = Integer.class, nillable = true)
    protected Integer sectorNumber;

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
     * Gets the value of the cdma2KType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdma2KType() {
        return cdma2KType;
    }

    /**
     * Sets the value of the cdma2KType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdma2KType(String value) {
        this.cdma2KType = value;
    }

    /**
     * Gets the value of the bandClass property.
     * 
     * @return
     *     possible object is
     *     {@link BandClasses }
     *     
     */
    public BandClasses getBandClass() {
        return bandClass;
    }

    /**
     * Sets the value of the bandClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandClasses }
     *     
     */
    public void setBandClass(BandClasses value) {
        this.bandClass = value;
    }

    /**
     * Gets the value of the arfcn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArfcn() {
        return arfcn;
    }

    /**
     * Sets the value of the arfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArfcn(Integer value) {
        this.arfcn = value;
    }

    /**
     * Gets the value of the sectorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorId() {
        return sectorId;
    }

    /**
     * Sets the value of the sectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorId(String value) {
        this.sectorId = value;
    }

    /**
     * Gets the value of the marketId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarketId() {
        return marketId;
    }

    /**
     * Sets the value of the marketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarketId(Integer value) {
        this.marketId = value;
    }

    /**
     * Gets the value of the switchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSwitchNumber() {
        return switchNumber;
    }

    /**
     * Sets the value of the switchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSwitchNumber(Integer value) {
        this.switchNumber = value;
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
     * Gets the value of the sectorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSectorNumber() {
        return sectorNumber;
    }

    /**
     * Sets the value of the sectorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSectorNumber(Integer value) {
        this.sectorNumber = value;
    }

}
