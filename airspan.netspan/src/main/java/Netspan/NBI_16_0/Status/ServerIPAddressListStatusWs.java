
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerIPAddressListStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerIPAddressListStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BhQosBwReservationServerIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BhQosBwReservationServerIPAddressCbrStatus" type="{http://Airspan.Netspan.WebServices}ServerIpAddressStatesWs"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerIPAddressListStatusWs", propOrder = {
    "bhQosBwReservationServerIPAddress",
    "bhQosBwReservationServerIPAddressCbrStatus"
})
public class ServerIPAddressListStatusWs {

    @XmlElement(name = "BhQosBwReservationServerIPAddress")
    protected String bhQosBwReservationServerIPAddress;
    @XmlElement(name = "BhQosBwReservationServerIPAddressCbrStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ServerIpAddressStatesWs bhQosBwReservationServerIPAddressCbrStatus;

    /**
     * Gets the value of the bhQosBwReservationServerIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBhQosBwReservationServerIPAddress() {
        return bhQosBwReservationServerIPAddress;
    }

    /**
     * Sets the value of the bhQosBwReservationServerIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBhQosBwReservationServerIPAddress(String value) {
        this.bhQosBwReservationServerIPAddress = value;
    }

    /**
     * Gets the value of the bhQosBwReservationServerIPAddressCbrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServerIpAddressStatesWs }
     *     
     */
    public ServerIpAddressStatesWs getBhQosBwReservationServerIPAddressCbrStatus() {
        return bhQosBwReservationServerIPAddressCbrStatus;
    }

    /**
     * Sets the value of the bhQosBwReservationServerIPAddressCbrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerIpAddressStatesWs }
     *     
     */
    public void setBhQosBwReservationServerIPAddressCbrStatus(ServerIpAddressStatesWs value) {
        this.bhQosBwReservationServerIPAddressCbrStatus = value;
    }

}
