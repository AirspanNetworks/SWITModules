
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2QosProfileGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2QosProfileGet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}IBridge2QosProfile"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileType" type="{http://Airspan.Netspan.WebServices}ProfileTypes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2QosProfileGet", propOrder = {
    "profileType"
})
public class IBridge2QosProfileGet2
    extends IBridge2QosProfile
{

    @XmlElement(name = "ProfileType", required = true)
    @XmlSchemaType(name = "string")
    protected ProfileTypes profileType;

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
