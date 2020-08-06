
package Netspan.NBI_18_0.FaultManagement;

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
 *         &lt;element name="AlarmDeleteResult" type="{http://Airspan.Netspan.WebServices}AlarmActionResult" minOccurs="0"/&gt;
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
    "alarmDeleteResult"
})
@XmlRootElement(name = "AlarmDeleteResponse")
public class AlarmDeleteResponse {

    @XmlElement(name = "AlarmDeleteResult")
    protected AlarmActionResult alarmDeleteResult;

    /**
     * Gets the value of the alarmDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmActionResult }
     *     
     */
    public AlarmActionResult getAlarmDeleteResult() {
        return alarmDeleteResult;
    }

    /**
     * Sets the value of the alarmDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmActionResult }
     *     
     */
    public void setAlarmDeleteResult(AlarmActionResult value) {
        this.alarmDeleteResult = value;
    }

}
