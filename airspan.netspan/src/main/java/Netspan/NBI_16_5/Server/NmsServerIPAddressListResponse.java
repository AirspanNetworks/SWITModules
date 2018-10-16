
package Netspan.NBI_16_5.Server;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NmsServerIPAddressListResult" type="{http://Airspan.Netspan.WebServices}NmsServerIPAddressListWs" minOccurs="0"/&gt;
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
    "nmsServerIPAddressListResult"
})
@XmlRootElement(name = "NmsServerIPAddressListResponse")
public class NmsServerIPAddressListResponse {

    @XmlElement(name = "NmsServerIPAddressListResult")
    protected NmsServerIPAddressListWs nmsServerIPAddressListResult;

    /**
     * Gets the value of the nmsServerIPAddressListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NmsServerIPAddressListWs }
     *     
     */
    public NmsServerIPAddressListWs getNmsServerIPAddressListResult() {
        return nmsServerIPAddressListResult;
    }

    /**
     * Sets the value of the nmsServerIPAddressListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NmsServerIPAddressListWs }
     *     
     */
    public void setNmsServerIPAddressListResult(NmsServerIPAddressListWs value) {
        this.nmsServerIPAddressListResult = value;
    }

}
