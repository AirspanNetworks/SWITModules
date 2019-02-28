
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
 *         &lt;element name="IBridgeTermPnpConfigGetResult" type="{http://Airspan.Netspan.WebServices}iBridgeTermPnpConfigGetResult" minOccurs="0"/&gt;
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
    "iBridgeTermPnpConfigGetResult"
})
@XmlRootElement(name = "IBridgeTermPnpConfigGetResponse")
public class IBridgeTermPnpConfigGetResponse {

    @XmlElement(name = "IBridgeTermPnpConfigGetResult")
    protected IBridgeTermPnpConfigGetResult iBridgeTermPnpConfigGetResult;

    /**
     * Gets the value of the iBridgeTermPnpConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeTermPnpConfigGetResult }
     *     
     */
    public IBridgeTermPnpConfigGetResult getIBridgeTermPnpConfigGetResult() {
        return iBridgeTermPnpConfigGetResult;
    }

    /**
     * Sets the value of the iBridgeTermPnpConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeTermPnpConfigGetResult }
     *     
     */
    public void setIBridgeTermPnpConfigGetResult(IBridgeTermPnpConfigGetResult value) {
        this.iBridgeTermPnpConfigGetResult = value;
    }

}
