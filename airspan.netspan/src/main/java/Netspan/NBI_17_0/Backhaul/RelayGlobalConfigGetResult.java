
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayGlobalConfigGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayGlobalConfigGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelayGlobalConfigResult" type="{http://Airspan.Netspan.WebServices}RelayGlobalConfigResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayGlobalConfigGetResult", propOrder = {
    "relayGlobalConfigResult"
})
public class RelayGlobalConfigGetResult
    extends WsResponse
{

    @XmlElement(name = "RelayGlobalConfigResult")
    protected RelayGlobalConfigResult relayGlobalConfigResult;

    /**
     * Gets the value of the relayGlobalConfigResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayGlobalConfigResult }
     *     
     */
    public RelayGlobalConfigResult getRelayGlobalConfigResult() {
        return relayGlobalConfigResult;
    }

    /**
     * Sets the value of the relayGlobalConfigResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayGlobalConfigResult }
     *     
     */
    public void setRelayGlobalConfigResult(RelayGlobalConfigResult value) {
        this.relayGlobalConfigResult = value;
    }

}
