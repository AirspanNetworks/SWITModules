
package Netspan.NBI_17_5.Status;

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
 *         &lt;element name="NodeTimeGetResult" type="{http://Airspan.Netspan.WebServices}NodeTimeStatusGetResult" minOccurs="0"/&gt;
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
    "nodeTimeGetResult"
})
@XmlRootElement(name = "NodeTimeGetResponse")
public class NodeTimeGetResponse {

    @XmlElement(name = "NodeTimeGetResult")
    protected NodeTimeStatusGetResult nodeTimeGetResult;

    /**
     * Gets the value of the nodeTimeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeTimeStatusGetResult }
     *     
     */
    public NodeTimeStatusGetResult getNodeTimeGetResult() {
        return nodeTimeGetResult;
    }

    /**
     * Sets the value of the nodeTimeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeTimeStatusGetResult }
     *     
     */
    public void setNodeTimeGetResult(NodeTimeStatusGetResult value) {
        this.nodeTimeGetResult = value;
    }

}
