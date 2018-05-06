
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
 *         &lt;element name="IBridgeBaseConfigGetResult" type="{http://Airspan.Netspan.WebServices}IbBaseConfigGetResult" minOccurs="0"/>
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
    "iBridgeBaseConfigGetResult"
})
@XmlRootElement(name = "IBridgeBaseConfigGetResponse")
public class IBridgeBaseConfigGetResponse {

    @XmlElement(name = "IBridgeBaseConfigGetResult")
    protected IbBaseConfigGetResult iBridgeBaseConfigGetResult;

    /**
     * Gets the value of the iBridgeBaseConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IbBaseConfigGetResult }
     *     
     */
    public IbBaseConfigGetResult getIBridgeBaseConfigGetResult() {
        return iBridgeBaseConfigGetResult;
    }

    /**
     * Sets the value of the iBridgeBaseConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbBaseConfigGetResult }
     *     
     */
    public void setIBridgeBaseConfigGetResult(IbBaseConfigGetResult value) {
        this.iBridgeBaseConfigGetResult = value;
    }

}
