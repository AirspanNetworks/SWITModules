
package Netspan.NBI_15_2.Lte;

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
 *         &lt;element name="MobilityProfile" type="{http://Airspan.Netspan.WebServices}EnbMobilityProfile" minOccurs="0"/&gt;
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
    "mobilityProfile"
})
@XmlRootElement(name = "MobilityProfileClone")
public class MobilityProfileClone {

    @XmlElement(name = "CloneFromName")
    protected String cloneFromName;
    @XmlElement(name = "MobilityProfile")
    protected EnbMobilityProfile mobilityProfile;

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
     * Gets the value of the mobilityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbMobilityProfile }
     *     
     */
    public EnbMobilityProfile getMobilityProfile() {
        return mobilityProfile;
    }

    /**
     * Sets the value of the mobilityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbMobilityProfile }
     *     
     */
    public void setMobilityProfile(EnbMobilityProfile value) {
        this.mobilityProfile = value;
    }

}
