
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnrWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnrWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NrtSteadyThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NrtSteadyThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnrWs", propOrder = {
    "nrtSteadyThresholdIsDefault",
    "nrtSteadyThreshold"
})
public class AnrWs {

    @XmlElementRef(name = "NrtSteadyThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nrtSteadyThresholdIsDefault;
    @XmlElementRef(name = "NrtSteadyThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nrtSteadyThreshold;

    /**
     * Gets the value of the nrtSteadyThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNrtSteadyThresholdIsDefault() {
        return nrtSteadyThresholdIsDefault;
    }

    /**
     * Sets the value of the nrtSteadyThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNrtSteadyThresholdIsDefault(JAXBElement<Boolean> value) {
        this.nrtSteadyThresholdIsDefault = value;
    }

    /**
     * Gets the value of the nrtSteadyThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNrtSteadyThreshold() {
        return nrtSteadyThreshold;
    }

    /**
     * Sets the value of the nrtSteadyThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNrtSteadyThreshold(JAXBElement<Integer> value) {
        this.nrtSteadyThreshold = value;
    }

}
