
package Netspan.NBI_18_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


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
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte"/&gt;
 *         &lt;element name="HardwareType" type="{http://Airspan.Netspan.WebServices}EnbModelIds"/&gt;
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
    "nodeName",
    "nodeId",
    "hardwareCategory",
    "hardwareType"
})
@XmlRootElement(name = "NodeCachedLocationStatusGet")
public class NodeCachedLocationStatusGet {

    @XmlElement(name = "NodeName")
    protected List<String> nodeName;
    @XmlElement(name = "NodeId")
    protected List<String> nodeId;
    @XmlElement(name = "HardwareCategory", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CategoriesLte hardwareCategory;
    @XmlElement(name = "HardwareType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnbModelIds hardwareType;

    /**
     * Gets the value of the nodeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNodeName() {
        if (nodeName == null) {
            nodeName = new ArrayList<String>();
        }
        return this.nodeName;
    }

    /**
     * Gets the value of the nodeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNodeId() {
        if (nodeId == null) {
            nodeId = new ArrayList<String>();
        }
        return this.nodeId;
    }

    /**
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriesLte }
     *     
     */
    public CategoriesLte getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriesLte }
     *     
     */
    public void setHardwareCategory(CategoriesLte value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the hardwareType property.
     * 
     * @return
     *     possible object is
     *     {@link EnbModelIds }
     *     
     */
    public EnbModelIds getHardwareType() {
        return hardwareType;
    }

    /**
     * Sets the value of the hardwareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbModelIds }
     *     
     */
    public void setHardwareType(EnbModelIds value) {
        this.hardwareType = value;
    }

}
