
package Netspan.NBI_17_5.Status;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDetailsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationDetailsWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EstimatedLatitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedLongitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedLocationAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAltitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://Airspan.Netspan.WebServices}SourceTypeWs" minOccurs="0"/&gt;
 *         &lt;element name="PnpReferenceLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PnpReferenceLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PnpReferenceAccuracy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PnpReferenceSource" type="{http://Airspan.Netspan.WebServices}SourceTypeWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDetailsWs", propOrder = {
    "estimatedLatitude",
    "estimatedLongitude",
    "estimatedLocationAccuracy",
    "estimatedAltitude",
    "source",
    "pnpReferenceLatitude",
    "pnpReferenceLongitude",
    "pnpReferenceAccuracy",
    "pnpReferenceSource"
})
public class LocationDetailsWs {

    @XmlElement(name = "EstimatedLatitude")
    protected String estimatedLatitude;
    @XmlElement(name = "EstimatedLongitude")
    protected String estimatedLongitude;
    @XmlElement(name = "EstimatedLocationAccuracy")
    protected String estimatedLocationAccuracy;
    @XmlElement(name = "EstimatedAltitude")
    protected String estimatedAltitude;
    @XmlElementRef(name = "Source", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SourceTypeWs> source;
    @XmlElementRef(name = "PnpReferenceLatitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnpReferenceLatitude;
    @XmlElementRef(name = "PnpReferenceLongitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnpReferenceLongitude;
    @XmlElementRef(name = "PnpReferenceAccuracy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pnpReferenceAccuracy;
    @XmlElementRef(name = "PnpReferenceSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SourceTypeWs> pnpReferenceSource;

    /**
     * Gets the value of the estimatedLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedLatitude() {
        return estimatedLatitude;
    }

    /**
     * Sets the value of the estimatedLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedLatitude(String value) {
        this.estimatedLatitude = value;
    }

    /**
     * Gets the value of the estimatedLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedLongitude() {
        return estimatedLongitude;
    }

    /**
     * Sets the value of the estimatedLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedLongitude(String value) {
        this.estimatedLongitude = value;
    }

    /**
     * Gets the value of the estimatedLocationAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedLocationAccuracy() {
        return estimatedLocationAccuracy;
    }

    /**
     * Sets the value of the estimatedLocationAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedLocationAccuracy(String value) {
        this.estimatedLocationAccuracy = value;
    }

    /**
     * Gets the value of the estimatedAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedAltitude() {
        return estimatedAltitude;
    }

    /**
     * Sets the value of the estimatedAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedAltitude(String value) {
        this.estimatedAltitude = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SourceTypeWs }{@code >}
     *     
     */
    public JAXBElement<SourceTypeWs> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SourceTypeWs }{@code >}
     *     
     */
    public void setSource(JAXBElement<SourceTypeWs> value) {
        this.source = value;
    }

    /**
     * Gets the value of the pnpReferenceLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPnpReferenceLatitude() {
        return pnpReferenceLatitude;
    }

    /**
     * Sets the value of the pnpReferenceLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPnpReferenceLatitude(JAXBElement<BigDecimal> value) {
        this.pnpReferenceLatitude = value;
    }

    /**
     * Gets the value of the pnpReferenceLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPnpReferenceLongitude() {
        return pnpReferenceLongitude;
    }

    /**
     * Sets the value of the pnpReferenceLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPnpReferenceLongitude(JAXBElement<BigDecimal> value) {
        this.pnpReferenceLongitude = value;
    }

    /**
     * Gets the value of the pnpReferenceAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPnpReferenceAccuracy() {
        return pnpReferenceAccuracy;
    }

    /**
     * Sets the value of the pnpReferenceAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPnpReferenceAccuracy(JAXBElement<Integer> value) {
        this.pnpReferenceAccuracy = value;
    }

    /**
     * Gets the value of the pnpReferenceSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SourceTypeWs }{@code >}
     *     
     */
    public JAXBElement<SourceTypeWs> getPnpReferenceSource() {
        return pnpReferenceSource;
    }

    /**
     * Sets the value of the pnpReferenceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SourceTypeWs }{@code >}
     *     
     */
    public void setPnpReferenceSource(JAXBElement<SourceTypeWs> value) {
        this.pnpReferenceSource = value;
    }

}
