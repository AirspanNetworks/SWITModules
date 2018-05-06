
package Netspan.NBI_14_50.API.Lte;

import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType name="EnbEmbmsProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SyncAreaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AreaList" type="{http://Airspan.Netspan.WebServices}WSEmbmsAreaEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServiceAreaList" type="{http://Airspan.Netspan.WebServices}WSEmbmsServiceAreaEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "serviceAreaList"
})
public class EnbEmbmsProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "SyncAreaId")
    protected int syncAreaId;
    @XmlElement(name = "AreaList")
    protected List<WSEmbmsAreaEntry> areaList;
    @XmlElement(name = "ServiceAreaList")
    protected List<WSEmbmsServiceAreaEntry> serviceAreaList;

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
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the syncAreaId property.
     * 
     */
    public int getSyncAreaId() {
        return syncAreaId;
    }

    /**
     * Sets the value of the syncAreaId property.
     * 
     */
    public void setSyncAreaId(int value) {
        this.syncAreaId = value;
    }

    /**
     * Gets the value of the areaList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSEmbmsAreaEntry }
     * 
     * 
     */
    public List<WSEmbmsAreaEntry> getAreaList() {
        if (areaList == null) {
            areaList = new ArrayList<WSEmbmsAreaEntry>();
        }
        return this.areaList;
    }

    /**
     * Gets the value of the serviceAreaList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAreaList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAreaList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSEmbmsServiceAreaEntry }
     * 
     * 
     */
    public List<WSEmbmsServiceAreaEntry> getServiceAreaList() {
        if (serviceAreaList == null) {
            serviceAreaList = new ArrayList<WSEmbmsServiceAreaEntry>();
        }
        return this.serviceAreaList;
    }

}
