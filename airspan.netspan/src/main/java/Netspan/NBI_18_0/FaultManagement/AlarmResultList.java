
package Netspan.NBI_18_0.FaultManagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmResultList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmResultList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alarm" type="{http://Airspan.Netspan.WebServices}Alarm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmResultList", propOrder = {
    "alarm"
})
public class AlarmResultList
    extends WsResponse
{

    @XmlElement(name = "Alarm")
    protected List<Alarm> alarm;

    /**
     * Gets the value of the alarm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alarm }
     * 
     * 
     */
    public List<Alarm> getAlarm() {
        if (alarm == null) {
            alarm = new ArrayList<Alarm>();
        }
        return this.alarm;
    }

}
