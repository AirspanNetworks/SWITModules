
package Netspan.NBI_17_5.Backhaul;

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
 *         &lt;element name="IBridge2PnpConfigGetResult" type="{http://Airspan.Netspan.WebServices}IBridge2PnpConfigGetResult" minOccurs="0"/&gt;
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
    "iBridge2PnpConfigGetResult"
})
@XmlRootElement(name = "IBridge2PnpConfigGetResponse")
public class IBridge2PnpConfigGetResponse {

    @XmlElement(name = "IBridge2PnpConfigGetResult")
    protected IBridge2PnpConfigGetResult iBridge2PnpConfigGetResult;

    /**
     * Gets the value of the iBridge2PnpConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2PnpConfigGetResult }
     *     
     */
    public IBridge2PnpConfigGetResult getIBridge2PnpConfigGetResult() {
        return iBridge2PnpConfigGetResult;
    }

    /**
     * Sets the value of the iBridge2PnpConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2PnpConfigGetResult }
     *     
     */
    public void setIBridge2PnpConfigGetResult(IBridge2PnpConfigGetResult value) {
        this.iBridge2PnpConfigGetResult = value;
    }

}
