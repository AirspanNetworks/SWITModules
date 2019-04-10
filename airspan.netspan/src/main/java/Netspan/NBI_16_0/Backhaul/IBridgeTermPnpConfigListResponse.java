
package Netspan.NBI_16_0.Backhaul;

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
 *         &lt;element name="IBridgeTermPnpConfigListResult" type="{http://Airspan.Netspan.WebServices}NodeListResult" minOccurs="0"/&gt;
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
    "iBridgeTermPnpConfigListResult"
})
@XmlRootElement(name = "IBridgeTermPnpConfigListResponse")
public class IBridgeTermPnpConfigListResponse {

    @XmlElement(name = "IBridgeTermPnpConfigListResult")
    protected NodeListResult iBridgeTermPnpConfigListResult;

    /**
     * Gets the value of the iBridgeTermPnpConfigListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeListResult }
     *     
     */
    public NodeListResult getIBridgeTermPnpConfigListResult() {
        return iBridgeTermPnpConfigListResult;
    }

    /**
     * Sets the value of the iBridgeTermPnpConfigListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeListResult }
     *     
     */
    public void setIBridgeTermPnpConfigListResult(NodeListResult value) {
        this.iBridgeTermPnpConfigListResult = value;
    }

}
