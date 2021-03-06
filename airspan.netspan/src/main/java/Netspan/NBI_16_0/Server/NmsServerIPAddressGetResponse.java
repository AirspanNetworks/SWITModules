
package Netspan.NBI_16_0.Server;

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
 *         &lt;element name="NmsServerIPAddressGetResult" type="{http://Airspan.Netspan.WebServices}NmsServerIPAddressGetWs" minOccurs="0"/>
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
    "nmsServerIPAddressGetResult"
})
@XmlRootElement(name = "NmsServerIPAddressGetResponse")
public class NmsServerIPAddressGetResponse {

    @XmlElement(name = "NmsServerIPAddressGetResult")
    protected NmsServerIPAddressGetWs nmsServerIPAddressGetResult;

    /**
     * Gets the value of the nmsServerIPAddressGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NmsServerIPAddressGetWs }
     *     
     */
    public NmsServerIPAddressGetWs getNmsServerIPAddressGetResult() {
        return nmsServerIPAddressGetResult;
    }

    /**
     * Sets the value of the nmsServerIPAddressGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NmsServerIPAddressGetWs }
     *     
     */
    public void setNmsServerIPAddressGetResult(NmsServerIPAddressGetWs value) {
        this.nmsServerIPAddressGetResult = value;
    }

}
