
package Netspan.NBI_14_0.API.Statistics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatsLteCellLevelRadioBearerQosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsLteCellLevelRadioBearerQosResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="NodeSensorResult" type="{http://Airspan.Netspan.WebServices}NodeLteRbStatsResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsLteCellLevelRadioBearerQosResponse", propOrder = {
    "nodeSensorResult"
})
public class StatsLteCellLevelRadioBearerQosResponse
    extends WsResponse
{

    @XmlElement(name = "NodeSensorResult")
    protected List<NodeLteRbStatsResult> nodeSensorResult;

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
     * {@link NodeLteRbStatsResult }
     * 
     * 
     */
    public List<NodeLteRbStatsResult> getNodeSensorResult() {
        if (nodeSensorResult == null) {
            nodeSensorResult = new ArrayList<NodeLteRbStatsResult>();
        }
        return this.nodeSensorResult;
    }

}
