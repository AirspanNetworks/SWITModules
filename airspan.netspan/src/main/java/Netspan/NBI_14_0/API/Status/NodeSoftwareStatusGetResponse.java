
package Netspan.NBI_14_0.API.Status;

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
 *         &lt;element name="NodeSoftwareStatusGetResult" type="{http://Airspan.Netspan.WebServices}NodeSoftwareGetResult" minOccurs="0"/>
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
    "nodeSoftwareStatusGetResult"
})
@XmlRootElement(name = "NodeSoftwareStatusGetResponse")
public class NodeSoftwareStatusGetResponse {

    @XmlElement(name = "NodeSoftwareStatusGetResult")
    protected NodeSoftwareGetResult nodeSoftwareStatusGetResult;

    /**
     * Gets the value of the nodeSoftwareStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSoftwareGetResult }
     *     
     */
    public NodeSoftwareGetResult getNodeSoftwareStatusGetResult() {
        return nodeSoftwareStatusGetResult;
    }

    /**
     * Sets the value of the nodeSoftwareStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSoftwareGetResult }
     *     
     */
    public void setNodeSoftwareStatusGetResult(NodeSoftwareGetResult value) {
        this.nodeSoftwareStatusGetResult = value;
    }

}
