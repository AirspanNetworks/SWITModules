
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellCallTraceWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellCallTraceWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SibsGranularityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SibsGranularity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="L1MeasurementsGranularityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="L1MeasurementsGranularity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellCallTraceWs", propOrder = {
    "sibsGranularityIsDefault",
    "sibsGranularity",
    "l1MeasurementsGranularityIsDefault",
    "l1MeasurementsGranularity"
})
public class CellCallTraceWs {

    @XmlElementRef(name = "SibsGranularityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sibsGranularityIsDefault;
    @XmlElementRef(name = "SibsGranularity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sibsGranularity;
    @XmlElementRef(name = "L1MeasurementsGranularityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> l1MeasurementsGranularityIsDefault;
    @XmlElementRef(name = "L1MeasurementsGranularity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> l1MeasurementsGranularity;

    /**
     * Gets the value of the sibsGranularityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSibsGranularityIsDefault() {
        return sibsGranularityIsDefault;
    }

    /**
     * Sets the value of the sibsGranularityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSibsGranularityIsDefault(JAXBElement<Boolean> value) {
        this.sibsGranularityIsDefault = value;
    }

    /**
     * Gets the value of the sibsGranularity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSibsGranularity() {
        return sibsGranularity;
    }

    /**
     * Sets the value of the sibsGranularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSibsGranularity(JAXBElement<Integer> value) {
        this.sibsGranularity = value;
    }

    /**
     * Gets the value of the l1MeasurementsGranularityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getL1MeasurementsGranularityIsDefault() {
        return l1MeasurementsGranularityIsDefault;
    }

    /**
     * Sets the value of the l1MeasurementsGranularityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setL1MeasurementsGranularityIsDefault(JAXBElement<Boolean> value) {
        this.l1MeasurementsGranularityIsDefault = value;
    }

    /**
     * Gets the value of the l1MeasurementsGranularity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getL1MeasurementsGranularity() {
        return l1MeasurementsGranularity;
    }

    /**
     * Sets the value of the l1MeasurementsGranularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setL1MeasurementsGranularity(JAXBElement<Integer> value) {
        this.l1MeasurementsGranularity = value;
    }

}
