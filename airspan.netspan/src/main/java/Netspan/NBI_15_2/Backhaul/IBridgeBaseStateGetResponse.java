
package Netspan.NBI_15_2.Backhaul;

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
 *         &lt;element name="IBridgeBaseStateGetResult" type="{http://Airspan.Netspan.WebServices}IbBaseStateGetResult" minOccurs="0"/>
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
    "iBridgeBaseStateGetResult"
})
@XmlRootElement(name = "IBridgeBaseStateGetResponse")
public class IBridgeBaseStateGetResponse {

    @XmlElement(name = "IBridgeBaseStateGetResult")
    protected IbBaseStateGetResult iBridgeBaseStateGetResult;

    /**
     * Gets the value of the iBridgeBaseStateGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IbBaseStateGetResult }
     *     
     */
    public IbBaseStateGetResult getIBridgeBaseStateGetResult() {
        return iBridgeBaseStateGetResult;
    }

    /**
     * Sets the value of the iBridgeBaseStateGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbBaseStateGetResult }
     *     
     */
    public void setIBridgeBaseStateGetResult(IbBaseStateGetResult value) {
        this.iBridgeBaseStateGetResult = value;
    }

}
