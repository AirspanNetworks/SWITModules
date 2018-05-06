
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmbmsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmbmsWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SynchronizationPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SynchronizationPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SynchronizationSequenceIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SynchronizationSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LeapSecondsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LeapSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmbmsWs", propOrder = {
    "synchronizationPeriodIsDefault",
    "synchronizationPeriod",
    "synchronizationSequenceIsDefault",
    "synchronizationSequence",
    "leapSecondsIsDefault",
    "leapSeconds"
})
public class EmbmsWs {

    @XmlElementRef(name = "SynchronizationPeriodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> synchronizationPeriodIsDefault;
    @XmlElementRef(name = "SynchronizationPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> synchronizationPeriod;
    @XmlElementRef(name = "SynchronizationSequenceIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> synchronizationSequenceIsDefault;
    @XmlElementRef(name = "SynchronizationSequence", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> synchronizationSequence;
    @XmlElementRef(name = "LeapSecondsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> leapSecondsIsDefault;
    @XmlElementRef(name = "LeapSeconds", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> leapSeconds;

    /**
     * Gets the value of the synchronizationPeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSynchronizationPeriodIsDefault() {
        return synchronizationPeriodIsDefault;
    }

    /**
     * Sets the value of the synchronizationPeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSynchronizationPeriodIsDefault(JAXBElement<Boolean> value) {
        this.synchronizationPeriodIsDefault = value;
    }

    /**
     * Gets the value of the synchronizationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSynchronizationPeriod() {
        return synchronizationPeriod;
    }

    /**
     * Sets the value of the synchronizationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSynchronizationPeriod(JAXBElement<Integer> value) {
        this.synchronizationPeriod = value;
    }

    /**
     * Gets the value of the synchronizationSequenceIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSynchronizationSequenceIsDefault() {
        return synchronizationSequenceIsDefault;
    }

    /**
     * Sets the value of the synchronizationSequenceIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSynchronizationSequenceIsDefault(JAXBElement<Boolean> value) {
        this.synchronizationSequenceIsDefault = value;
    }

    /**
     * Gets the value of the synchronizationSequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSynchronizationSequence() {
        return synchronizationSequence;
    }

    /**
     * Sets the value of the synchronizationSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSynchronizationSequence(JAXBElement<Integer> value) {
        this.synchronizationSequence = value;
    }

    /**
     * Gets the value of the leapSecondsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLeapSecondsIsDefault() {
        return leapSecondsIsDefault;
    }

    /**
     * Sets the value of the leapSecondsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLeapSecondsIsDefault(JAXBElement<Boolean> value) {
        this.leapSecondsIsDefault = value;
    }

    /**
     * Gets the value of the leapSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLeapSeconds() {
        return leapSeconds;
    }

    /**
     * Sets the value of the leapSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLeapSeconds(JAXBElement<Integer> value) {
        this.leapSeconds = value;
    }

}
