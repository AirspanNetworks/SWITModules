
package Netspan.NBI_15_2.Backhaul;

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
 *         &lt;element name="IBridgeTermPnpConfigUpdateResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "iBridgeTermPnpConfigUpdateResult"
})
@XmlRootElement(name = "IBridgeTermPnpConfigUpdateResponse")
public class IBridgeTermPnpConfigUpdateResponse {

    @XmlElement(name = "IBridgeTermPnpConfigUpdateResult")
    protected NodeActionResult iBridgeTermPnpConfigUpdateResult;

    /**
     * Gets the value of the iBridgeTermPnpConfigUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIBridgeTermPnpConfigUpdateResult() {
        return iBridgeTermPnpConfigUpdateResult;
    }

    /**
     * Sets the value of the iBridgeTermPnpConfigUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIBridgeTermPnpConfigUpdateResult(NodeActionResult value) {
        this.iBridgeTermPnpConfigUpdateResult = value;
    }

}
