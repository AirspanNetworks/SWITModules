
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
 *         &lt;element name="IBridgeTermConfigGetResult" type="{http://Airspan.Netspan.WebServices}IbTermConfigGetResult" minOccurs="0"/&gt;
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
    "iBridgeTermConfigGetResult"
})
@XmlRootElement(name = "IBridgeTermConfigGetResponse")
public class IBridgeTermConfigGetResponse {

    @XmlElement(name = "IBridgeTermConfigGetResult")
    protected IbTermConfigGetResult iBridgeTermConfigGetResult;

    /**
     * Gets the value of the iBridgeTermConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IbTermConfigGetResult }
     *     
     */
    public IbTermConfigGetResult getIBridgeTermConfigGetResult() {
        return iBridgeTermConfigGetResult;
    }

    /**
     * Sets the value of the iBridgeTermConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbTermConfigGetResult }
     *     
     */
    public void setIBridgeTermConfigGetResult(IbTermConfigGetResult value) {
        this.iBridgeTermConfigGetResult = value;
    }

}
