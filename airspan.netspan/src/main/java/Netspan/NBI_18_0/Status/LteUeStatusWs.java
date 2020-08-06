
package Netspan.NBI_18_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteUeStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteUeStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualMaxUeSupported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CaPCellMacDataVolumeMbpsDl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPCellMacDataVolumeMbpsUl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaSCellMacDataVolumeMbpsDl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaSCellMacDataVolumeMbpsUl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CategoryData" type="{http://Airspan.Netspan.WebServices}LteUeCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RttsUeNumInService" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RttsUeNumConfigured" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteUeStatusWs", propOrder = {
    "cellNumber",
    "cellId",
    "actualMaxUeSupported",
    "connectedUesTotal",
    "caPCellMacDataVolumeMbpsDl",
    "caPCellMacDataVolumeMbpsUl",
    "caSCellMacDataVolumeMbpsDl",
    "caSCellMacDataVolumeMbpsUl",
    "categoryData",
    "rttsUeNumInService",
    "rttsUeNumConfigured"
})
public class LteUeStatusWs {

    @XmlElement(name = "CellNumber")
    protected int cellNumber;
    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElementRef(name = "ActualMaxUeSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> actualMaxUeSupported;
    @XmlElementRef(name = "ConnectedUesTotal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesTotal;
    @XmlElementRef(name = "CaPCellMacDataVolumeMbpsDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPCellMacDataVolumeMbpsDl;
    @XmlElementRef(name = "CaPCellMacDataVolumeMbpsUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPCellMacDataVolumeMbpsUl;
    @XmlElementRef(name = "CaSCellMacDataVolumeMbpsDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caSCellMacDataVolumeMbpsDl;
    @XmlElementRef(name = "CaSCellMacDataVolumeMbpsUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caSCellMacDataVolumeMbpsUl;
    @XmlElement(name = "CategoryData")
    protected List<LteUeCategory> categoryData;
    @XmlElementRef(name = "RttsUeNumInService", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rttsUeNumInService;
    @XmlElementRef(name = "RttsUeNumConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rttsUeNumConfigured;

    /**
     * Gets the value of the cellNumber property.
     * 
     */
    public int getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     */
    public void setCellNumber(int value) {
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
     * Gets the value of the actualMaxUeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActualMaxUeSupported() {
        return actualMaxUeSupported;
    }

    /**
     * Sets the value of the actualMaxUeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActualMaxUeSupported(JAXBElement<Integer> value) {
        this.actualMaxUeSupported = value;
    }

    /**
     * Gets the value of the connectedUesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesTotal() {
        return connectedUesTotal;
    }

    /**
     * Sets the value of the connectedUesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesTotal(JAXBElement<Integer> value) {
        this.connectedUesTotal = value;
    }

    /**
     * Gets the value of the caPCellMacDataVolumeMbpsDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPCellMacDataVolumeMbpsDl() {
        return caPCellMacDataVolumeMbpsDl;
    }

    /**
     * Sets the value of the caPCellMacDataVolumeMbpsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPCellMacDataVolumeMbpsDl(JAXBElement<Long> value) {
        this.caPCellMacDataVolumeMbpsDl = value;
    }

    /**
     * Gets the value of the caPCellMacDataVolumeMbpsUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPCellMacDataVolumeMbpsUl() {
        return caPCellMacDataVolumeMbpsUl;
    }

    /**
     * Sets the value of the caPCellMacDataVolumeMbpsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPCellMacDataVolumeMbpsUl(JAXBElement<Long> value) {
        this.caPCellMacDataVolumeMbpsUl = value;
    }

    /**
     * Gets the value of the caSCellMacDataVolumeMbpsDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaSCellMacDataVolumeMbpsDl() {
        return caSCellMacDataVolumeMbpsDl;
    }

    /**
     * Sets the value of the caSCellMacDataVolumeMbpsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaSCellMacDataVolumeMbpsDl(JAXBElement<Long> value) {
        this.caSCellMacDataVolumeMbpsDl = value;
    }

    /**
     * Gets the value of the caSCellMacDataVolumeMbpsUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaSCellMacDataVolumeMbpsUl() {
        return caSCellMacDataVolumeMbpsUl;
    }

    /**
     * Sets the value of the caSCellMacDataVolumeMbpsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaSCellMacDataVolumeMbpsUl(JAXBElement<Long> value) {
        this.caSCellMacDataVolumeMbpsUl = value;
    }

    /**
     * Gets the value of the categoryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteUeCategory }
     * 
     * 
     */
    public List<LteUeCategory> getCategoryData() {
        if (categoryData == null) {
            categoryData = new ArrayList<LteUeCategory>();
        }
        return this.categoryData;
    }

    /**
     * Gets the value of the rttsUeNumInService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRttsUeNumInService() {
        return rttsUeNumInService;
    }

    /**
     * Sets the value of the rttsUeNumInService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRttsUeNumInService(JAXBElement<Integer> value) {
        this.rttsUeNumInService = value;
    }

    /**
     * Gets the value of the rttsUeNumConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRttsUeNumConfigured() {
        return rttsUeNumConfigured;
    }

    /**
     * Sets the value of the rttsUeNumConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRttsUeNumConfigured(JAXBElement<Integer> value) {
        this.rttsUeNumConfigured = value;
    }

}
