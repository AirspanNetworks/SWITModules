
package Netspan.NBI_14_50.API.Backhaul;

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
 *         &lt;element name="IRelayProfile" type="{http://Airspan.Netspan.WebServices}IRelayProfile" minOccurs="0"/>
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
    "iRelayProfile"
})
@XmlRootElement(name = "IRelayProfileCreate")
public class IRelayProfileCreate {

    @XmlElement(name = "IRelayProfile")
    protected IRelayProfile iRelayProfile;

    /**
     * Gets the value of the iRelayProfile property.
     * 
     * @return
     *     possible object is
     *     {@link IRelayProfile }
     *     
     */
    public IRelayProfile getIRelayProfile() {
        return iRelayProfile;
    }

    /**
     * Sets the value of the iRelayProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IRelayProfile }
     *     
     */
    public void setIRelayProfile(IRelayProfile value) {
        this.iRelayProfile = value;
    }

}
