
package Netspan.NBI_16_5.Backhaul;

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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ib440QosProfile" type="{http://Airspan.Netspan.WebServices}IBridge11acQosProfile" minOccurs="0"/&gt;
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
    "name",
    "ib440QosProfile"
})
@XmlRootElement(name = "Ib440QosProfileUpdate")
public class Ib440QosProfileUpdate {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Ib440QosProfile")
    protected IBridge11AcQosProfile ib440QosProfile;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ib440QosProfile property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge11AcQosProfile }
     *     
     */
    public IBridge11AcQosProfile getIb440QosProfile() {
        return ib440QosProfile;
    }

    /**
     * Sets the value of the ib440QosProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge11AcQosProfile }
     *     
     */
    public void setIb440QosProfile(IBridge11AcQosProfile value) {
        this.ib440QosProfile = value;
    }

}
