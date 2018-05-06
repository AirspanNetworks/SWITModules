
package Netspan.NBI_15_2.Status;

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
 *         &lt;element name="NodeGpsGetResult" type="{http://Airspan.Netspan.WebServices}NodeGpsGetResult" minOccurs="0"/>
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
    "nodeGpsGetResult"
})
@XmlRootElement(name = "NodeGpsGetResponse")
public class NodeGpsGetResponse {

    @XmlElement(name = "NodeGpsGetResult")
    protected NodeGpsGetResult nodeGpsGetResult;

    /**
     * Gets the value of the nodeGpsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeGpsGetResult }
     *     
     */
    public NodeGpsGetResult getNodeGpsGetResult() {
        return nodeGpsGetResult;
    }

    /**
     * Sets the value of the nodeGpsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeGpsGetResult }
     *     
     */
    public void setNodeGpsGetResult(NodeGpsGetResult value) {
        this.nodeGpsGetResult = value;
    }

}
