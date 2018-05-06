
package Netspan.NBI_14_50.API.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IRelayDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IRelayDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagedMode" type="{http://Airspan.Netspan.WebServices}NodeManagementModeType" minOccurs="0"/>
 *         &lt;element name="ManagementModeOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SystemDefaultProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IRelayProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPdclLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Pdcl" type="{http://Airspan.Netspan.WebServices}PdclEntryWs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IsAllowedBandsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowedBands" type="{http://Airspan.Netspan.WebServices}AllowedBandWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IRelayDetails", propOrder = {
    "name",
    "description",
    "region",
    "site",
    "managedMode",
    "managementModeOnly",
    "systemDefaultProfile",
    "iRelayProfile",
    "isPdclLocked",
    "pdcl",
    "isAllowedBandsLocked",
    "allowedBands"
})
public class IRelayDetails {

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
    @XmlElementRef(name = "ManagementModeOnly", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> managementModeOnly;
    @XmlElement(name = "SystemDefaultProfile")
    protected String systemDefaultProfile;
    @XmlElement(name = "IRelayProfile")
    protected String iRelayProfile;
    @XmlElementRef(name = "IsPdclLocked", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPdclLocked;
    @XmlElement(name = "Pdcl")
    protected List<PdclEntryWs> pdcl;
    @XmlElementRef(name = "IsAllowedBandsLocked", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAllowedBandsLocked;
    @XmlElement(name = "AllowedBands")
    protected AllowedBandWs allowedBands;

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
     * Gets the value of the managementModeOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getManagementModeOnly() {
        return managementModeOnly;
    }

    /**
     * Sets the value of the managementModeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setManagementModeOnly(JAXBElement<Boolean> value) {
        this.managementModeOnly = value;
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
     * Gets the value of the iRelayProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIRelayProfile() {
        return iRelayProfile;
    }

    /**
     * Sets the value of the iRelayProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIRelayProfile(String value) {
        this.iRelayProfile = value;
    }

    /**
     * Gets the value of the isPdclLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPdclLocked() {
        return isPdclLocked;
    }

    /**
     * Sets the value of the isPdclLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPdclLocked(JAXBElement<Boolean> value) {
        this.isPdclLocked = value;
    }

    /**
     * Gets the value of the pdcl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdcl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdcl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PdclEntryWs }
     * 
     * 
     */
    public List<PdclEntryWs> getPdcl() {
        if (pdcl == null) {
            pdcl = new ArrayList<PdclEntryWs>();
        }
        return this.pdcl;
    }

    /**
     * Gets the value of the isAllowedBandsLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAllowedBandsLocked() {
        return isAllowedBandsLocked;
    }

    /**
     * Sets the value of the isAllowedBandsLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAllowedBandsLocked(JAXBElement<Boolean> value) {
        this.isAllowedBandsLocked = value;
    }

    /**
     * Gets the value of the allowedBands property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedBandWs }
     *     
     */
    public AllowedBandWs getAllowedBands() {
        return allowedBands;
    }

    /**
     * Sets the value of the allowedBands property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedBandWs }
     *     
     */
    public void setAllowedBands(AllowedBandWs value) {
        this.allowedBands = value;
    }

}
