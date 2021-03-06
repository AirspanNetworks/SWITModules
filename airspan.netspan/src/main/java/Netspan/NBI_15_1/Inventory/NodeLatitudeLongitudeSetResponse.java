
package Netspan.NBI_15_1.Inventory;

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
 *         &lt;element name="NodeLatitudeLongitudeSetResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "nodeLatitudeLongitudeSetResult"
})
@XmlRootElement(name = "NodeLatitudeLongitudeSetResponse")
public class NodeLatitudeLongitudeSetResponse {

    @XmlElement(name = "NodeLatitudeLongitudeSetResult")
    protected NodeActionResult nodeLatitudeLongitudeSetResult;

    /**
     * Gets the value of the nodeLatitudeLongitudeSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getNodeLatitudeLongitudeSetResult() {
        return nodeLatitudeLongitudeSetResult;
    }

    /**
     * Sets the value of the nodeLatitudeLongitudeSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setNodeLatitudeLongitudeSetResult(NodeActionResult value) {
        this.nodeLatitudeLongitudeSetResult = value;
    }

}
