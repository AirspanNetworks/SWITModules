
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayGlobalConfigDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayGlobalConfigDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubBandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Band" type="{http://Airspan.Netspan.WebServices}BandValuesWs" minOccurs="0"/&gt;
 *         &lt;element name="EarfcnHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EarfcnLow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsVoLteEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsBandEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayGlobalConfigDetail", propOrder = {
    "subBandId",
    "band",
    "earfcnHigh",
    "earfcnLow",
    "isVoLteEnabled",
    "isBandEnabled"
})
public class RelayGlobalConfigDetail {

    @XmlElement(name = "SubBandId")
    protected String subBandId;
    @XmlElementRef(name = "Band", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BandValuesWs> band;
    @XmlElementRef(name = "EarfcnHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> earfcnHigh;
    @XmlElementRef(name = "EarfcnLow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> earfcnLow;
    @XmlElementRef(name = "IsVoLteEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoLteEnabled;
    @XmlElementRef(name = "IsBandEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isBandEnabled;

    /**
     * Gets the value of the subBandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBandId() {
        return subBandId;
    }

    /**
     * Sets the value of the subBandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBandId(String value) {
        this.subBandId = value;
    }

    /**
     * Gets the value of the band property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BandValuesWs }{@code >}
     *     
     */
    public JAXBElement<BandValuesWs> getBand() {
        return band;
    }

    /**
     * Sets the value of the band property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BandValuesWs }{@code >}
     *     
     */
    public void setBand(JAXBElement<BandValuesWs> value) {
        this.band = value;
    }

    /**
     * Gets the value of the earfcnHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEarfcnHigh() {
        return earfcnHigh;
    }

    /**
     * Sets the value of the earfcnHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEarfcnHigh(JAXBElement<Integer> value) {
        this.earfcnHigh = value;
    }

    /**
     * Gets the value of the earfcnLow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEarfcnLow() {
        return earfcnLow;
    }

    /**
     * Sets the value of the earfcnLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEarfcnLow(JAXBElement<Integer> value) {
        this.earfcnLow = value;
    }

    /**
     * Gets the value of the isVoLteEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoLteEnabled() {
        return isVoLteEnabled;
    }

    /**
     * Sets the value of the isVoLteEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoLteEnabled(JAXBElement<Boolean> value) {
        this.isVoLteEnabled = value;
    }

    /**
     * Gets the value of the isBandEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsBandEnabled() {
        return isBandEnabled;
    }

    /**
     * Sets the value of the isBandEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsBandEnabled(JAXBElement<Boolean> value) {
        this.isBandEnabled = value;
    }

}
