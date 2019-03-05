
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.HoControlStateTypes;
import Netspan.API.Enums.X2ControlStateTypes;


/**
 * <p>Java class for LteNbrConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteNbrConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellIdentity28Bits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoControlState" type="{http://Airspan.Netspan.WebServices}HoControlStateTypes" minOccurs="0"/&gt;
 *         &lt;element name="X2ControlState" type="{http://Airspan.Netspan.WebServices}X2ControlStateTypes" minOccurs="0"/&gt;
 *         &lt;element name="HandoverType" type="{http://Airspan.Netspan.WebServices}HandoverType" minOccurs="0"/&gt;
 *         &lt;element name="IsStaticNeighbour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QOffsetRange" type="{http://Airspan.Netspan.WebServices}QOffsetRangeTypes" minOccurs="0"/&gt;
 *         &lt;element name="CellIndividualOffsetRange" type="{http://Airspan.Netspan.WebServices}QOffsetRangeTypes" minOccurs="0"/&gt;
 *         &lt;element name="NodeType" type="{http://Airspan.Netspan.WebServices}NeighbourEnbTypes" minOccurs="0"/&gt;
 *         &lt;element name="NeighbourIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NeighbourEarfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NeighbourPci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NeighbourTac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlmnList" type="{http://Airspan.Netspan.WebServices}PlmnListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteNbrConfig", propOrder = {
    "nodeName",
    "mcc",
    "mnc",
    "cellIdentity28Bits",
    "hoControlState",
    "x2ControlState",
    "handoverType",
    "isStaticNeighbour",
    "qOffsetRange",
    "cellIndividualOffsetRange",
    "nodeType",
    "neighbourIpAddress",
    "neighbourEarfcn",
    "neighbourPci",
    "neighbourTac",
    "plmnList"
})
public class LteNbrConfig {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElement(name = "CellIdentity28Bits")
    protected String cellIdentity28Bits;
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
    @XmlElementRef(name = "CellIndividualOffsetRange", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cellIndividualOffsetRange;
    @XmlElementRef(name = "NodeType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<NeighbourEnbTypes> nodeType;
    @XmlElement(name = "NeighbourIpAddress")
    protected String neighbourIpAddress;
    @XmlElementRef(name = "NeighbourEarfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> neighbourEarfcn;
    @XmlElementRef(name = "NeighbourPci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> neighbourPci;
    @XmlElementRef(name = "NeighbourTac", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> neighbourTac;
    @XmlElement(name = "PlmnList")
    protected PlmnListContainer plmnList;

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
     * Gets the value of the cellIdentity28Bits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellIdentity28Bits() {
        return cellIdentity28Bits;
    }

    /**
     * Sets the value of the cellIdentity28Bits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellIdentity28Bits(String value) {
        this.cellIdentity28Bits = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCellIndividualOffsetRange() {
        return cellIndividualOffsetRange;
    }

    /**
     * Sets the value of the cellIndividualOffsetRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCellIndividualOffsetRange(JAXBElement<String> value) {
        this.cellIndividualOffsetRange = value;
    }

    /**
     * Gets the value of the nodeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NeighbourEnbTypes }{@code >}
     *     
     */
    public JAXBElement<NeighbourEnbTypes> getNodeType() {
        return nodeType;
    }

    /**
     * Sets the value of the nodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NeighbourEnbTypes }{@code >}
     *     
     */
    public void setNodeType(JAXBElement<NeighbourEnbTypes> value) {
        this.nodeType = value;
    }

    /**
     * Gets the value of the neighbourIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighbourIpAddress() {
        return neighbourIpAddress;
    }

    /**
     * Sets the value of the neighbourIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighbourIpAddress(String value) {
        this.neighbourIpAddress = value;
    }

    /**
     * Gets the value of the neighbourEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNeighbourEarfcn() {
        return neighbourEarfcn;
    }

    /**
     * Sets the value of the neighbourEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNeighbourEarfcn(JAXBElement<Integer> value) {
        this.neighbourEarfcn = value;
    }

    /**
     * Gets the value of the neighbourPci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNeighbourPci() {
        return neighbourPci;
    }

    /**
     * Sets the value of the neighbourPci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNeighbourPci(JAXBElement<Integer> value) {
        this.neighbourPci = value;
    }

    /**
     * Gets the value of the neighbourTac property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNeighbourTac() {
        return neighbourTac;
    }

    /**
     * Sets the value of the neighbourTac property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNeighbourTac(JAXBElement<Integer> value) {
        this.neighbourTac = value;
    }

    /**
     * Gets the value of the plmnList property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnListContainer }
     *     
     */
    public PlmnListContainer getPlmnList() {
        return plmnList;
    }

    /**
     * Sets the value of the plmnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnListContainer }
     *     
     */
    public void setPlmnList(PlmnListContainer value) {
        this.plmnList = value;
    }

}
