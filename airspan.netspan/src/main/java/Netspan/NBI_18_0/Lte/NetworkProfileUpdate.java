
package Netspan.NBI_18_0.Lte;

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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkProfile" type="{http://Airspan.Netspan.WebServices}EnbNetworkProfile" minOccurs="0"/&gt;
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
    "name",
    "networkProfile"
})
@XmlRootElement(name = "NetworkProfileUpdate")
public class NetworkProfileUpdate {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NetworkProfile")
    protected EnbNetworkProfile networkProfile;

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
     * Gets the value of the networkProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbNetworkProfile }
     *     
     */
    public EnbNetworkProfile getNetworkProfile() {
        return networkProfile;
    }

    /**
     * Sets the value of the networkProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbNetworkProfile }
     *     
     */
    public void setNetworkProfile(EnbNetworkProfile value) {
        this.networkProfile = value;
    }

}
