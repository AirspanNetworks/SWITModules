
package Netspan.NBI_18_0.Status;

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
 *         &lt;element name="NodeCachedLocationStatusGetResult" type="{http://Airspan.Netspan.WebServices}NodeCachedLocationStatusGetListResult" minOccurs="0"/&gt;
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
    "nodeCachedLocationStatusGetResult"
})
@XmlRootElement(name = "NodeCachedLocationStatusGetResponse")
public class NodeCachedLocationStatusGetResponse {

    @XmlElement(name = "NodeCachedLocationStatusGetResult")
    protected NodeCachedLocationStatusGetListResult nodeCachedLocationStatusGetResult;

    /**
     * Gets the value of the nodeCachedLocationStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeCachedLocationStatusGetListResult }
     *     
     */
    public NodeCachedLocationStatusGetListResult getNodeCachedLocationStatusGetResult() {
        return nodeCachedLocationStatusGetResult;
    }

    /**
     * Sets the value of the nodeCachedLocationStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeCachedLocationStatusGetListResult }
     *     
     */
    public void setNodeCachedLocationStatusGetResult(NodeCachedLocationStatusGetListResult value) {
        this.nodeCachedLocationStatusGetResult = value;
    }

}
