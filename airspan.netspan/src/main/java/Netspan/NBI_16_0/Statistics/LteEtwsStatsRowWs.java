
package Netspan.NBI_16_0.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteEtwsStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteEtwsStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WarningType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarnReqCancelDueToKillReq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarnReqCancelDueToOtherType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarnReqNumSuccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarnReqNumFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarnReqNumTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarnReqSib10SuccSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarnReqSib10Failed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarnReqSib11SuccSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarnReqSib11Failed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarnReqNumOfPaging" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteEtwsStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "warningType",
    "warnReqCancelDueToKillReq",
    "warnReqCancelDueToOtherType",
    "warnReqNumSuccess",
    "warnReqNumFail",
    "warnReqNumTotal",
    "warnReqSib10SuccSent",
    "warnReqSib10Failed",
    "warnReqSib11SuccSent",
    "warnReqSib11Failed",
    "warnReqNumOfPaging"
})
public class LteEtwsStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "WarningType")
    protected String warningType;
    @XmlElementRef(name = "WarnReqCancelDueToKillReq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warnReqCancelDueToKillReq;
    @XmlElementRef(name = "WarnReqCancelDueToOtherType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warnReqCancelDueToOtherType;
    @XmlElementRef(name = "WarnReqNumSuccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warnReqNumSuccess;
    @XmlElementRef(name = "WarnReqNumFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warnReqNumFail;
    @XmlElementRef(name = "WarnReqNumTotal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warnReqNumTotal;
    @XmlElementRef(name = "WarnReqSib10SuccSent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warnReqSib10SuccSent;
    @XmlElementRef(name = "WarnReqSib10Failed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warnReqSib10Failed;
    @XmlElementRef(name = "WarnReqSib11SuccSent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warnReqSib11SuccSent;
    @XmlElementRef(name = "WarnReqSib11Failed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warnReqSib11Failed;
    @XmlElementRef(name = "WarnReqNumOfPaging", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warnReqNumOfPaging;

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
     * Gets the value of the warningType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningType() {
        return warningType;
    }

    /**
     * Sets the value of the warningType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningType(String value) {
        this.warningType = value;
    }

    /**
     * Gets the value of the warnReqCancelDueToKillReq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarnReqCancelDueToKillReq() {
        return warnReqCancelDueToKillReq;
    }

    /**
     * Sets the value of the warnReqCancelDueToKillReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarnReqCancelDueToKillReq(JAXBElement<Integer> value) {
        this.warnReqCancelDueToKillReq = value;
    }

    /**
     * Gets the value of the warnReqCancelDueToOtherType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarnReqCancelDueToOtherType() {
        return warnReqCancelDueToOtherType;
    }

    /**
     * Sets the value of the warnReqCancelDueToOtherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarnReqCancelDueToOtherType(JAXBElement<Integer> value) {
        this.warnReqCancelDueToOtherType = value;
    }

    /**
     * Gets the value of the warnReqNumSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarnReqNumSuccess() {
        return warnReqNumSuccess;
    }

    /**
     * Sets the value of the warnReqNumSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarnReqNumSuccess(JAXBElement<Integer> value) {
        this.warnReqNumSuccess = value;
    }

    /**
     * Gets the value of the warnReqNumFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarnReqNumFail() {
        return warnReqNumFail;
    }

    /**
     * Sets the value of the warnReqNumFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarnReqNumFail(JAXBElement<Integer> value) {
        this.warnReqNumFail = value;
    }

    /**
     * Gets the value of the warnReqNumTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarnReqNumTotal() {
        return warnReqNumTotal;
    }

    /**
     * Sets the value of the warnReqNumTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarnReqNumTotal(JAXBElement<Integer> value) {
        this.warnReqNumTotal = value;
    }

    /**
     * Gets the value of the warnReqSib10SuccSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarnReqSib10SuccSent() {
        return warnReqSib10SuccSent;
    }

    /**
     * Sets the value of the warnReqSib10SuccSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarnReqSib10SuccSent(JAXBElement<Integer> value) {
        this.warnReqSib10SuccSent = value;
    }

    /**
     * Gets the value of the warnReqSib10Failed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarnReqSib10Failed() {
        return warnReqSib10Failed;
    }

    /**
     * Sets the value of the warnReqSib10Failed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarnReqSib10Failed(JAXBElement<Integer> value) {
        this.warnReqSib10Failed = value;
    }

    /**
     * Gets the value of the warnReqSib11SuccSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarnReqSib11SuccSent() {
        return warnReqSib11SuccSent;
    }

    /**
     * Sets the value of the warnReqSib11SuccSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarnReqSib11SuccSent(JAXBElement<Integer> value) {
        this.warnReqSib11SuccSent = value;
    }

    /**
     * Gets the value of the warnReqSib11Failed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarnReqSib11Failed() {
        return warnReqSib11Failed;
    }

    /**
     * Sets the value of the warnReqSib11Failed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarnReqSib11Failed(JAXBElement<Integer> value) {
        this.warnReqSib11Failed = value;
    }

    /**
     * Gets the value of the warnReqNumOfPaging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarnReqNumOfPaging() {
        return warnReqNumOfPaging;
    }

    /**
     * Sets the value of the warnReqNumOfPaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarnReqNumOfPaging(JAXBElement<Integer> value) {
        this.warnReqNumOfPaging = value;
    }

}
