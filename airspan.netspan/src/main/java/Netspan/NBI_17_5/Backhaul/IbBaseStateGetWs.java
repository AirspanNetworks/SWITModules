
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbBaseStateGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbBaseStateGetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IBridgeBaseRfState" type="{http://Airspan.Netspan.WebServices}IbBaseStatesGet"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbBaseStateGetWs", propOrder = {
    "name",
    "iBridgeBaseRfState"
})
public class IbBaseStateGetWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IBridgeBaseRfState", required = true)
    @XmlSchemaType(name = "string")
    protected IbBaseStatesGet iBridgeBaseRfState;

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
     * Gets the value of the iBridgeBaseRfState property.
     * 
     * @return
     *     possible object is
     *     {@link IbBaseStatesGet }
     *     
     */
    public IbBaseStatesGet getIBridgeBaseRfState() {
        return iBridgeBaseRfState;
    }

    /**
     * Sets the value of the iBridgeBaseRfState property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbBaseStatesGet }
     *     
     */
    public void setIBridgeBaseRfState(IbBaseStatesGet value) {
        this.iBridgeBaseRfState = value;
    }

}
