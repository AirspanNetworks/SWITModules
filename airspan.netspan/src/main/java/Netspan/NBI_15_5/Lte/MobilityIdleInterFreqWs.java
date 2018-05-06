
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityIdleInterFreqWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityIdleInterFreqWs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}MobilityIdleFreqWs">
 *       &lt;sequence>
 *         &lt;element name="AllowedMeasurementBandwidthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowedMeasurementBandwidth" type="{http://Airspan.Netspan.WebServices}AllowMeasBandwidth" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityIdleInterFreqWs", propOrder = {
    "allowedMeasurementBandwidthIsDefault",
    "allowedMeasurementBandwidth"
})
public class MobilityIdleInterFreqWs
    extends MobilityIdleFreqWs
{

    @XmlElementRef(name = "AllowedMeasurementBandwidthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowedMeasurementBandwidthIsDefault;
    @XmlElementRef(name = "AllowedMeasurementBandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> allowedMeasurementBandwidth;

    /**
     * Gets the value of the allowedMeasurementBandwidthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowedMeasurementBandwidthIsDefault() {
        return allowedMeasurementBandwidthIsDefault;
    }

    /**
     * Sets the value of the allowedMeasurementBandwidthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowedMeasurementBandwidthIsDefault(JAXBElement<Boolean> value) {
        this.allowedMeasurementBandwidthIsDefault = value;
    }

    /**
     * Gets the value of the allowedMeasurementBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAllowedMeasurementBandwidth() {
        return allowedMeasurementBandwidth;
    }

    /**
     * Sets the value of the allowedMeasurementBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAllowedMeasurementBandwidth(JAXBElement<String> value) {
        this.allowedMeasurementBandwidth = value;
    }

}
