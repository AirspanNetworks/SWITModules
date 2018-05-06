
package Netspan.NBI_15_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeTermRxNullingStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeTermRxNullingStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RankingIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="PatternIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NullingQi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumFrames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumMeasurements" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeTermRxNullingStatus", propOrder = {
    "rankingIndex",
    "patternIndex",
    "nullingQi",
    "numFrames",
    "numMeasurements"
})
public class IBridgeTermRxNullingStatus {

    @XmlElementRef(name = "RankingIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> rankingIndex;
    @XmlElementRef(name = "PatternIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> patternIndex;
    @XmlElementRef(name = "NullingQi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nullingQi;
    @XmlElementRef(name = "NumFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numFrames;
    @XmlElementRef(name = "NumMeasurements", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numMeasurements;

    /**
     * Gets the value of the rankingIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRankingIndex() {
        return rankingIndex;
    }

    /**
     * Sets the value of the rankingIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRankingIndex(JAXBElement<Long> value) {
        this.rankingIndex = value;
    }

    /**
     * Gets the value of the patternIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPatternIndex() {
        return patternIndex;
    }

    /**
     * Sets the value of the patternIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPatternIndex(JAXBElement<Integer> value) {
        this.patternIndex = value;
    }

    /**
     * Gets the value of the nullingQi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNullingQi() {
        return nullingQi;
    }

    /**
     * Sets the value of the nullingQi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNullingQi(JAXBElement<Integer> value) {
        this.nullingQi = value;
    }

    /**
     * Gets the value of the numFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumFrames() {
        return numFrames;
    }

    /**
     * Sets the value of the numFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumFrames(JAXBElement<Integer> value) {
        this.numFrames = value;
    }

    /**
     * Gets the value of the numMeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumMeasurements() {
        return numMeasurements;
    }

    /**
     * Sets the value of the numMeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumMeasurements(JAXBElement<Integer> value) {
        this.numMeasurements = value;
    }

}
