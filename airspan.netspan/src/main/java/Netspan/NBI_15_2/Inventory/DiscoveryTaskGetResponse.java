
package Netspan.NBI_15_2.Inventory;

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
 *         &lt;element name="DiscoveryTaskGetResult" type="{http://Airspan.Netspan.WebServices}DiscoveryTaskDetailGetResult" minOccurs="0"/&gt;
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
    "discoveryTaskGetResult"
})
@XmlRootElement(name = "DiscoveryTaskGetResponse")
public class DiscoveryTaskGetResponse {

    @XmlElement(name = "DiscoveryTaskGetResult")
    protected DiscoveryTaskDetailGetResult discoveryTaskGetResult;

    /**
     * Gets the value of the discoveryTaskGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link DiscoveryTaskDetailGetResult }
     *     
     */
    public DiscoveryTaskDetailGetResult getDiscoveryTaskGetResult() {
        return discoveryTaskGetResult;
    }

    /**
     * Sets the value of the discoveryTaskGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoveryTaskDetailGetResult }
     *     
     */
    public void setDiscoveryTaskGetResult(DiscoveryTaskDetailGetResult value) {
        this.discoveryTaskGetResult = value;
    }

}
