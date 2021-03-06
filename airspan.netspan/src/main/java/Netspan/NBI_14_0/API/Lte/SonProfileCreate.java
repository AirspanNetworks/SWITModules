
package Netspan.NBI_14_0.API.Lte;

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
 *         &lt;element name="SonProfile" type="{http://Airspan.Netspan.WebServices}LteSonProfileWs" minOccurs="0"/>
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
    "sonProfile"
})
@XmlRootElement(name = "SonProfileCreate")
public class SonProfileCreate {

    @XmlElement(name = "SonProfile")
    protected LteSonProfileWs sonProfile;

    /**
     * Gets the value of the sonProfile property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonProfileWs }
     *     
     */
    public LteSonProfileWs getSonProfile() {
        return sonProfile;
    }

    /**
     * Sets the value of the sonProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonProfileWs }
     *     
     */
    public void setSonProfile(LteSonProfileWs value) {
        this.sonProfile = value;
    }

}
