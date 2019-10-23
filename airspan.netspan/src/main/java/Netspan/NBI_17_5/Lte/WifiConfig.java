
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WifiConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WifiConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Radio2dot4Ghz" type="{http://Airspan.Netspan.WebServices}WifiEnableDisableValues" minOccurs="0"/&gt;
 *         &lt;element name="Radio5Ghz" type="{http://Airspan.Netspan.WebServices}WifiEnableDisableValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WifiConfig", propOrder = {
    "radio2Dot4Ghz",
    "radio5Ghz"
})
public class WifiConfig {

    @XmlElementRef(name = "Radio2dot4Ghz", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<WifiEnableDisableValues> radio2Dot4Ghz;
    @XmlElementRef(name = "Radio5Ghz", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<WifiEnableDisableValues> radio5Ghz;

    /**
     * Gets the value of the radio2Dot4Ghz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WifiEnableDisableValues }{@code >}
     *     
     */
    public JAXBElement<WifiEnableDisableValues> getRadio2Dot4Ghz() {
        return radio2Dot4Ghz;
    }

    /**
     * Sets the value of the radio2Dot4Ghz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WifiEnableDisableValues }{@code >}
     *     
     */
    public void setRadio2Dot4Ghz(JAXBElement<WifiEnableDisableValues> value) {
        this.radio2Dot4Ghz = value;
    }

    /**
     * Gets the value of the radio5Ghz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WifiEnableDisableValues }{@code >}
     *     
     */
    public JAXBElement<WifiEnableDisableValues> getRadio5Ghz() {
        return radio5Ghz;
    }

    /**
     * Sets the value of the radio5Ghz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WifiEnableDisableValues }{@code >}
     *     
     */
    public void setRadio5Ghz(JAXBElement<WifiEnableDisableValues> value) {
        this.radio5Ghz = value;
    }

}
