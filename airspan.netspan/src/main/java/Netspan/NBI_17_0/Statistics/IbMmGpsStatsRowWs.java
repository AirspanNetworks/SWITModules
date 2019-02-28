
package Netspan.NBI_17_0.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IbMmGpsStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbMmGpsStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaSatelliteSnr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaSatelliteStrength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaGpsSatellites" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaGlonassSatellites" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbMmGpsStatsRowWs", propOrder = {
    "dateTimeStart",
    "dateTimeEnd",
    "granularityPeriod",
    "mimosaSatelliteSnr",
    "mimosaSatelliteStrength",
    "mimosaGpsSatellites",
    "mimosaGlonassSatellites"
})
public class IbMmGpsStatsRowWs {

    @XmlElement(name = "DateTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStart;
    @XmlElement(name = "DateTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "MimosaSatelliteSnr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaSatelliteSnr;
    @XmlElementRef(name = "MimosaSatelliteStrength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaSatelliteStrength;
    @XmlElementRef(name = "MimosaGpsSatellites", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaGpsSatellites;
    @XmlElementRef(name = "MimosaGlonassSatellites", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaGlonassSatellites;

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
     * Gets the value of the mimosaSatelliteSnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaSatelliteSnr() {
        return mimosaSatelliteSnr;
    }

    /**
     * Sets the value of the mimosaSatelliteSnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaSatelliteSnr(JAXBElement<Integer> value) {
        this.mimosaSatelliteSnr = value;
    }

    /**
     * Gets the value of the mimosaSatelliteStrength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaSatelliteStrength() {
        return mimosaSatelliteStrength;
    }

    /**
     * Sets the value of the mimosaSatelliteStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaSatelliteStrength(JAXBElement<Integer> value) {
        this.mimosaSatelliteStrength = value;
    }

    /**
     * Gets the value of the mimosaGpsSatellites property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaGpsSatellites() {
        return mimosaGpsSatellites;
    }

    /**
     * Sets the value of the mimosaGpsSatellites property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaGpsSatellites(JAXBElement<Integer> value) {
        this.mimosaGpsSatellites = value;
    }

    /**
     * Gets the value of the mimosaGlonassSatellites property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaGlonassSatellites() {
        return mimosaGlonassSatellites;
    }

    /**
     * Sets the value of the mimosaGlonassSatellites property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaGlonassSatellites(JAXBElement<Integer> value) {
        this.mimosaGlonassSatellites = value;
    }

}
