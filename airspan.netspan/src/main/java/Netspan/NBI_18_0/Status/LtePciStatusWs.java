
package Netspan.NBI_18_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtePciStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtePciStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalLayerCellGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalLayerIdentity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalCellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PciStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TacSource" type="{http://Airspan.Netspan.WebServices}TacSourceTypesWs" minOccurs="0"/&gt;
 *         &lt;element name="Tac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtePciStatusWs", propOrder = {
    "cellNumber",
    "cellId",
    "physicalLayerCellGroup",
    "physicalLayerIdentity",
    "physicalCellId",
    "pciStatus",
    "tacSource",
    "tac"
})
public class LtePciStatusWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElementRef(name = "PhysicalLayerCellGroup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalLayerCellGroup;
    @XmlElementRef(name = "PhysicalLayerIdentity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalLayerIdentity;
    @XmlElementRef(name = "PhysicalCellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalCellId;
    @XmlElement(name = "PciStatus")
    protected String pciStatus;
    @XmlElementRef(name = "TacSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TacSourceTypesWs> tacSource;
    @XmlElementRef(name = "Tac", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tac;

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellNumber(JAXBElement<Integer> value) {
        this.cellNumber = value;
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
     * Gets the value of the physicalCellId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhysicalCellId() {
        return physicalCellId;
    }

    /**
     * Sets the value of the physicalCellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhysicalCellId(JAXBElement<Integer> value) {
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

    /**
     * Gets the value of the tacSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TacSourceTypesWs }{@code >}
     *     
     */
    public JAXBElement<TacSourceTypesWs> getTacSource() {
        return tacSource;
    }

    /**
     * Sets the value of the tacSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TacSourceTypesWs }{@code >}
     *     
     */
    public void setTacSource(JAXBElement<TacSourceTypesWs> value) {
        this.tacSource = value;
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

}
