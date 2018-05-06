
package Netspan.NBI_14_50.API.Backhaul;

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
 *         &lt;element name="IBridgeTermPnpConfigDeleteResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "iBridgeTermPnpConfigDeleteResult"
})
@XmlRootElement(name = "IBridgeTermPnpConfigDeleteResponse")
public class IBridgeTermPnpConfigDeleteResponse {

    @XmlElement(name = "IBridgeTermPnpConfigDeleteResult")
    protected NodeActionResult iBridgeTermPnpConfigDeleteResult;

    /**
     * Gets the value of the iBridgeTermPnpConfigDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIBridgeTermPnpConfigDeleteResult() {
        return iBridgeTermPnpConfigDeleteResult;
    }

    /**
     * Sets the value of the iBridgeTermPnpConfigDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIBridgeTermPnpConfigDeleteResult(NodeActionResult value) {
        this.iBridgeTermPnpConfigDeleteResult = value;
    }

}
