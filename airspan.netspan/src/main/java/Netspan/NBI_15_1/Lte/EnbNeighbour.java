
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbNeighbour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbNeighbour">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeighbourName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeighbourType" type="{http://Airspan.Netspan.WebServices}LteNeighbourTypes" minOccurs="0"/>
 *         &lt;element name="NeighbourCellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoControlState" type="{http://Airspan.Netspan.WebServices}HoControlStateTypes" minOccurs="0"/>
 *         &lt;element name="X2ControlState" type="{http://Airspan.Netspan.WebServices}X2ControlStateTypes" minOccurs="0"/>
 *         &lt;element name="HandoverType" type="{http://Airspan.Netspan.WebServices}HandoverType" minOccurs="0"/>
 *         &lt;element name="IsStaticNeighbour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QOffsetRange" type="{http://Airspan.Netspan.WebServices}QOffsetRangeTypes" minOccurs="0"/>
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
@XmlType(name = "EnbNeighbour", propOrder = {
    "nodeName",
    "neighbourName",
    "neighbourType",
    "neighbourCellNumber",
    "distance",
    "hoControlState",
    "x2ControlState",
    "handoverType",
    "isStaticNeighbour",
    "qOffsetRange",
    "cellIndividualOffsetRange"
})
public class EnbNeighbour {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NeighbourName")
    protected String neighbourName;
    @XmlElementRef(name = "NeighbourType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<LteNeighbourTypes> neighbourType;
    @XmlElementRef(name = "NeighbourCellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> neighbourCellNumber;
    @XmlElement(name = "Distance")
    protected String distance;
    @XmlElementRef(name = "HoControlState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<HoControlStateTypes> hoControlState;
    @XmlElementRef(name = "X2ControlState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<X2ControlStateTypes> x2ControlState;
    @XmlElementRef(name = "HandoverType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<HandoverType> handoverType;
    @XmlElementRef(name = "IsStaticNeighbour", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isStaticNeighbour;
    @XmlElementRef(name = "QOffsetRange", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qOffsetRange;
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
     * Gets the value of the neighbourType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LteNeighbourTypes }{@code >}
     *     
     */
    public JAXBElement<LteNeighbourTypes> getNeighbourType() {
        return neighbourType;
    }

    /**
     * Sets the value of the neighbourType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LteNeighbourTypes }{@code >}
     *     
     */
    public void setNeighbourType(JAXBElement<LteNeighbourTypes> value) {
        this.neighbourType = value;
    }

    /**
     * Gets the value of the neighbourCellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNeighbourCellNumber() {
        return neighbourCellNumber;
    }

    /**
     * Sets the value of the neighbourCellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNeighbourCellNumber(JAXBElement<Integer> value) {
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
     *     {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}
     *     
     */
    public JAXBElement<HoControlStateTypes> getHoControlState() {
        return hoControlState;
    }

    /**
     * Sets the value of the hoControlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}
     *     
     */
    public void setHoControlState(JAXBElement<HoControlStateTypes> value) {
        this.hoControlState = value;
    }

    /**
     * Gets the value of the x2ControlState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}
     *     
     */
    public JAXBElement<X2ControlStateTypes> getX2ControlState() {
        return x2ControlState;
    }

    /**
     * Sets the value of the x2ControlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}
     *     
     */
    public void setX2ControlState(JAXBElement<X2ControlStateTypes> value) {
        this.x2ControlState = value;
    }

    /**
     * Gets the value of the handoverType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HandoverType }{@code >}
     *     
     */
    public JAXBElement<HandoverType> getHandoverType() {
        return handoverType;
    }

    /**
     * Sets the value of the handoverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HandoverType }{@code >}
     *     
     */
    public void setHandoverType(JAXBElement<HandoverType> value) {
        this.handoverType = value;
    }

    /**
     * Gets the value of the isStaticNeighbour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsStaticNeighbour() {
        return isStaticNeighbour;
    }

    /**
     * Sets the value of the isStaticNeighbour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsStaticNeighbour(JAXBElement<Boolean> value) {
        this.isStaticNeighbour = value;
    }

    /**
     * Gets the value of the qOffsetRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQOffsetRange() {
        return qOffsetRange;
    }

    /**
     * Sets the value of the qOffsetRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQOffsetRange(JAXBElement<String> value) {
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
