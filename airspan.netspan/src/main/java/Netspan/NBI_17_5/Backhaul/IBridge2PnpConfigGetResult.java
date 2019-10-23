
package Netspan.NBI_17_5.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2PnpConfigGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2PnpConfigGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IBridge2PnpConfig" type="{http://Airspan.Netspan.WebServices}IBridge2PnpConfigWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2PnpConfigGetResult", propOrder = {
    "iBridge2PnpConfig"
})
public class IBridge2PnpConfigGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridge2PnpConfig")
    protected List<IBridge2PnpConfigWs> iBridge2PnpConfig;

    /**
     * Gets the value of the iBridge2PnpConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridge2PnpConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridge2PnpConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridge2PnpConfigWs }
     * 
     * 
     */
    public List<IBridge2PnpConfigWs> getIBridge2PnpConfig() {
        if (iBridge2PnpConfig == null) {
            iBridge2PnpConfig = new ArrayList<IBridge2PnpConfigWs>();
        }
        return this.iBridge2PnpConfig;
    }

}
