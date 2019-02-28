
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallTraceEnbWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallTraceEnbWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TraceLogStartWaitForACKIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TraceLogStartWaitForACK" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TraceLogStartEndResumeRetransmissionsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TraceLogStartEndResumeRetransmissions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DelayBetweenRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DelayBetweenRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TraceKeepAliveIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TraceKeepAlive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TraceKeepAliveFailuresIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TraceKeepAliveFailures" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallTraceEnbWs", propOrder = {
    "traceLogStartWaitForACKIsDefault",
    "traceLogStartWaitForACK",
    "traceLogStartEndResumeRetransmissionsIsDefault",
    "traceLogStartEndResumeRetransmissions",
    "delayBetweenRetriesIsDefault",
    "delayBetweenRetries",
    "traceKeepAliveIsDefault",
    "traceKeepAlive",
    "traceKeepAliveFailuresIsDefault",
    "traceKeepAliveFailures"
})
public class CallTraceEnbWs {

    @XmlElementRef(name = "TraceLogStartWaitForACKIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> traceLogStartWaitForACKIsDefault;
    @XmlElementRef(name = "TraceLogStartWaitForACK", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> traceLogStartWaitForACK;
    @XmlElementRef(name = "TraceLogStartEndResumeRetransmissionsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> traceLogStartEndResumeRetransmissionsIsDefault;
    @XmlElementRef(name = "TraceLogStartEndResumeRetransmissions", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> traceLogStartEndResumeRetransmissions;
    @XmlElementRef(name = "DelayBetweenRetriesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> delayBetweenRetriesIsDefault;
    @XmlElementRef(name = "DelayBetweenRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> delayBetweenRetries;
    @XmlElementRef(name = "TraceKeepAliveIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> traceKeepAliveIsDefault;
    @XmlElementRef(name = "TraceKeepAlive", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> traceKeepAlive;
    @XmlElementRef(name = "TraceKeepAliveFailuresIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> traceKeepAliveFailuresIsDefault;
    @XmlElementRef(name = "TraceKeepAliveFailures", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> traceKeepAliveFailures;

    /**
     * Gets the value of the traceLogStartWaitForACKIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTraceLogStartWaitForACKIsDefault() {
        return traceLogStartWaitForACKIsDefault;
    }

    /**
     * Sets the value of the traceLogStartWaitForACKIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTraceLogStartWaitForACKIsDefault(JAXBElement<Boolean> value) {
        this.traceLogStartWaitForACKIsDefault = value;
    }

    /**
     * Gets the value of the traceLogStartWaitForACK property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTraceLogStartWaitForACK() {
        return traceLogStartWaitForACK;
    }

    /**
     * Sets the value of the traceLogStartWaitForACK property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTraceLogStartWaitForACK(JAXBElement<Integer> value) {
        this.traceLogStartWaitForACK = value;
    }

    /**
     * Gets the value of the traceLogStartEndResumeRetransmissionsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTraceLogStartEndResumeRetransmissionsIsDefault() {
        return traceLogStartEndResumeRetransmissionsIsDefault;
    }

    /**
     * Sets the value of the traceLogStartEndResumeRetransmissionsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTraceLogStartEndResumeRetransmissionsIsDefault(JAXBElement<Boolean> value) {
        this.traceLogStartEndResumeRetransmissionsIsDefault = value;
    }

    /**
     * Gets the value of the traceLogStartEndResumeRetransmissions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTraceLogStartEndResumeRetransmissions() {
        return traceLogStartEndResumeRetransmissions;
    }

    /**
     * Sets the value of the traceLogStartEndResumeRetransmissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTraceLogStartEndResumeRetransmissions(JAXBElement<Integer> value) {
        this.traceLogStartEndResumeRetransmissions = value;
    }

    /**
     * Gets the value of the delayBetweenRetriesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDelayBetweenRetriesIsDefault() {
        return delayBetweenRetriesIsDefault;
    }

    /**
     * Sets the value of the delayBetweenRetriesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDelayBetweenRetriesIsDefault(JAXBElement<Boolean> value) {
        this.delayBetweenRetriesIsDefault = value;
    }

    /**
     * Gets the value of the delayBetweenRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDelayBetweenRetries() {
        return delayBetweenRetries;
    }

    /**
     * Sets the value of the delayBetweenRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDelayBetweenRetries(JAXBElement<Integer> value) {
        this.delayBetweenRetries = value;
    }

    /**
     * Gets the value of the traceKeepAliveIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTraceKeepAliveIsDefault() {
        return traceKeepAliveIsDefault;
    }

    /**
     * Sets the value of the traceKeepAliveIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTraceKeepAliveIsDefault(JAXBElement<Boolean> value) {
        this.traceKeepAliveIsDefault = value;
    }

    /**
     * Gets the value of the traceKeepAlive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTraceKeepAlive() {
        return traceKeepAlive;
    }

    /**
     * Sets the value of the traceKeepAlive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTraceKeepAlive(JAXBElement<Integer> value) {
        this.traceKeepAlive = value;
    }

    /**
     * Gets the value of the traceKeepAliveFailuresIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTraceKeepAliveFailuresIsDefault() {
        return traceKeepAliveFailuresIsDefault;
    }

    /**
     * Sets the value of the traceKeepAliveFailuresIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTraceKeepAliveFailuresIsDefault(JAXBElement<Boolean> value) {
        this.traceKeepAliveFailuresIsDefault = value;
    }

    /**
     * Gets the value of the traceKeepAliveFailures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTraceKeepAliveFailures() {
        return traceKeepAliveFailures;
    }

    /**
     * Sets the value of the traceKeepAliveFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTraceKeepAliveFailures(JAXBElement<Integer> value) {
        this.traceKeepAliveFailures = value;
    }

}
