
package Netspan.NBI_15_5.FaultManagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AlarmHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlarmId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlarmTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AlarmType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://Airspan.Netspan.WebServices}SourceType"/>
 *         &lt;element name="SourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceIfIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SourceMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlarmInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://Airspan.Netspan.WebServices}Severity"/>
 *         &lt;element name="ChangeType" type="{http://Airspan.Netspan.WebServices}AlarmHistoryChangeType"/>
 *         &lt;element name="ChangeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmHistory", propOrder = {
    "alarmId",
    "alarmTypeId",
    "alarmType",
    "sourceType",
    "sourceName",
    "sourceId",
    "sourceIfIndex",
    "sourceMacAddress",
    "sourceUniqueId",
    "alarmInfo",
    "severity",
    "changeType",
    "changeTime"
})
public class AlarmHistory {

    @XmlElement(name = "AlarmId", required = true, type = Integer.class, nillable = true)
    protected Integer alarmId;
    @XmlElement(name = "AlarmTypeId", required = true, type = Integer.class, nillable = true)
    protected Integer alarmTypeId;
    @XmlElement(name = "AlarmType")
    protected String alarmType;
    @XmlElement(name = "SourceType", required = true, nillable = true)
    protected String sourceType;
    @XmlElement(name = "SourceName")
    protected String sourceName;
    @XmlElement(name = "SourceId")
    protected String sourceId;
    @XmlElement(name = "SourceIfIndex", required = true, type = Integer.class, nillable = true)
    protected Integer sourceIfIndex;
    @XmlElement(name = "SourceMacAddress")
    protected String sourceMacAddress;
    @XmlElement(name = "SourceUniqueId")
    protected String sourceUniqueId;
    @XmlElement(name = "AlarmInfo")
    protected String alarmInfo;
    @XmlElement(name = "Severity", required = true)
    @XmlSchemaType(name = "string")
    protected Severity severity;
    @XmlElement(name = "ChangeType", required = true)
    @XmlSchemaType(name = "string")
    protected AlarmHistoryChangeType changeType;
    @XmlElement(name = "ChangeTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeTime;

    /**
     * Gets the value of the alarmId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlarmId() {
        return alarmId;
    }

    /**
     * Sets the value of the alarmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlarmId(Integer value) {
        this.alarmId = value;
    }

    /**
     * Gets the value of the alarmTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlarmTypeId() {
        return alarmTypeId;
    }

    /**
     * Sets the value of the alarmTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlarmTypeId(Integer value) {
        this.alarmTypeId = value;
    }

    /**
     * Gets the value of the alarmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * Sets the value of the alarmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmType(String value) {
        this.alarmType = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the sourceIfIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceIfIndex() {
        return sourceIfIndex;
    }

    /**
     * Sets the value of the sourceIfIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceIfIndex(Integer value) {
        this.sourceIfIndex = value;
    }

    /**
     * Gets the value of the sourceMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceMacAddress() {
        return sourceMacAddress;
    }

    /**
     * Sets the value of the sourceMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceMacAddress(String value) {
        this.sourceMacAddress = value;
    }

    /**
     * Gets the value of the sourceUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUniqueId() {
        return sourceUniqueId;
    }

    /**
     * Sets the value of the sourceUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUniqueId(String value) {
        this.sourceUniqueId = value;
    }

    /**
     * Gets the value of the alarmInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmInfo() {
        return alarmInfo;
    }

    /**
     * Sets the value of the alarmInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmInfo(String value) {
        this.alarmInfo = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Severity }
     *     
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Severity }
     *     
     */
    public void setSeverity(Severity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmHistoryChangeType }
     *     
     */
    public AlarmHistoryChangeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmHistoryChangeType }
     *     
     */
    public void setChangeType(AlarmHistoryChangeType value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the changeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeTime() {
        return changeTime;
    }

    /**
     * Sets the value of the changeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeTime(XMLGregorianCalendar value) {
        this.changeTime = value;
    }

}
