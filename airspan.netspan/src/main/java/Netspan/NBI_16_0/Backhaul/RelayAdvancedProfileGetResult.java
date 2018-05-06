
package Netspan.NBI_16_0.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayAdvancedProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayAdvancedProfileGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="RelayAdvancedProfileResult" type="{http://Airspan.Netspan.WebServices}RelayAdvancedProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayAdvancedProfileGetResult", propOrder = {
    "relayAdvancedProfileResult"
})
public class RelayAdvancedProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "RelayAdvancedProfileResult")
    protected List<RelayAdvancedProfileResult> relayAdvancedProfileResult;

    /**
     * Gets the value of the relayAdvancedProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relayAdvancedProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelayAdvancedProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelayAdvancedProfileResult }
     * 
     * 
     */
    public List<RelayAdvancedProfileResult> getRelayAdvancedProfileResult() {
        if (relayAdvancedProfileResult == null) {
            relayAdvancedProfileResult = new ArrayList<RelayAdvancedProfileResult>();
        }
        return this.relayAdvancedProfileResult;
    }

}
