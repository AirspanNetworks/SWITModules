
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QosBasedHoWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QosBasedHoWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelayQualityVoltePercentageIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RelayQualityVoltePercentage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RelayQualityUserIpTypeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RelayQualityUserIpType" type="{http://Airspan.Netspan.WebServices}IPTypes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QosBasedHoWs", propOrder = {
    "relayQualityVoltePercentageIsDefault",
    "relayQualityVoltePercentage",
    "relayQualityUserIpTypeIsDefault",
    "relayQualityUserIpType"
})
public class QosBasedHoWs {

    @XmlElementRef(name = "RelayQualityVoltePercentageIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> relayQualityVoltePercentageIsDefault;
    @XmlElementRef(name = "RelayQualityVoltePercentage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> relayQualityVoltePercentage;
    @XmlElementRef(name = "RelayQualityUserIpTypeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> relayQualityUserIpTypeIsDefault;
    @XmlElementRef(name = "RelayQualityUserIpType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IPTypes> relayQualityUserIpType;

    /**
     * Gets the value of the relayQualityVoltePercentageIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRelayQualityVoltePercentageIsDefault() {
        return relayQualityVoltePercentageIsDefault;
    }

    /**
     * Sets the value of the relayQualityVoltePercentageIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRelayQualityVoltePercentageIsDefault(JAXBElement<Boolean> value) {
        this.relayQualityVoltePercentageIsDefault = value;
    }

    /**
     * Gets the value of the relayQualityVoltePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRelayQualityVoltePercentage() {
        return relayQualityVoltePercentage;
    }

    /**
     * Sets the value of the relayQualityVoltePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRelayQualityVoltePercentage(JAXBElement<Integer> value) {
        this.relayQualityVoltePercentage = value;
    }

    /**
     * Gets the value of the relayQualityUserIpTypeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRelayQualityUserIpTypeIsDefault() {
        return relayQualityUserIpTypeIsDefault;
    }

    /**
     * Sets the value of the relayQualityUserIpTypeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRelayQualityUserIpTypeIsDefault(JAXBElement<Boolean> value) {
        this.relayQualityUserIpTypeIsDefault = value;
    }

    /**
     * Gets the value of the relayQualityUserIpType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IPTypes }{@code >}
     *     
     */
    public JAXBElement<IPTypes> getRelayQualityUserIpType() {
        return relayQualityUserIpType;
    }

    /**
     * Sets the value of the relayQualityUserIpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IPTypes }{@code >}
     *     
     */
    public void setRelayQualityUserIpType(JAXBElement<IPTypes> value) {
        this.relayQualityUserIpType = value;
    }

}
