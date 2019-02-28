
package Netspan.NBI_17_0.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelaySystemDefaultProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelaySystemDefaultProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelaySystemDefaultProfileResult" type="{http://Airspan.Netspan.WebServices}RelaySystemDefaultProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelaySystemDefaultProfileGetResult", propOrder = {
    "relaySystemDefaultProfileResult"
})
public class RelaySystemDefaultProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "RelaySystemDefaultProfileResult")
    protected List<RelaySystemDefaultProfileResult> relaySystemDefaultProfileResult;

    /**
     * Gets the value of the relaySystemDefaultProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relaySystemDefaultProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelaySystemDefaultProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelaySystemDefaultProfileResult }
     * 
     * 
     */
    public List<RelaySystemDefaultProfileResult> getRelaySystemDefaultProfileResult() {
        if (relaySystemDefaultProfileResult == null) {
            relaySystemDefaultProfileResult = new ArrayList<RelaySystemDefaultProfileResult>();
        }
        return this.relaySystemDefaultProfileResult;
    }

}
