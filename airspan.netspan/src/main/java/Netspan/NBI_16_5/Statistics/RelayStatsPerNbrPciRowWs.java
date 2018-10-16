
package Netspan.NBI_16_5.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RelayStatsPerNbrPciRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayStatsPerNbrPciRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RsrpMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RsrpMean" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RsrpMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RsrqMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RsrqMean" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RsrqMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayStatsPerNbrPciRowWs", propOrder = {
    "pci",
    "dateTimeStart",
    "dateTimeEnd",
    "granularityPeriod",
    "rsrpMin",
    "rsrpMean",
    "rsrpMax",
    "rsrqMin",
    "rsrqMean",
    "rsrqMax"
})
public class RelayStatsPerNbrPciRowWs {

    @XmlElementRef(name = "Pci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci;
    @XmlElement(name = "DateTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStart;
    @XmlElement(name = "DateTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "RsrpMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rsrpMin;
    @XmlElementRef(name = "RsrpMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rsrpMean;
    @XmlElementRef(name = "RsrpMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rsrpMax;
    @XmlElementRef(name = "RsrqMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rsrqMin;
    @XmlElementRef(name = "RsrqMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rsrqMean;
    @XmlElementRef(name = "RsrqMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rsrqMax;

    /**
     * Gets the value of the pci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPci() {
        return pci;
    }

    /**
     * Sets the value of the pci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPci(JAXBElement<Integer> value) {
        this.pci = value;
    }

    /**
     * Gets the value of the dateTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeStart() {
        return dateTimeStart;
    }

    /**
     * Sets the value of the dateTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeStart(XMLGregorianCalendar value) {
        this.dateTimeStart = value;
    }

    /**
     * Gets the value of the dateTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeEnd() {
        return dateTimeEnd;
    }

    /**
     * Sets the value of the dateTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeEnd(XMLGregorianCalendar value) {
        this.dateTimeEnd = value;
    }

    /**
     * Gets the value of the granularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGranularityPeriod(JAXBElement<Integer> value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the rsrpMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRsrpMin() {
        return rsrpMin;
    }

    /**
     * Sets the value of the rsrpMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRsrpMin(JAXBElement<Double> value) {
        this.rsrpMin = value;
    }

    /**
     * Gets the value of the rsrpMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRsrpMean() {
        return rsrpMean;
    }

    /**
     * Sets the value of the rsrpMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRsrpMean(JAXBElement<Double> value) {
        this.rsrpMean = value;
    }

    /**
     * Gets the value of the rsrpMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRsrpMax() {
        return rsrpMax;
    }

    /**
     * Sets the value of the rsrpMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRsrpMax(JAXBElement<Double> value) {
        this.rsrpMax = value;
    }

    /**
     * Gets the value of the rsrqMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRsrqMin() {
        return rsrqMin;
    }

    /**
     * Sets the value of the rsrqMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRsrqMin(JAXBElement<Double> value) {
        this.rsrqMin = value;
    }

    /**
     * Gets the value of the rsrqMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRsrqMean() {
        return rsrqMean;
    }

    /**
     * Sets the value of the rsrqMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRsrqMean(JAXBElement<Double> value) {
        this.rsrqMean = value;
    }

    /**
     * Gets the value of the rsrqMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRsrqMax() {
        return rsrqMax;
    }

    /**
     * Sets the value of the rsrqMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRsrqMax(JAXBElement<Double> value) {
        this.rsrqMax = value;
    }

}
