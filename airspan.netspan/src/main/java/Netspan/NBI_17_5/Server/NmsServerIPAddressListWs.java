
package Netspan.NBI_17_5.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NmsServerIPAddressListWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NmsServerIPAddressListWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NMSServerIPAddressList" type="{http://Airspan.Netspan.WebServices}ArrayOfNMSServerIPAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NmsServerIPAddressListWs", propOrder = {
    "nmsServerIPAddressList"
})
public class NmsServerIPAddressListWs
    extends WsResponse
{

    @XmlElement(name = "NMSServerIPAddressList")
    protected ArrayOfNMSServerIPAddress nmsServerIPAddressList;

    /**
     * Gets the value of the nmsServerIPAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNMSServerIPAddress }
     *     
     */
    public ArrayOfNMSServerIPAddress getNMSServerIPAddressList() {
        return nmsServerIPAddressList;
    }

    /**
     * Sets the value of the nmsServerIPAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNMSServerIPAddress }
     *     
     */
    public void setNMSServerIPAddressList(ArrayOfNMSServerIPAddress value) {
        this.nmsServerIPAddressList = value;
    }

}
