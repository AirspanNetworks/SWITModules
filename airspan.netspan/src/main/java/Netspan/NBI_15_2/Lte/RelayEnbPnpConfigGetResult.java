
package Netspan.NBI_15_2.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayEnbPnpConfigGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayEnbPnpConfigGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PnpConfig" type="{http://Airspan.Netspan.WebServices}RelayEnbPnpConfig" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayEnbPnpConfigGetResult", propOrder = {
    "pnpConfig"
})
public class RelayEnbPnpConfigGetResult
    extends WsResponse
{

    @XmlElement(name = "PnpConfig")
    protected List<RelayEnbPnpConfig> pnpConfig;

    /**
     * Gets the value of the pnpConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnpConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnpConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelayEnbPnpConfig }
     * 
     * 
     */
    public List<RelayEnbPnpConfig> getPnpConfig() {
        if (pnpConfig == null) {
            pnpConfig = new ArrayList<RelayEnbPnpConfig>();
        }
        return this.pnpConfig;
    }

}
