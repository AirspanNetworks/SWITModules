
package Netspan.NBI_14_50.API.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeTermDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeTermDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagedMode" type="{http://Airspan.Netspan.WebServices}NodeManagementModeType" minOccurs="0"/>
 *         &lt;element name="ServiceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemDefaultProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagementVlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UseManagementIfForPtp" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="PtpIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PtpSubnetCidr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PtpVlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeTermDetails", propOrder = {
    "name",
    "description",
    "region",
    "site",
    "managedMode",
    "serviceAllowed",
    "serviceProduct",
    "systemDefaultProfile",
    "radioProfile",
    "managementVlanId",
    "useManagementIfForPtp",
    "ptpIpAddress",
    "ptpSubnetCidr",
    "ptpVlanId"
})
public class IBridgeTermDetails {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElementRef(name = "ManagedMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeManagementModeType> managedMode;
    @XmlElementRef(name = "ServiceAllowed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> serviceAllowed;
    @XmlElement(name = "ServiceProduct")
    protected String serviceProduct;
    @XmlElement(name = "SystemDefaultProfile")
    protected String systemDefaultProfile;
    @XmlElement(name = "RadioProfile")
    protected String radioProfile;
    @XmlElement(name = "ManagementVlanId", required = true, type = Integer.class, nillable = true)
    protected Integer managementVlanId;
    @XmlElement(name = "UseManagementIfForPtp", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues useManagementIfForPtp;
    @XmlElement(name = "PtpIpAddress")
    protected String ptpIpAddress;
    @XmlElement(name = "PtpSubnetCidr", required = true, type = Integer.class, nillable = true)
    protected Integer ptpSubnetCidr;
    @XmlElement(name = "PtpVlanId", required = true, type = Integer.class, nillable = true)
    protected Integer ptpVlanId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the managedMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeManagementModeType }{@code >}
     *     
     */
    public JAXBElement<NodeManagementModeType> getManagedMode() {
        return managedMode;
    }

    /**
     * Sets the value of the managedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeManagementModeType }{@code >}
     *     
     */
    public void setManagedMode(JAXBElement<NodeManagementModeType> value) {
        this.managedMode = value;
    }

    /**
     * Gets the value of the serviceAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getServiceAllowed() {
        return serviceAllowed;
    }

    /**
     * Sets the value of the serviceAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setServiceAllowed(JAXBElement<Boolean> value) {
        this.serviceAllowed = value;
    }

    /**
     * Gets the value of the serviceProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProduct() {
        return serviceProduct;
    }

    /**
     * Sets the value of the serviceProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProduct(String value) {
        this.serviceProduct = value;
    }

    /**
     * Gets the value of the systemDefaultProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemDefaultProfile() {
        return systemDefaultProfile;
    }

    /**
     * Sets the value of the systemDefaultProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemDefaultProfile(String value) {
        this.systemDefaultProfile = value;
    }

    /**
     * Gets the value of the radioProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioProfile() {
        return radioProfile;
    }

    /**
     * Sets the value of the radioProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioProfile(String value) {
        this.radioProfile = value;
    }

    /**
     * Gets the value of the managementVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManagementVlanId() {
        return managementVlanId;
    }

    /**
     * Sets the value of the managementVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManagementVlanId(Integer value) {
        this.managementVlanId = value;
    }

    /**
     * Gets the value of the useManagementIfForPtp property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getUseManagementIfForPtp() {
        return useManagementIfForPtp;
    }

    /**
     * Sets the value of the useManagementIfForPtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setUseManagementIfForPtp(EnabledDisabledValues value) {
        this.useManagementIfForPtp = value;
    }

    /**
     * Gets the value of the ptpIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtpIpAddress() {
        return ptpIpAddress;
    }

    /**
     * Sets the value of the ptpIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtpIpAddress(String value) {
        this.ptpIpAddress = value;
    }

    /**
     * Gets the value of the ptpSubnetCidr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPtpSubnetCidr() {
        return ptpSubnetCidr;
    }

    /**
     * Sets the value of the ptpSubnetCidr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPtpSubnetCidr(Integer value) {
        this.ptpSubnetCidr = value;
    }

    /**
     * Gets the value of the ptpVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPtpVlanId() {
        return ptpVlanId;
    }

    /**
     * Sets the value of the ptpVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPtpVlanId(Integer value) {
        this.ptpVlanId = value;
    }

}
