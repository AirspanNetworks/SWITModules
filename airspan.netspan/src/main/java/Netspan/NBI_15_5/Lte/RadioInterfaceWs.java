
package Netspan.NBI_15_5.Lte;

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
 * &lt;complexType name="RadioInterfaceWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultPagingCycleIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DefaultPagingCycle" type="{http://Airspan.Netspan.WebServices}RrcPagingCycle" minOccurs="0"/>
 *         &lt;element name="CfiIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Cfi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioInterfaceWs", propOrder = {
    "defaultPagingCycleIsDefault",
    "defaultPagingCycle",
    "cfiIsDefault",
    "cfi"
})
public class RadioInterfaceWs {

    @XmlElementRef(name = "DefaultPagingCycleIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> defaultPagingCycleIsDefault;
    @XmlElementRef(name = "DefaultPagingCycle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultPagingCycle;
    @XmlElementRef(name = "CfiIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cfiIsDefault;
    @XmlElementRef(name = "Cfi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cfi;

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

    /**
     * Gets the value of the cfiIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCfiIsDefault() {
        return cfiIsDefault;
    }

    /**
     * Sets the value of the cfiIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCfiIsDefault(JAXBElement<Boolean> value) {
        this.cfiIsDefault = value;
    }

    /**
     * Gets the value of the cfi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCfi() {
        return cfi;
    }

    /**
     * Sets the value of the cfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCfi(JAXBElement<Integer> value) {
        this.cfi = value;
    }

}
