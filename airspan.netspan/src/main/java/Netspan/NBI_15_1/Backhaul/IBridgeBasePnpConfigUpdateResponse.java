
package Netspan.NBI_15_1.Backhaul;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IBridgeBasePnpConfigUpdateResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iBridgeBasePnpConfigUpdateResult"
})
@XmlRootElement(name = "IBridgeBasePnpConfigUpdateResponse")
public class IBridgeBasePnpConfigUpdateResponse {

    @XmlElement(name = "IBridgeBasePnpConfigUpdateResult")
    protected NodeActionResult iBridgeBasePnpConfigUpdateResult;

    /**
     * Gets the value of the iBridgeBasePnpConfigUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIBridgeBasePnpConfigUpdateResult() {
        return iBridgeBasePnpConfigUpdateResult;
    }

    /**
     * Sets the value of the iBridgeBasePnpConfigUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIBridgeBasePnpConfigUpdateResult(NodeActionResult value) {
        this.iBridgeBasePnpConfigUpdateResult = value;
    }

}
