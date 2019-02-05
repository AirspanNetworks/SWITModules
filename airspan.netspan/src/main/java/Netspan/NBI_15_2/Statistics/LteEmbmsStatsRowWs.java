
package Netspan.NBI_15_2.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteEmbmsStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteEmbmsStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2ConnSetupAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2ConnSetupSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2ConnSetupFailStd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2ConnSetupFailLinkLoss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2SessionStartAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2SessionStartSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2SessionStartFailSpec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2SessionStartFailLinkLoss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2SessionStartFailUnSpec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2SessionStopAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2SessionStopSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2SessionStopFailLinkLoss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="M2SessionStopFailOther" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncPduCountType0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncPduCountType1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncPduCountType3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncByteType0" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SyncByteType1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SyncByteType3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SyncSyncSeqDiscard" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncSyncPduDropWrongTeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncSyncByteDropWrongTeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncSyncSduDropOtherReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncSyncSeqCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncDiscardedSyncSeqCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellSyncSync2RlcPduCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellSyncSync2RlcByteCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellSyncSync2RlcSyncSeqCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteEmbmsStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "m2ConnSetupAtt",
    "m2ConnSetupSucc",
    "m2ConnSetupFailStd",
    "m2ConnSetupFailLinkLoss",
    "m2SessionStartAtt",
    "m2SessionStartSucc",
    "m2SessionStartFailSpec",
    "m2SessionStartFailLinkLoss",
    "m2SessionStartFailUnSpec",
    "m2SessionStopAtt",
    "m2SessionStopSucc",
    "m2SessionStopFailLinkLoss",
    "m2SessionStopFailOther",
    "syncPduCountType0",
    "syncPduCountType1",
    "syncPduCountType3",
    "syncByteType0",
    "syncByteType1",
    "syncByteType3",
    "syncSyncSeqDiscard",
    "syncSyncPduDropWrongTeId",
    "syncSyncByteDropWrongTeId",
    "syncSyncSduDropOtherReason",
    "syncSyncSeqCount",
    "syncDiscardedSyncSeqCount",
    "cellSyncSync2RlcPduCount",
    "cellSyncSync2RlcByteCount",
    "cellSyncSync2RlcSyncSeqCount"
})
public class LteEmbmsStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "M2ConnSetupAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2ConnSetupAtt;
    @XmlElementRef(name = "M2ConnSetupSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2ConnSetupSucc;
    @XmlElementRef(name = "M2ConnSetupFailStd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2ConnSetupFailStd;
    @XmlElementRef(name = "M2ConnSetupFailLinkLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2ConnSetupFailLinkLoss;
    @XmlElementRef(name = "M2SessionStartAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2SessionStartAtt;
    @XmlElementRef(name = "M2SessionStartSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2SessionStartSucc;
    @XmlElementRef(name = "M2SessionStartFailSpec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2SessionStartFailSpec;
    @XmlElementRef(name = "M2SessionStartFailLinkLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2SessionStartFailLinkLoss;
    @XmlElementRef(name = "M2SessionStartFailUnSpec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2SessionStartFailUnSpec;
    @XmlElementRef(name = "M2SessionStopAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2SessionStopAtt;
    @XmlElementRef(name = "M2SessionStopSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2SessionStopSucc;
    @XmlElementRef(name = "M2SessionStopFailLinkLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2SessionStopFailLinkLoss;
    @XmlElementRef(name = "M2SessionStopFailOther", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2SessionStopFailOther;
    @XmlElementRef(name = "SyncPduCountType0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncPduCountType0;
    @XmlElementRef(name = "SyncPduCountType1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncPduCountType1;
    @XmlElementRef(name = "SyncPduCountType3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncPduCountType3;
    @XmlElementRef(name = "SyncByteType0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> syncByteType0;
    @XmlElementRef(name = "SyncByteType1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> syncByteType1;
    @XmlElementRef(name = "SyncByteType3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> syncByteType3;
    @XmlElementRef(name = "SyncSyncSeqDiscard", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncSyncSeqDiscard;
    @XmlElementRef(name = "SyncSyncPduDropWrongTeId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncSyncPduDropWrongTeId;
    @XmlElementRef(name = "SyncSyncByteDropWrongTeId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncSyncByteDropWrongTeId;
    @XmlElementRef(name = "SyncSyncSduDropOtherReason", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncSyncSduDropOtherReason;
    @XmlElementRef(name = "SyncSyncSeqCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncSyncSeqCount;
    @XmlElementRef(name = "SyncDiscardedSyncSeqCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncDiscardedSyncSeqCount;
    @XmlElementRef(name = "CellSyncSync2RlcPduCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellSyncSync2RlcPduCount;
    @XmlElementRef(name = "CellSyncSync2RlcByteCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellSyncSync2RlcByteCount;
    @XmlElementRef(name = "CellSyncSync2RlcSyncSeqCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellSyncSync2RlcSyncSeqCount;

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
     * Gets the value of the m2ConnSetupAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2ConnSetupAtt() {
        return m2ConnSetupAtt;
    }

    /**
     * Sets the value of the m2ConnSetupAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2ConnSetupAtt(JAXBElement<Integer> value) {
        this.m2ConnSetupAtt = value;
    }

    /**
     * Gets the value of the m2ConnSetupSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2ConnSetupSucc() {
        return m2ConnSetupSucc;
    }

    /**
     * Sets the value of the m2ConnSetupSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2ConnSetupSucc(JAXBElement<Integer> value) {
        this.m2ConnSetupSucc = value;
    }

    /**
     * Gets the value of the m2ConnSetupFailStd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2ConnSetupFailStd() {
        return m2ConnSetupFailStd;
    }

    /**
     * Sets the value of the m2ConnSetupFailStd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2ConnSetupFailStd(JAXBElement<Integer> value) {
        this.m2ConnSetupFailStd = value;
    }

    /**
     * Gets the value of the m2ConnSetupFailLinkLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2ConnSetupFailLinkLoss() {
        return m2ConnSetupFailLinkLoss;
    }

    /**
     * Sets the value of the m2ConnSetupFailLinkLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2ConnSetupFailLinkLoss(JAXBElement<Integer> value) {
        this.m2ConnSetupFailLinkLoss = value;
    }

    /**
     * Gets the value of the m2SessionStartAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2SessionStartAtt() {
        return m2SessionStartAtt;
    }

    /**
     * Sets the value of the m2SessionStartAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2SessionStartAtt(JAXBElement<Integer> value) {
        this.m2SessionStartAtt = value;
    }

    /**
     * Gets the value of the m2SessionStartSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2SessionStartSucc() {
        return m2SessionStartSucc;
    }

    /**
     * Sets the value of the m2SessionStartSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2SessionStartSucc(JAXBElement<Integer> value) {
        this.m2SessionStartSucc = value;
    }

    /**
     * Gets the value of the m2SessionStartFailSpec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2SessionStartFailSpec() {
        return m2SessionStartFailSpec;
    }

    /**
     * Sets the value of the m2SessionStartFailSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2SessionStartFailSpec(JAXBElement<Integer> value) {
        this.m2SessionStartFailSpec = value;
    }

    /**
     * Gets the value of the m2SessionStartFailLinkLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2SessionStartFailLinkLoss() {
        return m2SessionStartFailLinkLoss;
    }

    /**
     * Sets the value of the m2SessionStartFailLinkLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2SessionStartFailLinkLoss(JAXBElement<Integer> value) {
        this.m2SessionStartFailLinkLoss = value;
    }

    /**
     * Gets the value of the m2SessionStartFailUnSpec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2SessionStartFailUnSpec() {
        return m2SessionStartFailUnSpec;
    }

    /**
     * Sets the value of the m2SessionStartFailUnSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2SessionStartFailUnSpec(JAXBElement<Integer> value) {
        this.m2SessionStartFailUnSpec = value;
    }

    /**
     * Gets the value of the m2SessionStopAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2SessionStopAtt() {
        return m2SessionStopAtt;
    }

    /**
     * Sets the value of the m2SessionStopAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2SessionStopAtt(JAXBElement<Integer> value) {
        this.m2SessionStopAtt = value;
    }

    /**
     * Gets the value of the m2SessionStopSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2SessionStopSucc() {
        return m2SessionStopSucc;
    }

    /**
     * Sets the value of the m2SessionStopSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2SessionStopSucc(JAXBElement<Integer> value) {
        this.m2SessionStopSucc = value;
    }

    /**
     * Gets the value of the m2SessionStopFailLinkLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2SessionStopFailLinkLoss() {
        return m2SessionStopFailLinkLoss;
    }

    /**
     * Sets the value of the m2SessionStopFailLinkLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2SessionStopFailLinkLoss(JAXBElement<Integer> value) {
        this.m2SessionStopFailLinkLoss = value;
    }

    /**
     * Gets the value of the m2SessionStopFailOther property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2SessionStopFailOther() {
        return m2SessionStopFailOther;
    }

    /**
     * Sets the value of the m2SessionStopFailOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2SessionStopFailOther(JAXBElement<Integer> value) {
        this.m2SessionStopFailOther = value;
    }

    /**
     * Gets the value of the syncPduCountType0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncPduCountType0() {
        return syncPduCountType0;
    }

    /**
     * Sets the value of the syncPduCountType0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncPduCountType0(JAXBElement<Integer> value) {
        this.syncPduCountType0 = value;
    }

    /**
     * Gets the value of the syncPduCountType1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncPduCountType1() {
        return syncPduCountType1;
    }

    /**
     * Sets the value of the syncPduCountType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncPduCountType1(JAXBElement<Integer> value) {
        this.syncPduCountType1 = value;
    }

    /**
     * Gets the value of the syncPduCountType3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncPduCountType3() {
        return syncPduCountType3;
    }

    /**
     * Sets the value of the syncPduCountType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncPduCountType3(JAXBElement<Integer> value) {
        this.syncPduCountType3 = value;
    }

    /**
     * Gets the value of the syncByteType0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSyncByteType0() {
        return syncByteType0;
    }

    /**
     * Sets the value of the syncByteType0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSyncByteType0(JAXBElement<Long> value) {
        this.syncByteType0 = value;
    }

    /**
     * Gets the value of the syncByteType1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSyncByteType1() {
        return syncByteType1;
    }

    /**
     * Sets the value of the syncByteType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSyncByteType1(JAXBElement<Long> value) {
        this.syncByteType1 = value;
    }

    /**
     * Gets the value of the syncByteType3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSyncByteType3() {
        return syncByteType3;
    }

    /**
     * Sets the value of the syncByteType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSyncByteType3(JAXBElement<Long> value) {
        this.syncByteType3 = value;
    }

    /**
     * Gets the value of the syncSyncSeqDiscard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncSyncSeqDiscard() {
        return syncSyncSeqDiscard;
    }

    /**
     * Sets the value of the syncSyncSeqDiscard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncSyncSeqDiscard(JAXBElement<Integer> value) {
        this.syncSyncSeqDiscard = value;
    }

    /**
     * Gets the value of the syncSyncPduDropWrongTeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncSyncPduDropWrongTeId() {
        return syncSyncPduDropWrongTeId;
    }

    /**
     * Sets the value of the syncSyncPduDropWrongTeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncSyncPduDropWrongTeId(JAXBElement<Integer> value) {
        this.syncSyncPduDropWrongTeId = value;
    }

    /**
     * Gets the value of the syncSyncByteDropWrongTeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncSyncByteDropWrongTeId() {
        return syncSyncByteDropWrongTeId;
    }

    /**
     * Sets the value of the syncSyncByteDropWrongTeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncSyncByteDropWrongTeId(JAXBElement<Integer> value) {
        this.syncSyncByteDropWrongTeId = value;
    }

    /**
     * Gets the value of the syncSyncSduDropOtherReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncSyncSduDropOtherReason() {
        return syncSyncSduDropOtherReason;
    }

    /**
     * Sets the value of the syncSyncSduDropOtherReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncSyncSduDropOtherReason(JAXBElement<Integer> value) {
        this.syncSyncSduDropOtherReason = value;
    }

    /**
     * Gets the value of the syncSyncSeqCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncSyncSeqCount() {
        return syncSyncSeqCount;
    }

    /**
     * Sets the value of the syncSyncSeqCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncSyncSeqCount(JAXBElement<Integer> value) {
        this.syncSyncSeqCount = value;
    }

    /**
     * Gets the value of the syncDiscardedSyncSeqCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncDiscardedSyncSeqCount() {
        return syncDiscardedSyncSeqCount;
    }

    /**
     * Sets the value of the syncDiscardedSyncSeqCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncDiscardedSyncSeqCount(JAXBElement<Integer> value) {
        this.syncDiscardedSyncSeqCount = value;
    }

    /**
     * Gets the value of the cellSyncSync2RlcPduCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellSyncSync2RlcPduCount() {
        return cellSyncSync2RlcPduCount;
    }

    /**
     * Sets the value of the cellSyncSync2RlcPduCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellSyncSync2RlcPduCount(JAXBElement<Integer> value) {
        this.cellSyncSync2RlcPduCount = value;
    }

    /**
     * Gets the value of the cellSyncSync2RlcByteCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellSyncSync2RlcByteCount() {
        return cellSyncSync2RlcByteCount;
    }

    /**
     * Sets the value of the cellSyncSync2RlcByteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellSyncSync2RlcByteCount(JAXBElement<Integer> value) {
        this.cellSyncSync2RlcByteCount = value;
    }

    /**
     * Gets the value of the cellSyncSync2RlcSyncSeqCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellSyncSync2RlcSyncSeqCount() {
        return cellSyncSync2RlcSyncSeqCount;
    }

    /**
     * Sets the value of the cellSyncSync2RlcSyncSeqCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellSyncSync2RlcSyncSeqCount(JAXBElement<Integer> value) {
        this.cellSyncSync2RlcSyncSeqCount = value;
    }

}
