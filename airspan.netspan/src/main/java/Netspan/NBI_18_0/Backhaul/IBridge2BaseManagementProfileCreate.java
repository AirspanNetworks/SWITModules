
package Netspan.NBI_18_0.Backhaul;

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
 *         &lt;element name="ManagementProfile" type="{http://Airspan.Netspan.WebServices}IBridge2BaseManagementProfile" minOccurs="0"/&gt;
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
    "managementProfile"
})
@XmlRootElement(name = "IBridge2BaseManagementProfileCreate")
public class IBridge2BaseManagementProfileCreate {

    @XmlElement(name = "ManagementProfile")
    protected IBridge2BaseManagementProfile managementProfile;

    /**
     * Gets the value of the managementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2BaseManagementProfile }
     *     
     */
    public IBridge2BaseManagementProfile getManagementProfile() {
        return managementProfile;
    }

    /**
     * Sets the value of the managementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2BaseManagementProfile }
     *     
     */
    public void setManagementProfile(IBridge2BaseManagementProfile value) {
        this.managementProfile = value;
    }

}
