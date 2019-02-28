
package Netspan.NBI_17_0.Inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeProvisioningGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeProvisioningGetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigPending" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConfigQueued" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConfigFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActionPending" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActionQueued" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActionFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeProvisioningGetWs", propOrder = {
    "configPending",
    "configQueued",
    "configFailed",
    "actionPending",
    "actionQueued",
    "actionFailed"
})
public class NodeProvisioningGetWs {

    @XmlElementRef(name = "ConfigPending", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> configPending;
    @XmlElementRef(name = "ConfigQueued", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> configQueued;
    @XmlElementRef(name = "ConfigFailed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> configFailed;
    @XmlElementRef(name = "ActionPending", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> actionPending;
    @XmlElementRef(name = "ActionQueued", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> actionQueued;
    @XmlElementRef(name = "ActionFailed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> actionFailed;

    /**
     * Gets the value of the configPending property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConfigPending() {
        return configPending;
    }

    /**
     * Sets the value of the configPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConfigPending(JAXBElement<Integer> value) {
        this.configPending = value;
    }

    /**
     * Gets the value of the configQueued property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConfigQueued() {
        return configQueued;
    }

    /**
     * Sets the value of the configQueued property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConfigQueued(JAXBElement<Integer> value) {
        this.configQueued = value;
    }

    /**
     * Gets the value of the configFailed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConfigFailed() {
        return configFailed;
    }

    /**
     * Sets the value of the configFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConfigFailed(JAXBElement<Integer> value) {
        this.configFailed = value;
    }

    /**
     * Gets the value of the actionPending property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActionPending() {
        return actionPending;
    }

    /**
     * Sets the value of the actionPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActionPending(JAXBElement<Integer> value) {
        this.actionPending = value;
    }

    /**
     * Gets the value of the actionQueued property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActionQueued() {
        return actionQueued;
    }

    /**
     * Sets the value of the actionQueued property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActionQueued(JAXBElement<Integer> value) {
        this.actionQueued = value;
    }

    /**
     * Gets the value of the actionFailed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActionFailed() {
        return actionFailed;
    }

    /**
     * Sets the value of the actionFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActionFailed(JAXBElement<Integer> value) {
        this.actionFailed = value;
    }

}
