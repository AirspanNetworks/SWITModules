
package Netspan.NBI_15_1.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayChannelQualityEnbWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayChannelQualityEnbWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutdoorTxOffIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OutdoorTxOff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SinrThreshIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SinrThresh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SptEffThreshIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SptEffThresh" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AlphaIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Alpha" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    @XmlElement(name = "OutdoorTxOffIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean outdoorTxOffIsDefault;
    @XmlElementRef(name = "OutdoorTxOff", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outdoorTxOff;
    @XmlElement(name = "SinrThreshIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean sinrThreshIsDefault;
    @XmlElementRef(name = "SinrThresh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sinrThresh;
    @XmlElement(name = "SptEffThreshIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean sptEffThreshIsDefault;
    @XmlElementRef(name = "SptEffThresh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sptEffThresh;
    @XmlElement(name = "AlphaIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean alphaIsDefault;
    @XmlElementRef(name = "Alpha", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> alpha;

    /**
     * Gets the value of the outdoorTxOffIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutdoorTxOffIsDefault() {
        return outdoorTxOffIsDefault;
    }

    /**
     * Sets the value of the outdoorTxOffIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutdoorTxOffIsDefault(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isSinrThreshIsDefault() {
        return sinrThreshIsDefault;
    }

    /**
     * Sets the value of the sinrThreshIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSinrThreshIsDefault(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isSptEffThreshIsDefault() {
        return sptEffThreshIsDefault;
    }

    /**
     * Sets the value of the sptEffThreshIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSptEffThreshIsDefault(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isAlphaIsDefault() {
        return alphaIsDefault;
    }

    /**
     * Sets the value of the alphaIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlphaIsDefault(Boolean value) {
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
