
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


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
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://Airspan.Netspan.WebServices}WiFiAction"/>
 *         &lt;element name="Radio2Dot4GHz" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates"/>
 *         &lt;element name="Radio5GHz" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates"/>
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
    "nodeName",
    "action",
    "radio2Dot4GHz",
    "radio5GHz"
})
@XmlRootElement(name = "EnbWiFiActionSet")
public class EnbWiFiActionSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "Action", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected WiFiAction action;
    @XmlElement(name = "Radio2Dot4GHz", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledStates radio2Dot4GHz;
    @XmlElement(name = "Radio5GHz", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledStates radio5GHz;

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link WiFiAction }
     *     
     */
    public WiFiAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiAction }
     *     
     */
    public void setAction(WiFiAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the radio2Dot4GHz property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledStates }
     *     
     */
    public EnabledDisabledStates getRadio2Dot4GHz() {
        return radio2Dot4GHz;
    }

    /**
     * Sets the value of the radio2Dot4GHz property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledStates }
     *     
     */
    public void setRadio2Dot4GHz(EnabledDisabledStates value) {
        this.radio2Dot4GHz = value;
    }

    /**
     * Gets the value of the radio5GHz property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledStates }
     *     
     */
    public EnabledDisabledStates getRadio5GHz() {
        return radio5GHz;
    }

    /**
     * Sets the value of the radio5GHz property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledStates }
     *     
     */
    public void setRadio5GHz(EnabledDisabledStates value) {
        this.radio5GHz = value;
    }

}
