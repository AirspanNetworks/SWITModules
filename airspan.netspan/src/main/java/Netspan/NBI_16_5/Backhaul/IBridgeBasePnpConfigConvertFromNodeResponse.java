
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IBridgeBasePnpConfigConvertFromNodeResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iBridgeBasePnpConfigConvertFromNodeResult"
})
@XmlRootElement(name = "IBridgeBasePnpConfigConvertFromNodeResponse")
public class IBridgeBasePnpConfigConvertFromNodeResponse {

    @XmlElement(name = "IBridgeBasePnpConfigConvertFromNodeResult")
    protected NodeActionResult iBridgeBasePnpConfigConvertFromNodeResult;

    /**
     * Gets the value of the iBridgeBasePnpConfigConvertFromNodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIBridgeBasePnpConfigConvertFromNodeResult() {
        return iBridgeBasePnpConfigConvertFromNodeResult;
    }

    /**
     * Sets the value of the iBridgeBasePnpConfigConvertFromNodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIBridgeBasePnpConfigConvertFromNodeResult(NodeActionResult value) {
        this.iBridgeBasePnpConfigConvertFromNodeResult = value;
    }

}
