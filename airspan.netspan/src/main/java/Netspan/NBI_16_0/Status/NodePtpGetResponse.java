
package Netspan.NBI_16_0.Status;

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
 *         &lt;element name="NodePtpGetResult" type="{http://Airspan.Netspan.WebServices}NodePtpGetResult" minOccurs="0"/>
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
    "nodePtpGetResult"
})
@XmlRootElement(name = "NodePtpGetResponse")
public class NodePtpGetResponse {

    @XmlElement(name = "NodePtpGetResult")
    protected NodePtpGetResult nodePtpGetResult;

    /**
     * Gets the value of the nodePtpGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodePtpGetResult }
     *     
     */
    public NodePtpGetResult getNodePtpGetResult() {
        return nodePtpGetResult;
    }

    /**
     * Sets the value of the nodePtpGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodePtpGetResult }
     *     
     */
    public void setNodePtpGetResult(NodePtpGetResult value) {
        this.nodePtpGetResult = value;
    }

}
