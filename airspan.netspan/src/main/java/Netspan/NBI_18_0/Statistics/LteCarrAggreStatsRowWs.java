
package Netspan.NBI_18_0.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteCarrAggreStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCarrAggreStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CaSCellReleaseSentNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CaScellAdditionAttemptCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CaScellAdditionSuccessCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CaScellAdditionSuccessRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CaNumActivateCommandsSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CaNumDeactivateCommandsSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCarrAggreStatsRowWs", propOrder = {
    "cellNumber",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "caSCellReleaseSentNum",
    "caScellAdditionAttemptCount",
    "caScellAdditionSuccessCount",
    "caScellAdditionSuccessRate",
    "caNumActivateCommandsSent",
    "caNumDeactivateCommandsSent"
})
public class LteCarrAggreStatsRowWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "CaSCellReleaseSentNum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> caSCellReleaseSentNum;
    @XmlElementRef(name = "CaScellAdditionAttemptCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> caScellAdditionAttemptCount;
    @XmlElementRef(name = "CaScellAdditionSuccessCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> caScellAdditionSuccessCount;
    @XmlElementRef(name = "CaScellAdditionSuccessRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> caScellAdditionSuccessRate;
    @XmlElementRef(name = "CaNumActivateCommandsSent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> caNumActivateCommandsSent;
    @XmlElementRef(name = "CaNumDeactivateCommandsSent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> caNumDeactivateCommandsSent;

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellNumber(JAXBElement<Integer> value) {
        this.cellNumber = value;
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
     * Gets the value of the caSCellReleaseSentNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCaSCellReleaseSentNum() {
        return caSCellReleaseSentNum;
    }

    /**
     * Sets the value of the caSCellReleaseSentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCaSCellReleaseSentNum(JAXBElement<Integer> value) {
        this.caSCellReleaseSentNum = value;
    }

    /**
     * Gets the value of the caScellAdditionAttemptCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCaScellAdditionAttemptCount() {
        return caScellAdditionAttemptCount;
    }

    /**
     * Sets the value of the caScellAdditionAttemptCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCaScellAdditionAttemptCount(JAXBElement<Integer> value) {
        this.caScellAdditionAttemptCount = value;
    }

    /**
     * Gets the value of the caScellAdditionSuccessCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCaScellAdditionSuccessCount() {
        return caScellAdditionSuccessCount;
    }

    /**
     * Sets the value of the caScellAdditionSuccessCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCaScellAdditionSuccessCount(JAXBElement<Integer> value) {
        this.caScellAdditionSuccessCount = value;
    }

    /**
     * Gets the value of the caScellAdditionSuccessRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCaScellAdditionSuccessRate() {
        return caScellAdditionSuccessRate;
    }

    /**
     * Sets the value of the caScellAdditionSuccessRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCaScellAdditionSuccessRate(JAXBElement<Double> value) {
        this.caScellAdditionSuccessRate = value;
    }

    /**
     * Gets the value of the caNumActivateCommandsSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCaNumActivateCommandsSent() {
        return caNumActivateCommandsSent;
    }

    /**
     * Sets the value of the caNumActivateCommandsSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCaNumActivateCommandsSent(JAXBElement<Integer> value) {
        this.caNumActivateCommandsSent = value;
    }

    /**
     * Gets the value of the caNumDeactivateCommandsSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCaNumDeactivateCommandsSent() {
        return caNumDeactivateCommandsSent;
    }

    /**
     * Sets the value of the caNumDeactivateCommandsSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCaNumDeactivateCommandsSent(JAXBElement<Integer> value) {
        this.caNumDeactivateCommandsSent = value;
    }

}
