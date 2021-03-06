
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
 *         &lt;element name="TrafficManagementProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/>
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
    "trafficManagementProfileListResult"
})
@XmlRootElement(name = "TrafficManagementProfileListResponse")
public class TrafficManagementProfileListResponse {

    @XmlElement(name = "TrafficManagementProfileListResult")
    protected NameResult trafficManagementProfileListResult;

    /**
     * Gets the value of the trafficManagementProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getTrafficManagementProfileListResult() {
        return trafficManagementProfileListResult;
    }

    /**
     * Sets the value of the trafficManagementProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setTrafficManagementProfileListResult(NameResult value) {
        this.trafficManagementProfileListResult = value;
    }

}
