
package Netspan.NBI_18_0.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WebUiAccessAction" type="{http://Airspan.Netspan.WebServices}WebUiAccessAction"/&gt;
 *         &lt;element name="TimeoutMins" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "webUiAccessAction",
    "timeoutMins"
})
@XmlRootElement(name = "IBridge2WebUiAccessSet")
public class IBridge2WebUiAccessSet {

    @XmlElement(name = "NodeName")
    protected List<String> nodeName;
    @XmlElement(name = "NodeId")
    protected List<String> nodeId;
    @XmlElement(name = "WebUiAccessAction", required = true)
    @XmlSchemaType(name = "string")
    protected WebUiAccessAction webUiAccessAction;
    @XmlElement(name = "TimeoutMins", required = true, type = Integer.class, nillable = true)
    protected Integer timeoutMins;

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
     * Gets the value of the webUiAccessAction property.
     * 
     * @return
     *     possible object is
     *     {@link WebUiAccessAction }
     *     
     */
    public WebUiAccessAction getWebUiAccessAction() {
        return webUiAccessAction;
    }

    /**
     * Sets the value of the webUiAccessAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUiAccessAction }
     *     
     */
    public void setWebUiAccessAction(WebUiAccessAction value) {
        this.webUiAccessAction = value;
    }

    /**
     * Gets the value of the timeoutMins property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeoutMins() {
        return timeoutMins;
    }

    /**
     * Sets the value of the timeoutMins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeoutMins(Integer value) {
        this.timeoutMins = value;
    }

}
