
package Netspan.NBI_15_1.Lte;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrafficManagementProfile" type="{http://Airspan.Netspan.WebServices}TrafficManagementProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trafficManagementProfile"
})
@XmlRootElement(name = "TrafficManagementProfileCreate")
public class TrafficManagementProfileCreate {

    @XmlElement(name = "TrafficManagementProfile")
    protected TrafficManagementProfile trafficManagementProfile;

    /**
     * Gets the value of the trafficManagementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficManagementProfile }
     *     
     */
    public TrafficManagementProfile getTrafficManagementProfile() {
        return trafficManagementProfile;
    }

    /**
     * Sets the value of the trafficManagementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficManagementProfile }
     *     
     */
    public void setTrafficManagementProfile(TrafficManagementProfile value) {
        this.trafficManagementProfile = value;
    }

}
