
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayProfileGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayProfileGet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}RelayProfile"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileType" type="{http://Airspan.Netspan.WebServices}ProfileTypes"/&gt;
 *         &lt;element name="ScanModeType" type="{http://Airspan.Netspan.WebServices}ScanModeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayProfileGet", propOrder = {
    "profileType",
    "scanModeType"
})
public class RelayProfileGet2
    extends RelayProfile
{

    @XmlElement(name = "ProfileType", required = true)
    @XmlSchemaType(name = "string")
    protected ProfileTypes profileType;
    @XmlElement(name = "ScanModeType", required = true)
    @XmlSchemaType(name = "string")
    protected ScanModeType scanModeType;

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

    /**
     * Gets the value of the scanModeType property.
     * 
     * @return
     *     possible object is
     *     {@link ScanModeType }
     *     
     */
    public ScanModeType getScanModeType() {
        return scanModeType;
    }

    /**
     * Sets the value of the scanModeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanModeType }
     *     
     */
    public void setScanModeType(ScanModeType value) {
        this.scanModeType = value;
    }

}
