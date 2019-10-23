
package Netspan.NBI_17_5.Lte;

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
 *         &lt;element name="NodeNameOrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UeTraceAction" type="{http://Airspan.Netspan.WebServices}ActivateDeactivateValuesWs"/&gt;
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
    "nodeNameOrId",
    "ueTraceAction"
})
@XmlRootElement(name = "EnbUeTraceActionSet")
public class EnbUeTraceActionSet {

    @XmlElement(name = "NodeNameOrId")
    protected String nodeNameOrId;
    @XmlElement(name = "UeTraceAction", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ActivateDeactivateValuesWs ueTraceAction;

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
     * Gets the value of the ueTraceAction property.
     * 
     * @return
     *     possible object is
     *     {@link ActivateDeactivateValuesWs }
     *     
     */
    public ActivateDeactivateValuesWs getUeTraceAction() {
        return ueTraceAction;
    }

    /**
     * Sets the value of the ueTraceAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivateDeactivateValuesWs }
     *     
     */
    public void setUeTraceAction(ActivateDeactivateValuesWs value) {
        this.ueTraceAction = value;
    }

}
