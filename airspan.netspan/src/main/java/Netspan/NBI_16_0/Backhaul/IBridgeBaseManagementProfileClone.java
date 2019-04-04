
package Netspan.NBI_16_0.Backhaul;

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
 *         &lt;element name="CloneFromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagementProfile" type="{http://Airspan.Netspan.WebServices}IBridgeBaseManagementProfile" minOccurs="0"/&gt;
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
    "cloneFromName",
    "managementProfile"
})
@XmlRootElement(name = "IBridgeBaseManagementProfileClone")
public class IBridgeBaseManagementProfileClone {

    @XmlElement(name = "CloneFromName")
    protected String cloneFromName;
    @XmlElement(name = "ManagementProfile")
    protected IBridgeBaseManagementProfile managementProfile;

    /**
     * Gets the value of the cloneFromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloneFromName() {
        return cloneFromName;
    }

    /**
     * Sets the value of the cloneFromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloneFromName(String value) {
        this.cloneFromName = value;
    }

    /**
     * Gets the value of the managementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeBaseManagementProfile }
     *     
     */
    public IBridgeBaseManagementProfile getManagementProfile() {
        return managementProfile;
    }

    /**
     * Sets the value of the managementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeBaseManagementProfile }
     *     
     */
    public void setManagementProfile(IBridgeBaseManagementProfile value) {
        this.managementProfile = value;
    }

}
