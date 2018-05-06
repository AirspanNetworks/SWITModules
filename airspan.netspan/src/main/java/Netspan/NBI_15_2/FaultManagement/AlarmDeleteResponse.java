
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
 *         &lt;element name="AlarmDeleteResult" type="{http://Airspan.Netspan.WebServices}AlarmActionResult" minOccurs="0"/>
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
