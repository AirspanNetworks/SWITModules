
package Netspan.NBI_14_0.API.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.NodeManagementModes;
import Netspan.API.Lte.IRetunTypes.ILteEnbDetailsSet;


/**
 * <p>Java class for LteEnbDetailsSetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteEnbDetailsSetWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagedMode" type="{http://Airspan.Netspan.WebServices}NodeManagementModeType"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENodeBID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SystemDefaultProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvancedConfigProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SyncProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SonProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagementProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LteCell" type="{http://Airspan.Netspan.WebServices}LteCellSetWs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ActiveAntenna" type="{http://Airspan.Netspan.WebServices}ActiveAntenna"/>
 *         &lt;element name="ControlIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PtpSlaveIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PtpSlaveSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSonServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSonServerSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IpRouteList" type="{http://Airspan.Netspan.WebServices}IpRouteListContainer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteEnbDetailsSetWs", propOrder = {
    "name",
    "description",
    "managedMode",
    "site",
    "region",
    "eNodeBID",
    "systemDefaultProfile",
    "advancedConfigProfile",
    "networkProfile",
    "syncProfile",
    "securityProfile",
    "sonProfile",
    "managementProfile",
    "lteCell",
    "activeAntenna",
    "controlIpAddress",
    "controlSubnetMask",
    "dataIpAddress",
    "dataSubnetMask",
    "ptpSlaveIpAddress",
    "ptpSlaveSubnetMask",
    "cSonServerIpAddress",
    "cSonServerSubnetMask",
    "ipRouteList"
})
public class LteEnbDetailsSetWs implements ILteEnbDetailsSet{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ManagedMode", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected NodeManagementModes managedMode;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "ENodeBID", required = true, type = Integer.class, nillable = true)
    protected Integer eNodeBID;
    @XmlElement(name = "SystemDefaultProfile")
    protected String systemDefaultProfile;
    @XmlElement(name = "AdvancedConfigProfile")
    protected String advancedConfigProfile;
    @XmlElement(name = "NetworkProfile")
    protected String networkProfile;
    @XmlElement(name = "SyncProfile")
    protected String syncProfile;
    @XmlElement(name = "SecurityProfile")
    protected String securityProfile;
    @XmlElement(name = "SonProfile")
    protected String sonProfile;
    @XmlElement(name = "ManagementProfile")
    protected String managementProfile;
    @XmlElement(name = "LteCell")
    protected List<LteCellSetWs> lteCell;
    @XmlElement(name = "ActiveAntenna", required = true, nillable = true)
    protected String activeAntenna;
    @XmlElement(name = "ControlIpAddress")
    protected String controlIpAddress;
    @XmlElement(name = "ControlSubnetMask")
    protected String controlSubnetMask;
    @XmlElement(name = "DataIpAddress")
    protected String dataIpAddress;
    @XmlElement(name = "DataSubnetMask")
    protected String dataSubnetMask;
    @XmlElement(name = "PtpSlaveIpAddress")
    protected String ptpSlaveIpAddress;
    @XmlElement(name = "PtpSlaveSubnetMask")
    protected String ptpSlaveSubnetMask;
    @XmlElement(name = "CSonServerIpAddress")
    protected String cSonServerIpAddress;
    @XmlElement(name = "CSonServerSubnetMask")
    protected String cSonServerSubnetMask;
    @XmlElement(name = "IpRouteList")
    protected IpRouteListContainer ipRouteList;

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
     * Gets the value of the managedMode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementModes }
     *     
     */
    public NodeManagementModes getManagedMode() {
        return managedMode;
    }

    /**
     * Sets the value of the managedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementModes }
     *     
     */
    public void setManagedMode(NodeManagementModes value) {
        this.managedMode = value;
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
     * Gets the value of the eNodeBID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getENodeBID() {
        return eNodeBID;
    }

    /**
     * Sets the value of the eNodeBID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setENodeBID(Integer value) {
        this.eNodeBID = value;
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
     * Gets the value of the advancedConfigProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvancedConfigProfile() {
        return advancedConfigProfile;
    }

    /**
     * Sets the value of the advancedConfigProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvancedConfigProfile(String value) {
        this.advancedConfigProfile = value;
    }

    /**
     * Gets the value of the networkProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkProfile() {
        return networkProfile;
    }

    /**
     * Sets the value of the networkProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkProfile(String value) {
        this.networkProfile = value;
    }

    /**
     * Gets the value of the syncProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncProfile() {
        return syncProfile;
    }

    /**
     * Sets the value of the syncProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncProfile(String value) {
        this.syncProfile = value;
    }

    /**
     * Gets the value of the securityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityProfile() {
        return securityProfile;
    }

    /**
     * Sets the value of the securityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityProfile(String value) {
        this.securityProfile = value;
    }

    /**
     * Gets the value of the sonProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonProfile() {
        return sonProfile;
    }

    /**
     * Sets the value of the sonProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonProfile(String value) {
        this.sonProfile = value;
    }

    /**
     * Gets the value of the managementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementProfile() {
        return managementProfile;
    }

    /**
     * Sets the value of the managementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementProfile(String value) {
        this.managementProfile = value;
    }

    /**
     * Gets the value of the lteCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lteCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLteCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteCellSetWs }
     * 
     * 
     */
    public List<LteCellSetWs> getLteCell() {
        if (lteCell == null) {
            lteCell = new ArrayList<LteCellSetWs>();
        }
        return this.lteCell;
    }

    /**
     * Gets the value of the activeAntenna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveAntenna() {
        return activeAntenna;
    }

    /**
     * Sets the value of the activeAntenna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveAntenna(String value) {
        this.activeAntenna = value;
    }

    /**
     * Gets the value of the controlIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlIpAddress() {
        return controlIpAddress;
    }

    /**
     * Sets the value of the controlIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlIpAddress(String value) {
        this.controlIpAddress = value;
    }

    /**
     * Gets the value of the controlSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlSubnetMask() {
        return controlSubnetMask;
    }

    /**
     * Sets the value of the controlSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlSubnetMask(String value) {
        this.controlSubnetMask = value;
    }

    /**
     * Gets the value of the dataIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIpAddress() {
        return dataIpAddress;
    }

    /**
     * Sets the value of the dataIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIpAddress(String value) {
        this.dataIpAddress = value;
    }

    /**
     * Gets the value of the dataSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSubnetMask() {
        return dataSubnetMask;
    }

    /**
     * Sets the value of the dataSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSubnetMask(String value) {
        this.dataSubnetMask = value;
    }

    /**
     * Gets the value of the ptpSlaveIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtpSlaveIpAddress() {
        return ptpSlaveIpAddress;
    }

    /**
     * Sets the value of the ptpSlaveIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtpSlaveIpAddress(String value) {
        this.ptpSlaveIpAddress = value;
    }

    /**
     * Gets the value of the ptpSlaveSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtpSlaveSubnetMask() {
        return ptpSlaveSubnetMask;
    }

    /**
     * Sets the value of the ptpSlaveSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtpSlaveSubnetMask(String value) {
        this.ptpSlaveSubnetMask = value;
    }

    /**
     * Gets the value of the cSonServerIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSonServerIpAddress() {
        return cSonServerIpAddress;
    }

    /**
     * Sets the value of the cSonServerIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSonServerIpAddress(String value) {
        this.cSonServerIpAddress = value;
    }

    /**
     * Gets the value of the cSonServerSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSonServerSubnetMask() {
        return cSonServerSubnetMask;
    }

    /**
     * Sets the value of the cSonServerSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSonServerSubnetMask(String value) {
        this.cSonServerSubnetMask = value;
    }

    /**
     * Gets the value of the ipRouteList property.
     * 
     * @return
     *     possible object is
     *     {@link IpRouteListContainer }
     *     
     */
    public IpRouteListContainer getIpRouteList() {
        return ipRouteList;
    }

    /**
     * Sets the value of the ipRouteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpRouteListContainer }
     *     
     */
    public void setIpRouteList(IpRouteListContainer value) {
        this.ipRouteList = value;
    }

}
