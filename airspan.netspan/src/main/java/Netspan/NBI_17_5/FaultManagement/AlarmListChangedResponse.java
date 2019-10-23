
package Netspan.NBI_17_5.FaultManagement;

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
 *         &lt;element name="AlarmListChangedResult" type="{http://Airspan.Netspan.WebServices}AlarmResultList" minOccurs="0"/&gt;
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
    "alarmListChangedResult"
})
@XmlRootElement(name = "AlarmListChangedResponse")
public class AlarmListChangedResponse {

    @XmlElement(name = "AlarmListChangedResult")
    protected AlarmResultList alarmListChangedResult;

    /**
     * Gets the value of the alarmListChangedResult property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmResultList }
     *     
     */
    public AlarmResultList getAlarmListChangedResult() {
        return alarmListChangedResult;
    }

    /**
     * Sets the value of the alarmListChangedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmResultList }
     *     
     */
    public void setAlarmListChangedResult(AlarmResultList value) {
        this.alarmListChangedResult = value;
    }

}
