
package Netspan.NBI_14_50.API.Statistics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatsBsIbBaseAirInterfaceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsBsIbBaseAirInterfaceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="StatisticsResult" type="{http://Airspan.Netspan.WebServices}NodeBsIbBaseAirInterfaceStatsResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsBsIbBaseAirInterfaceResponse", propOrder = {
    "statisticsResult"
})
public class StatsBsIbBaseAirInterfaceResponse
    extends WsResponse
{

    @XmlElement(name = "StatisticsResult")
    protected List<NodeBsIbBaseAirInterfaceStatsResult> statisticsResult;

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
     * {@link NodeBsIbBaseAirInterfaceStatsResult }
     * 
     * 
     */
    public List<NodeBsIbBaseAirInterfaceStatsResult> getStatisticsResult() {
        if (statisticsResult == null) {
            statisticsResult = new ArrayList<NodeBsIbBaseAirInterfaceStatsResult>();
        }
        return this.statisticsResult;
    }

}
