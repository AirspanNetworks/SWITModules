
package Netspan.NBI_17_0.Statistics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatsLteCellLevelRadioBearerQosPerQciResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsLteCellLevelRadioBearerQosPerQciResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatisticsResult" type="{http://Airspan.Netspan.WebServices}NodeLteRbPerQciStatsResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsLteCellLevelRadioBearerQosPerQciResponse", propOrder = {
    "statisticsResult"
})
public class StatsLteCellLevelRadioBearerQosPerQciResponse
    extends WsResponse
{

    @XmlElement(name = "StatisticsResult")
    protected List<NodeLteRbPerQciStatsResult> statisticsResult;

    /**
     * Gets the value of the statisticsResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statisticsResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatisticsResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeLteRbPerQciStatsResult }
     * 
     * 
     */
    public List<NodeLteRbPerQciStatsResult> getStatisticsResult() {
        if (statisticsResult == null) {
            statisticsResult = new ArrayList<NodeLteRbPerQciStatsResult>();
        }
        return this.statisticsResult;
    }

}
