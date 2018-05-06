
package Netspan.NBI_14_50.API.Lte;

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
 *         &lt;element name="MbmsScheduleDelayIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MbmsScheduleDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="M2KeepAlivePeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="M2KeepAlivePeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SfnOffsetIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SfnOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="McchUpdateTimeOffset512IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="McchUpdateTimeOffset512" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="McchUpdateTimeOffset1024IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="McchUpdateTimeOffset1024" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeStampOffsetIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TimeStampOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SynchronizationPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SynchronizationPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SynchronizationSequenceIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SynchronizationSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MbmsHighRsrpThIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MbmsHighRsrpTh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MbmsLowRsrpThIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MbmsLowRsrpTh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "mbmsScheduleDelayIsDefault",
    "mbmsScheduleDelay",
    "m2KeepAlivePeriodIsDefault",
    "m2KeepAlivePeriod",
    "sfnOffsetIsDefault",
    "sfnOffset",
    "mcchUpdateTimeOffset512IsDefault",
    "mcchUpdateTimeOffset512",
    "mcchUpdateTimeOffset1024IsDefault",
    "mcchUpdateTimeOffset1024",
    "timeStampOffsetIsDefault",
    "timeStampOffset",
    "synchronizationPeriodIsDefault",
    "synchronizationPeriod",
    "synchronizationSequenceIsDefault",
    "synchronizationSequence",
    "mbmsHighRsrpThIsDefault",
    "mbmsHighRsrpTh",
    "mbmsLowRsrpThIsDefault",
    "mbmsLowRsrpTh",
    "leapSecondsIsDefault",
    "leapSeconds"
})
public class EmbmsWs {

    @XmlElementRef(name = "MbmsScheduleDelayIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mbmsScheduleDelayIsDefault;
    @XmlElementRef(name = "MbmsScheduleDelay", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mbmsScheduleDelay;
    @XmlElementRef(name = "M2KeepAlivePeriodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> m2KeepAlivePeriodIsDefault;
    @XmlElementRef(name = "M2KeepAlivePeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2KeepAlivePeriod;
    @XmlElementRef(name = "SfnOffsetIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sfnOffsetIsDefault;
    @XmlElementRef(name = "SfnOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfnOffset;
    @XmlElementRef(name = "McchUpdateTimeOffset512IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mcchUpdateTimeOffset512IsDefault;
    @XmlElementRef(name = "McchUpdateTimeOffset512", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mcchUpdateTimeOffset512;
    @XmlElementRef(name = "McchUpdateTimeOffset1024IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mcchUpdateTimeOffset1024IsDefault;
    @XmlElementRef(name = "McchUpdateTimeOffset1024", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mcchUpdateTimeOffset1024;
    @XmlElementRef(name = "TimeStampOffsetIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> timeStampOffsetIsDefault;
    @XmlElementRef(name = "TimeStampOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeStampOffset;
    @XmlElementRef(name = "SynchronizationPeriodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> synchronizationPeriodIsDefault;
    @XmlElementRef(name = "SynchronizationPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> synchronizationPeriod;
    @XmlElementRef(name = "SynchronizationSequenceIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> synchronizationSequenceIsDefault;
    @XmlElementRef(name = "SynchronizationSequence", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> synchronizationSequence;
    @XmlElementRef(name = "MbmsHighRsrpThIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mbmsHighRsrpThIsDefault;
    @XmlElementRef(name = "MbmsHighRsrpTh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mbmsHighRsrpTh;
    @XmlElementRef(name = "MbmsLowRsrpThIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mbmsLowRsrpThIsDefault;
    @XmlElementRef(name = "MbmsLowRsrpTh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mbmsLowRsrpTh;
    @XmlElementRef(name = "LeapSecondsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> leapSecondsIsDefault;
    @XmlElementRef(name = "LeapSeconds", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> leapSeconds;

    /**
     * Gets the value of the mbmsScheduleDelayIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMbmsScheduleDelayIsDefault() {
        return mbmsScheduleDelayIsDefault;
    }

    /**
     * Sets the value of the mbmsScheduleDelayIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMbmsScheduleDelayIsDefault(JAXBElement<Boolean> value) {
        this.mbmsScheduleDelayIsDefault = value;
    }

    /**
     * Gets the value of the mbmsScheduleDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbmsScheduleDelay() {
        return mbmsScheduleDelay;
    }

    /**
     * Sets the value of the mbmsScheduleDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbmsScheduleDelay(JAXBElement<Integer> value) {
        this.mbmsScheduleDelay = value;
    }

    /**
     * Gets the value of the m2KeepAlivePeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getM2KeepAlivePeriodIsDefault() {
        return m2KeepAlivePeriodIsDefault;
    }

    /**
     * Sets the value of the m2KeepAlivePeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setM2KeepAlivePeriodIsDefault(JAXBElement<Boolean> value) {
        this.m2KeepAlivePeriodIsDefault = value;
    }

    /**
     * Gets the value of the m2KeepAlivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2KeepAlivePeriod() {
        return m2KeepAlivePeriod;
    }

    /**
     * Sets the value of the m2KeepAlivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2KeepAlivePeriod(JAXBElement<Integer> value) {
        this.m2KeepAlivePeriod = value;
    }

    /**
     * Gets the value of the sfnOffsetIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSfnOffsetIsDefault() {
        return sfnOffsetIsDefault;
    }

    /**
     * Sets the value of the sfnOffsetIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSfnOffsetIsDefault(JAXBElement<Boolean> value) {
        this.sfnOffsetIsDefault = value;
    }

    /**
     * Gets the value of the sfnOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSfnOffset() {
        return sfnOffset;
    }

    /**
     * Sets the value of the sfnOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSfnOffset(JAXBElement<Integer> value) {
        this.sfnOffset = value;
    }

    /**
     * Gets the value of the mcchUpdateTimeOffset512IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMcchUpdateTimeOffset512IsDefault() {
        return mcchUpdateTimeOffset512IsDefault;
    }

    /**
     * Sets the value of the mcchUpdateTimeOffset512IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMcchUpdateTimeOffset512IsDefault(JAXBElement<Boolean> value) {
        this.mcchUpdateTimeOffset512IsDefault = value;
    }

    /**
     * Gets the value of the mcchUpdateTimeOffset512 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMcchUpdateTimeOffset512() {
        return mcchUpdateTimeOffset512;
    }

    /**
     * Sets the value of the mcchUpdateTimeOffset512 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMcchUpdateTimeOffset512(JAXBElement<Integer> value) {
        this.mcchUpdateTimeOffset512 = value;
    }

    /**
     * Gets the value of the mcchUpdateTimeOffset1024IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMcchUpdateTimeOffset1024IsDefault() {
        return mcchUpdateTimeOffset1024IsDefault;
    }

    /**
     * Sets the value of the mcchUpdateTimeOffset1024IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMcchUpdateTimeOffset1024IsDefault(JAXBElement<Boolean> value) {
        this.mcchUpdateTimeOffset1024IsDefault = value;
    }

    /**
     * Gets the value of the mcchUpdateTimeOffset1024 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMcchUpdateTimeOffset1024() {
        return mcchUpdateTimeOffset1024;
    }

    /**
     * Sets the value of the mcchUpdateTimeOffset1024 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMcchUpdateTimeOffset1024(JAXBElement<Integer> value) {
        this.mcchUpdateTimeOffset1024 = value;
    }

    /**
     * Gets the value of the timeStampOffsetIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTimeStampOffsetIsDefault() {
        return timeStampOffsetIsDefault;
    }

    /**
     * Sets the value of the timeStampOffsetIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTimeStampOffsetIsDefault(JAXBElement<Boolean> value) {
        this.timeStampOffsetIsDefault = value;
    }

    /**
     * Gets the value of the timeStampOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeStampOffset() {
        return timeStampOffset;
    }

    /**
     * Sets the value of the timeStampOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeStampOffset(JAXBElement<Integer> value) {
        this.timeStampOffset = value;
    }

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
     * Gets the value of the mbmsHighRsrpThIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMbmsHighRsrpThIsDefault() {
        return mbmsHighRsrpThIsDefault;
    }

    /**
     * Sets the value of the mbmsHighRsrpThIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMbmsHighRsrpThIsDefault(JAXBElement<Boolean> value) {
        this.mbmsHighRsrpThIsDefault = value;
    }

    /**
     * Gets the value of the mbmsHighRsrpTh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbmsHighRsrpTh() {
        return mbmsHighRsrpTh;
    }

    /**
     * Sets the value of the mbmsHighRsrpTh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbmsHighRsrpTh(JAXBElement<Integer> value) {
        this.mbmsHighRsrpTh = value;
    }

    /**
     * Gets the value of the mbmsLowRsrpThIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMbmsLowRsrpThIsDefault() {
        return mbmsLowRsrpThIsDefault;
    }

    /**
     * Sets the value of the mbmsLowRsrpThIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMbmsLowRsrpThIsDefault(JAXBElement<Boolean> value) {
        this.mbmsLowRsrpThIsDefault = value;
    }

    /**
     * Gets the value of the mbmsLowRsrpTh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbmsLowRsrpTh() {
        return mbmsLowRsrpTh;
    }

    /**
     * Sets the value of the mbmsLowRsrpTh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbmsLowRsrpTh(JAXBElement<Integer> value) {
        this.mbmsLowRsrpTh = value;
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
