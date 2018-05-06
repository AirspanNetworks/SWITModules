
package Netspan.NBI_15_5.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteIntraEnbLbStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteIntraEnbLbStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="X2InterFreqInAttRnlIntraEnbLoadBalancingRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoadMeasurementsCompositeLoadAverage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoadMeasurementsCompositeLoadMinimum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoadMeasurementsCompositeLoadMaximum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteIntraEnbLbStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "x2InterFreqInAttRnlIntraEnbLoadBalancingRsn",
    "x2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn",
    "x2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn",
    "loadMeasurementsCompositeLoadAverage",
    "loadMeasurementsCompositeLoadMinimum",
    "loadMeasurementsCompositeLoadMaximum"
})
public class LteIntraEnbLbStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "X2InterFreqInAttRnlIntraEnbLoadBalancingRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInAttRnlIntraEnbLoadBalancingRsn;
    @XmlElementRef(name = "X2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn;
    @XmlElementRef(name = "LoadMeasurementsCompositeLoadAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> loadMeasurementsCompositeLoadAverage;
    @XmlElementRef(name = "LoadMeasurementsCompositeLoadMinimum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> loadMeasurementsCompositeLoadMinimum;
    @XmlElementRef(name = "LoadMeasurementsCompositeLoadMaximum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> loadMeasurementsCompositeLoadMaximum;

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellId(JAXBElement<Integer> value) {
        this.cellId = value;
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
     * Gets the value of the x2InterFreqInAttRnlIntraEnbLoadBalancingRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInAttRnlIntraEnbLoadBalancingRsn() {
        return x2InterFreqInAttRnlIntraEnbLoadBalancingRsn;
    }

    /**
     * Sets the value of the x2InterFreqInAttRnlIntraEnbLoadBalancingRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInAttRnlIntraEnbLoadBalancingRsn(JAXBElement<Integer> value) {
        this.x2InterFreqInAttRnlIntraEnbLoadBalancingRsn = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn() {
        return x2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn;
    }

    /**
     * Sets the value of the x2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn(JAXBElement<Integer> value) {
        this.x2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn() {
        return x2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn = value;
    }

    /**
     * Gets the value of the loadMeasurementsCompositeLoadAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLoadMeasurementsCompositeLoadAverage() {
        return loadMeasurementsCompositeLoadAverage;
    }

    /**
     * Sets the value of the loadMeasurementsCompositeLoadAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLoadMeasurementsCompositeLoadAverage(JAXBElement<Integer> value) {
        this.loadMeasurementsCompositeLoadAverage = value;
    }

    /**
     * Gets the value of the loadMeasurementsCompositeLoadMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLoadMeasurementsCompositeLoadMinimum() {
        return loadMeasurementsCompositeLoadMinimum;
    }

    /**
     * Sets the value of the loadMeasurementsCompositeLoadMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLoadMeasurementsCompositeLoadMinimum(JAXBElement<Integer> value) {
        this.loadMeasurementsCompositeLoadMinimum = value;
    }

    /**
     * Gets the value of the loadMeasurementsCompositeLoadMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLoadMeasurementsCompositeLoadMaximum() {
        return loadMeasurementsCompositeLoadMaximum;
    }

    /**
     * Sets the value of the loadMeasurementsCompositeLoadMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLoadMeasurementsCompositeLoadMaximum(JAXBElement<Integer> value) {
        this.loadMeasurementsCompositeLoadMaximum = value;
    }

}
