
package Netspan.NBI_15_1.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iBridgeBasePnpConfigGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iBridgeBasePnpConfigGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="iBridgeBasePnpConfig" type="{http://Airspan.Netspan.WebServices}IBridgeBasePnpConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iBridgeBasePnpConfigGetResult", propOrder = {
    "iBridgeBasePnpConfig"
})
public class IBridgeBasePnpConfigGetResult
    extends WsResponse
{

    protected List<IBridgeBasePnpConfig> iBridgeBasePnpConfig;

    /**
     * Gets the value of the iBridgeBasePnpConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridgeBasePnpConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridgeBasePnpConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeBasePnpConfig }
     * 
     * 
     */
    public List<IBridgeBasePnpConfig> getIBridgeBasePnpConfig() {
        if (iBridgeBasePnpConfig == null) {
            iBridgeBasePnpConfig = new ArrayList<IBridgeBasePnpConfig>();
        }
        return this.iBridgeBasePnpConfig;
    }

}
