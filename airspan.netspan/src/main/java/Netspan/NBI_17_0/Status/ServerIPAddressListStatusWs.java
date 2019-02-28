
package Netspan.NBI_17_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerIPAddressListStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerIPAddressListStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BhQosBwReservationServerIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BhQosBwReservationServerIPAddressCbrStatus" type="{http://Airspan.Netspan.WebServices}ServerIpAddressStatesWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    @XmlElementRef(name = "BhQosBwReservationServerIPAddressCbrStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ServerIpAddressStatesWs> bhQosBwReservationServerIPAddressCbrStatus;

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
     *     {@link JAXBElement }{@code <}{@link ServerIpAddressStatesWs }{@code >}
     *     
     */
    public JAXBElement<ServerIpAddressStatesWs> getBhQosBwReservationServerIPAddressCbrStatus() {
        return bhQosBwReservationServerIPAddressCbrStatus;
    }

    /**
     * Sets the value of the bhQosBwReservationServerIPAddressCbrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServerIpAddressStatesWs }{@code >}
     *     
     */
    public void setBhQosBwReservationServerIPAddressCbrStatus(JAXBElement<ServerIpAddressStatesWs> value) {
        this.bhQosBwReservationServerIPAddressCbrStatus = value;
    }

}
