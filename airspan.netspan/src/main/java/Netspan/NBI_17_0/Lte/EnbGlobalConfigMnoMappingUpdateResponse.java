
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
 *         &lt;element name="EnbGlobalConfigMnoMappingUpdateResult" type="{http://Airspan.Netspan.WebServices}PlmnGlobalConfigActionResult" minOccurs="0"/&gt;
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
    "enbGlobalConfigMnoMappingUpdateResult"
})
@XmlRootElement(name = "EnbGlobalConfigMnoMappingUpdateResponse")
public class EnbGlobalConfigMnoMappingUpdateResponse {

    @XmlElement(name = "EnbGlobalConfigMnoMappingUpdateResult")
    protected PlmnGlobalConfigActionResult enbGlobalConfigMnoMappingUpdateResult;

    /**
     * Gets the value of the enbGlobalConfigMnoMappingUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnGlobalConfigActionResult }
     *     
     */
    public PlmnGlobalConfigActionResult getEnbGlobalConfigMnoMappingUpdateResult() {
        return enbGlobalConfigMnoMappingUpdateResult;
    }

    /**
     * Sets the value of the enbGlobalConfigMnoMappingUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnGlobalConfigActionResult }
     *     
     */
    public void setEnbGlobalConfigMnoMappingUpdateResult(PlmnGlobalConfigActionResult value) {
        this.enbGlobalConfigMnoMappingUpdateResult = value;
    }

}
