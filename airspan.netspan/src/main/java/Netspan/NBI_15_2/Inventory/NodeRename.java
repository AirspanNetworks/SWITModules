
package Netspan.NBI_15_2.Inventory;

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
 *         &lt;element name="NodeNameOld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeNameNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nodeNameOld",
    "nodeNameNew"
})
@XmlRootElement(name = "NodeRename")
public class NodeRename {

    @XmlElement(name = "NodeNameOld")
    protected String nodeNameOld;
    @XmlElement(name = "NodeNameNew")
    protected String nodeNameNew;

    /**
     * Gets the value of the nodeNameOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeNameOld() {
        return nodeNameOld;
    }

    /**
     * Sets the value of the nodeNameOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeNameOld(String value) {
        this.nodeNameOld = value;
    }

    /**
     * Gets the value of the nodeNameNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeNameNew() {
        return nodeNameNew;
    }

    /**
     * Sets the value of the nodeNameNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeNameNew(String value) {
        this.nodeNameNew = value;
    }

}
