
package Netspan.NBI_17_0.Server;

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
 *         &lt;element name="LicenceBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "licenceBase64"
})
@XmlRootElement(name = "NmsLicenceAdd")
public class NmsLicenceAdd {

    @XmlElement(name = "LicenceBase64")
    protected String licenceBase64;

    /**
     * Gets the value of the licenceBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceBase64() {
        return licenceBase64;
    }

    /**
     * Sets the value of the licenceBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceBase64(String value) {
        this.licenceBase64 = value;
    }

}
