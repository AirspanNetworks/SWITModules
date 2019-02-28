
package Netspan.NBI_17_0.Backhaul;

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
 *         &lt;element name="IBridge2PnpConfigDeleteResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "iBridge2PnpConfigDeleteResult"
})
@XmlRootElement(name = "IBridge2PnpConfigDeleteResponse")
public class IBridge2PnpConfigDeleteResponse {

    @XmlElement(name = "IBridge2PnpConfigDeleteResult")
    protected NodeActionResult iBridge2PnpConfigDeleteResult;

    /**
     * Gets the value of the iBridge2PnpConfigDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIBridge2PnpConfigDeleteResult() {
        return iBridge2PnpConfigDeleteResult;
    }

    /**
     * Sets the value of the iBridge2PnpConfigDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIBridge2PnpConfigDeleteResult(NodeActionResult value) {
        this.iBridge2PnpConfigDeleteResult = value;
    }

}
