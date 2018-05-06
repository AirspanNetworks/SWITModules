
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
 *         &lt;element name="EnbNetworkElementStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteNetworkElementGetResult" minOccurs="0"/>
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
    "enbNetworkElementStatusGetResult"
})
@XmlRootElement(name = "EnbNetworkElementStatusGetResponse")
public class EnbNetworkElementStatusGetResponse {

    @XmlElement(name = "EnbNetworkElementStatusGetResult")
    protected LteNetworkElementGetResult enbNetworkElementStatusGetResult;

    /**
     * Gets the value of the enbNetworkElementStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteNetworkElementGetResult }
     *     
     */
    public LteNetworkElementGetResult getEnbNetworkElementStatusGetResult() {
        return enbNetworkElementStatusGetResult;
    }

    /**
     * Sets the value of the enbNetworkElementStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNetworkElementGetResult }
     *     
     */
    public void setEnbNetworkElementStatusGetResult(LteNetworkElementGetResult value) {
        this.enbNetworkElementStatusGetResult = value;
    }

}
