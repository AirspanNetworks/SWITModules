
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
 *         &lt;element name="EnbGlobalConfigMnoMappingListResult" type="{http://Airspan.Netspan.WebServices}PlmnGlobalConfigGetResult" minOccurs="0"/&gt;
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
    "enbGlobalConfigMnoMappingListResult"
})
@XmlRootElement(name = "EnbGlobalConfigMnoMappingListResponse")
public class EnbGlobalConfigMnoMappingListResponse {

    @XmlElement(name = "EnbGlobalConfigMnoMappingListResult")
    protected PlmnGlobalConfigGetResult enbGlobalConfigMnoMappingListResult;

    /**
     * Gets the value of the enbGlobalConfigMnoMappingListResult property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnGlobalConfigGetResult }
     *     
     */
    public PlmnGlobalConfigGetResult getEnbGlobalConfigMnoMappingListResult() {
        return enbGlobalConfigMnoMappingListResult;
    }

    /**
     * Sets the value of the enbGlobalConfigMnoMappingListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnGlobalConfigGetResult }
     *     
     */
    public void setEnbGlobalConfigMnoMappingListResult(PlmnGlobalConfigGetResult value) {
        this.enbGlobalConfigMnoMappingListResult = value;
    }

}
