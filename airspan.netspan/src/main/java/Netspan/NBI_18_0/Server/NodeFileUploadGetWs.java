
package Netspan.NBI_18_0.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeFileUploadGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeFileUploadGetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeFileUpload" type="{http://Airspan.Netspan.WebServices}NodeFileUpload" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeFileUploadGetWs", propOrder = {
    "nodeFileUpload"
})
public class NodeFileUploadGetWs
    extends WsResponse
{

    @XmlElement(name = "NodeFileUpload")
    protected NodeFileUpload nodeFileUpload;

    /**
     * Gets the value of the nodeFileUpload property.
     * 
     * @return
     *     possible object is
     *     {@link NodeFileUpload }
     *     
     */
    public NodeFileUpload getNodeFileUpload() {
        return nodeFileUpload;
    }

    /**
     * Sets the value of the nodeFileUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeFileUpload }
     *     
     */
    public void setNodeFileUpload(NodeFileUpload value) {
        this.nodeFileUpload = value;
    }

}
