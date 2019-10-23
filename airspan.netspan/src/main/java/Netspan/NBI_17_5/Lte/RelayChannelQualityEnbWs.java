
package Netspan.NBI_17_5.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayChannelQualityEnbWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayChannelQualityEnbWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutdoorTxOffIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OutdoorTxOff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SinrThreshIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SinrThresh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SptEffThreshIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SptEffThresh" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AlphaIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Alpha" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayChannelQualityEnbWs", propOrder = {
    "outdoorTxOffIsDefault",
    "outdoorTxOff",
    "sinrThreshIsDefault",
    "sinrThresh",
    "sptEffThreshIsDefault",
    "sptEffThresh",
    "alphaIsDefault",
    "alpha"
})
public class RelayChannelQualityEnbWs {

    @XmlElementRef(name = "OutdoorTxOffIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> outdoorTxOffIsDefault;
    @XmlElementRef(name = "OutdoorTxOff", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outdoorTxOff;
    @XmlElementRef(name = "SinrThreshIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sinrThreshIsDefault;
    @XmlElementRef(name = "SinrThresh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sinrThresh;
    @XmlElementRef(name = "SptEffThreshIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sptEffThreshIsDefault;
    @XmlElementRef(name = "SptEffThresh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sptEffThresh;
    @XmlElementRef(name = "AlphaIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> alphaIsDefault;
    @XmlElementRef(name = "Alpha", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> alpha;

    /**
     * Gets the value of the outdoorTxOffIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOutdoorTxOffIsDefault() {
        return outdoorTxOffIsDefault;
    }

    /**
     * Sets the value of the outdoorTxOffIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOutdoorTxOffIsDefault(JAXBElement<Boolean> value) {
        this.outdoorTxOffIsDefault = value;
    }

    /**
     * Gets the value of the outdoorTxOff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutdoorTxOff() {
        return outdoorTxOff;
    }

    /**
     * Sets the value of the outdoorTxOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutdoorTxOff(JAXBElement<Integer> value) {
        this.outdoorTxOff = value;
    }

    /**
     * Gets the value of the sinrThreshIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSinrThreshIsDefault() {
        return sinrThreshIsDefault;
    }

    /**
     * Sets the value of the sinrThreshIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSinrThreshIsDefault(JAXBElement<Boolean> value) {
        this.sinrThreshIsDefault = value;
    }

    /**
     * Gets the value of the sinrThresh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSinrThresh() {
        return sinrThresh;
    }

    /**
     * Sets the value of the sinrThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSinrThresh(JAXBElement<Integer> value) {
        this.sinrThresh = value;
    }

    /**
     * Gets the value of the sptEffThreshIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSptEffThreshIsDefault() {
        return sptEffThreshIsDefault;
    }

    /**
     * Sets the value of the sptEffThreshIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSptEffThreshIsDefault(JAXBElement<Boolean> value) {
        this.sptEffThreshIsDefault = value;
    }

    /**
     * Gets the value of the sptEffThresh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSptEffThresh() {
        return sptEffThresh;
    }

    /**
     * Sets the value of the sptEffThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSptEffThresh(JAXBElement<BigDecimal> value) {
        this.sptEffThresh = value;
    }

    /**
     * Gets the value of the alphaIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAlphaIsDefault() {
        return alphaIsDefault;
    }

    /**
     * Sets the value of the alphaIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAlphaIsDefault(JAXBElement<Boolean> value) {
        this.alphaIsDefault = value;
    }

    /**
     * Gets the value of the alpha property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAlpha() {
        return alpha;
    }

    /**
     * Sets the value of the alpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAlpha(JAXBElement<Integer> value) {
        this.alpha = value;
    }

}
