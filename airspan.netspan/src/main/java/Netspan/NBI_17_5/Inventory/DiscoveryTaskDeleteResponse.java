
package Netspan.NBI_17_5.Inventory;

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
 *         &lt;element name="DiscoveryTaskDeleteResult" type="{http://Airspan.Netspan.WebServices}DiscoveryTaskActionResult" minOccurs="0"/&gt;
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
    "discoveryTaskDeleteResult"
})
@XmlRootElement(name = "DiscoveryTaskDeleteResponse")
public class DiscoveryTaskDeleteResponse {

    @XmlElement(name = "DiscoveryTaskDeleteResult")
    protected DiscoveryTaskActionResult discoveryTaskDeleteResult;

    /**
     * Gets the value of the discoveryTaskDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link DiscoveryTaskActionResult }
     *     
     */
    public DiscoveryTaskActionResult getDiscoveryTaskDeleteResult() {
        return discoveryTaskDeleteResult;
    }

    /**
     * Sets the value of the discoveryTaskDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoveryTaskActionResult }
     *     
     */
    public void setDiscoveryTaskDeleteResult(DiscoveryTaskActionResult value) {
        this.discoveryTaskDeleteResult = value;
    }

}
