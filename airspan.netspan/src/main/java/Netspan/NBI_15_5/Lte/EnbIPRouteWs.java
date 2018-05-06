
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbIPRouteWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbIPRouteWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IpSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GatewayIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbIPRouteWs", propOrder = {
    "destIpAddress",
    "ipSubnetMask",
    "gatewayIpAddress"
})
public class EnbIPRouteWs {

    @XmlElement(name = "DestIpAddress")
    protected String destIpAddress;
    @XmlElement(name = "IpSubnetMask")
    protected String ipSubnetMask;
    @XmlElement(name = "GatewayIpAddress")
    protected String gatewayIpAddress;

    /**
     * Gets the value of the destIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestIpAddress() {
        return destIpAddress;
    }

    /**
     * Sets the value of the destIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestIpAddress(String value) {
        this.destIpAddress = value;
    }

    /**
     * Gets the value of the ipSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpSubnetMask() {
        return ipSubnetMask;
    }

    /**
     * Sets the value of the ipSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpSubnetMask(String value) {
        this.ipSubnetMask = value;
    }

    /**
     * Gets the value of the gatewayIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayIpAddress() {
        return gatewayIpAddress;
    }

    /**
     * Sets the value of the gatewayIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayIpAddress(String value) {
        this.gatewayIpAddress = value;
    }

}
