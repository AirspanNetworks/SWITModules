
package Netspan.NBI_15_2.Software;

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
 *         &lt;element name="SoftwareServer" type="{http://Airspan.Netspan.WebServices}SwServerWs" minOccurs="0"/>
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
    "softwareServer"
})
@XmlRootElement(name = "SoftwareServerCreate")
public class SoftwareServerCreate {

    @XmlElement(name = "SoftwareServer")
    protected SwServerWs softwareServer;

    /**
     * Gets the value of the softwareServer property.
     * 
     * @return
     *     possible object is
     *     {@link SwServerWs }
     *     
     */
    public SwServerWs getSoftwareServer() {
        return softwareServer;
    }

    /**
     * Sets the value of the softwareServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwServerWs }
     *     
     */
    public void setSoftwareServer(SwServerWs value) {
        this.softwareServer = value;
    }

}
