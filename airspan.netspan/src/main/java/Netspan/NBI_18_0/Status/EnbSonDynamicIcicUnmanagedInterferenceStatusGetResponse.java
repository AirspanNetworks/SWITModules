
package Netspan.NBI_18_0.Status;

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
 *         &lt;element name="EnbSonDynamicIcicUnmanagedInterferenceStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteSonDynamicIcicUnmanagedInterferenceGetResult" minOccurs="0"/&gt;
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
    "enbSonDynamicIcicUnmanagedInterferenceStatusGetResult"
})
@XmlRootElement(name = "EnbSonDynamicIcicUnmanagedInterferenceStatusGetResponse")
public class EnbSonDynamicIcicUnmanagedInterferenceStatusGetResponse {

    @XmlElement(name = "EnbSonDynamicIcicUnmanagedInterferenceStatusGetResult")
    protected LteSonDynamicIcicUnmanagedInterferenceGetResult enbSonDynamicIcicUnmanagedInterferenceStatusGetResult;

    /**
     * Gets the value of the enbSonDynamicIcicUnmanagedInterferenceStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonDynamicIcicUnmanagedInterferenceGetResult }
     *     
     */
    public LteSonDynamicIcicUnmanagedInterferenceGetResult getEnbSonDynamicIcicUnmanagedInterferenceStatusGetResult() {
        return enbSonDynamicIcicUnmanagedInterferenceStatusGetResult;
    }

    /**
     * Sets the value of the enbSonDynamicIcicUnmanagedInterferenceStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonDynamicIcicUnmanagedInterferenceGetResult }
     *     
     */
    public void setEnbSonDynamicIcicUnmanagedInterferenceStatusGetResult(LteSonDynamicIcicUnmanagedInterferenceGetResult value) {
        this.enbSonDynamicIcicUnmanagedInterferenceStatusGetResult = value;
    }

}
