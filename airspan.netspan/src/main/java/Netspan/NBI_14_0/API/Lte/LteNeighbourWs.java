
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.HandoverTypes;
import Netspan.API.Enums.HoControlStateTypes;
import Netspan.API.Enums.X2ControlStateTypes;


/**
 * <p>Java class for LteNeighbourWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteNeighbourWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NeighbourName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeighbourType" type="{http://Airspan.Netspan.WebServices}LteNeighbourTypes"/>
 *         &lt;element name="NeighbourCellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoControlState" type="{http://Airspan.Netspan.WebServices}HoControlStateTypes"/>
 *         &lt;element name="X2ControlState" type="{http://Airspan.Netspan.WebServices}X2ControlStateTypes"/>
 *         &lt;element name="HandoverType" type="{http://Airspan.Netspan.WebServices}HandoverType"/>
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
@XmlType(name = "LteNeighbourWs", propOrder = {
    "neighbourName",
    "neighbourType",
    "neighbourCellNumber",
    "distance",
    "hoControlState",
    "x2ControlState",
    "handoverType",
    "isStaticNeighbour"
})
public class LteNeighbourWs {

    @XmlElement(name = "NeighbourName")
    protected String neighbourName;
    @XmlElement(name = "NeighbourType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected LteNeighbourTypes neighbourType;
    @XmlElement(name = "NeighbourCellNumber", required = true, type = Integer.class, nillable = true)
    protected Integer neighbourCellNumber;
    @XmlElement(name = "Distance")
    protected String distance;
    @XmlElement(name = "HoControlState", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected HoControlStateTypes hoControlState;
    @XmlElement(name = "X2ControlState", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected X2ControlStateTypes x2ControlState;
    @XmlElement(name = "HandoverType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected HandoverTypes handoverType;
    @XmlElement(name = "IsStaticNeighbour", required = true, type = Boolean.class, nillable = true)
    protected Boolean isStaticNeighbour;

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
     * Gets the value of the neighbourType property.
     * 
     * @return
     *     possible object is
     *     {@link LteNeighbourTypes }
     *     
     */
    public LteNeighbourTypes getNeighbourType() {
        return neighbourType;
    }

    /**
     * Sets the value of the neighbourType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNeighbourTypes }
     *     
     */
    public void setNeighbourType(LteNeighbourTypes value) {
        this.neighbourType = value;
    }

    /**
     * Gets the value of the neighbourCellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNeighbourCellNumber() {
        return neighbourCellNumber;
    }

    /**
     * Sets the value of the neighbourCellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNeighbourCellNumber(Integer value) {
        this.neighbourCellNumber = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Gets the value of the hoControlState property.
     * 
     * @return
     *     possible object is
     *     {@link HoControlStateTypes }
     *     
     */
    public HoControlStateTypes getHoControlState() {
        return hoControlState;
    }

    /**
     * Sets the value of the hoControlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoControlStateTypes }
     *     
     */
    public void setHoControlState(HoControlStateTypes value) {
        this.hoControlState = value;
    }

    /**
     * Gets the value of the x2ControlState property.
     * 
     * @return
     *     possible object is
     *     {@link X2ControlStateTypes }
     *     
     */
    public X2ControlStateTypes getX2ControlState() {
        return x2ControlState;
    }

    /**
     * Sets the value of the x2ControlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link X2ControlStateTypes }
     *     
     */
    public void setX2ControlState(X2ControlStateTypes value) {
        this.x2ControlState = value;
    }

    /**
     * Gets the value of the handoverType property.
     * 
     * @return
     *     possible object is
     *     {@link HandoverTypes }
     *     
     */
    public HandoverTypes getHandoverType() {
        return handoverType;
    }

    /**
     * Sets the value of the handoverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandoverTypes }
     *     
     */
    public void setHandoverType(HandoverTypes value) {
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

}
