
package Netspan.NBI_18_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteCellStatusCachedWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCellStatusCachedWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalLayerCellGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalLayerIdentity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalCellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PciStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RsiStatus" type="{http://Airspan.Netspan.WebServices}ManualAutomaticValues"/&gt;
 *         &lt;element name="CurrentRsiValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AvailableRsiRanges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfStatus" type="{http://Airspan.Netspan.WebServices}LteCachedRfStatusWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCellStatusCachedWs", propOrder = {
    "cellNumber",
    "cellId",
    "physicalLayerCellGroup",
    "physicalLayerIdentity",
    "physicalCellId",
    "pciStatus",
    "rsiStatus",
    "currentRsiValue",
    "availableRsiRanges",
    "serviceState",
    "rfStatus"
})
public class LteCellStatusCachedWs {

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
    @XmlElement(name = "RsiStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ManualAutomaticValues rsiStatus;
    @XmlElementRef(name = "CurrentRsiValue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> currentRsiValue;
    @XmlElement(name = "AvailableRsiRanges")
    protected String availableRsiRanges;
    @XmlElement(name = "ServiceState")
    protected String serviceState;
    @XmlElement(name = "RfStatus")
    protected List<LteCachedRfStatusWs> rfStatus;

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
     * Gets the value of the rsiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ManualAutomaticValues }
     *     
     */
    public ManualAutomaticValues getRsiStatus() {
        return rsiStatus;
    }

    /**
     * Sets the value of the rsiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualAutomaticValues }
     *     
     */
    public void setRsiStatus(ManualAutomaticValues value) {
        this.rsiStatus = value;
    }

    /**
     * Gets the value of the currentRsiValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCurrentRsiValue() {
        return currentRsiValue;
    }

    /**
     * Sets the value of the currentRsiValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCurrentRsiValue(JAXBElement<Integer> value) {
        this.currentRsiValue = value;
    }

    /**
     * Gets the value of the availableRsiRanges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableRsiRanges() {
        return availableRsiRanges;
    }

    /**
     * Sets the value of the availableRsiRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableRsiRanges(String value) {
        this.availableRsiRanges = value;
    }

    /**
     * Gets the value of the serviceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceState() {
        return serviceState;
    }

    /**
     * Sets the value of the serviceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceState(String value) {
        this.serviceState = value;
    }

    /**
     * Gets the value of the rfStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteCachedRfStatusWs }
     * 
     * 
     */
    public List<LteCachedRfStatusWs> getRfStatus() {
        if (rfStatus == null) {
            rfStatus = new ArrayList<LteCachedRfStatusWs>();
        }
        return this.rfStatus;
    }

}
