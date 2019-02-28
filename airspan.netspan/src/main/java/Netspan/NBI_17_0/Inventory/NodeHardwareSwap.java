
package Netspan.NBI_17_0.Inventory;

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
 *         &lt;element name="OldNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "oldNode",
    "newNode"
})
@XmlRootElement(name = "NodeHardwareSwap")
public class NodeHardwareSwap {

    @XmlElement(name = "OldNode")
    protected String oldNode;
    @XmlElement(name = "NewNode")
    protected String newNode;

    /**
     * Gets the value of the oldNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldNode() {
        return oldNode;
    }

    /**
     * Sets the value of the oldNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldNode(String value) {
        this.oldNode = value;
    }

    /**
     * Gets the value of the newNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewNode() {
        return newNode;
    }

    /**
     * Sets the value of the newNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewNode(String value) {
        this.newNode = value;
    }

}
