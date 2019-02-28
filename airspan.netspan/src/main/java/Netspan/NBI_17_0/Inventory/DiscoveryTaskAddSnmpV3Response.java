
package Netspan.NBI_17_0.Inventory;

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
 *         &lt;element name="DiscoveryTaskAddSnmpV3Result" type="{http://Airspan.Netspan.WebServices}WsResponse" minOccurs="0"/&gt;
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
    "discoveryTaskAddSnmpV3Result"
})
@XmlRootElement(name = "DiscoveryTaskAddSnmpV3Response")
public class DiscoveryTaskAddSnmpV3Response {

    @XmlElement(name = "DiscoveryTaskAddSnmpV3Result")
    protected WsResponse discoveryTaskAddSnmpV3Result;

    /**
     * Gets the value of the discoveryTaskAddSnmpV3Result property.
     * 
     * @return
     *     possible object is
     *     {@link WsResponse }
     *     
     */
    public WsResponse getDiscoveryTaskAddSnmpV3Result() {
        return discoveryTaskAddSnmpV3Result;
    }

    /**
     * Sets the value of the discoveryTaskAddSnmpV3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsResponse }
     *     
     */
    public void setDiscoveryTaskAddSnmpV3Result(WsResponse value) {
        this.discoveryTaskAddSnmpV3Result = value;
    }

}
