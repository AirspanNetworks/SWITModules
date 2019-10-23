
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedDeviceTypeToApnEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectedDeviceTypeToApnEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypeId" type="{http://Airspan.Netspan.WebServices}AccessDeviceTypeIdsWs" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VendorClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VlanIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Blocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccessPointName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthType" type="{http://Airspan.Netspan.WebServices}ApnAuthenticationTypes" minOccurs="0"/&gt;
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PdnConnectionType" type="{http://Airspan.Netspan.WebServices}PdnConnectionTypes" minOccurs="0"/&gt;
 *         &lt;element name="ProviderXlatPrefixIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressAllocationMethod" type="{http://Airspan.Netspan.WebServices}AddressAllocationMethodTypes" minOccurs="0"/&gt;
 *         &lt;element name="PnpMethod" type="{http://Airspan.Netspan.WebServices}PnpMethodTypes" minOccurs="0"/&gt;
 *         &lt;element name="IPAssignment" type="{http://Airspan.Netspan.WebServices}IPAssignmentTypesWs" minOccurs="0"/&gt;
 *         &lt;element name="GatewayIPv4Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CidrPrefix" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedDeviceTypeToApnEntryWs", propOrder = {
    "apnName",
    "typeId",
    "isEnabled",
    "vendorClassIdentifier",
    "vlanIdentifier",
    "blocked",
    "accessPointName",
    "authType",
    "username",
    "password",
    "pdnConnectionType",
    "providerXlatPrefixIpAddress",
    "addressAllocationMethod",
    "pnpMethod",
    "ipAssignment",
    "gatewayIPv4Address",
    "cidrPrefix"
})
public class ConnectedDeviceTypeToApnEntryWs {

    @XmlElement(name = "ApnName")
    protected String apnName;
    @XmlElementRef(name = "TypeId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AccessDeviceTypeIdsWs> typeId;
    @XmlElementRef(name = "IsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEnabled;
    @XmlElement(name = "VendorClassIdentifier")
    protected String vendorClassIdentifier;
    @XmlElementRef(name = "VlanIdentifier", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> vlanIdentifier;
    @XmlElementRef(name = "Blocked", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> blocked;
    @XmlElement(name = "AccessPointName")
    protected String accessPointName;
    @XmlElementRef(name = "AuthType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ApnAuthenticationTypes> authType;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElementRef(name = "PdnConnectionType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdnConnectionType;
    @XmlElement(name = "ProviderXlatPrefixIpAddress")
    protected String providerXlatPrefixIpAddress;
    @XmlElementRef(name = "AddressAllocationMethod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressAllocationMethodTypes> addressAllocationMethod;
    @XmlElementRef(name = "PnpMethod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PnpMethodTypes> pnpMethod;
    @XmlElementRef(name = "IPAssignment", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IPAssignmentTypesWs> ipAssignment;
    @XmlElement(name = "GatewayIPv4Address")
    protected String gatewayIPv4Address;
    @XmlElementRef(name = "CidrPrefix", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cidrPrefix;

    /**
     * Gets the value of the apnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApnName() {
        return apnName;
    }

    /**
     * Sets the value of the apnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApnName(String value) {
        this.apnName = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccessDeviceTypeIdsWs }{@code >}
     *     
     */
    public JAXBElement<AccessDeviceTypeIdsWs> getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccessDeviceTypeIdsWs }{@code >}
     *     
     */
    public void setTypeId(JAXBElement<AccessDeviceTypeIdsWs> value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the isEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEnabled(JAXBElement<Boolean> value) {
        this.isEnabled = value;
    }

    /**
     * Gets the value of the vendorClassIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorClassIdentifier() {
        return vendorClassIdentifier;
    }

    /**
     * Sets the value of the vendorClassIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorClassIdentifier(String value) {
        this.vendorClassIdentifier = value;
    }

    /**
     * Gets the value of the vlanIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVlanIdentifier() {
        return vlanIdentifier;
    }

    /**
     * Sets the value of the vlanIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVlanIdentifier(JAXBElement<Integer> value) {
        this.vlanIdentifier = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBlocked(JAXBElement<Boolean> value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the accessPointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPointName() {
        return accessPointName;
    }

    /**
     * Sets the value of the accessPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessPointName(String value) {
        this.accessPointName = value;
    }

    /**
     * Gets the value of the authType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApnAuthenticationTypes }{@code >}
     *     
     */
    public JAXBElement<ApnAuthenticationTypes> getAuthType() {
        return authType;
    }

    /**
     * Sets the value of the authType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApnAuthenticationTypes }{@code >}
     *     
     */
    public void setAuthType(JAXBElement<ApnAuthenticationTypes> value) {
        this.authType = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the pdnConnectionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPdnConnectionType() {
        return pdnConnectionType;
    }

    /**
     * Sets the value of the pdnConnectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPdnConnectionType(JAXBElement<String> value) {
        this.pdnConnectionType = value;
    }

    /**
     * Gets the value of the providerXlatPrefixIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderXlatPrefixIpAddress() {
        return providerXlatPrefixIpAddress;
    }

    /**
     * Sets the value of the providerXlatPrefixIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderXlatPrefixIpAddress(String value) {
        this.providerXlatPrefixIpAddress = value;
    }

    /**
     * Gets the value of the addressAllocationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressAllocationMethodTypes }{@code >}
     *     
     */
    public JAXBElement<AddressAllocationMethodTypes> getAddressAllocationMethod() {
        return addressAllocationMethod;
    }

    /**
     * Sets the value of the addressAllocationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressAllocationMethodTypes }{@code >}
     *     
     */
    public void setAddressAllocationMethod(JAXBElement<AddressAllocationMethodTypes> value) {
        this.addressAllocationMethod = value;
    }

    /**
     * Gets the value of the pnpMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PnpMethodTypes }{@code >}
     *     
     */
    public JAXBElement<PnpMethodTypes> getPnpMethod() {
        return pnpMethod;
    }

    /**
     * Sets the value of the pnpMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PnpMethodTypes }{@code >}
     *     
     */
    public void setPnpMethod(JAXBElement<PnpMethodTypes> value) {
        this.pnpMethod = value;
    }

    /**
     * Gets the value of the ipAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IPAssignmentTypesWs }{@code >}
     *     
     */
    public JAXBElement<IPAssignmentTypesWs> getIPAssignment() {
        return ipAssignment;
    }

    /**
     * Sets the value of the ipAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IPAssignmentTypesWs }{@code >}
     *     
     */
    public void setIPAssignment(JAXBElement<IPAssignmentTypesWs> value) {
        this.ipAssignment = value;
    }

    /**
     * Gets the value of the gatewayIPv4Address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayIPv4Address() {
        return gatewayIPv4Address;
    }

    /**
     * Sets the value of the gatewayIPv4Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayIPv4Address(String value) {
        this.gatewayIPv4Address = value;
    }

    /**
     * Gets the value of the cidrPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCidrPrefix() {
        return cidrPrefix;
    }

    /**
     * Sets the value of the cidrPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCidrPrefix(JAXBElement<Integer> value) {
        this.cidrPrefix = value;
    }

}
