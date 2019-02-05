
package Netspan.NBI_15_2.Server;

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
 *         &lt;element name="NmsUserCreateResult" type="{http://Airspan.Netspan.WebServices}UserResponse" minOccurs="0"/&gt;
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
    "nmsUserCreateResult"
})
@XmlRootElement(name = "NmsUserCreateResponse")
public class NmsUserCreateResponse {

    @XmlElement(name = "NmsUserCreateResult")
    protected UserResponse nmsUserCreateResult;

    /**
     * Gets the value of the nmsUserCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserResponse }
     *     
     */
    public UserResponse getNmsUserCreateResult() {
        return nmsUserCreateResult;
    }

    /**
     * Sets the value of the nmsUserCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserResponse }
     *     
     */
    public void setNmsUserCreateResult(UserResponse value) {
        this.nmsUserCreateResult = value;
    }

}
