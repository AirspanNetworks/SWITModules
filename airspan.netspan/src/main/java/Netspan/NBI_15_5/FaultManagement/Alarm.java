
package Netspan.NBI_15_5.FaultManagement;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Alarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Alarm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlarmId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="AlarmType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlarmTypeId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="AlarmSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlarmInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirstReceived" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastReceived" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AlarmCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Acknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Alarm", propOrder = {
    "alarmId",
    "alarmType",
    "alarmTypeId",
    "alarmSource",
    "alarmInfo",
    "severity",
    "firstReceived",
    "lastReceived",
    "alarmCount",
    "acknowledged",
    "userName"
})
public class Alarm {

    @XmlElement(name = "AlarmId", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger alarmId;
    @XmlElement(name = "AlarmType")
    protected String alarmType;
    @XmlElement(name = "AlarmTypeId", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger alarmTypeId;
    @XmlElement(name = "AlarmSource")
    protected String alarmSource;
    @XmlElement(name = "AlarmInfo")
    protected String alarmInfo;
    @XmlElement(name = "Severity")
    protected int severity;
    @XmlElement(name = "FirstReceived", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstReceived;
    @XmlElement(name = "LastReceived", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReceived;
    @XmlElement(name = "AlarmCount")
    protected int alarmCount;
    @XmlElement(name = "Acknowledged")
    protected boolean acknowledged;
    @XmlElement(name = "UserName")
    protected String userName;

    /**
     * Gets the value of the alarmId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlarmId() {
        return alarmId;
    }

    /**
     * Sets the value of the alarmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlarmId(BigInteger value) {
        this.alarmId = value;
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
     * Gets the value of the alarmTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlarmTypeId() {
        return alarmTypeId;
    }

    /**
     * Sets the value of the alarmTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlarmTypeId(BigInteger value) {
        this.alarmTypeId = value;
    }

    /**
     * Gets the value of the alarmSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmSource() {
        return alarmSource;
    }

    /**
     * Sets the value of the alarmSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmSource(String value) {
        this.alarmSource = value;
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
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     */
    public void setSeverity(int value) {
        this.severity = value;
    }

    /**
     * Gets the value of the firstReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstReceived() {
        return firstReceived;
    }

    /**
     * Sets the value of the firstReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstReceived(XMLGregorianCalendar value) {
        this.firstReceived = value;
    }

    /**
     * Gets the value of the lastReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReceived() {
        return lastReceived;
    }

    /**
     * Sets the value of the lastReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReceived(XMLGregorianCalendar value) {
        this.lastReceived = value;
    }

    /**
     * Gets the value of the alarmCount property.
     * 
     */
    public int getAlarmCount() {
        return alarmCount;
    }

    /**
     * Sets the value of the alarmCount property.
     * 
     */
    public void setAlarmCount(int value) {
        this.alarmCount = value;
    }

    /**
     * Gets the value of the acknowledged property.
     * 
     */
    public boolean isAcknowledged() {
        return acknowledged;
    }

    /**
     * Sets the value of the acknowledged property.
     * 
     */
    public void setAcknowledged(boolean value) {
        this.acknowledged = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
