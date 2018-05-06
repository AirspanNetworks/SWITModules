
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbDynamicIcicWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbDynamicIcicWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNTPPeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RNTPPeriodicity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbDynamicIcicWs", propOrder = {
    "rntpPeriodicityIsDefault",
    "rntpPeriodicity"
})
public class EnbDynamicIcicWs {

    @XmlElementRef(name = "RNTPPeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rntpPeriodicityIsDefault;
    @XmlElementRef(name = "RNTPPeriodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rntpPeriodicity;

    /**
     * Gets the value of the rntpPeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRNTPPeriodicityIsDefault() {
        return rntpPeriodicityIsDefault;
    }

    /**
     * Sets the value of the rntpPeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRNTPPeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.rntpPeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the rntpPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRNTPPeriodicity() {
        return rntpPeriodicity;
    }

    /**
     * Sets the value of the rntpPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRNTPPeriodicity(JAXBElement<Integer> value) {
        this.rntpPeriodicity = value;
    }

}
