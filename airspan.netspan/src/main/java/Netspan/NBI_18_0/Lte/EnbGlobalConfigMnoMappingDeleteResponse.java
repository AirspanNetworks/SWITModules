
package Netspan.NBI_18_0.Lte;

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
 *         &lt;element name="EnbGlobalConfigMnoMappingDeleteResult" type="{http://Airspan.Netspan.WebServices}PlmnGlobalConfigActionResult" minOccurs="0"/&gt;
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
    "enbGlobalConfigMnoMappingDeleteResult"
})
@XmlRootElement(name = "EnbGlobalConfigMnoMappingDeleteResponse")
public class EnbGlobalConfigMnoMappingDeleteResponse {

    @XmlElement(name = "EnbGlobalConfigMnoMappingDeleteResult")
    protected PlmnGlobalConfigActionResult enbGlobalConfigMnoMappingDeleteResult;

    /**
     * Gets the value of the enbGlobalConfigMnoMappingDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnGlobalConfigActionResult }
     *     
     */
    public PlmnGlobalConfigActionResult getEnbGlobalConfigMnoMappingDeleteResult() {
        return enbGlobalConfigMnoMappingDeleteResult;
    }

    /**
     * Sets the value of the enbGlobalConfigMnoMappingDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnGlobalConfigActionResult }
     *     
     */
    public void setEnbGlobalConfigMnoMappingDeleteResult(PlmnGlobalConfigActionResult value) {
        this.enbGlobalConfigMnoMappingDeleteResult = value;
    }

}
