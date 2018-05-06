
package Netspan.NBI_15_1.Status;

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
 *         &lt;element name="IBridgeTermRfStatusGetResult" type="{http://Airspan.Netspan.WebServices}IBridgeTermRfGetResult" minOccurs="0"/>
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
    "iBridgeTermRfStatusGetResult"
})
@XmlRootElement(name = "IBridgeTermRfStatusGetResponse")
public class IBridgeTermRfStatusGetResponse {

    @XmlElement(name = "IBridgeTermRfStatusGetResult")
    protected IBridgeTermRfGetResult iBridgeTermRfStatusGetResult;

    /**
     * Gets the value of the iBridgeTermRfStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeTermRfGetResult }
     *     
     */
    public IBridgeTermRfGetResult getIBridgeTermRfStatusGetResult() {
        return iBridgeTermRfStatusGetResult;
    }

    /**
     * Sets the value of the iBridgeTermRfStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeTermRfGetResult }
     *     
     */
    public void setIBridgeTermRfStatusGetResult(IBridgeTermRfGetResult value) {
        this.iBridgeTermRfStatusGetResult = value;
    }

}
