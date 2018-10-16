
package Netspan.NBI_16_5.Inventory;

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
 *         &lt;element name="DiscoveryTaskListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/&gt;
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
    "discoveryTaskListResult"
})
@XmlRootElement(name = "DiscoveryTaskListResponse")
public class DiscoveryTaskListResponse {

    @XmlElement(name = "DiscoveryTaskListResult")
    protected NameResult discoveryTaskListResult;

    /**
     * Gets the value of the discoveryTaskListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getDiscoveryTaskListResult() {
        return discoveryTaskListResult;
    }

    /**
     * Sets the value of the discoveryTaskListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setDiscoveryTaskListResult(NameResult value) {
        this.discoveryTaskListResult = value;
    }

}
