
package Netspan.NBI_15_5.Lte;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnbState" type="{http://Airspan.Netspan.WebServices}EnbStates"/>
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
    "enbState"
})
@XmlRootElement(name = "EnbStateSet")
public class EnbStateSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "EnbState", required = true)
    @XmlSchemaType(name = "string")
    protected EnbStates enbState;

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
     * Gets the value of the enbState property.
     * 
     * @return
     *     possible object is
     *     {@link EnbStates }
     *     
     */
    public EnbStates getEnbState() {
        return enbState;
    }

    /**
     * Sets the value of the enbState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbStates }
     *     
     */
    public void setEnbState(EnbStates value) {
        this.enbState = value;
    }

}
