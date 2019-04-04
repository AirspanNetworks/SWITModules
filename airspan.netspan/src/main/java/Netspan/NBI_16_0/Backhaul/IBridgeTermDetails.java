
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeTermDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeTermDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}IBridgeTermDetailsPnp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ManagedMode" type="{http://Airspan.Netspan.WebServices}NodeManagementModes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeTermDetails", propOrder = {
    "managedMode"
})
public class IBridgeTermDetails
    extends IBridgeTermDetailsPnp
{

    @XmlElementRef(name = "ManagedMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeManagementModes> managedMode;

    /**
     * Gets the value of the managedMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}
     *     
     */
    public JAXBElement<NodeManagementModes> getManagedMode() {
        return managedMode;
    }

    /**
     * Sets the value of the managedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}
     *     
     */
    public void setManagedMode(JAXBElement<NodeManagementModes> value) {
        this.managedMode = value;
    }

}
