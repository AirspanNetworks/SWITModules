
package Netspan.NBI_15_5.Backhaul;

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
 *         &lt;element name="IBridgeTermConfigSetResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "iBridgeTermConfigSetResult"
})
@XmlRootElement(name = "IBridgeTermConfigSetResponse")
public class IBridgeTermConfigSetResponse {

    @XmlElement(name = "IBridgeTermConfigSetResult")
    protected NodeActionResult iBridgeTermConfigSetResult;

    /**
     * Gets the value of the iBridgeTermConfigSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIBridgeTermConfigSetResult() {
        return iBridgeTermConfigSetResult;
    }

    /**
     * Sets the value of the iBridgeTermConfigSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIBridgeTermConfigSetResult(NodeActionResult value) {
        this.iBridgeTermConfigSetResult = value;
    }

}
