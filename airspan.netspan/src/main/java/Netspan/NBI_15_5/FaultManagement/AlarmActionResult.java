
package Netspan.NBI_15_5.FaultManagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmActionResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="AlarmActionResult" type="{http://Airspan.Netspan.WebServices}AlarmResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmActionResult", propOrder = {
    "alarmActionResult"
})
public class AlarmActionResult
    extends WsResponse
{

    @XmlElement(name = "AlarmActionResult")
    protected List<AlarmResult> alarmActionResult;

    /**
     * Gets the value of the alarmActionResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmActionResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmActionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmResult }
     * 
     * 
     */
    public List<AlarmResult> getAlarmActionResult() {
        if (alarmActionResult == null) {
            alarmActionResult = new ArrayList<AlarmResult>();
        }
        return this.alarmActionResult;
    }

}
