
package Netspan.NBI_16_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FtpIpAddressStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FtpIpAddressStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BhQosFtpServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BhQosFtpServerIpAddressStatus" type="{http://Airspan.Netspan.WebServices}IpAddressStatesWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FtpIpAddressStatusWs", propOrder = {
    "bhQosFtpServerIpAddress",
    "bhQosFtpServerIpAddressStatus"
})
public class FtpIpAddressStatusWs {

    @XmlElement(name = "BhQosFtpServerIpAddress")
    protected String bhQosFtpServerIpAddress;
    @XmlElementRef(name = "BhQosFtpServerIpAddressStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IpAddressStatesWs> bhQosFtpServerIpAddressStatus;

    /**
     * Gets the value of the bhQosFtpServerIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBhQosFtpServerIpAddress() {
        return bhQosFtpServerIpAddress;
    }

    /**
     * Sets the value of the bhQosFtpServerIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBhQosFtpServerIpAddress(String value) {
        this.bhQosFtpServerIpAddress = value;
    }

    /**
     * Gets the value of the bhQosFtpServerIpAddressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IpAddressStatesWs }{@code >}
     *     
     */
    public JAXBElement<IpAddressStatesWs> getBhQosFtpServerIpAddressStatus() {
        return bhQosFtpServerIpAddressStatus;
    }

    /**
     * Sets the value of the bhQosFtpServerIpAddressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IpAddressStatesWs }{@code >}
     *     
     */
    public void setBhQosFtpServerIpAddressStatus(JAXBElement<IpAddressStatesWs> value) {
        this.bhQosFtpServerIpAddressStatus = value;
    }

}
