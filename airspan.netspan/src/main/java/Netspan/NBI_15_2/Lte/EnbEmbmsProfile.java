
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for EnbEmbmsProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbEmbmsProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SyncAreaId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AreaList" type="{http://Airspan.Netspan.WebServices}WSEmbmsId" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAreaList" type="{http://Airspan.Netspan.WebServices}WSEmbmsId" minOccurs="0"/&gt;
 *         &lt;element name="BroadcastSib15Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sib15FreqList" type="{http://Airspan.Netspan.WebServices}Sib15FrequencyListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbEmbmsProfile", propOrder = {
    "name",
    "hardwareCategory",
    "enabled",
    "syncAreaId",
    "areaList",
    "serviceAreaList",
    "broadcastSib15Enabled",
    "sib15FreqList"
})
public class EnbEmbmsProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElementRef(name = "Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> enabled;
    @XmlElementRef(name = "SyncAreaId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncAreaId;
    @XmlElement(name = "AreaList")
    protected WSEmbmsId areaList;
    @XmlElement(name = "ServiceAreaList")
    protected WSEmbmsId serviceAreaList;
    @XmlElementRef(name = "BroadcastSib15Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> broadcastSib15Enabled;
    @XmlElement(name = "Sib15FreqList")
    protected Sib15FrequencyListContainer sib15FreqList;

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
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public JAXBElement<CategoriesLte> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesLte> value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEnabled(JAXBElement<Boolean> value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the syncAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncAreaId() {
        return syncAreaId;
    }

    /**
     * Sets the value of the syncAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncAreaId(JAXBElement<Integer> value) {
        this.syncAreaId = value;
    }

    /**
     * Gets the value of the areaList property.
     * 
     * @return
     *     possible object is
     *     {@link WSEmbmsId }
     *     
     */
    public WSEmbmsId getAreaList() {
        return areaList;
    }

    /**
     * Sets the value of the areaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSEmbmsId }
     *     
     */
    public void setAreaList(WSEmbmsId value) {
        this.areaList = value;
    }

    /**
     * Gets the value of the serviceAreaList property.
     * 
     * @return
     *     possible object is
     *     {@link WSEmbmsId }
     *     
     */
    public WSEmbmsId getServiceAreaList() {
        return serviceAreaList;
    }

    /**
     * Sets the value of the serviceAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSEmbmsId }
     *     
     */
    public void setServiceAreaList(WSEmbmsId value) {
        this.serviceAreaList = value;
    }

    /**
     * Gets the value of the broadcastSib15Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBroadcastSib15Enabled() {
        return broadcastSib15Enabled;
    }

    /**
     * Sets the value of the broadcastSib15Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBroadcastSib15Enabled(JAXBElement<Boolean> value) {
        this.broadcastSib15Enabled = value;
    }

    /**
     * Gets the value of the sib15FreqList property.
     * 
     * @return
     *     possible object is
     *     {@link Sib15FrequencyListContainer }
     *     
     */
    public Sib15FrequencyListContainer getSib15FreqList() {
        return sib15FreqList;
    }

    /**
     * Sets the value of the sib15FreqList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sib15FrequencyListContainer }
     *     
     */
    public void setSib15FreqList(Sib15FrequencyListContainer value) {
        this.sib15FreqList = value;
    }

}
