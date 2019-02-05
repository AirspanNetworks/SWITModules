
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbStateGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbStateGetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnbState" type="{http://Airspan.Netspan.WebServices}EnbStatesGet"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbStateGetWs", propOrder = {
    "name",
    "enbState"
})
public class EnbStateGetWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "EnbState", required = true)
    @XmlSchemaType(name = "string")
    protected EnbStatesGet enbState;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the enbState property.
     * 
     * @return
     *     possible object is
     *     {@link EnbStatesGet }
     *     
     */
    public EnbStatesGet getEnbState() {
        return enbState;
    }

    /**
     * Sets the value of the enbState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbStatesGet }
     *     
     */
    public void setEnbState(EnbStatesGet value) {
        this.enbState = value;
    }

}
