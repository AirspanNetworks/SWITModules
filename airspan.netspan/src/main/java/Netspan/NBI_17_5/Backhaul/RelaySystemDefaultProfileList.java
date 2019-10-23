
package Netspan.NBI_17_5.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}RelayHardwareTypes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProfileType" type="{http://Airspan.Netspan.WebServices}ProfileTypes"/&gt;
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
    "hardwareCategory",
    "profileType"
})
@XmlRootElement(name = "RelaySystemDefaultProfileList")
public class RelaySystemDefaultProfileList {

    @XmlElement(name = "HardwareCategory")
    @XmlSchemaType(name = "string")
    protected List<RelayHardwareTypes> hardwareCategory;
    @XmlElement(name = "ProfileType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ProfileTypes profileType;

    /**
     * Gets the value of the hardwareCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardwareCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardwareCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelayHardwareTypes }
     * 
     * 
     */
    public List<RelayHardwareTypes> getHardwareCategory() {
        if (hardwareCategory == null) {
            hardwareCategory = new ArrayList<RelayHardwareTypes>();
        }
        return this.hardwareCategory;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileTypes }
     *     
     */
    public ProfileTypes getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileTypes }
     *     
     */
    public void setProfileType(ProfileTypes value) {
        this.profileType = value;
    }

}
