
package Netspan.NBI_15_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteDicicStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteDicicStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfCellEdgeRbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RbgMapping" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfCeu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfCcu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CeuRbUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CcuRbUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinCeuThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxCeuThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EffectiveCeuThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteDicicStatusWs", propOrder = {
    "cellNumber",
    "numberOfCellEdgeRbs",
    "rbgMapping",
    "numberOfCeu",
    "numberOfCcu",
    "ceuRbUsage",
    "ccuRbUsage",
    "minCeuThreshold",
    "maxCeuThreshold",
    "effectiveCeuThreshold"
})
public class LteDicicStatusWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
    @XmlElementRef(name = "NumberOfCellEdgeRbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfCellEdgeRbs;
    @XmlElementRef(name = "RbgMapping", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rbgMapping;
    @XmlElementRef(name = "NumberOfCeu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfCeu;
    @XmlElementRef(name = "NumberOfCcu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfCcu;
    @XmlElementRef(name = "CeuRbUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ceuRbUsage;
    @XmlElementRef(name = "CcuRbUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ccuRbUsage;
    @XmlElementRef(name = "MinCeuThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minCeuThreshold;
    @XmlElementRef(name = "MaxCeuThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxCeuThreshold;
    @XmlElementRef(name = "EffectiveCeuThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> effectiveCeuThreshold;

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
     * Gets the value of the numberOfCellEdgeRbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfCellEdgeRbs() {
        return numberOfCellEdgeRbs;
    }

    /**
     * Sets the value of the numberOfCellEdgeRbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfCellEdgeRbs(JAXBElement<Integer> value) {
        this.numberOfCellEdgeRbs = value;
    }

    /**
     * Gets the value of the rbgMapping property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRbgMapping() {
        return rbgMapping;
    }

    /**
     * Sets the value of the rbgMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRbgMapping(JAXBElement<Integer> value) {
        this.rbgMapping = value;
    }

    /**
     * Gets the value of the numberOfCeu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfCeu() {
        return numberOfCeu;
    }

    /**
     * Sets the value of the numberOfCeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfCeu(JAXBElement<Integer> value) {
        this.numberOfCeu = value;
    }

    /**
     * Gets the value of the numberOfCcu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfCcu() {
        return numberOfCcu;
    }

    /**
     * Sets the value of the numberOfCcu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfCcu(JAXBElement<Integer> value) {
        this.numberOfCcu = value;
    }

    /**
     * Gets the value of the ceuRbUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCeuRbUsage() {
        return ceuRbUsage;
    }

    /**
     * Sets the value of the ceuRbUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCeuRbUsage(JAXBElement<Integer> value) {
        this.ceuRbUsage = value;
    }

    /**
     * Gets the value of the ccuRbUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCcuRbUsage() {
        return ccuRbUsage;
    }

    /**
     * Sets the value of the ccuRbUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCcuRbUsage(JAXBElement<Integer> value) {
        this.ccuRbUsage = value;
    }

    /**
     * Gets the value of the minCeuThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinCeuThreshold() {
        return minCeuThreshold;
    }

    /**
     * Sets the value of the minCeuThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinCeuThreshold(JAXBElement<Integer> value) {
        this.minCeuThreshold = value;
    }

    /**
     * Gets the value of the maxCeuThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxCeuThreshold() {
        return maxCeuThreshold;
    }

    /**
     * Sets the value of the maxCeuThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxCeuThreshold(JAXBElement<Integer> value) {
        this.maxCeuThreshold = value;
    }

    /**
     * Gets the value of the effectiveCeuThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEffectiveCeuThreshold() {
        return effectiveCeuThreshold;
    }

    /**
     * Sets the value of the effectiveCeuThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEffectiveCeuThreshold(JAXBElement<Integer> value) {
        this.effectiveCeuThreshold = value;
    }

}
