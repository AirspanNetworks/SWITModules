
package Netspan.NBI_16_0.Server;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NmsLicenceDeleteResult" type="{http://Airspan.Netspan.WebServices}ItemActionResult" minOccurs="0"/>
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
    "nmsLicenceDeleteResult"
})
@XmlRootElement(name = "NmsLicenceDeleteResponse")
public class NmsLicenceDeleteResponse {

    @XmlElement(name = "NmsLicenceDeleteResult")
    protected ItemActionResult nmsLicenceDeleteResult;

    /**
     * Gets the value of the nmsLicenceDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ItemActionResult }
     *     
     */
    public ItemActionResult getNmsLicenceDeleteResult() {
        return nmsLicenceDeleteResult;
    }

    /**
     * Sets the value of the nmsLicenceDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemActionResult }
     *     
     */
    public void setNmsLicenceDeleteResult(ItemActionResult value) {
        this.nmsLicenceDeleteResult = value;
    }

}
