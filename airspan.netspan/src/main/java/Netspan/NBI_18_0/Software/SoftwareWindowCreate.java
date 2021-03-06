
package Netspan.NBI_18_0.Software;

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
 *         &lt;element name="SoftwareWindow" type="{http://Airspan.Netspan.WebServices}SwWindowWs" minOccurs="0"/&gt;
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
    "softwareWindow"
})
@XmlRootElement(name = "SoftwareWindowCreate")
public class SoftwareWindowCreate {

    @XmlElement(name = "SoftwareWindow")
    protected SwWindowWs softwareWindow;

    /**
     * Gets the value of the softwareWindow property.
     * 
     * @return
     *     possible object is
     *     {@link SwWindowWs }
     *     
     */
    public SwWindowWs getSoftwareWindow() {
        return softwareWindow;
    }

    /**
     * Sets the value of the softwareWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwWindowWs }
     *     
     */
    public void setSoftwareWindow(SwWindowWs value) {
        this.softwareWindow = value;
    }

}
