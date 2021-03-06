
package Netspan.NBI_14_50.API.Lte;

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
 *         &lt;element name="NetworkProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteNetworkProfileGetResult" minOccurs="0"/>
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
    "networkProfileGetResult"
})
@XmlRootElement(name = "NetworkProfileGetResponse")
public class NetworkProfileGetResponse {

    @XmlElement(name = "NetworkProfileGetResult")
    protected LteNetworkProfileGetResult networkProfileGetResult;

    /**
     * Gets the value of the networkProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteNetworkProfileGetResult }
     *     
     */
    public LteNetworkProfileGetResult getNetworkProfileGetResult() {
        return networkProfileGetResult;
    }

    /**
     * Sets the value of the networkProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNetworkProfileGetResult }
     *     
     */
    public void setNetworkProfileGetResult(LteNetworkProfileGetResult value) {
        this.networkProfileGetResult = value;
    }

}
