
package Netspan.NBI_16_5.FaultManagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlarmStatus" type="{http://Airspan.Netspan.WebServices}NetspanAlarmStatus"/&gt;
 *         &lt;element name="AlarmStatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alarmStatus",
    "alarmStatusInfo"
})
@XmlRootElement(name = "NetspanSFServerError")
public class NetspanSFServerError {

    @XmlElement(name = "AlarmStatus", required = true)
    @XmlSchemaType(name = "string")
    protected NetspanAlarmStatus alarmStatus;
    @XmlElement(name = "AlarmStatusInfo")
    protected String alarmStatusInfo;

    /**
     * Gets the value of the alarmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NetspanAlarmStatus }
     *     
     */
    public NetspanAlarmStatus getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * Sets the value of the alarmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetspanAlarmStatus }
     *     
     */
    public void setAlarmStatus(NetspanAlarmStatus value) {
        this.alarmStatus = value;
    }

    /**
     * Gets the value of the alarmStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmStatusInfo() {
        return alarmStatusInfo;
    }

    /**
     * Sets the value of the alarmStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmStatusInfo(String value) {
        this.alarmStatusInfo = value;
    }

}
