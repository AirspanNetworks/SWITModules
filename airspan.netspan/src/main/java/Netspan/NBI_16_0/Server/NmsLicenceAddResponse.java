
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
 *         &lt;element name="NmsLicenceAddResult" type="{http://Airspan.Netspan.WebServices}WsResponse" minOccurs="0"/>
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
    "nmsLicenceAddResult"
})
@XmlRootElement(name = "NmsLicenceAddResponse")
public class NmsLicenceAddResponse {

    @XmlElement(name = "NmsLicenceAddResult")
    protected WsResponse nmsLicenceAddResult;

    /**
     * Gets the value of the nmsLicenceAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsResponse }
     *     
     */
    public WsResponse getNmsLicenceAddResult() {
        return nmsLicenceAddResult;
    }

    /**
     * Sets the value of the nmsLicenceAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsResponse }
     *     
     */
    public void setNmsLicenceAddResult(WsResponse value) {
        this.nmsLicenceAddResult = value;
    }

}
