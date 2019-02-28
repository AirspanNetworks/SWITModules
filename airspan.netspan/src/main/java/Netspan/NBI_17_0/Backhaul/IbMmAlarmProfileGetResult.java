
package Netspan.NBI_17_0.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbMmAlarmProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbMmAlarmProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IBridge2AlarmProfileResult" type="{http://Airspan.Netspan.WebServices}IBridge2AlarmProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbMmAlarmProfileGetResult", propOrder = {
    "iBridge2AlarmProfileResult"
})
public class IbMmAlarmProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridge2AlarmProfileResult")
    protected List<IBridge2AlarmProfileResult> iBridge2AlarmProfileResult;

    /**
     * Gets the value of the iBridge2AlarmProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridge2AlarmProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridge2AlarmProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridge2AlarmProfileResult }
     * 
     * 
     */
    public List<IBridge2AlarmProfileResult> getIBridge2AlarmProfileResult() {
        if (iBridge2AlarmProfileResult == null) {
            iBridge2AlarmProfileResult = new ArrayList<IBridge2AlarmProfileResult>();
        }
        return this.iBridge2AlarmProfileResult;
    }

}
