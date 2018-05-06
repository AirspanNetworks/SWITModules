
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
 *         &lt;element name="IBridgeTermSystemDefaultProfileGetResult" type="{http://Airspan.Netspan.WebServices}IBridgeTermSystemDefaultProfileGetResult" minOccurs="0"/>
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
    "iBridgeTermSystemDefaultProfileGetResult"
})
@XmlRootElement(name = "IBridgeTermSystemDefaultProfileGetResponse")
public class IBridgeTermSystemDefaultProfileGetResponse {

    @XmlElement(name = "IBridgeTermSystemDefaultProfileGetResult")
    protected IBridgeTermSystemDefaultProfileGetResult iBridgeTermSystemDefaultProfileGetResult;

    /**
     * Gets the value of the iBridgeTermSystemDefaultProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeTermSystemDefaultProfileGetResult }
     *     
     */
    public IBridgeTermSystemDefaultProfileGetResult getIBridgeTermSystemDefaultProfileGetResult() {
        return iBridgeTermSystemDefaultProfileGetResult;
    }

    /**
     * Sets the value of the iBridgeTermSystemDefaultProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeTermSystemDefaultProfileGetResult }
     *     
     */
    public void setIBridgeTermSystemDefaultProfileGetResult(IBridgeTermSystemDefaultProfileGetResult value) {
        this.iBridgeTermSystemDefaultProfileGetResult = value;
    }

}
