
package Netspan.NBI_17_0.Server;

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
 *         &lt;element name="NodeFileUploadConfigSetResult" type="{http://Airspan.Netspan.WebServices}WsResponse" minOccurs="0"/&gt;
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
    "nodeFileUploadConfigSetResult"
})
@XmlRootElement(name = "NodeFileUploadConfigSetResponse")
public class NodeFileUploadConfigSetResponse {

    @XmlElement(name = "NodeFileUploadConfigSetResult")
    protected WsResponse nodeFileUploadConfigSetResult;

    /**
     * Gets the value of the nodeFileUploadConfigSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsResponse }
     *     
     */
    public WsResponse getNodeFileUploadConfigSetResult() {
        return nodeFileUploadConfigSetResult;
    }

    /**
     * Sets the value of the nodeFileUploadConfigSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsResponse }
     *     
     */
    public void setNodeFileUploadConfigSetResult(WsResponse value) {
        this.nodeFileUploadConfigSetResult = value;
    }

}
