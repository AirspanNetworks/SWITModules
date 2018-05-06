
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallTraceEnbWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallTraceEnbWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TraceLogStartWaitForACKIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TraceLogStartWaitForACK" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TraceLogStartEndResumeRetransmissionsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TraceLogStartEndResumeRetransmissions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DelayBetweenRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DelayBetweenRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TraceKeepAliveIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TraceKeepAlive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TraceKeepAliveFailuresIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TraceKeepAliveFailures" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    @XmlElement(name = "TraceLogStartWaitForACKIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean traceLogStartWaitForACKIsDefault;
    @XmlElementRef(name = "TraceLogStartWaitForACK", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> traceLogStartWaitForACK;
    @XmlElement(name = "TraceLogStartEndResumeRetransmissionsIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean traceLogStartEndResumeRetransmissionsIsDefault;
    @XmlElementRef(name = "TraceLogStartEndResumeRetransmissions", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> traceLogStartEndResumeRetransmissions;
    @XmlElement(name = "DelayBetweenRetriesIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean delayBetweenRetriesIsDefault;
    @XmlElementRef(name = "DelayBetweenRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> delayBetweenRetries;
    @XmlElement(name = "TraceKeepAliveIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean traceKeepAliveIsDefault;
    @XmlElementRef(name = "TraceKeepAlive", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> traceKeepAlive;
    @XmlElement(name = "TraceKeepAliveFailuresIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean traceKeepAliveFailuresIsDefault;
    @XmlElementRef(name = "TraceKeepAliveFailures", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> traceKeepAliveFailures;

    /**
     * Gets the value of the traceLogStartWaitForACKIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTraceLogStartWaitForACKIsDefault() {
        return traceLogStartWaitForACKIsDefault;
    }

    /**
     * Sets the value of the traceLogStartWaitForACKIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraceLogStartWaitForACKIsDefault(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isTraceLogStartEndResumeRetransmissionsIsDefault() {
        return traceLogStartEndResumeRetransmissionsIsDefault;
    }

    /**
     * Sets the value of the traceLogStartEndResumeRetransmissionsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraceLogStartEndResumeRetransmissionsIsDefault(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isDelayBetweenRetriesIsDefault() {
        return delayBetweenRetriesIsDefault;
    }

    /**
     * Sets the value of the delayBetweenRetriesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelayBetweenRetriesIsDefault(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isTraceKeepAliveIsDefault() {
        return traceKeepAliveIsDefault;
    }

    /**
     * Sets the value of the traceKeepAliveIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraceKeepAliveIsDefault(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isTraceKeepAliveFailuresIsDefault() {
        return traceKeepAliveFailuresIsDefault;
    }

    /**
     * Sets the value of the traceKeepAliveFailuresIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraceKeepAliveFailuresIsDefault(Boolean value) {
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
