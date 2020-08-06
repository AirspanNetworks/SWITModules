
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UeHandlingEnbWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UeHandlingEnbWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxUeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxUe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sr80RachModeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sr80RachMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UeHandlingEnbWs", propOrder = {
    "maxUeIsDefault",
    "maxUe",
    "sr80RachModeIsDefault",
    "sr80RachMode"
})
public class UeHandlingEnbWs {

    @XmlElementRef(name = "MaxUeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxUeIsDefault;
    @XmlElementRef(name = "MaxUe", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxUe;
    @XmlElementRef(name = "Sr80RachModeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sr80RachModeIsDefault;
    @XmlElementRef(name = "Sr80RachMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> sr80RachMode;

    /**
     * Gets the value of the maxUeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxUeIsDefault() {
        return maxUeIsDefault;
    }

    /**
     * Sets the value of the maxUeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxUeIsDefault(JAXBElement<Boolean> value) {
        this.maxUeIsDefault = value;
    }

    /**
     * Gets the value of the maxUe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxUe() {
        return maxUe;
    }

    /**
     * Sets the value of the maxUe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxUe(JAXBElement<Integer> value) {
        this.maxUe = value;
    }

    /**
     * Gets the value of the sr80RachModeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSr80RachModeIsDefault() {
        return sr80RachModeIsDefault;
    }

    /**
     * Sets the value of the sr80RachModeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSr80RachModeIsDefault(JAXBElement<Boolean> value) {
        this.sr80RachModeIsDefault = value;
    }

    /**
     * Gets the value of the sr80RachMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSr80RachMode() {
        return sr80RachMode;
    }

    /**
     * Sets the value of the sr80RachMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSr80RachMode(JAXBElement<EnabledDisabledStates> value) {
        this.sr80RachMode = value;
    }

}
