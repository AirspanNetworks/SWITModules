
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FtpIpAddressStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FtpIpAddressStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BhQosFtpServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BhQosFtpServerIpAddressStatus" type="{http://Airspan.Netspan.WebServices}IpAddressStatesWs"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    @XmlElement(name = "BhQosFtpServerIpAddressStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected IpAddressStatesWs bhQosFtpServerIpAddressStatus;

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
     *     {@link IpAddressStatesWs }
     *     
     */
    public IpAddressStatesWs getBhQosFtpServerIpAddressStatus() {
        return bhQosFtpServerIpAddressStatus;
    }

    /**
     * Sets the value of the bhQosFtpServerIpAddressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpAddressStatesWs }
     *     
     */
    public void setBhQosFtpServerIpAddressStatus(IpAddressStatesWs value) {
        this.bhQosFtpServerIpAddressStatus = value;
    }

}
