
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
 *         &lt;element name="IBridge2PnpConfigListResult" type="{http://Airspan.Netspan.WebServices}NodeListResult" minOccurs="0"/&gt;
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
    "iBridge2PnpConfigListResult"
})
@XmlRootElement(name = "IBridge2PnpConfigListResponse")
public class IBridge2PnpConfigListResponse {

    @XmlElement(name = "IBridge2PnpConfigListResult")
    protected NodeListResult iBridge2PnpConfigListResult;

    /**
     * Gets the value of the iBridge2PnpConfigListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeListResult }
     *     
     */
    public NodeListResult getIBridge2PnpConfigListResult() {
        return iBridge2PnpConfigListResult;
    }

    /**
     * Sets the value of the iBridge2PnpConfigListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeListResult }
     *     
     */
    public void setIBridge2PnpConfigListResult(NodeListResult value) {
        this.iBridge2PnpConfigListResult = value;
    }

}
