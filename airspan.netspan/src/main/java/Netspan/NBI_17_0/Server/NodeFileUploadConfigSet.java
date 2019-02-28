
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
 *         &lt;element name="NodeFileUpload" type="{http://Airspan.Netspan.WebServices}NodeFileUpload" minOccurs="0"/&gt;
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
    "nodeFileUpload"
})
@XmlRootElement(name = "NodeFileUploadConfigSet")
public class NodeFileUploadConfigSet {

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
