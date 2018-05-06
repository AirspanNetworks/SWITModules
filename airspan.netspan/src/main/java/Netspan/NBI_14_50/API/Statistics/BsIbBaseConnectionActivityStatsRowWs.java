
package Netspan.NBI_14_50.API.Statistics;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BsIbBaseConnectionActivityStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BsIbBaseConnectionActivityStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SysUpTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RegisteredMsCount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RangingAttempt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RangingAttemptIdle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RangingCompletion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RangingCompletionIdle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IneAttempt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IneCompletion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MsInitiatedNxRequest" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MsInitiatedNxResponse" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NwInitiatedNxRequest" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NwInitiatedNxRejection" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NwInitiatedNxResponse" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MsDrop" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RangingCompletionSuccessPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IneSuccessPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MsInitiatedNxSuccessPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NwInitiatedNxSuccessPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NwInitiatedNxRejectionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BsIbBaseConnectionActivityStatsRowWs", propOrder = {
    "node",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "sysUpTime",
    "registeredMsCount",
    "rangingAttempt",
    "rangingAttemptIdle",
    "rangingCompletion",
    "rangingCompletionIdle",
    "ineAttempt",
    "ineCompletion",
    "msInitiatedNxRequest",
    "msInitiatedNxResponse",
    "nwInitiatedNxRequest",
    "nwInitiatedNxRejection",
    "nwInitiatedNxResponse",
    "msDrop",
    "rangingCompletionSuccessPercent",
    "ineSuccessPercent",
    "msInitiatedNxSuccessPercent",
    "nwInitiatedNxSuccessPercent",
    "nwInitiatedNxRejectionPercent"
})
public class BsIbBaseConnectionActivityStatsRowWs {

    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "SysUpTime")
    protected long sysUpTime;
    @XmlElementRef(name = "RegisteredMsCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> registeredMsCount;
    @XmlElementRef(name = "RangingAttempt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rangingAttempt;
    @XmlElementRef(name = "RangingAttemptIdle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rangingAttemptIdle;
    @XmlElementRef(name = "RangingCompletion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rangingCompletion;
    @XmlElementRef(name = "RangingCompletionIdle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rangingCompletionIdle;
    @XmlElementRef(name = "IneAttempt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ineAttempt;
    @XmlElementRef(name = "IneCompletion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ineCompletion;
    @XmlElementRef(name = "MsInitiatedNxRequest", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> msInitiatedNxRequest;
    @XmlElementRef(name = "MsInitiatedNxResponse", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> msInitiatedNxResponse;
    @XmlElementRef(name = "NwInitiatedNxRequest", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nwInitiatedNxRequest;
    @XmlElementRef(name = "NwInitiatedNxRejection", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nwInitiatedNxRejection;
    @XmlElementRef(name = "NwInitiatedNxResponse", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nwInitiatedNxResponse;
    @XmlElementRef(name = "MsDrop", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> msDrop;
    @XmlElementRef(name = "RangingCompletionSuccessPercent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rangingCompletionSuccessPercent;
    @XmlElementRef(name = "IneSuccessPercent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ineSuccessPercent;
    @XmlElementRef(name = "MsInitiatedNxSuccessPercent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> msInitiatedNxSuccessPercent;
    @XmlElementRef(name = "NwInitiatedNxSuccessPercent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> nwInitiatedNxSuccessPercent;
    @XmlElementRef(name = "NwInitiatedNxRejectionPercent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> nwInitiatedNxRejectionPercent;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the dateAndTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeStart() {
        return dateAndTimeStart;
    }

    /**
     * Sets the value of the dateAndTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeStart(XMLGregorianCalendar value) {
        this.dateAndTimeStart = value;
    }

    /**
     * Gets the value of the dateAndTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeEnd() {
        return dateAndTimeEnd;
    }

    /**
     * Sets the value of the dateAndTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeEnd(XMLGregorianCalendar value) {
        this.dateAndTimeEnd = value;
    }

    /**
     * Gets the value of the sysUpTime property.
     * 
     */
    public long getSysUpTime() {
        return sysUpTime;
    }

    /**
     * Sets the value of the sysUpTime property.
     * 
     */
    public void setSysUpTime(long value) {
        this.sysUpTime = value;
    }

    /**
     * Gets the value of the registeredMsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRegisteredMsCount() {
        return registeredMsCount;
    }

    /**
     * Sets the value of the registeredMsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRegisteredMsCount(JAXBElement<Double> value) {
        this.registeredMsCount = value;
    }

    /**
     * Gets the value of the rangingAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRangingAttempt() {
        return rangingAttempt;
    }

    /**
     * Sets the value of the rangingAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRangingAttempt(JAXBElement<Double> value) {
        this.rangingAttempt = value;
    }

    /**
     * Gets the value of the rangingAttemptIdle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRangingAttemptIdle() {
        return rangingAttemptIdle;
    }

    /**
     * Sets the value of the rangingAttemptIdle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRangingAttemptIdle(JAXBElement<Double> value) {
        this.rangingAttemptIdle = value;
    }

    /**
     * Gets the value of the rangingCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRangingCompletion() {
        return rangingCompletion;
    }

    /**
     * Sets the value of the rangingCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRangingCompletion(JAXBElement<Double> value) {
        this.rangingCompletion = value;
    }

    /**
     * Gets the value of the rangingCompletionIdle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRangingCompletionIdle() {
        return rangingCompletionIdle;
    }

    /**
     * Sets the value of the rangingCompletionIdle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRangingCompletionIdle(JAXBElement<Double> value) {
        this.rangingCompletionIdle = value;
    }

    /**
     * Gets the value of the ineAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getIneAttempt() {
        return ineAttempt;
    }

    /**
     * Sets the value of the ineAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setIneAttempt(JAXBElement<Double> value) {
        this.ineAttempt = value;
    }

    /**
     * Gets the value of the ineCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getIneCompletion() {
        return ineCompletion;
    }

    /**
     * Sets the value of the ineCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setIneCompletion(JAXBElement<Double> value) {
        this.ineCompletion = value;
    }

    /**
     * Gets the value of the msInitiatedNxRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMsInitiatedNxRequest() {
        return msInitiatedNxRequest;
    }

    /**
     * Sets the value of the msInitiatedNxRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMsInitiatedNxRequest(JAXBElement<Double> value) {
        this.msInitiatedNxRequest = value;
    }

    /**
     * Gets the value of the msInitiatedNxResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMsInitiatedNxResponse() {
        return msInitiatedNxResponse;
    }

    /**
     * Sets the value of the msInitiatedNxResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMsInitiatedNxResponse(JAXBElement<Double> value) {
        this.msInitiatedNxResponse = value;
    }

    /**
     * Gets the value of the nwInitiatedNxRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNwInitiatedNxRequest() {
        return nwInitiatedNxRequest;
    }

    /**
     * Sets the value of the nwInitiatedNxRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNwInitiatedNxRequest(JAXBElement<Double> value) {
        this.nwInitiatedNxRequest = value;
    }

    /**
     * Gets the value of the nwInitiatedNxRejection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNwInitiatedNxRejection() {
        return nwInitiatedNxRejection;
    }

    /**
     * Sets the value of the nwInitiatedNxRejection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNwInitiatedNxRejection(JAXBElement<Double> value) {
        this.nwInitiatedNxRejection = value;
    }

    /**
     * Gets the value of the nwInitiatedNxResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNwInitiatedNxResponse() {
        return nwInitiatedNxResponse;
    }

    /**
     * Sets the value of the nwInitiatedNxResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNwInitiatedNxResponse(JAXBElement<Double> value) {
        this.nwInitiatedNxResponse = value;
    }

    /**
     * Gets the value of the msDrop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMsDrop() {
        return msDrop;
    }

    /**
     * Sets the value of the msDrop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMsDrop(JAXBElement<Double> value) {
        this.msDrop = value;
    }

    /**
     * Gets the value of the rangingCompletionSuccessPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRangingCompletionSuccessPercent() {
        return rangingCompletionSuccessPercent;
    }

    /**
     * Sets the value of the rangingCompletionSuccessPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRangingCompletionSuccessPercent(JAXBElement<BigDecimal> value) {
        this.rangingCompletionSuccessPercent = value;
    }

    /**
     * Gets the value of the ineSuccessPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIneSuccessPercent() {
        return ineSuccessPercent;
    }

    /**
     * Sets the value of the ineSuccessPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIneSuccessPercent(JAXBElement<BigDecimal> value) {
        this.ineSuccessPercent = value;
    }

    /**
     * Gets the value of the msInitiatedNxSuccessPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMsInitiatedNxSuccessPercent() {
        return msInitiatedNxSuccessPercent;
    }

    /**
     * Sets the value of the msInitiatedNxSuccessPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMsInitiatedNxSuccessPercent(JAXBElement<BigDecimal> value) {
        this.msInitiatedNxSuccessPercent = value;
    }

    /**
     * Gets the value of the nwInitiatedNxSuccessPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNwInitiatedNxSuccessPercent() {
        return nwInitiatedNxSuccessPercent;
    }

    /**
     * Sets the value of the nwInitiatedNxSuccessPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNwInitiatedNxSuccessPercent(JAXBElement<BigDecimal> value) {
        this.nwInitiatedNxSuccessPercent = value;
    }

    /**
     * Gets the value of the nwInitiatedNxRejectionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNwInitiatedNxRejectionPercent() {
        return nwInitiatedNxRejectionPercent;
    }

    /**
     * Sets the value of the nwInitiatedNxRejectionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNwInitiatedNxRejectionPercent(JAXBElement<BigDecimal> value) {
        this.nwInitiatedNxRejectionPercent = value;
    }

}
