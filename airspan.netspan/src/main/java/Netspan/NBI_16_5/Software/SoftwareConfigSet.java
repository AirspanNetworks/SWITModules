
package Netspan.NBI_16_5.Software;

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
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareDetails" type="{http://Airspan.Netspan.WebServices}SwConfigSetWs" minOccurs="0"/&gt;
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
    "nodeName",
    "softwareDetails"
})
@XmlRootElement(name = "SoftwareConfigSet")
public class SoftwareConfigSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "SoftwareDetails")
    protected SwConfigSetWs softwareDetails;

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the softwareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SwConfigSetWs }
     *     
     */
    public SwConfigSetWs getSoftwareDetails() {
        return softwareDetails;
    }

    /**
     * Sets the value of the softwareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwConfigSetWs }
     *     
     */
    public void setSoftwareDetails(SwConfigSetWs value) {
        this.softwareDetails = value;
    }

}
