
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteHoStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteHoStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraEnbOutAttSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraEnbOutAttDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraEnbOutAttTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraEnbOutAttResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraEnbOutSuccSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraEnbOutSuccDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraEnbOutSuccTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraEnbOutSuccResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutPrepAtt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutAttSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutAttDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutAttTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutAttResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutSuccSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutSuccDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutSuccTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutSuccResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraFreqOutAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraFreqOutSucc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterFreqMeasGapOutAtt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterFreqMeasGapOutSucc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterFreqNoMeasGapOutAtt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterFreqNoMeasGapOutSucc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrxOutAtt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrxOutSucc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NonDrxOutAtt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NonDrxOutSucc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutAttReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterEnbOutSuccReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraEnbOutAttReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraEnbOutSuccReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteHoStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "intraEnbOutAttSum",
    "intraEnbOutAttDesForRadReasons",
    "intraEnbOutAttTimeCritical",
    "intraEnbOutAttResOptimisation",
    "intraEnbOutSuccSum",
    "intraEnbOutSuccDesForRadReasons",
    "intraEnbOutSuccTimeCritical",
    "intraEnbOutSuccResOptimisation",
    "interEnbOutPrepAtt",
    "interEnbOutAttSum",
    "interEnbOutAttDesForRadReasons",
    "interEnbOutAttTimeCritical",
    "interEnbOutAttResOptimisation",
    "interEnbOutSuccSum",
    "interEnbOutSuccDesForRadReasons",
    "interEnbOutSuccTimeCritical",
    "interEnbOutSuccResOptimisation",
    "intraFreqOutAttempts",
    "intraFreqOutSucc",
    "interFreqMeasGapOutAtt",
    "interFreqMeasGapOutSucc",
    "interFreqNoMeasGapOutAtt",
    "interFreqNoMeasGapOutSucc",
    "drxOutAtt",
    "drxOutSucc",
    "nonDrxOutAtt",
    "nonDrxOutSucc",
    "interEnbOutAttReduceLoadInServingCell",
    "interEnbOutSuccReduceLoadInServingCell",
    "intraEnbOutAttReduceLoadInServingCell",
    "intraEnbOutSuccReduceLoadInServingCell"
})
public class LteHoStatsRowWs {

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
    @XmlElement(name = "IntraEnbOutAttSum", required = true, type = Integer.class, nillable = true)
    protected Integer intraEnbOutAttSum;
    @XmlElement(name = "IntraEnbOutAttDesForRadReasons", required = true, type = Integer.class, nillable = true)
    protected Integer intraEnbOutAttDesForRadReasons;
    @XmlElement(name = "IntraEnbOutAttTimeCritical", required = true, type = Integer.class, nillable = true)
    protected Integer intraEnbOutAttTimeCritical;
    @XmlElement(name = "IntraEnbOutAttResOptimisation", required = true, type = Integer.class, nillable = true)
    protected Integer intraEnbOutAttResOptimisation;
    @XmlElement(name = "IntraEnbOutSuccSum", required = true, type = Integer.class, nillable = true)
    protected Integer intraEnbOutSuccSum;
    @XmlElement(name = "IntraEnbOutSuccDesForRadReasons", required = true, type = Integer.class, nillable = true)
    protected Integer intraEnbOutSuccDesForRadReasons;
    @XmlElement(name = "IntraEnbOutSuccTimeCritical", required = true, type = Integer.class, nillable = true)
    protected Integer intraEnbOutSuccTimeCritical;
    @XmlElement(name = "IntraEnbOutSuccResOptimisation", required = true, type = Integer.class, nillable = true)
    protected Integer intraEnbOutSuccResOptimisation;
    @XmlElement(name = "InterEnbOutPrepAtt", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutPrepAtt;
    @XmlElement(name = "InterEnbOutAttSum", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutAttSum;
    @XmlElement(name = "InterEnbOutAttDesForRadReasons", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutAttDesForRadReasons;
    @XmlElement(name = "InterEnbOutAttTimeCritical", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutAttTimeCritical;
    @XmlElement(name = "InterEnbOutAttResOptimisation", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutAttResOptimisation;
    @XmlElement(name = "InterEnbOutSuccSum", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutSuccSum;
    @XmlElement(name = "InterEnbOutSuccDesForRadReasons", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutSuccDesForRadReasons;
    @XmlElement(name = "InterEnbOutSuccTimeCritical", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutSuccTimeCritical;
    @XmlElement(name = "InterEnbOutSuccResOptimisation", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutSuccResOptimisation;
    @XmlElement(name = "IntraFreqOutAttempts", required = true, type = Integer.class, nillable = true)
    protected Integer intraFreqOutAttempts;
    @XmlElement(name = "IntraFreqOutSucc", required = true, type = Integer.class, nillable = true)
    protected Integer intraFreqOutSucc;
    @XmlElement(name = "InterFreqMeasGapOutAtt", required = true, type = Integer.class, nillable = true)
    protected Integer interFreqMeasGapOutAtt;
    @XmlElement(name = "InterFreqMeasGapOutSucc", required = true, type = Integer.class, nillable = true)
    protected Integer interFreqMeasGapOutSucc;
    @XmlElement(name = "InterFreqNoMeasGapOutAtt", required = true, type = Integer.class, nillable = true)
    protected Integer interFreqNoMeasGapOutAtt;
    @XmlElement(name = "InterFreqNoMeasGapOutSucc", required = true, type = Integer.class, nillable = true)
    protected Integer interFreqNoMeasGapOutSucc;
    @XmlElement(name = "DrxOutAtt", required = true, type = Integer.class, nillable = true)
    protected Integer drxOutAtt;
    @XmlElement(name = "DrxOutSucc", required = true, type = Integer.class, nillable = true)
    protected Integer drxOutSucc;
    @XmlElement(name = "NonDrxOutAtt", required = true, type = Integer.class, nillable = true)
    protected Integer nonDrxOutAtt;
    @XmlElement(name = "NonDrxOutSucc", required = true, type = Integer.class, nillable = true)
    protected Integer nonDrxOutSucc;
    @XmlElement(name = "InterEnbOutAttReduceLoadInServingCell", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutAttReduceLoadInServingCell;
    @XmlElement(name = "InterEnbOutSuccReduceLoadInServingCell", required = true, type = Integer.class, nillable = true)
    protected Integer interEnbOutSuccReduceLoadInServingCell;
    @XmlElement(name = "IntraEnbOutAttReduceLoadInServingCell", required = true, type = Integer.class, nillable = true)
    protected Integer intraEnbOutAttReduceLoadInServingCell;
    @XmlElement(name = "IntraEnbOutSuccReduceLoadInServingCell", required = true, type = Integer.class, nillable = true)
    protected Integer intraEnbOutSuccReduceLoadInServingCell;

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
     * Gets the value of the intraEnbOutAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraEnbOutAttSum() {
        return intraEnbOutAttSum;
    }

    /**
     * Sets the value of the intraEnbOutAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraEnbOutAttSum(Integer value) {
        this.intraEnbOutAttSum = value;
    }

    /**
     * Gets the value of the intraEnbOutAttDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraEnbOutAttDesForRadReasons() {
        return intraEnbOutAttDesForRadReasons;
    }

    /**
     * Sets the value of the intraEnbOutAttDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraEnbOutAttDesForRadReasons(Integer value) {
        this.intraEnbOutAttDesForRadReasons = value;
    }

    /**
     * Gets the value of the intraEnbOutAttTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraEnbOutAttTimeCritical() {
        return intraEnbOutAttTimeCritical;
    }

    /**
     * Sets the value of the intraEnbOutAttTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraEnbOutAttTimeCritical(Integer value) {
        this.intraEnbOutAttTimeCritical = value;
    }

    /**
     * Gets the value of the intraEnbOutAttResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraEnbOutAttResOptimisation() {
        return intraEnbOutAttResOptimisation;
    }

    /**
     * Sets the value of the intraEnbOutAttResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraEnbOutAttResOptimisation(Integer value) {
        this.intraEnbOutAttResOptimisation = value;
    }

    /**
     * Gets the value of the intraEnbOutSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraEnbOutSuccSum() {
        return intraEnbOutSuccSum;
    }

    /**
     * Sets the value of the intraEnbOutSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraEnbOutSuccSum(Integer value) {
        this.intraEnbOutSuccSum = value;
    }

    /**
     * Gets the value of the intraEnbOutSuccDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraEnbOutSuccDesForRadReasons() {
        return intraEnbOutSuccDesForRadReasons;
    }

    /**
     * Sets the value of the intraEnbOutSuccDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraEnbOutSuccDesForRadReasons(Integer value) {
        this.intraEnbOutSuccDesForRadReasons = value;
    }

    /**
     * Gets the value of the intraEnbOutSuccTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraEnbOutSuccTimeCritical() {
        return intraEnbOutSuccTimeCritical;
    }

    /**
     * Sets the value of the intraEnbOutSuccTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraEnbOutSuccTimeCritical(Integer value) {
        this.intraEnbOutSuccTimeCritical = value;
    }

    /**
     * Gets the value of the intraEnbOutSuccResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraEnbOutSuccResOptimisation() {
        return intraEnbOutSuccResOptimisation;
    }

    /**
     * Sets the value of the intraEnbOutSuccResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraEnbOutSuccResOptimisation(Integer value) {
        this.intraEnbOutSuccResOptimisation = value;
    }

    /**
     * Gets the value of the interEnbOutPrepAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutPrepAtt() {
        return interEnbOutPrepAtt;
    }

    /**
     * Sets the value of the interEnbOutPrepAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutPrepAtt(Integer value) {
        this.interEnbOutPrepAtt = value;
    }

    /**
     * Gets the value of the interEnbOutAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutAttSum() {
        return interEnbOutAttSum;
    }

    /**
     * Sets the value of the interEnbOutAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutAttSum(Integer value) {
        this.interEnbOutAttSum = value;
    }

    /**
     * Gets the value of the interEnbOutAttDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutAttDesForRadReasons() {
        return interEnbOutAttDesForRadReasons;
    }

    /**
     * Sets the value of the interEnbOutAttDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutAttDesForRadReasons(Integer value) {
        this.interEnbOutAttDesForRadReasons = value;
    }

    /**
     * Gets the value of the interEnbOutAttTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutAttTimeCritical() {
        return interEnbOutAttTimeCritical;
    }

    /**
     * Sets the value of the interEnbOutAttTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutAttTimeCritical(Integer value) {
        this.interEnbOutAttTimeCritical = value;
    }

    /**
     * Gets the value of the interEnbOutAttResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutAttResOptimisation() {
        return interEnbOutAttResOptimisation;
    }

    /**
     * Sets the value of the interEnbOutAttResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutAttResOptimisation(Integer value) {
        this.interEnbOutAttResOptimisation = value;
    }

    /**
     * Gets the value of the interEnbOutSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutSuccSum() {
        return interEnbOutSuccSum;
    }

    /**
     * Sets the value of the interEnbOutSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutSuccSum(Integer value) {
        this.interEnbOutSuccSum = value;
    }

    /**
     * Gets the value of the interEnbOutSuccDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutSuccDesForRadReasons() {
        return interEnbOutSuccDesForRadReasons;
    }

    /**
     * Sets the value of the interEnbOutSuccDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutSuccDesForRadReasons(Integer value) {
        this.interEnbOutSuccDesForRadReasons = value;
    }

    /**
     * Gets the value of the interEnbOutSuccTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutSuccTimeCritical() {
        return interEnbOutSuccTimeCritical;
    }

    /**
     * Sets the value of the interEnbOutSuccTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutSuccTimeCritical(Integer value) {
        this.interEnbOutSuccTimeCritical = value;
    }

    /**
     * Gets the value of the interEnbOutSuccResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutSuccResOptimisation() {
        return interEnbOutSuccResOptimisation;
    }

    /**
     * Sets the value of the interEnbOutSuccResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutSuccResOptimisation(Integer value) {
        this.interEnbOutSuccResOptimisation = value;
    }

    /**
     * Gets the value of the intraFreqOutAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraFreqOutAttempts() {
        return intraFreqOutAttempts;
    }

    /**
     * Sets the value of the intraFreqOutAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraFreqOutAttempts(Integer value) {
        this.intraFreqOutAttempts = value;
    }

    /**
     * Gets the value of the intraFreqOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraFreqOutSucc() {
        return intraFreqOutSucc;
    }

    /**
     * Sets the value of the intraFreqOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraFreqOutSucc(Integer value) {
        this.intraFreqOutSucc = value;
    }

    /**
     * Gets the value of the interFreqMeasGapOutAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterFreqMeasGapOutAtt() {
        return interFreqMeasGapOutAtt;
    }

    /**
     * Sets the value of the interFreqMeasGapOutAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterFreqMeasGapOutAtt(Integer value) {
        this.interFreqMeasGapOutAtt = value;
    }

    /**
     * Gets the value of the interFreqMeasGapOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterFreqMeasGapOutSucc() {
        return interFreqMeasGapOutSucc;
    }

    /**
     * Sets the value of the interFreqMeasGapOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterFreqMeasGapOutSucc(Integer value) {
        this.interFreqMeasGapOutSucc = value;
    }

    /**
     * Gets the value of the interFreqNoMeasGapOutAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterFreqNoMeasGapOutAtt() {
        return interFreqNoMeasGapOutAtt;
    }

    /**
     * Sets the value of the interFreqNoMeasGapOutAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterFreqNoMeasGapOutAtt(Integer value) {
        this.interFreqNoMeasGapOutAtt = value;
    }

    /**
     * Gets the value of the interFreqNoMeasGapOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterFreqNoMeasGapOutSucc() {
        return interFreqNoMeasGapOutSucc;
    }

    /**
     * Sets the value of the interFreqNoMeasGapOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterFreqNoMeasGapOutSucc(Integer value) {
        this.interFreqNoMeasGapOutSucc = value;
    }

    /**
     * Gets the value of the drxOutAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrxOutAtt() {
        return drxOutAtt;
    }

    /**
     * Sets the value of the drxOutAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrxOutAtt(Integer value) {
        this.drxOutAtt = value;
    }

    /**
     * Gets the value of the drxOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrxOutSucc() {
        return drxOutSucc;
    }

    /**
     * Sets the value of the drxOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrxOutSucc(Integer value) {
        this.drxOutSucc = value;
    }

    /**
     * Gets the value of the nonDrxOutAtt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonDrxOutAtt() {
        return nonDrxOutAtt;
    }

    /**
     * Sets the value of the nonDrxOutAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonDrxOutAtt(Integer value) {
        this.nonDrxOutAtt = value;
    }

    /**
     * Gets the value of the nonDrxOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonDrxOutSucc() {
        return nonDrxOutSucc;
    }

    /**
     * Sets the value of the nonDrxOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonDrxOutSucc(Integer value) {
        this.nonDrxOutSucc = value;
    }

    /**
     * Gets the value of the interEnbOutAttReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutAttReduceLoadInServingCell() {
        return interEnbOutAttReduceLoadInServingCell;
    }

    /**
     * Sets the value of the interEnbOutAttReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutAttReduceLoadInServingCell(Integer value) {
        this.interEnbOutAttReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the interEnbOutSuccReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterEnbOutSuccReduceLoadInServingCell() {
        return interEnbOutSuccReduceLoadInServingCell;
    }

    /**
     * Sets the value of the interEnbOutSuccReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterEnbOutSuccReduceLoadInServingCell(Integer value) {
        this.interEnbOutSuccReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the intraEnbOutAttReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraEnbOutAttReduceLoadInServingCell() {
        return intraEnbOutAttReduceLoadInServingCell;
    }

    /**
     * Sets the value of the intraEnbOutAttReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraEnbOutAttReduceLoadInServingCell(Integer value) {
        this.intraEnbOutAttReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the intraEnbOutSuccReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraEnbOutSuccReduceLoadInServingCell() {
        return intraEnbOutSuccReduceLoadInServingCell;
    }

    /**
     * Sets the value of the intraEnbOutSuccReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraEnbOutSuccReduceLoadInServingCell(Integer value) {
        this.intraEnbOutSuccReduceLoadInServingCell = value;
    }

}
