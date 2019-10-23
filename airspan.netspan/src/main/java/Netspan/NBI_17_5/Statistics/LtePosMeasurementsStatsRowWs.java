
package Netspan.NBI_17_5.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LtePosMeasurementsStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtePosMeasurementsStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EcidSuccMeasInitResponse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EcidFailMeasInitCauseReqItemNotSupported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EcidFailMeasInitCauseReqItemTemporarilyNotSupported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OtdoaRrcInterFreqRstdMeasIndicationStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OtdoaRrcInterFreqRstdMeasIndicationStop" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OtdoaRrcConnectionReconfigStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OtdoaRrcConnectionReconfigStop" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtePosMeasurementsStatsRowWs", propOrder = {
    "cellNumber",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "ecidSuccMeasInitResponse",
    "ecidFailMeasInitCauseReqItemNotSupported",
    "ecidFailMeasInitCauseReqItemTemporarilyNotSupported",
    "otdoaRrcInterFreqRstdMeasIndicationStart",
    "otdoaRrcInterFreqRstdMeasIndicationStop",
    "otdoaRrcConnectionReconfigStart",
    "otdoaRrcConnectionReconfigStop"
})
public class LtePosMeasurementsStatsRowWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "EcidSuccMeasInitResponse", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ecidSuccMeasInitResponse;
    @XmlElementRef(name = "EcidFailMeasInitCauseReqItemNotSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ecidFailMeasInitCauseReqItemNotSupported;
    @XmlElementRef(name = "EcidFailMeasInitCauseReqItemTemporarilyNotSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ecidFailMeasInitCauseReqItemTemporarilyNotSupported;
    @XmlElementRef(name = "OtdoaRrcInterFreqRstdMeasIndicationStart", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> otdoaRrcInterFreqRstdMeasIndicationStart;
    @XmlElementRef(name = "OtdoaRrcInterFreqRstdMeasIndicationStop", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> otdoaRrcInterFreqRstdMeasIndicationStop;
    @XmlElementRef(name = "OtdoaRrcConnectionReconfigStart", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> otdoaRrcConnectionReconfigStart;
    @XmlElementRef(name = "OtdoaRrcConnectionReconfigStop", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> otdoaRrcConnectionReconfigStop;

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
     * Gets the value of the ecidSuccMeasInitResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEcidSuccMeasInitResponse() {
        return ecidSuccMeasInitResponse;
    }

    /**
     * Sets the value of the ecidSuccMeasInitResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEcidSuccMeasInitResponse(JAXBElement<Integer> value) {
        this.ecidSuccMeasInitResponse = value;
    }

    /**
     * Gets the value of the ecidFailMeasInitCauseReqItemNotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEcidFailMeasInitCauseReqItemNotSupported() {
        return ecidFailMeasInitCauseReqItemNotSupported;
    }

    /**
     * Sets the value of the ecidFailMeasInitCauseReqItemNotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEcidFailMeasInitCauseReqItemNotSupported(JAXBElement<Integer> value) {
        this.ecidFailMeasInitCauseReqItemNotSupported = value;
    }

    /**
     * Gets the value of the ecidFailMeasInitCauseReqItemTemporarilyNotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEcidFailMeasInitCauseReqItemTemporarilyNotSupported() {
        return ecidFailMeasInitCauseReqItemTemporarilyNotSupported;
    }

    /**
     * Sets the value of the ecidFailMeasInitCauseReqItemTemporarilyNotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEcidFailMeasInitCauseReqItemTemporarilyNotSupported(JAXBElement<Integer> value) {
        this.ecidFailMeasInitCauseReqItemTemporarilyNotSupported = value;
    }

    /**
     * Gets the value of the otdoaRrcInterFreqRstdMeasIndicationStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOtdoaRrcInterFreqRstdMeasIndicationStart() {
        return otdoaRrcInterFreqRstdMeasIndicationStart;
    }

    /**
     * Sets the value of the otdoaRrcInterFreqRstdMeasIndicationStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOtdoaRrcInterFreqRstdMeasIndicationStart(JAXBElement<Integer> value) {
        this.otdoaRrcInterFreqRstdMeasIndicationStart = value;
    }

    /**
     * Gets the value of the otdoaRrcInterFreqRstdMeasIndicationStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOtdoaRrcInterFreqRstdMeasIndicationStop() {
        return otdoaRrcInterFreqRstdMeasIndicationStop;
    }

    /**
     * Sets the value of the otdoaRrcInterFreqRstdMeasIndicationStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOtdoaRrcInterFreqRstdMeasIndicationStop(JAXBElement<Integer> value) {
        this.otdoaRrcInterFreqRstdMeasIndicationStop = value;
    }

    /**
     * Gets the value of the otdoaRrcConnectionReconfigStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOtdoaRrcConnectionReconfigStart() {
        return otdoaRrcConnectionReconfigStart;
    }

    /**
     * Sets the value of the otdoaRrcConnectionReconfigStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOtdoaRrcConnectionReconfigStart(JAXBElement<Integer> value) {
        this.otdoaRrcConnectionReconfigStart = value;
    }

    /**
     * Gets the value of the otdoaRrcConnectionReconfigStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOtdoaRrcConnectionReconfigStop() {
        return otdoaRrcConnectionReconfigStop;
    }

    /**
     * Sets the value of the otdoaRrcConnectionReconfigStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOtdoaRrcConnectionReconfigStop(JAXBElement<Integer> value) {
        this.otdoaRrcConnectionReconfigStop = value;
    }

}
