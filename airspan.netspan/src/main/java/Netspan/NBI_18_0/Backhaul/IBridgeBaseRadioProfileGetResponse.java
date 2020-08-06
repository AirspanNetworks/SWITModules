
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
 *         &lt;element name="IBridgeBaseRadioProfileGetResult" type="{http://Airspan.Netspan.WebServices}IbBaseRadioProfileGetResult" minOccurs="0"/&gt;
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
    "iBridgeBaseRadioProfileGetResult"
})
@XmlRootElement(name = "IBridgeBaseRadioProfileGetResponse")
public class IBridgeBaseRadioProfileGetResponse {

    @XmlElement(name = "IBridgeBaseRadioProfileGetResult")
    protected IbBaseRadioProfileGetResult iBridgeBaseRadioProfileGetResult;

    /**
     * Gets the value of the iBridgeBaseRadioProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IbBaseRadioProfileGetResult }
     *     
     */
    public IbBaseRadioProfileGetResult getIBridgeBaseRadioProfileGetResult() {
        return iBridgeBaseRadioProfileGetResult;
    }

    /**
     * Sets the value of the iBridgeBaseRadioProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbBaseRadioProfileGetResult }
     *     
     */
    public void setIBridgeBaseRadioProfileGetResult(IbBaseRadioProfileGetResult value) {
        this.iBridgeBaseRadioProfileGetResult = value;
    }

}
