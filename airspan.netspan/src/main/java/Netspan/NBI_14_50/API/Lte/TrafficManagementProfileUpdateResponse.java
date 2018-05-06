
package Netspan.NBI_14_50.API.Lte;

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
 *         &lt;element name="TrafficManagementProfileUpdateResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/>
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
    "trafficManagementProfileUpdateResult"
})
@XmlRootElement(name = "TrafficManagementProfileUpdateResponse")
public class TrafficManagementProfileUpdateResponse {

    @XmlElement(name = "TrafficManagementProfileUpdateResult")
    protected ProfileResponse trafficManagementProfileUpdateResult;

    /**
     * Gets the value of the trafficManagementProfileUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getTrafficManagementProfileUpdateResult() {
        return trafficManagementProfileUpdateResult;
    }

    /**
     * Sets the value of the trafficManagementProfileUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setTrafficManagementProfileUpdateResult(ProfileResponse value) {
        this.trafficManagementProfileUpdateResult = value;
    }

}
