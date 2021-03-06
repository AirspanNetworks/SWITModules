
package Netspan.NBI_16_0.Lte;

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
 *         &lt;element name="EnbWiFiActionSetResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "enbWiFiActionSetResult"
})
@XmlRootElement(name = "EnbWiFiActionSetResponse")
public class EnbWiFiActionSetResponse {

    @XmlElement(name = "EnbWiFiActionSetResult")
    protected NodeActionResult enbWiFiActionSetResult;

    /**
     * Gets the value of the enbWiFiActionSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getEnbWiFiActionSetResult() {
        return enbWiFiActionSetResult;
    }

    /**
     * Sets the value of the enbWiFiActionSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setEnbWiFiActionSetResult(NodeActionResult value) {
        this.enbWiFiActionSetResult = value;
    }

}
