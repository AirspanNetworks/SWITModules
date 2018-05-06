
package Netspan.NBI_15_5.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NmsServerIPAddressGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NmsServerIPAddressGetWs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="IPAddress" type="{http://Airspan.Netspan.WebServices}NMSServerIPAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NmsServerIPAddressGetWs", propOrder = {
    "ipAddress"
})
public class NmsServerIPAddressGetWs
    extends WsResponse
{

    @XmlElement(name = "IPAddress")
    protected NMSServerIPAddress ipAddress;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link NMSServerIPAddress }
     *     
     */
    public NMSServerIPAddress getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMSServerIPAddress }
     *     
     */
    public void setIPAddress(NMSServerIPAddress value) {
        this.ipAddress = value;
    }

}
