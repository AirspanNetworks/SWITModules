
package Netspan.NBI_15_1.FaultManagement;

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
 *         &lt;element name="AlarmListChangedResult" type="{http://Airspan.Netspan.WebServices}AlarmResultList" minOccurs="0"/>
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
