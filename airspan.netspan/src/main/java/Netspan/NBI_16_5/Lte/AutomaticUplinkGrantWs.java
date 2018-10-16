
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for AutomaticUplinkGrantWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomaticUplinkGrantWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutomaticUplinkGrantIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticUplinkGrant" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticGrantPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticGrantPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfParticipatingUeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfParticipatingUe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdNumberOfUeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdNumberOfUe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomaticUplinkGrantWs", propOrder = {
    "automaticUplinkGrantIsDefault",
    "automaticUplinkGrant",
    "automaticGrantPeriodIsDefault",
    "automaticGrantPeriod",
    "numberOfParticipatingUeIsDefault",
    "numberOfParticipatingUe",
    "thresholdNumberOfUeIsDefault",
    "thresholdNumberOfUe"
})
public class AutomaticUplinkGrantWs {

    @XmlElementRef(name = "AutomaticUplinkGrantIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> automaticUplinkGrantIsDefault;
    @XmlElementRef(name = "AutomaticUplinkGrant", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> automaticUplinkGrant;
    @XmlElementRef(name = "AutomaticGrantPeriodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> automaticGrantPeriodIsDefault;
    @XmlElementRef(name = "AutomaticGrantPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> automaticGrantPeriod;
    @XmlElementRef(name = "NumberOfParticipatingUeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> numberOfParticipatingUeIsDefault;
    @XmlElementRef(name = "NumberOfParticipatingUe", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfParticipatingUe;
    @XmlElementRef(name = "ThresholdNumberOfUeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> thresholdNumberOfUeIsDefault;
    @XmlElementRef(name = "ThresholdNumberOfUe", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> thresholdNumberOfUe;

    /**
     * Gets the value of the automaticUplinkGrantIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutomaticUplinkGrantIsDefault() {
        return automaticUplinkGrantIsDefault;
    }

    /**
     * Sets the value of the automaticUplinkGrantIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutomaticUplinkGrantIsDefault(JAXBElement<Boolean> value) {
        this.automaticUplinkGrantIsDefault = value;
    }

    /**
     * Gets the value of the automaticUplinkGrant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getAutomaticUplinkGrant() {
        return automaticUplinkGrant;
    }

    /**
     * Sets the value of the automaticUplinkGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setAutomaticUplinkGrant(JAXBElement<EnabledDisabledStates> value) {
        this.automaticUplinkGrant = value;
    }

    /**
     * Gets the value of the automaticGrantPeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutomaticGrantPeriodIsDefault() {
        return automaticGrantPeriodIsDefault;
    }

    /**
     * Sets the value of the automaticGrantPeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutomaticGrantPeriodIsDefault(JAXBElement<Boolean> value) {
        this.automaticGrantPeriodIsDefault = value;
    }

    /**
     * Gets the value of the automaticGrantPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutomaticGrantPeriod() {
        return automaticGrantPeriod;
    }

    /**
     * Sets the value of the automaticGrantPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutomaticGrantPeriod(JAXBElement<Integer> value) {
        this.automaticGrantPeriod = value;
    }

    /**
     * Gets the value of the numberOfParticipatingUeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNumberOfParticipatingUeIsDefault() {
        return numberOfParticipatingUeIsDefault;
    }

    /**
     * Sets the value of the numberOfParticipatingUeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNumberOfParticipatingUeIsDefault(JAXBElement<Boolean> value) {
        this.numberOfParticipatingUeIsDefault = value;
    }

    /**
     * Gets the value of the numberOfParticipatingUe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfParticipatingUe() {
        return numberOfParticipatingUe;
    }

    /**
     * Sets the value of the numberOfParticipatingUe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfParticipatingUe(JAXBElement<Integer> value) {
        this.numberOfParticipatingUe = value;
    }

    /**
     * Gets the value of the thresholdNumberOfUeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getThresholdNumberOfUeIsDefault() {
        return thresholdNumberOfUeIsDefault;
    }

    /**
     * Sets the value of the thresholdNumberOfUeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setThresholdNumberOfUeIsDefault(JAXBElement<Boolean> value) {
        this.thresholdNumberOfUeIsDefault = value;
    }

    /**
     * Gets the value of the thresholdNumberOfUe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThresholdNumberOfUe() {
        return thresholdNumberOfUe;
    }

    /**
     * Sets the value of the thresholdNumberOfUe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThresholdNumberOfUe(JAXBElement<Integer> value) {
        this.thresholdNumberOfUe = value;
    }

}
