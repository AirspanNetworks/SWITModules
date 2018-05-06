
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiAccessPointWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiAccessPointWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxWiFiInactivityPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxWiFiInactivityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiAccessPointWs", propOrder = {
    "maxWiFiInactivityPeriodIsDefault",
    "maxWiFiInactivityPeriod"
})
public class WiFiAccessPointWs {

    @XmlElementRef(name = "MaxWiFiInactivityPeriodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxWiFiInactivityPeriodIsDefault;
    @XmlElementRef(name = "MaxWiFiInactivityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxWiFiInactivityPeriod;

    /**
     * Gets the value of the maxWiFiInactivityPeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxWiFiInactivityPeriodIsDefault() {
        return maxWiFiInactivityPeriodIsDefault;
    }

    /**
     * Sets the value of the maxWiFiInactivityPeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxWiFiInactivityPeriodIsDefault(JAXBElement<Boolean> value) {
        this.maxWiFiInactivityPeriodIsDefault = value;
    }

    /**
     * Gets the value of the maxWiFiInactivityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxWiFiInactivityPeriod() {
        return maxWiFiInactivityPeriod;
    }

    /**
     * Sets the value of the maxWiFiInactivityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxWiFiInactivityPeriod(JAXBElement<Integer> value) {
        this.maxWiFiInactivityPeriod = value;
    }

}
