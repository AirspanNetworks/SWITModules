
package Netspan.NBI_16_0.FaultManagement;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlarmId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="AlarmResultCode" type="{http://Airspan.Netspan.WebServices}AlarmResultValues"/>
 *         &lt;element name="AlarmResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmResult", propOrder = {
    "alarmId",
    "alarmResultCode",
    "alarmResultString"
})
public class AlarmResult {

    @XmlElement(name = "AlarmId", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger alarmId;
    @XmlElement(name = "AlarmResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected AlarmResultValues alarmResultCode;
    @XmlElement(name = "AlarmResultString")
    protected String alarmResultString;

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
     * Gets the value of the alarmResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmResultValues }
     *     
     */
    public AlarmResultValues getAlarmResultCode() {
        return alarmResultCode;
    }

    /**
     * Sets the value of the alarmResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmResultValues }
     *     
     */
    public void setAlarmResultCode(AlarmResultValues value) {
        this.alarmResultCode = value;
    }

    /**
     * Gets the value of the alarmResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmResultString() {
        return alarmResultString;
    }

    /**
     * Sets the value of the alarmResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmResultString(String value) {
        this.alarmResultString = value;
    }

}
