
package Netspan.NBI_15_5.Server;

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
 *         &lt;element name="NodeFileUploadConfigGetResult" type="{http://Airspan.Netspan.WebServices}NodeFileUploadGetWs" minOccurs="0"/>
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
    "nodeFileUploadConfigGetResult"
})
@XmlRootElement(name = "NodeFileUploadConfigGetResponse")
public class NodeFileUploadConfigGetResponse {

    @XmlElement(name = "NodeFileUploadConfigGetResult")
    protected NodeFileUploadGetWs nodeFileUploadConfigGetResult;

    /**
     * Gets the value of the nodeFileUploadConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeFileUploadGetWs }
     *     
     */
    public NodeFileUploadGetWs getNodeFileUploadConfigGetResult() {
        return nodeFileUploadConfigGetResult;
    }

    /**
     * Sets the value of the nodeFileUploadConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeFileUploadGetWs }
     *     
     */
    public void setNodeFileUploadConfigGetResult(NodeFileUploadGetWs value) {
        this.nodeFileUploadConfigGetResult = value;
    }

}
