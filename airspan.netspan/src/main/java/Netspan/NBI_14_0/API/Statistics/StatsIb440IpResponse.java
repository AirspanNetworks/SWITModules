
package Netspan.NBI_14_0.API.Statistics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatsIb440IpResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsIb440IpResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="NodeSensorResult" type="{http://Airspan.Netspan.WebServices}NodeIb440IpStatsResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsIb440IpResponse", propOrder = {
    "nodeSensorResult"
})
public class StatsIb440IpResponse
    extends WsResponse
{

    @XmlElement(name = "NodeSensorResult")
    protected List<NodeIb440IpStatsResult> nodeSensorResult;

    /**
     * Gets the value of the nodeSensorResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeSensorResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeSensorResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeIb440IpStatsResult }
     * 
     * 
     */
    public List<NodeIb440IpStatsResult> getNodeSensorResult() {
        if (nodeSensorResult == null) {
            nodeSensorResult = new ArrayList<NodeIb440IpStatsResult>();
        }
        return this.nodeSensorResult;
    }

}
