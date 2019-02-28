
package Netspan.NBI_17_0.Status;

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
 *         &lt;element name="NodeNlSyncStatusGetResult" type="{http://Airspan.Netspan.WebServices}NodeNLSyncStatusGetResult" minOccurs="0"/&gt;
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
    "nodeNlSyncStatusGetResult"
})
@XmlRootElement(name = "NodeNlSyncStatusGetResponse")
public class NodeNlSyncStatusGetResponse {

    @XmlElement(name = "NodeNlSyncStatusGetResult")
    protected NodeNLSyncStatusGetResult nodeNlSyncStatusGetResult;

    /**
     * Gets the value of the nodeNlSyncStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeNLSyncStatusGetResult }
     *     
     */
    public NodeNLSyncStatusGetResult getNodeNlSyncStatusGetResult() {
        return nodeNlSyncStatusGetResult;
    }

    /**
     * Sets the value of the nodeNlSyncStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeNLSyncStatusGetResult }
     *     
     */
    public void setNodeNlSyncStatusGetResult(NodeNLSyncStatusGetResult value) {
        this.nodeNlSyncStatusGetResult = value;
    }

}
