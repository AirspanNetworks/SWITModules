
package Netspan.NBI_16_0.FaultManagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmHistoryResultList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmHistoryResultList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="AlarmHistory" type="{http://Airspan.Netspan.WebServices}AlarmHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmHistoryResultList", propOrder = {
    "alarmHistory"
})
public class AlarmHistoryResultList
    extends WsResponse
{

    @XmlElement(name = "AlarmHistory")
    protected List<AlarmHistory> alarmHistory;

    /**
     * Gets the value of the alarmHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmHistory }
     * 
     * 
     */
    public List<AlarmHistory> getAlarmHistory() {
        if (alarmHistory == null) {
            alarmHistory = new ArrayList<AlarmHistory>();
        }
        return this.alarmHistory;
    }

}
