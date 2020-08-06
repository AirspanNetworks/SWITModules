
package Netspan.NBI_18_0.Backhaul;

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
 *         &lt;element name="IBridge2PnpConfigUpdateResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "iBridge2PnpConfigUpdateResult"
})
@XmlRootElement(name = "IBridge2PnpConfigUpdateResponse")
public class IBridge2PnpConfigUpdateResponse {

    @XmlElement(name = "IBridge2PnpConfigUpdateResult")
    protected NodeActionResult iBridge2PnpConfigUpdateResult;

    /**
     * Gets the value of the iBridge2PnpConfigUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIBridge2PnpConfigUpdateResult() {
        return iBridge2PnpConfigUpdateResult;
    }

    /**
     * Sets the value of the iBridge2PnpConfigUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIBridge2PnpConfigUpdateResult(NodeActionResult value) {
        this.iBridge2PnpConfigUpdateResult = value;
    }

}
