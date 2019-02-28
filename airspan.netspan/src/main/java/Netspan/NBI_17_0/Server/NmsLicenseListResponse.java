
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
 *         &lt;element name="NmsLicenseListResult" type="{http://Airspan.Netspan.WebServices}NmsLicenseListResult" minOccurs="0"/&gt;
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
    "nmsLicenseListResult"
})
@XmlRootElement(name = "NmsLicenseListResponse")
public class NmsLicenseListResponse {

    @XmlElement(name = "NmsLicenseListResult")
    protected NmsLicenseListResult nmsLicenseListResult;

    /**
     * Gets the value of the nmsLicenseListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NmsLicenseListResult }
     *     
     */
    public NmsLicenseListResult getNmsLicenseListResult() {
        return nmsLicenseListResult;
    }

    /**
     * Sets the value of the nmsLicenseListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NmsLicenseListResult }
     *     
     */
    public void setNmsLicenseListResult(NmsLicenseListResult value) {
        this.nmsLicenseListResult = value;
    }

}
