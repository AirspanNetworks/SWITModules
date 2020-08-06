
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
 *         &lt;element name="FaultManagementProfile" type="{http://Airspan.Netspan.WebServices}EnbFaultManagementProfile" minOccurs="0"/&gt;
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
    "faultManagementProfile"
})
@XmlRootElement(name = "FaultManagementProfileCreate")
public class FaultManagementProfileCreate {

    @XmlElement(name = "FaultManagementProfile")
    protected EnbFaultManagementProfile faultManagementProfile;

    /**
     * Gets the value of the faultManagementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbFaultManagementProfile }
     *     
     */
    public EnbFaultManagementProfile getFaultManagementProfile() {
        return faultManagementProfile;
    }

    /**
     * Sets the value of the faultManagementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbFaultManagementProfile }
     *     
     */
    public void setFaultManagementProfile(EnbFaultManagementProfile value) {
        this.faultManagementProfile = value;
    }

}
