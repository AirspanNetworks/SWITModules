
package Netspan.NBI_16_0.Statistics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatsLteEtwsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsLteEtwsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="EtwsResult" type="{http://Airspan.Netspan.WebServices}NodeLteEtwsStatsResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsLteEtwsResponse", propOrder = {
    "etwsResult"
})
public class StatsLteEtwsResponse
    extends WsResponse
{

    @XmlElement(name = "EtwsResult")
    protected List<NodeLteEtwsStatsResult> etwsResult;

    /**
     * Gets the value of the etwsResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etwsResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtwsResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeLteEtwsStatsResult }
     * 
     * 
     */
    public List<NodeLteEtwsStatsResult> getEtwsResult() {
        if (etwsResult == null) {
            etwsResult = new ArrayList<NodeLteEtwsStatsResult>();
        }
        return this.etwsResult;
    }

}
