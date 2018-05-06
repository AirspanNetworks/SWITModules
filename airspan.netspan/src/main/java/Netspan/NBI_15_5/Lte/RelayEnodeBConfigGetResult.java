
package Netspan.NBI_15_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayEnodeBConfigGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayEnodeBConfigGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="RelayEnodeBConfig" type="{http://Airspan.Netspan.WebServices}RelayEnodeBConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayEnodeBConfigGetResult", propOrder = {
    "relayEnodeBConfig"
})
public class RelayEnodeBConfigGetResult
    extends WsResponse
{

    @XmlElement(name = "RelayEnodeBConfig")
    protected List<RelayEnodeBConfig> relayEnodeBConfig;

    /**
     * Gets the value of the relayEnodeBConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relayEnodeBConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelayEnodeBConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelayEnodeBConfig }
     * 
     * 
     */
    public List<RelayEnodeBConfig> getRelayEnodeBConfig() {
        if (relayEnodeBConfig == null) {
            relayEnodeBConfig = new ArrayList<RelayEnodeBConfig>();
        }
        return this.relayEnodeBConfig;
    }

}
