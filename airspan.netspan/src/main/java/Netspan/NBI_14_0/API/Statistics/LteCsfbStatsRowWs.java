
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteCsfbStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCsfbStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UtranRedirectionAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UtranFailedRedirections" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UtranSuccessfulRedirections" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCsfbStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "utranRedirectionAttempts",
    "utranFailedRedirections",
    "utranSuccessfulRedirections"
})
public class LteCsfbStatsRowWs {

    @XmlElement(name = "CellId", required = true, type = Integer.class, nillable = true)
    protected Integer cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "GranularityPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer granularityPeriod;
    @XmlElement(name = "UtranRedirectionAttempts", required = true, type = Integer.class, nillable = true)
    protected Integer utranRedirectionAttempts;
    @XmlElement(name = "UtranFailedRedirections", required = true, type = Integer.class, nillable = true)
    protected Integer utranFailedRedirections;
    @XmlElement(name = "UtranSuccessfulRedirections", required = true, type = Integer.class, nillable = true)
    protected Integer utranSuccessfulRedirections;

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellId(Integer value) {
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
     * Gets the value of the granularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGranularityPeriod(Integer value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the utranRedirectionAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUtranRedirectionAttempts() {
        return utranRedirectionAttempts;
    }

    /**
     * Sets the value of the utranRedirectionAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUtranRedirectionAttempts(Integer value) {
        this.utranRedirectionAttempts = value;
    }

    /**
     * Gets the value of the utranFailedRedirections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUtranFailedRedirections() {
        return utranFailedRedirections;
    }

    /**
     * Sets the value of the utranFailedRedirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUtranFailedRedirections(Integer value) {
        this.utranFailedRedirections = value;
    }

    /**
     * Gets the value of the utranSuccessfulRedirections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUtranSuccessfulRedirections() {
        return utranSuccessfulRedirections;
    }

    /**
     * Sets the value of the utranSuccessfulRedirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUtranSuccessfulRedirections(Integer value) {
        this.utranSuccessfulRedirections = value;
    }

}
