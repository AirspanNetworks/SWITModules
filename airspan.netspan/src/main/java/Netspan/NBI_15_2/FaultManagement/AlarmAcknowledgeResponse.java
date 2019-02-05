
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlarmAcknowledgeResult" type="{http://Airspan.Netspan.WebServices}AlarmActionResult" minOccurs="0"/&gt;
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
