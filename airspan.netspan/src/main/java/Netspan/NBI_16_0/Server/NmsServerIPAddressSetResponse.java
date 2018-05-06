
package Netspan.NBI_16_0.Server;

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
 *         &lt;element name="NmsServerIPAddressSetResult" type="{http://Airspan.Netspan.WebServices}WsResponse" minOccurs="0"/>
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
    "nmsServerIPAddressSetResult"
})
@XmlRootElement(name = "NmsServerIPAddressSetResponse")
public class NmsServerIPAddressSetResponse {

    @XmlElement(name = "NmsServerIPAddressSetResult")
    protected WsResponse nmsServerIPAddressSetResult;

    /**
     * Gets the value of the nmsServerIPAddressSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsResponse }
     *     
     */
    public WsResponse getNmsServerIPAddressSetResult() {
        return nmsServerIPAddressSetResult;
    }

    /**
     * Sets the value of the nmsServerIPAddressSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsResponse }
     *     
     */
    public void setNmsServerIPAddressSetResult(WsResponse value) {
        this.nmsServerIPAddressSetResult = value;
    }

}
