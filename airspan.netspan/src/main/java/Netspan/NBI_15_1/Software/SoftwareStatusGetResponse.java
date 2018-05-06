
package Netspan.NBI_15_1.Software;

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
 *         &lt;element name="SoftwareStatusGetResult" type="{http://Airspan.Netspan.WebServices}SoftwareStatusGetWs" minOccurs="0"/>
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
    "softwareStatusGetResult"
})
@XmlRootElement(name = "SoftwareStatusGetResponse")
public class SoftwareStatusGetResponse {

    @XmlElement(name = "SoftwareStatusGetResult")
    protected SoftwareStatusGetWs softwareStatusGetResult;

    /**
     * Gets the value of the softwareStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareStatusGetWs }
     *     
     */
    public SoftwareStatusGetWs getSoftwareStatusGetResult() {
        return softwareStatusGetResult;
    }

    /**
     * Sets the value of the softwareStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareStatusGetWs }
     *     
     */
    public void setSoftwareStatusGetResult(SoftwareStatusGetWs value) {
        this.softwareStatusGetResult = value;
    }

}
