
package Netspan.NBI_16_5.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IPAddressFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPAddressTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPAddress", propOrder = {
    "ipAddressFrom",
    "ipAddressTo"
})
public class IPAddress {

    @XmlElement(name = "IPAddressFrom")
    protected String ipAddressFrom;
    @XmlElement(name = "IPAddressTo")
    protected String ipAddressTo;

    /**
     * Gets the value of the ipAddressFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddressFrom() {
        return ipAddressFrom;
    }

    /**
     * Sets the value of the ipAddressFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddressFrom(String value) {
        this.ipAddressFrom = value;
    }

    /**
     * Gets the value of the ipAddressTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddressTo() {
        return ipAddressTo;
    }

    /**
     * Sets the value of the ipAddressTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddressTo(String value) {
        this.ipAddressTo = value;
    }

}
