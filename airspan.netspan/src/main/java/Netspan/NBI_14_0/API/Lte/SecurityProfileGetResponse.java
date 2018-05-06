
package Netspan.NBI_14_0.API.Lte;

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
 *         &lt;element name="SecurityProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteSecurityProfileGetResult" minOccurs="0"/>
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
    "securityProfileGetResult"
})
@XmlRootElement(name = "SecurityProfileGetResponse")
public class SecurityProfileGetResponse {

    @XmlElement(name = "SecurityProfileGetResult")
    protected LteSecurityProfileGetResult securityProfileGetResult;

    /**
     * Gets the value of the securityProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSecurityProfileGetResult }
     *     
     */
    public LteSecurityProfileGetResult getSecurityProfileGetResult() {
        return securityProfileGetResult;
    }

    /**
     * Sets the value of the securityProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSecurityProfileGetResult }
     *     
     */
    public void setSecurityProfileGetResult(LteSecurityProfileGetResult value) {
        this.securityProfileGetResult = value;
    }

}
