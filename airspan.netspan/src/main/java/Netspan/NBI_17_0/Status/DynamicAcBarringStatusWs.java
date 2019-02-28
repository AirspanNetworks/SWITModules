
package Netspan.NBI_17_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicAcBarringStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicAcBarringStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DynamicAcBarringCongestionIndicator" type="{http://Airspan.Netspan.WebServices}CongestionIndicator" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringCongestionLevel" type="{http://Airspan.Netspan.WebServices}CongestionLevel" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcBarringCongestionDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicAcBarringStatusWs", propOrder = {
    "cellNumber",
    "dynamicAcBarringCongestionIndicator",
    "dynamicAcBarringCongestionLevel",
    "dynamicAcBarringCongestionDuration"
})
public class DynamicAcBarringStatusWs {

    @XmlElement(name = "CellNumber")
    protected int cellNumber;
    @XmlElementRef(name = "DynamicAcBarringCongestionIndicator", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CongestionIndicator> dynamicAcBarringCongestionIndicator;
    @XmlElementRef(name = "DynamicAcBarringCongestionLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CongestionLevel> dynamicAcBarringCongestionLevel;
    @XmlElementRef(name = "DynamicAcBarringCongestionDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dynamicAcBarringCongestionDuration;

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
     * Gets the value of the dynamicAcBarringCongestionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CongestionIndicator }{@code >}
     *     
     */
    public JAXBElement<CongestionIndicator> getDynamicAcBarringCongestionIndicator() {
        return dynamicAcBarringCongestionIndicator;
    }

    /**
     * Sets the value of the dynamicAcBarringCongestionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CongestionIndicator }{@code >}
     *     
     */
    public void setDynamicAcBarringCongestionIndicator(JAXBElement<CongestionIndicator> value) {
        this.dynamicAcBarringCongestionIndicator = value;
    }

    /**
     * Gets the value of the dynamicAcBarringCongestionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CongestionLevel }{@code >}
     *     
     */
    public JAXBElement<CongestionLevel> getDynamicAcBarringCongestionLevel() {
        return dynamicAcBarringCongestionLevel;
    }

    /**
     * Sets the value of the dynamicAcBarringCongestionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CongestionLevel }{@code >}
     *     
     */
    public void setDynamicAcBarringCongestionLevel(JAXBElement<CongestionLevel> value) {
        this.dynamicAcBarringCongestionLevel = value;
    }

    /**
     * Gets the value of the dynamicAcBarringCongestionDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDynamicAcBarringCongestionDuration() {
        return dynamicAcBarringCongestionDuration;
    }

    /**
     * Sets the value of the dynamicAcBarringCongestionDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDynamicAcBarringCongestionDuration(JAXBElement<Integer> value) {
        this.dynamicAcBarringCongestionDuration = value;
    }

}
