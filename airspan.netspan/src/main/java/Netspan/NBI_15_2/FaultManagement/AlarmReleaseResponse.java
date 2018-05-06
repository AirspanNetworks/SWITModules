
package Netspan.NBI_15_2.FaultManagement;

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
 *         &lt;element name="AlarmReleaseResult" type="{http://Airspan.Netspan.WebServices}AlarmActionResult" minOccurs="0"/>
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
    "alarmReleaseResult"
})
@XmlRootElement(name = "AlarmReleaseResponse")
public class AlarmReleaseResponse {

    @XmlElement(name = "AlarmReleaseResult")
    protected AlarmActionResult alarmReleaseResult;

    /**
     * Gets the value of the alarmReleaseResult property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmActionResult }
     *     
     */
    public AlarmActionResult getAlarmReleaseResult() {
        return alarmReleaseResult;
    }

    /**
     * Sets the value of the alarmReleaseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmActionResult }
     *     
     */
    public void setAlarmReleaseResult(AlarmActionResult value) {
        this.alarmReleaseResult = value;
    }

}
