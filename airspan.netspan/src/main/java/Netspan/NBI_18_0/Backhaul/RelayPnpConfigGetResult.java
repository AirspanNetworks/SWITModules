
package Netspan.NBI_18_0.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayPnpConfigGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayPnpConfigGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelayPnpConfig" type="{http://Airspan.Netspan.WebServices}RelayPnpConfigWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayPnpConfigGetResult", propOrder = {
    "relayPnpConfig"
})
public class RelayPnpConfigGetResult
    extends WsResponse
{

    @XmlElement(name = "RelayPnpConfig")
    protected List<RelayPnpConfigWs> relayPnpConfig;

    /**
     * Gets the value of the relayPnpConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relayPnpConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelayPnpConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelayPnpConfigWs }
     * 
     * 
     */
    public List<RelayPnpConfigWs> getRelayPnpConfig() {
        if (relayPnpConfig == null) {
            relayPnpConfig = new ArrayList<RelayPnpConfigWs>();
        }
        return this.relayPnpConfig;
    }

}
