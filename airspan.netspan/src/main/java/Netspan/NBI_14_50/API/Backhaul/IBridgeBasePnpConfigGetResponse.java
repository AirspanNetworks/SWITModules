
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
 *         &lt;element name="IBridgeBasePnpConfigGetResult" type="{http://Airspan.Netspan.WebServices}iBridgeBasePnpConfigGetResult" minOccurs="0"/>
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
    "iBridgeBasePnpConfigGetResult"
})
@XmlRootElement(name = "IBridgeBasePnpConfigGetResponse")
public class IBridgeBasePnpConfigGetResponse {

    @XmlElement(name = "IBridgeBasePnpConfigGetResult")
    protected IBridgeBasePnpConfigGetResult iBridgeBasePnpConfigGetResult;

    /**
     * Gets the value of the iBridgeBasePnpConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeBasePnpConfigGetResult }
     *     
     */
    public IBridgeBasePnpConfigGetResult getIBridgeBasePnpConfigGetResult() {
        return iBridgeBasePnpConfigGetResult;
    }

    /**
     * Sets the value of the iBridgeBasePnpConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeBasePnpConfigGetResult }
     *     
     */
    public void setIBridgeBasePnpConfigGetResult(IBridgeBasePnpConfigGetResult value) {
        this.iBridgeBasePnpConfigGetResult = value;
    }

}
