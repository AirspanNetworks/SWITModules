
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.DicicSchemeType;


/**
 * <p>Java class for LteSonDynIcic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSonDynIcic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IcicMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="IcicSchemeType" type="{http://Airspan.Netspan.WebServices}DicicSchemeType" minOccurs="0"/&gt;
 *         &lt;element name="MinThresholdCeu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxThresholdCeu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UnmanagedInterferenceHandling" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfColors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSonDynIcic", propOrder = {
    "icicMode",
    "icicSchemeType",
    "minThresholdCeu",
    "maxThresholdCeu",
    "unmanagedInterferenceHandling",
    "numberOfColors"
})
public class LteSonDynIcic {

    @XmlElementRef(name = "IcicMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> icicMode;
    @XmlElementRef(name = "IcicSchemeType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DicicSchemeType> icicSchemeType;
    @XmlElementRef(name = "MinThresholdCeu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minThresholdCeu;
    @XmlElementRef(name = "MaxThresholdCeu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxThresholdCeu;
    @XmlElementRef(name = "UnmanagedInterferenceHandling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> unmanagedInterferenceHandling;
    @XmlElementRef(name = "NumberOfColors", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfColors;

    /**
     * Gets the value of the icicMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIcicMode() {
        return icicMode;
    }

    /**
     * Sets the value of the icicMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIcicMode(JAXBElement<EnabledDisabledStates> value) {
        this.icicMode = value;
    }

    /**
     * Gets the value of the icicSchemeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DicicSchemeType }{@code >}
     *     
     */
    public JAXBElement<DicicSchemeType> getIcicSchemeType() {
        return icicSchemeType;
    }

    /**
     * Sets the value of the icicSchemeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DicicSchemeType }{@code >}
     *     
     */
    public void setIcicSchemeType(JAXBElement<DicicSchemeType> value) {
        this.icicSchemeType = value;
    }

    /**
     * Gets the value of the minThresholdCeu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinThresholdCeu() {
        return minThresholdCeu;
    }

    /**
     * Sets the value of the minThresholdCeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinThresholdCeu(JAXBElement<Integer> value) {
        this.minThresholdCeu = value;
    }

    /**
     * Gets the value of the maxThresholdCeu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxThresholdCeu() {
        return maxThresholdCeu;
    }

    /**
     * Sets the value of the maxThresholdCeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxThresholdCeu(JAXBElement<Integer> value) {
        this.maxThresholdCeu = value;
    }

    /**
     * Gets the value of the unmanagedInterferenceHandling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getUnmanagedInterferenceHandling() {
        return unmanagedInterferenceHandling;
    }

    /**
     * Sets the value of the unmanagedInterferenceHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setUnmanagedInterferenceHandling(JAXBElement<EnabledDisabledStates> value) {
        this.unmanagedInterferenceHandling = value;
    }

    /**
     * Gets the value of the numberOfColors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfColors() {
        return numberOfColors;
    }

    /**
     * Sets the value of the numberOfColors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfColors(JAXBElement<Integer> value) {
        this.numberOfColors = value;
    }

}
