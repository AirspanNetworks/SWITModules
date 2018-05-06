
package Netspan.NBI_15_2.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficManagementProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficManagementProfileGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="TrafficManagementProfileResult" type="{http://Airspan.Netspan.WebServices}TrafficManagementProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficManagementProfileGetResult", propOrder = {
    "trafficManagementProfileResult"
})
public class TrafficManagementProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "TrafficManagementProfileResult")
    protected List<TrafficManagementProfileResult> trafficManagementProfileResult;

    /**
     * Gets the value of the trafficManagementProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficManagementProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficManagementProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficManagementProfileResult }
     * 
     * 
     */
    public List<TrafficManagementProfileResult> getTrafficManagementProfileResult() {
        if (trafficManagementProfileResult == null) {
            trafficManagementProfileResult = new ArrayList<TrafficManagementProfileResult>();
        }
        return this.trafficManagementProfileResult;
    }

}
