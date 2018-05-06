
package Netspan.NBI_15_1.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeTermDetailsPnp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeTermDetailsPnp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemDefaultProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnableHomeBs" type="{http://Airspan.Netspan.WebServices}EnableDisableOptions" minOccurs="0"/>
 *         &lt;element name="HomeBsFbName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxLockPeriodForSignOn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ManagementVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UseManagementIfForPtp" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="PtpIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PtpSubnetCidr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PtpVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LedEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeTermDetailsPnp", propOrder = {
    "name",
    "description",
    "region",
    "site",
    "serviceAllowed",
    "serviceProduct",
    "systemDefaultProfile",
    "radioProfile",
    "enableHomeBs",
    "homeBsFbName",
    "maxLockPeriodForSignOn",
    "managementVlanId",
    "useManagementIfForPtp",
    "ptpIpAddress",
    "ptpSubnetCidr",
    "ptpVlanId",
    "ledEnabled"
})
@XmlSeeAlso({
    IBridgeTermDetails.class
})
public class IBridgeTermDetailsPnp {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElementRef(name = "ServiceAllowed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> serviceAllowed;
    @XmlElement(name = "ServiceProduct")
    protected String serviceProduct;
    @XmlElement(name = "SystemDefaultProfile")
    protected String systemDefaultProfile;
    @XmlElement(name = "RadioProfile")
    protected String radioProfile;
    @XmlElementRef(name = "EnableHomeBs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnableDisableOptions> enableHomeBs;
    @XmlElement(name = "HomeBsFbName")
    protected String homeBsFbName;
    @XmlElementRef(name = "MaxLockPeriodForSignOn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxLockPeriodForSignOn;
    @XmlElementRef(name = "ManagementVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> managementVlanId;
    @XmlElementRef(name = "UseManagementIfForPtp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> useManagementIfForPtp;
    @XmlElement(name = "PtpIpAddress")
    protected String ptpIpAddress;
    @XmlElementRef(name = "PtpSubnetCidr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpSubnetCidr;
    @XmlElementRef(name = "PtpVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpVlanId;
    @XmlElementRef(name = "LedEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ledEnabled;

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
     * Gets the value of the enableHomeBs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnableDisableOptions }{@code >}
     *     
     */
    public JAXBElement<EnableDisableOptions> getEnableHomeBs() {
        return enableHomeBs;
    }

    /**
     * Sets the value of the enableHomeBs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnableDisableOptions }{@code >}
     *     
     */
    public void setEnableHomeBs(JAXBElement<EnableDisableOptions> value) {
        this.enableHomeBs = value;
    }

    /**
     * Gets the value of the homeBsFbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeBsFbName() {
        return homeBsFbName;
    }

    /**
     * Sets the value of the homeBsFbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeBsFbName(String value) {
        this.homeBsFbName = value;
    }

    /**
     * Gets the value of the maxLockPeriodForSignOn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxLockPeriodForSignOn() {
        return maxLockPeriodForSignOn;
    }

    /**
     * Sets the value of the maxLockPeriodForSignOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxLockPeriodForSignOn(JAXBElement<Integer> value) {
        this.maxLockPeriodForSignOn = value;
    }

    /**
     * Gets the value of the managementVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getManagementVlanId() {
        return managementVlanId;
    }

    /**
     * Sets the value of the managementVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setManagementVlanId(JAXBElement<Integer> value) {
        this.managementVlanId = value;
    }

    /**
     * Gets the value of the useManagementIfForPtp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getUseManagementIfForPtp() {
        return useManagementIfForPtp;
    }

    /**
     * Sets the value of the useManagementIfForPtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setUseManagementIfForPtp(JAXBElement<EnabledDisabledValues> value) {
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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpSubnetCidr() {
        return ptpSubnetCidr;
    }

    /**
     * Sets the value of the ptpSubnetCidr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpSubnetCidr(JAXBElement<Integer> value) {
        this.ptpSubnetCidr = value;
    }

    /**
     * Gets the value of the ptpVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpVlanId() {
        return ptpVlanId;
    }

    /**
     * Sets the value of the ptpVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpVlanId(JAXBElement<Integer> value) {
        this.ptpVlanId = value;
    }

    /**
     * Gets the value of the ledEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLedEnabled() {
        return ledEnabled;
    }

    /**
     * Sets the value of the ledEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLedEnabled(JAXBElement<Boolean> value) {
        this.ledEnabled = value;
    }

}
