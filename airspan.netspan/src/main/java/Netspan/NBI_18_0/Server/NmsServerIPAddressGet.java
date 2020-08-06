
package Netspan.NBI_18_0.Server;

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
 *         &lt;element name="IPAddressType" type="{http://Airspan.Netspan.WebServices}IPAddressTypes"/&gt;
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
    "ipAddressType"
})
@XmlRootElement(name = "NmsServerIPAddressGet")
public class NmsServerIPAddressGet {

    @XmlElement(name = "IPAddressType", required = true)
    @XmlSchemaType(name = "string")
    protected IPAddressTypes ipAddressType;

    /**
     * Gets the value of the ipAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link IPAddressTypes }
     *     
     */
    public IPAddressTypes getIPAddressType() {
        return ipAddressType;
    }

    /**
     * Sets the value of the ipAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddressTypes }
     *     
     */
    public void setIPAddressType(IPAddressTypes value) {
        this.ipAddressType = value;
    }

}
