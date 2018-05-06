
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronizationWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchronizationWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastUlSymSuppressEnabledIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUlSymSuppressEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizationWs", propOrder = {
    "lastUlSymSuppressEnabledIsDefault",
    "lastUlSymSuppressEnabled"
})
public class SynchronizationWs {

    @XmlElementRef(name = "LastUlSymSuppressEnabledIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> lastUlSymSuppressEnabledIsDefault;
    @XmlElementRef(name = "LastUlSymSuppressEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> lastUlSymSuppressEnabled;

    /**
     * Gets the value of the lastUlSymSuppressEnabledIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLastUlSymSuppressEnabledIsDefault() {
        return lastUlSymSuppressEnabledIsDefault;
    }

    /**
     * Sets the value of the lastUlSymSuppressEnabledIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLastUlSymSuppressEnabledIsDefault(JAXBElement<Boolean> value) {
        this.lastUlSymSuppressEnabledIsDefault = value;
    }

    /**
     * Gets the value of the lastUlSymSuppressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getLastUlSymSuppressEnabled() {
        return lastUlSymSuppressEnabled;
    }

    /**
     * Sets the value of the lastUlSymSuppressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setLastUlSymSuppressEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.lastUlSymSuppressEnabled = value;
    }

}
