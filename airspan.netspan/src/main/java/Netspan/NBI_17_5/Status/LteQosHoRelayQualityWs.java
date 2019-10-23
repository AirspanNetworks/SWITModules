
package Netspan.NBI_17_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteQosHoRelayQualityWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteQosHoRelayQualityWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QosBasedHo" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates"/&gt;
 *         &lt;element name="QosHoRelayQualityGbrUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQualityGbrDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQualityMcsUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQualityMcsDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQualityLayersNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQualityFrameStructure" type="{http://Airspan.Netspan.WebServices}FrameStructureTypes" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQualityChannelBw" type="{http://Airspan.Netspan.WebServices}RelayQualityChannelBandwidths" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQualityPhr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQualityPhrRbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQualitySyncCounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQualityAcceptableCalls" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteQosHoRelayQualityWs", propOrder = {
    "qosBasedHo",
    "qosHoRelayQualityGbrUl",
    "qosHoRelayQualityGbrDl",
    "qosHoRelayQualityMcsUl",
    "qosHoRelayQualityMcsDl",
    "qosHoRelayQualityLayersNumber",
    "qosHoRelayQualityFrameStructure",
    "qosHoRelayQualityChannelBw",
    "qosHoRelayQualityPhr",
    "qosHoRelayQualityPhrRbs",
    "qosHoRelayQualitySyncCounter",
    "qosHoRelayQualityAcceptableCalls"
})
public class LteQosHoRelayQualityWs {

    @XmlElement(name = "QosBasedHo", required = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledStates qosBasedHo;
    @XmlElementRef(name = "QosHoRelayQualityGbrUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qosHoRelayQualityGbrUl;
    @XmlElementRef(name = "QosHoRelayQualityGbrDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qosHoRelayQualityGbrDl;
    @XmlElementRef(name = "QosHoRelayQualityMcsUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qosHoRelayQualityMcsUl;
    @XmlElementRef(name = "QosHoRelayQualityMcsDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qosHoRelayQualityMcsDl;
    @XmlElementRef(name = "QosHoRelayQualityLayersNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qosHoRelayQualityLayersNumber;
    @XmlElementRef(name = "QosHoRelayQualityFrameStructure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<FrameStructureTypes> qosHoRelayQualityFrameStructure;
    @XmlElementRef(name = "QosHoRelayQualityChannelBw", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelayQualityChannelBandwidths> qosHoRelayQualityChannelBw;
    @XmlElementRef(name = "QosHoRelayQualityPhr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qosHoRelayQualityPhr;
    @XmlElementRef(name = "QosHoRelayQualityPhrRbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qosHoRelayQualityPhrRbs;
    @XmlElementRef(name = "QosHoRelayQualitySyncCounter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qosHoRelayQualitySyncCounter;
    @XmlElementRef(name = "QosHoRelayQualityAcceptableCalls", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qosHoRelayQualityAcceptableCalls;

    /**
     * Gets the value of the qosBasedHo property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledStates }
     *     
     */
    public EnabledDisabledStates getQosBasedHo() {
        return qosBasedHo;
    }

    /**
     * Sets the value of the qosBasedHo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledStates }
     *     
     */
    public void setQosBasedHo(EnabledDisabledStates value) {
        this.qosBasedHo = value;
    }

    /**
     * Gets the value of the qosHoRelayQualityGbrUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQosHoRelayQualityGbrUl() {
        return qosHoRelayQualityGbrUl;
    }

    /**
     * Sets the value of the qosHoRelayQualityGbrUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQosHoRelayQualityGbrUl(JAXBElement<Integer> value) {
        this.qosHoRelayQualityGbrUl = value;
    }

    /**
     * Gets the value of the qosHoRelayQualityGbrDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQosHoRelayQualityGbrDl() {
        return qosHoRelayQualityGbrDl;
    }

    /**
     * Sets the value of the qosHoRelayQualityGbrDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQosHoRelayQualityGbrDl(JAXBElement<Integer> value) {
        this.qosHoRelayQualityGbrDl = value;
    }

    /**
     * Gets the value of the qosHoRelayQualityMcsUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQosHoRelayQualityMcsUl() {
        return qosHoRelayQualityMcsUl;
    }

    /**
     * Sets the value of the qosHoRelayQualityMcsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQosHoRelayQualityMcsUl(JAXBElement<Integer> value) {
        this.qosHoRelayQualityMcsUl = value;
    }

    /**
     * Gets the value of the qosHoRelayQualityMcsDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQosHoRelayQualityMcsDl() {
        return qosHoRelayQualityMcsDl;
    }

    /**
     * Sets the value of the qosHoRelayQualityMcsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQosHoRelayQualityMcsDl(JAXBElement<Integer> value) {
        this.qosHoRelayQualityMcsDl = value;
    }

    /**
     * Gets the value of the qosHoRelayQualityLayersNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQosHoRelayQualityLayersNumber() {
        return qosHoRelayQualityLayersNumber;
    }

    /**
     * Sets the value of the qosHoRelayQualityLayersNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQosHoRelayQualityLayersNumber(JAXBElement<Integer> value) {
        this.qosHoRelayQualityLayersNumber = value;
    }

    /**
     * Gets the value of the qosHoRelayQualityFrameStructure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrameStructureTypes }{@code >}
     *     
     */
    public JAXBElement<FrameStructureTypes> getQosHoRelayQualityFrameStructure() {
        return qosHoRelayQualityFrameStructure;
    }

    /**
     * Sets the value of the qosHoRelayQualityFrameStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrameStructureTypes }{@code >}
     *     
     */
    public void setQosHoRelayQualityFrameStructure(JAXBElement<FrameStructureTypes> value) {
        this.qosHoRelayQualityFrameStructure = value;
    }

    /**
     * Gets the value of the qosHoRelayQualityChannelBw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelayQualityChannelBandwidths }{@code >}
     *     
     */
    public JAXBElement<RelayQualityChannelBandwidths> getQosHoRelayQualityChannelBw() {
        return qosHoRelayQualityChannelBw;
    }

    /**
     * Sets the value of the qosHoRelayQualityChannelBw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelayQualityChannelBandwidths }{@code >}
     *     
     */
    public void setQosHoRelayQualityChannelBw(JAXBElement<RelayQualityChannelBandwidths> value) {
        this.qosHoRelayQualityChannelBw = value;
    }

    /**
     * Gets the value of the qosHoRelayQualityPhr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQosHoRelayQualityPhr() {
        return qosHoRelayQualityPhr;
    }

    /**
     * Sets the value of the qosHoRelayQualityPhr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQosHoRelayQualityPhr(JAXBElement<Integer> value) {
        this.qosHoRelayQualityPhr = value;
    }

    /**
     * Gets the value of the qosHoRelayQualityPhrRbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQosHoRelayQualityPhrRbs() {
        return qosHoRelayQualityPhrRbs;
    }

    /**
     * Sets the value of the qosHoRelayQualityPhrRbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQosHoRelayQualityPhrRbs(JAXBElement<Integer> value) {
        this.qosHoRelayQualityPhrRbs = value;
    }

    /**
     * Gets the value of the qosHoRelayQualitySyncCounter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQosHoRelayQualitySyncCounter() {
        return qosHoRelayQualitySyncCounter;
    }

    /**
     * Sets the value of the qosHoRelayQualitySyncCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQosHoRelayQualitySyncCounter(JAXBElement<Integer> value) {
        this.qosHoRelayQualitySyncCounter = value;
    }

    /**
     * Gets the value of the qosHoRelayQualityAcceptableCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQosHoRelayQualityAcceptableCalls() {
        return qosHoRelayQualityAcceptableCalls;
    }

    /**
     * Sets the value of the qosHoRelayQualityAcceptableCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQosHoRelayQualityAcceptableCalls(JAXBElement<Integer> value) {
        this.qosHoRelayQualityAcceptableCalls = value;
    }

}
