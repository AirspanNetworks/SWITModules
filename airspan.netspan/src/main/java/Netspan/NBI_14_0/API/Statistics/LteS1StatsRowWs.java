
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteS1StatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteS1StatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UeAssocS1ConnEstabAtt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UeAssocS1ConnEstabSucc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteS1StatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "ueAssocS1ConnEstabAtt",
    "ueAssocS1ConnEstabSucc"
})
public class LteS1StatsRowWs {

    @XmlElement(name = "CellId")
    protected int cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "GranularityPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer granularityPeriod;
    @XmlElement(name = "UeAssocS1ConnEstabAtt", required = true, type = Integer.class, nillable = true)
    protected Integer ueAssocS1ConnEstabAtt;
    @XmlElement(name = "UeAssocS1ConnEstabSucc", required = true, type = Integer.class, nillable = true)
    protected Integer ueAssocS1ConnEstabSucc;

    /**
     * Gets the value of the cellId property.
     * 
     */
    public int getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     */
    public void setCellId(int value) {
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
     * Gets the value of the ueAssocS1ConnEstabAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUeAssocS1ConnEstabAtt() {
        return ueAssocS1ConnEstabAtt;
    }

    /**
     * Sets the value of the ueAssocS1ConnEstabAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUeAssocS1ConnEstabAtt(Integer value) {
        this.ueAssocS1ConnEstabAtt = value;
    }

    /**
     * Gets the value of the ueAssocS1ConnEstabSucc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUeAssocS1ConnEstabSucc() {
        return ueAssocS1ConnEstabSucc;
    }

    /**
     * Sets the value of the ueAssocS1ConnEstabSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUeAssocS1ConnEstabSucc(Integer value) {
        this.ueAssocS1ConnEstabSucc = value;
    }

}
