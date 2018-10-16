
package Netspan.NBI_16_5.FaultManagement;

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
 *         &lt;element name="AlarmListNodeResult" type="{http://Airspan.Netspan.WebServices}AlarmResultList" minOccurs="0"/&gt;
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
    "alarmListNodeResult"
})
@XmlRootElement(name = "AlarmListNodeResponse")
public class AlarmListNodeResponse {

    @XmlElement(name = "AlarmListNodeResult")
    protected AlarmResultList alarmListNodeResult;

    /**
     * Gets the value of the alarmListNodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmResultList }
     *     
     */
    public AlarmResultList getAlarmListNodeResult() {
        return alarmListNodeResult;
    }

    /**
     * Sets the value of the alarmListNodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmResultList }
     *     
     */
    public void setAlarmListNodeResult(AlarmResultList value) {
        this.alarmListNodeResult = value;
    }

}
