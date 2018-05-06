
package Netspan.NBI_14_0.API.FaultManagement;

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
 *         &lt;element name="AlarmAcknowledgeResult" type="{http://Airspan.Netspan.WebServices}AlarmActionResult" minOccurs="0"/>
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
    "alarmAcknowledgeResult"
})
@XmlRootElement(name = "AlarmAcknowledgeResponse")
public class AlarmAcknowledgeResponse {

    @XmlElement(name = "AlarmAcknowledgeResult")
    protected AlarmActionResult alarmAcknowledgeResult;

    /**
     * Gets the value of the alarmAcknowledgeResult property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmActionResult }
     *     
     */
    public AlarmActionResult getAlarmAcknowledgeResult() {
        return alarmAcknowledgeResult;
    }

    /**
     * Sets the value of the alarmAcknowledgeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmActionResult }
     *     
     */
    public void setAlarmAcknowledgeResult(AlarmActionResult value) {
        this.alarmAcknowledgeResult = value;
    }

}
