
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
 *         &lt;element name="IBridgeTermPnpConfigCloneResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "iBridgeTermPnpConfigCloneResult"
})
@XmlRootElement(name = "IBridgeTermPnpConfigCloneResponse")
public class IBridgeTermPnpConfigCloneResponse {

    @XmlElement(name = "IBridgeTermPnpConfigCloneResult")
    protected NodeActionResult iBridgeTermPnpConfigCloneResult;

    /**
     * Gets the value of the iBridgeTermPnpConfigCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIBridgeTermPnpConfigCloneResult() {
        return iBridgeTermPnpConfigCloneResult;
    }

    /**
     * Sets the value of the iBridgeTermPnpConfigCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIBridgeTermPnpConfigCloneResult(NodeActionResult value) {
        this.iBridgeTermPnpConfigCloneResult = value;
    }

}
