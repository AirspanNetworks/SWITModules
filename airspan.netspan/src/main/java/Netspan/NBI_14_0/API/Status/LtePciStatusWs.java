
package Netspan.NBI_14_0.API.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtePciStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtePciStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhysicalLayerCellGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhysicalLayerIdentity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhysicalCellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PciStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtePciStatusWs", propOrder = {
    "cellId",
    "physicalLayerCellGroup",
    "physicalLayerIdentity",
    "physicalCellId",
    "pciStatus"
})
public class LtePciStatusWs {

    @XmlElement(name = "CellId", required = true, type = Integer.class, nillable = true)
    protected Integer cellId;
    @XmlElement(name = "PhysicalLayerCellGroup", required = true, type = Integer.class, nillable = true)
    protected Integer physicalLayerCellGroup;
    @XmlElement(name = "PhysicalLayerIdentity", required = true, type = Integer.class, nillable = true)
    protected Integer physicalLayerIdentity;
    @XmlElement(name = "PhysicalCellId", required = true, type = Integer.class, nillable = true)
    protected Integer physicalCellId;
    @XmlElement(name = "PciStatus")
    protected String pciStatus;

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
     * Gets the value of the pciStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciStatus() {
        return pciStatus;
    }

    /**
     * Sets the value of the pciStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciStatus(String value) {
        this.pciStatus = value;
    }

}
