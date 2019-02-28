
package Netspan.NBI_17_0.Inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeManagementMode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementMode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeNameOrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagementMode" type="{http://Airspan.Netspan.WebServices}NodeManagementModes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeManagementMode", propOrder = {
    "nodeNameOrId",
    "managementMode"
})
@XmlSeeAlso({
    ManagementModeResult.class
})
public class NodeManagementMode {

    @XmlElement(name = "NodeNameOrId")
    protected String nodeNameOrId;
    @XmlElementRef(name = "ManagementMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeManagementModes> managementMode;

    /**
     * Gets the value of the nodeNameOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeNameOrId() {
        return nodeNameOrId;
    }

    /**
     * Sets the value of the nodeNameOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeNameOrId(String value) {
        this.nodeNameOrId = value;
    }

    /**
     * Gets the value of the managementMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}
     *     
     */
    public JAXBElement<NodeManagementModes> getManagementMode() {
        return managementMode;
    }

    /**
     * Sets the value of the managementMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}
     *     
     */
    public void setManagementMode(JAXBElement<NodeManagementModes> value) {
        this.managementMode = value;
    }

}
