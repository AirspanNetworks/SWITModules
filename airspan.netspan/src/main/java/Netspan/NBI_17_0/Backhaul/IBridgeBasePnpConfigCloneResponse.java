
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
 *         &lt;element name="IBridgeBasePnpConfigCloneResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "iBridgeBasePnpConfigCloneResult"
})
@XmlRootElement(name = "IBridgeBasePnpConfigCloneResponse")
public class IBridgeBasePnpConfigCloneResponse {

    @XmlElement(name = "IBridgeBasePnpConfigCloneResult")
    protected NodeActionResult iBridgeBasePnpConfigCloneResult;

    /**
     * Gets the value of the iBridgeBasePnpConfigCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIBridgeBasePnpConfigCloneResult() {
        return iBridgeBasePnpConfigCloneResult;
    }

    /**
     * Sets the value of the iBridgeBasePnpConfigCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIBridgeBasePnpConfigCloneResult(NodeActionResult value) {
        this.iBridgeBasePnpConfigCloneResult = value;
    }

}
