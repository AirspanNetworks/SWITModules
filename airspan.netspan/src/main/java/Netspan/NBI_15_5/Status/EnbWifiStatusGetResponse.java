
package Netspan.NBI_15_5.Status;

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
 *         &lt;element name="EnbWifiStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteWifiGetResult" minOccurs="0"/>
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
    "enbWifiStatusGetResult"
})
@XmlRootElement(name = "EnbWifiStatusGetResponse")
public class EnbWifiStatusGetResponse {

    @XmlElement(name = "EnbWifiStatusGetResult")
    protected LteWifiGetResult enbWifiStatusGetResult;

    /**
     * Gets the value of the enbWifiStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteWifiGetResult }
     *     
     */
    public LteWifiGetResult getEnbWifiStatusGetResult() {
        return enbWifiStatusGetResult;
    }

    /**
     * Sets the value of the enbWifiStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteWifiGetResult }
     *     
     */
    public void setEnbWifiStatusGetResult(LteWifiGetResult value) {
        this.enbWifiStatusGetResult = value;
    }

}
