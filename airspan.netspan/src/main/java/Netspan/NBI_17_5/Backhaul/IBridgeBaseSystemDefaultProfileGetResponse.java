
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
 *         &lt;element name="IBridgeBaseSystemDefaultProfileGetResult" type="{http://Airspan.Netspan.WebServices}IBridgeBaseSystemDefaultProfileGetResult" minOccurs="0"/&gt;
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
    "iBridgeBaseSystemDefaultProfileGetResult"
})
@XmlRootElement(name = "IBridgeBaseSystemDefaultProfileGetResponse")
public class IBridgeBaseSystemDefaultProfileGetResponse {

    @XmlElement(name = "IBridgeBaseSystemDefaultProfileGetResult")
    protected IBridgeBaseSystemDefaultProfileGetResult iBridgeBaseSystemDefaultProfileGetResult;

    /**
     * Gets the value of the iBridgeBaseSystemDefaultProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeBaseSystemDefaultProfileGetResult }
     *     
     */
    public IBridgeBaseSystemDefaultProfileGetResult getIBridgeBaseSystemDefaultProfileGetResult() {
        return iBridgeBaseSystemDefaultProfileGetResult;
    }

    /**
     * Sets the value of the iBridgeBaseSystemDefaultProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeBaseSystemDefaultProfileGetResult }
     *     
     */
    public void setIBridgeBaseSystemDefaultProfileGetResult(IBridgeBaseSystemDefaultProfileGetResult value) {
        this.iBridgeBaseSystemDefaultProfileGetResult = value;
    }

}
