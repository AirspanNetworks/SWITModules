
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
 *         &lt;element name="DiscoveryTaskAddSnmpV2Result" type="{http://Airspan.Netspan.WebServices}WsResponse" minOccurs="0"/&gt;
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
    "discoveryTaskAddSnmpV2Result"
})
@XmlRootElement(name = "DiscoveryTaskAddSnmpV2Response")
public class DiscoveryTaskAddSnmpV2Response {

    @XmlElement(name = "DiscoveryTaskAddSnmpV2Result")
    protected WsResponse discoveryTaskAddSnmpV2Result;

    /**
     * Gets the value of the discoveryTaskAddSnmpV2Result property.
     * 
     * @return
     *     possible object is
     *     {@link WsResponse }
     *     
     */
    public WsResponse getDiscoveryTaskAddSnmpV2Result() {
        return discoveryTaskAddSnmpV2Result;
    }

    /**
     * Sets the value of the discoveryTaskAddSnmpV2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsResponse }
     *     
     */
    public void setDiscoveryTaskAddSnmpV2Result(WsResponse value) {
        this.discoveryTaskAddSnmpV2Result = value;
    }

}
