
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
 *         &lt;element name="NeighbourProfile" type="{http://Airspan.Netspan.WebServices}EnbNeighbourProfile" minOccurs="0"/&gt;
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
    "neighbourProfile"
})
@XmlRootElement(name = "NeighbourProfileCreate")
public class NeighbourProfileCreate {

    @XmlElement(name = "NeighbourProfile")
    protected EnbNeighbourProfile neighbourProfile;

    /**
     * Gets the value of the neighbourProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbNeighbourProfile }
     *     
     */
    public EnbNeighbourProfile getNeighbourProfile() {
        return neighbourProfile;
    }

    /**
     * Sets the value of the neighbourProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbNeighbourProfile }
     *     
     */
    public void setNeighbourProfile(EnbNeighbourProfile value) {
        this.neighbourProfile = value;
    }

}
