
package Netspan.NBI_17_0.Server;

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
 *         &lt;element name="NmsUserDeleteResult" type="{http://Airspan.Netspan.WebServices}UserResponse" minOccurs="0"/&gt;
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
    "nmsUserDeleteResult"
})
@XmlRootElement(name = "NmsUserDeleteResponse")
public class NmsUserDeleteResponse {

    @XmlElement(name = "NmsUserDeleteResult")
    protected UserResponse nmsUserDeleteResult;

    /**
     * Gets the value of the nmsUserDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserResponse }
     *     
     */
    public UserResponse getNmsUserDeleteResult() {
        return nmsUserDeleteResult;
    }

    /**
     * Sets the value of the nmsUserDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserResponse }
     *     
     */
    public void setNmsUserDeleteResult(UserResponse value) {
        this.nmsUserDeleteResult = value;
    }

}
