
package Netspan.NBI_14_50.API.Status;

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
 *         &lt;element name="IBridgeBaseRfStatusGetResult" type="{http://Airspan.Netspan.WebServices}IBridgeBaseRfGetResult" minOccurs="0"/>
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
    "iBridgeBaseRfStatusGetResult"
})
@XmlRootElement(name = "IBridgeBaseRfStatusGetResponse")
public class IBridgeBaseRfStatusGetResponse {

    @XmlElement(name = "IBridgeBaseRfStatusGetResult")
    protected IBridgeBaseRfGetResult iBridgeBaseRfStatusGetResult;

    /**
     * Gets the value of the iBridgeBaseRfStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeBaseRfGetResult }
     *     
     */
    public IBridgeBaseRfGetResult getIBridgeBaseRfStatusGetResult() {
        return iBridgeBaseRfStatusGetResult;
    }

    /**
     * Sets the value of the iBridgeBaseRfStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeBaseRfGetResult }
     *     
     */
    public void setIBridgeBaseRfStatusGetResult(IBridgeBaseRfGetResult value) {
        this.iBridgeBaseRfStatusGetResult = value;
    }

}
