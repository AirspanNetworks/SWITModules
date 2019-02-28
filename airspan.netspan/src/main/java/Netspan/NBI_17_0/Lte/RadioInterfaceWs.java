
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadioInterfaceWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioInterfaceWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultPagingCycleIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultPagingCycle" type="{http://Airspan.Netspan.WebServices}RrcPagingCycle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioInterfaceWs", propOrder = {
    "defaultPagingCycleIsDefault",
    "defaultPagingCycle"
})
public class RadioInterfaceWs {

    @XmlElementRef(name = "DefaultPagingCycleIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> defaultPagingCycleIsDefault;
    @XmlElementRef(name = "DefaultPagingCycle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultPagingCycle;

    /**
     * Gets the value of the defaultPagingCycleIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDefaultPagingCycleIsDefault() {
        return defaultPagingCycleIsDefault;
    }

    /**
     * Sets the value of the defaultPagingCycleIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDefaultPagingCycleIsDefault(JAXBElement<Boolean> value) {
        this.defaultPagingCycleIsDefault = value;
    }

    /**
     * Gets the value of the defaultPagingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultPagingCycle() {
        return defaultPagingCycle;
    }

    /**
     * Sets the value of the defaultPagingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultPagingCycle(JAXBElement<String> value) {
        this.defaultPagingCycle = value;
    }

}
