
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
 *         &lt;element name="UtranProfile" type="{http://Airspan.Netspan.WebServices}UtranProfile" minOccurs="0"/&gt;
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
    "utranProfile"
})
@XmlRootElement(name = "UtranProfileCreate")
public class UtranProfileCreate {

    @XmlElement(name = "UtranProfile")
    protected UtranProfile utranProfile;

    /**
     * Gets the value of the utranProfile property.
     * 
     * @return
     *     possible object is
     *     {@link UtranProfile }
     *     
     */
    public UtranProfile getUtranProfile() {
        return utranProfile;
    }

    /**
     * Sets the value of the utranProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtranProfile }
     *     
     */
    public void setUtranProfile(UtranProfile value) {
        this.utranProfile = value;
    }

}
