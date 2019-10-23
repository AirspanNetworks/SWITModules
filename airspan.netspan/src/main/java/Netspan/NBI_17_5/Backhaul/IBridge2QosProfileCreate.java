
package Netspan.NBI_17_5.Backhaul;

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
 *         &lt;element name="QosProfile" type="{http://Airspan.Netspan.WebServices}IBridge2QosProfile" minOccurs="0"/&gt;
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
    "qosProfile"
})
@XmlRootElement(name = "IBridge2QosProfileCreate")
public class IBridge2QosProfileCreate {

    @XmlElement(name = "QosProfile")
    protected IBridge2QosProfile qosProfile;

    /**
     * Gets the value of the qosProfile property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2QosProfile }
     *     
     */
    public IBridge2QosProfile getQosProfile() {
        return qosProfile;
    }

    /**
     * Sets the value of the qosProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2QosProfile }
     *     
     */
    public void setQosProfile(IBridge2QosProfile value) {
        this.qosProfile = value;
    }

}
