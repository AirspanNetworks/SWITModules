
package Netspan.NBI_17_0.Lte;

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
 *         &lt;element name="SystemDefaultProfile" type="{http://Airspan.Netspan.WebServices}LteSystemDefaultProfile" minOccurs="0"/&gt;
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
    "systemDefaultProfile"
})
@XmlRootElement(name = "SystemDefaultProfileCreate")
public class SystemDefaultProfileCreate {

    @XmlElement(name = "SystemDefaultProfile")
    protected LteSystemDefaultProfile systemDefaultProfile;

    /**
     * Gets the value of the systemDefaultProfile property.
     * 
     * @return
     *     possible object is
     *     {@link LteSystemDefaultProfile }
     *     
     */
    public LteSystemDefaultProfile getSystemDefaultProfile() {
        return systemDefaultProfile;
    }

    /**
     * Sets the value of the systemDefaultProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSystemDefaultProfile }
     *     
     */
    public void setSystemDefaultProfile(LteSystemDefaultProfile value) {
        this.systemDefaultProfile = value;
    }

}
