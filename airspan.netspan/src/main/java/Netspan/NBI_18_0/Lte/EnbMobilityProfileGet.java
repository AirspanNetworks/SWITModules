
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbMobilityProfileGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbMobilityProfileGet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}EnbMobilityProfile"&gt;
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
@XmlType(name = "EnbMobilityProfileGet", propOrder = {
    "profileType"
})
public class EnbMobilityProfileGet
    extends EnbMobilityProfile
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
