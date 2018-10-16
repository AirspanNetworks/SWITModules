
package Netspan.NBI_16_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.NetworkElementStatus;


/**
 * <p>Java class for LteNetworkElementStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteNetworkElementStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkElementType" type="{http://Airspan.Netspan.WebServices}NetworkElementType"/&gt;
 *         &lt;element name="NetworkElement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://Airspan.Netspan.WebServices}NetworkElementStatus"/&gt;
 *         &lt;element name="Vlan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MmeOverloadStatus" type="{http://Airspan.Netspan.WebServices}MmeOverloadStatus" minOccurs="0"/&gt;
 *         &lt;element name="MmeOverloadResponse" type="{http://Airspan.Netspan.WebServices}MmeOverloadResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteNetworkElementStatusWs", propOrder = {
    "networkElementType",
    "networkElement",
    "ipAddress",
    "status",
    "vlan",
    "mmeOverloadStatus",
    "mmeOverloadResponse"
})
public class LteNetworkElementStatusWs {

    @XmlElement(name = "NetworkElementType", required = true)
    @XmlSchemaType(name = "string")
    protected NetworkElementType networkElementType;
    @XmlElement(name = "NetworkElement")
    protected String networkElement;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected NetworkElementStatus status;
    @XmlElementRef(name = "Vlan", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> vlan;
    @XmlElementRef(name = "MmeOverloadStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MmeOverloadStatus> mmeOverloadStatus;
    @XmlElementRef(name = "MmeOverloadResponse", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MmeOverloadResponse> mmeOverloadResponse;

    /**
     * Gets the value of the networkElementType property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkElementType }
     *     
     */
    public NetworkElementType getNetworkElementType() {
        return networkElementType;
    }

    /**
     * Sets the value of the networkElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkElementType }
     *     
     */
    public void setNetworkElementType(NetworkElementType value) {
        this.networkElementType = value;
    }

    /**
     * Gets the value of the networkElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkElement() {
        return networkElement;
    }

    /**
     * Sets the value of the networkElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkElement(String value) {
        this.networkElement = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkElementStatus }
     *     
     */
    public NetworkElementStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkElementStatus }
     *     
     */
    public void setStatus(NetworkElementStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the vlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVlan() {
        return vlan;
    }

    /**
     * Sets the value of the vlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVlan(JAXBElement<Integer> value) {
        this.vlan = value;
    }

    /**
     * Gets the value of the mmeOverloadStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MmeOverloadStatus }{@code >}
     *     
     */
    public JAXBElement<MmeOverloadStatus> getMmeOverloadStatus() {
        return mmeOverloadStatus;
    }

    /**
     * Sets the value of the mmeOverloadStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MmeOverloadStatus }{@code >}
     *     
     */
    public void setMmeOverloadStatus(JAXBElement<MmeOverloadStatus> value) {
        this.mmeOverloadStatus = value;
    }

    /**
     * Gets the value of the mmeOverloadResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MmeOverloadResponse }{@code >}
     *     
     */
    public JAXBElement<MmeOverloadResponse> getMmeOverloadResponse() {
        return mmeOverloadResponse;
    }

    /**
     * Sets the value of the mmeOverloadResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MmeOverloadResponse }{@code >}
     *     
     */
    public void setMmeOverloadResponse(JAXBElement<MmeOverloadResponse> value) {
        this.mmeOverloadResponse = value;
    }

}
