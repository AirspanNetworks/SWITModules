
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlmnGlobalConfigGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlmnGlobalConfigGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnbGlobalConfigMnoMappingList" type="{http://Airspan.Netspan.WebServices}PlmnGlobalConfigContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlmnGlobalConfigGetResult", propOrder = {
    "enbGlobalConfigMnoMappingList"
})
public class PlmnGlobalConfigGetResult
    extends WsResponse
{

    @XmlElement(name = "EnbGlobalConfigMnoMappingList")
    protected PlmnGlobalConfigContainer enbGlobalConfigMnoMappingList;

    /**
     * Gets the value of the enbGlobalConfigMnoMappingList property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnGlobalConfigContainer }
     *     
     */
    public PlmnGlobalConfigContainer getEnbGlobalConfigMnoMappingList() {
        return enbGlobalConfigMnoMappingList;
    }

    /**
     * Sets the value of the enbGlobalConfigMnoMappingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnGlobalConfigContainer }
     *     
     */
    public void setEnbGlobalConfigMnoMappingList(PlmnGlobalConfigContainer value) {
        this.enbGlobalConfigMnoMappingList = value;
    }

}
