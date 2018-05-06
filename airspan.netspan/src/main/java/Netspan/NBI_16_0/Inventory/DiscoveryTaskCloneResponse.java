
package Netspan.NBI_16_0.Inventory;

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
 *         &lt;element name="DiscoveryTaskCloneResult" type="{http://Airspan.Netspan.WebServices}DiscoveryTaskActionResult" minOccurs="0"/>
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
    "discoveryTaskCloneResult"
})
@XmlRootElement(name = "DiscoveryTaskCloneResponse")
public class DiscoveryTaskCloneResponse {

    @XmlElement(name = "DiscoveryTaskCloneResult")
    protected DiscoveryTaskActionResult discoveryTaskCloneResult;

    /**
     * Gets the value of the discoveryTaskCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link DiscoveryTaskActionResult }
     *     
     */
    public DiscoveryTaskActionResult getDiscoveryTaskCloneResult() {
        return discoveryTaskCloneResult;
    }

    /**
     * Sets the value of the discoveryTaskCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoveryTaskActionResult }
     *     
     */
    public void setDiscoveryTaskCloneResult(DiscoveryTaskActionResult value) {
        this.discoveryTaskCloneResult = value;
    }

}
