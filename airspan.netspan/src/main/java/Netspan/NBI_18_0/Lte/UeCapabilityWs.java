
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UeCapabilityWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UeCapabilityWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReduceUeCapabilitySignallingFormatIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReduceUeCapabilitySignallingFormat" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SkipFallbackCaBandCombinationsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SkipFallbackCaBandCombinations" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="RequestedMaximumCcsDlIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequestedMaximumCcsDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequestedMaximumCcsUlIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RequestedMaximumCcsUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReduceIntraNonContiguousCaBandCombinationsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReduceIntraNonContiguousCaBandCombinations" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UeCapabilityWs", propOrder = {
    "reduceUeCapabilitySignallingFormatIsDefault",
    "reduceUeCapabilitySignallingFormat",
    "skipFallbackCaBandCombinationsIsDefault",
    "skipFallbackCaBandCombinations",
    "requestedMaximumCcsDlIsDefault",
    "requestedMaximumCcsDl",
    "requestedMaximumCcsUlIsDefault",
    "requestedMaximumCcsUl",
    "reduceIntraNonContiguousCaBandCombinationsIsDefault",
    "reduceIntraNonContiguousCaBandCombinations"
})
public class UeCapabilityWs {

    @XmlElementRef(name = "ReduceUeCapabilitySignallingFormatIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reduceUeCapabilitySignallingFormatIsDefault;
    @XmlElementRef(name = "ReduceUeCapabilitySignallingFormat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> reduceUeCapabilitySignallingFormat;
    @XmlElementRef(name = "SkipFallbackCaBandCombinationsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> skipFallbackCaBandCombinationsIsDefault;
    @XmlElementRef(name = "SkipFallbackCaBandCombinations", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> skipFallbackCaBandCombinations;
    @XmlElementRef(name = "RequestedMaximumCcsDlIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> requestedMaximumCcsDlIsDefault;
    @XmlElementRef(name = "RequestedMaximumCcsDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> requestedMaximumCcsDl;
    @XmlElementRef(name = "RequestedMaximumCcsUlIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> requestedMaximumCcsUlIsDefault;
    @XmlElementRef(name = "RequestedMaximumCcsUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> requestedMaximumCcsUl;
    @XmlElementRef(name = "ReduceIntraNonContiguousCaBandCombinationsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reduceIntraNonContiguousCaBandCombinationsIsDefault;
    @XmlElementRef(name = "ReduceIntraNonContiguousCaBandCombinations", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> reduceIntraNonContiguousCaBandCombinations;

    /**
     * Gets the value of the reduceUeCapabilitySignallingFormatIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReduceUeCapabilitySignallingFormatIsDefault() {
        return reduceUeCapabilitySignallingFormatIsDefault;
    }

    /**
     * Sets the value of the reduceUeCapabilitySignallingFormatIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReduceUeCapabilitySignallingFormatIsDefault(JAXBElement<Boolean> value) {
        this.reduceUeCapabilitySignallingFormatIsDefault = value;
    }

    /**
     * Gets the value of the reduceUeCapabilitySignallingFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getReduceUeCapabilitySignallingFormat() {
        return reduceUeCapabilitySignallingFormat;
    }

    /**
     * Sets the value of the reduceUeCapabilitySignallingFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setReduceUeCapabilitySignallingFormat(JAXBElement<EnabledDisabledStates> value) {
        this.reduceUeCapabilitySignallingFormat = value;
    }

    /**
     * Gets the value of the skipFallbackCaBandCombinationsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSkipFallbackCaBandCombinationsIsDefault() {
        return skipFallbackCaBandCombinationsIsDefault;
    }

    /**
     * Sets the value of the skipFallbackCaBandCombinationsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSkipFallbackCaBandCombinationsIsDefault(JAXBElement<Boolean> value) {
        this.skipFallbackCaBandCombinationsIsDefault = value;
    }

    /**
     * Gets the value of the skipFallbackCaBandCombinations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSkipFallbackCaBandCombinations() {
        return skipFallbackCaBandCombinations;
    }

    /**
     * Sets the value of the skipFallbackCaBandCombinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSkipFallbackCaBandCombinations(JAXBElement<EnabledDisabledStates> value) {
        this.skipFallbackCaBandCombinations = value;
    }

    /**
     * Gets the value of the requestedMaximumCcsDlIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRequestedMaximumCcsDlIsDefault() {
        return requestedMaximumCcsDlIsDefault;
    }

    /**
     * Sets the value of the requestedMaximumCcsDlIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRequestedMaximumCcsDlIsDefault(JAXBElement<Boolean> value) {
        this.requestedMaximumCcsDlIsDefault = value;
    }

    /**
     * Gets the value of the requestedMaximumCcsDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRequestedMaximumCcsDl() {
        return requestedMaximumCcsDl;
    }

    /**
     * Sets the value of the requestedMaximumCcsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRequestedMaximumCcsDl(JAXBElement<Integer> value) {
        this.requestedMaximumCcsDl = value;
    }

    /**
     * Gets the value of the requestedMaximumCcsUlIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRequestedMaximumCcsUlIsDefault() {
        return requestedMaximumCcsUlIsDefault;
    }

    /**
     * Sets the value of the requestedMaximumCcsUlIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRequestedMaximumCcsUlIsDefault(JAXBElement<Boolean> value) {
        this.requestedMaximumCcsUlIsDefault = value;
    }

    /**
     * Gets the value of the requestedMaximumCcsUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRequestedMaximumCcsUl() {
        return requestedMaximumCcsUl;
    }

    /**
     * Sets the value of the requestedMaximumCcsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRequestedMaximumCcsUl(JAXBElement<Integer> value) {
        this.requestedMaximumCcsUl = value;
    }

    /**
     * Gets the value of the reduceIntraNonContiguousCaBandCombinationsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReduceIntraNonContiguousCaBandCombinationsIsDefault() {
        return reduceIntraNonContiguousCaBandCombinationsIsDefault;
    }

    /**
     * Sets the value of the reduceIntraNonContiguousCaBandCombinationsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReduceIntraNonContiguousCaBandCombinationsIsDefault(JAXBElement<Boolean> value) {
        this.reduceIntraNonContiguousCaBandCombinationsIsDefault = value;
    }

    /**
     * Gets the value of the reduceIntraNonContiguousCaBandCombinations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getReduceIntraNonContiguousCaBandCombinations() {
        return reduceIntraNonContiguousCaBandCombinations;
    }

    /**
     * Sets the value of the reduceIntraNonContiguousCaBandCombinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setReduceIntraNonContiguousCaBandCombinations(JAXBElement<EnabledDisabledStates> value) {
        this.reduceIntraNonContiguousCaBandCombinations = value;
    }

}
