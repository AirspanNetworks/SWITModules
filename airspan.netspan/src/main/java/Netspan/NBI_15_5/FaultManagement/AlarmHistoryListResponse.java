
package Netspan.NBI_15_5.FaultManagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlarmHistoryListResult" type="{http://Airspan.Netspan.WebServices}AlarmHistoryResultList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alarmHistoryListResult"
})
@XmlRootElement(name = "AlarmHistoryListResponse")
public class AlarmHistoryListResponse {

    @XmlElement(name = "AlarmHistoryListResult")
    protected AlarmHistoryResultList alarmHistoryListResult;

    /**
     * Gets the value of the alarmHistoryListResult property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmHistoryResultList }
     *     
     */
    public AlarmHistoryResultList getAlarmHistoryListResult() {
        return alarmHistoryListResult;
    }

    /**
     * Sets the value of the alarmHistoryListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmHistoryResultList }
     *     
     */
    public void setAlarmHistoryListResult(AlarmHistoryResultList value) {
        this.alarmHistoryListResult = value;
    }

}
