
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.X2ControlStateTypes;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeighbourName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoControlStatus" type="{http://Airspan.Netspan.WebServices}HoControlStateTypes"/>
 *         &lt;element name="X2ControlStatus" type="{http://Airspan.Netspan.WebServices}X2ControlStateTypes"/>
 *         &lt;element name="HandoverType" type="{http://Airspan.Netspan.WebServices}HandoverType"/>
 *         &lt;element name="IsStaticNeighbour" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="QOffsetRange" type="{http://Airspan.Netspan.WebServices}QOffsetRangeTypes"/>
 *         &lt;element name="CellIndividualOffsetRange" type="{http://Airspan.Netspan.WebServices}QOffsetRangeTypes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodeName",
    "neighbourName",
    "hoControlStatus",
    "x2ControlStatus",
    "handoverType",
    "isStaticNeighbour",
    "qOffsetRange",
    "cellIndividualOffsetRange"
})
@XmlRootElement(name = "LteNeighbourAdd")
public class LteNeighbourAdd {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NeighbourName")
    protected String neighbourName;
    @XmlElement(name = "HoControlStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected HoControlStateTypes hoControlStatus;
    @XmlElement(name = "X2ControlStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected X2ControlStateTypes x2ControlStatus;
    @XmlElement(name = "HandoverType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected HandoverType handoverType;
    @XmlElement(name = "IsStaticNeighbour", required = true, type = Boolean.class, nillable = true)
    protected Boolean isStaticNeighbour;
    @XmlElement(name = "QOffsetRange", required = true, nillable = true)
    protected String qOffsetRange;
    @XmlElement(name = "CellIndividualOffsetRange", required = true, nillable = true)
    protected String cellIndividualOffsetRange;

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the neighbourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighbourName() {
        return neighbourName;
    }

    /**
     * Sets the value of the neighbourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighbourName(String value) {
        this.neighbourName = value;
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

    /**
     * Gets the value of the qOffsetRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQOffsetRange() {
        return qOffsetRange;
    }

    /**
     * Sets the value of the qOffsetRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQOffsetRange(String value) {
        this.qOffsetRange = value;
    }

    /**
     * Gets the value of the cellIndividualOffsetRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellIndividualOffsetRange() {
        return cellIndividualOffsetRange;
    }

    /**
     * Sets the value of the cellIndividualOffsetRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellIndividualOffsetRange(String value) {
        this.cellIndividualOffsetRange = value;
    }

}
