
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for EnbManagementProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbManagementProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/>
 *         &lt;element name="GranularityPeriod" type="{http://Airspan.Netspan.WebServices}GranularityPeriod" minOccurs="0"/>
 *         &lt;element name="CellLevelRbQoSEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="CellLevelRbQoSPerQciEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="CsfbEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="EquipMeasureEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="ERabEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="ERabPerQciEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="HoEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="HoPerTargetCellEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="PagingEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="RachEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="RachAccessDelayEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="RachPreamblesSentEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="RruEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="RruPerQciEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="RfMeasureEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="RrcEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="UEAssociatedS1Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbManagementProfile", propOrder = {
    "name",
    "hardwareCategory",
    "granularityPeriod",
    "cellLevelRbQoSEnabled",
    "cellLevelRbQoSPerQciEnabled",
    "csfbEnabled",
    "equipMeasureEnabled",
    "eRabEnabled",
    "eRabPerQciEnabled",
    "hoEnabled",
    "hoPerTargetCellEnabled",
    "pagingEnabled",
    "rachEnabled",
    "rachAccessDelayEnabled",
    "rachPreamblesSentEnabled",
    "rruEnabled",
    "rruPerQciEnabled",
    "rfMeasureEnabled",
    "rrcEnabled",
    "ueAssociatedS1Enabled"
})
public class EnbManagementProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> granularityPeriod;
    @XmlElementRef(name = "CellLevelRbQoSEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> cellLevelRbQoSEnabled;
    @XmlElementRef(name = "CellLevelRbQoSPerQciEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> cellLevelRbQoSPerQciEnabled;
    @XmlElementRef(name = "CsfbEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> csfbEnabled;
    @XmlElementRef(name = "EquipMeasureEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> equipMeasureEnabled;
    @XmlElementRef(name = "ERabEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> eRabEnabled;
    @XmlElementRef(name = "ERabPerQciEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> eRabPerQciEnabled;
    @XmlElementRef(name = "HoEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> hoEnabled;
    @XmlElementRef(name = "HoPerTargetCellEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> hoPerTargetCellEnabled;
    @XmlElementRef(name = "PagingEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> pagingEnabled;
    @XmlElementRef(name = "RachEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> rachEnabled;
    @XmlElementRef(name = "RachAccessDelayEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> rachAccessDelayEnabled;
    @XmlElementRef(name = "RachPreamblesSentEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> rachPreamblesSentEnabled;
    @XmlElementRef(name = "RruEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> rruEnabled;
    @XmlElementRef(name = "RruPerQciEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> rruPerQciEnabled;
    @XmlElementRef(name = "RfMeasureEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> rfMeasureEnabled;
    @XmlElementRef(name = "RrcEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> rrcEnabled;
    @XmlElementRef(name = "UEAssociatedS1Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> ueAssociatedS1Enabled;

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
     * Gets the value of the granularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGranularityPeriod(JAXBElement<String> value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the cellLevelRbQoSEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getCellLevelRbQoSEnabled() {
        return cellLevelRbQoSEnabled;
    }

    /**
     * Sets the value of the cellLevelRbQoSEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setCellLevelRbQoSEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.cellLevelRbQoSEnabled = value;
    }

    /**
     * Gets the value of the cellLevelRbQoSPerQciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getCellLevelRbQoSPerQciEnabled() {
        return cellLevelRbQoSPerQciEnabled;
    }

    /**
     * Sets the value of the cellLevelRbQoSPerQciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setCellLevelRbQoSPerQciEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.cellLevelRbQoSPerQciEnabled = value;
    }

    /**
     * Gets the value of the csfbEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getCsfbEnabled() {
        return csfbEnabled;
    }

    /**
     * Sets the value of the csfbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setCsfbEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.csfbEnabled = value;
    }

    /**
     * Gets the value of the equipMeasureEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getEquipMeasureEnabled() {
        return equipMeasureEnabled;
    }

    /**
     * Sets the value of the equipMeasureEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setEquipMeasureEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.equipMeasureEnabled = value;
    }

    /**
     * Gets the value of the eRabEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getERabEnabled() {
        return eRabEnabled;
    }

    /**
     * Sets the value of the eRabEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setERabEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.eRabEnabled = value;
    }

    /**
     * Gets the value of the eRabPerQciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getERabPerQciEnabled() {
        return eRabPerQciEnabled;
    }

    /**
     * Sets the value of the eRabPerQciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setERabPerQciEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.eRabPerQciEnabled = value;
    }

    /**
     * Gets the value of the hoEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getHoEnabled() {
        return hoEnabled;
    }

    /**
     * Sets the value of the hoEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setHoEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.hoEnabled = value;
    }

    /**
     * Gets the value of the hoPerTargetCellEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getHoPerTargetCellEnabled() {
        return hoPerTargetCellEnabled;
    }

    /**
     * Sets the value of the hoPerTargetCellEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setHoPerTargetCellEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.hoPerTargetCellEnabled = value;
    }

    /**
     * Gets the value of the pagingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getPagingEnabled() {
        return pagingEnabled;
    }

    /**
     * Sets the value of the pagingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setPagingEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.pagingEnabled = value;
    }

    /**
     * Gets the value of the rachEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getRachEnabled() {
        return rachEnabled;
    }

    /**
     * Sets the value of the rachEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setRachEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.rachEnabled = value;
    }

    /**
     * Gets the value of the rachAccessDelayEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getRachAccessDelayEnabled() {
        return rachAccessDelayEnabled;
    }

    /**
     * Sets the value of the rachAccessDelayEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setRachAccessDelayEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.rachAccessDelayEnabled = value;
    }

    /**
     * Gets the value of the rachPreamblesSentEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getRachPreamblesSentEnabled() {
        return rachPreamblesSentEnabled;
    }

    /**
     * Sets the value of the rachPreamblesSentEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setRachPreamblesSentEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.rachPreamblesSentEnabled = value;
    }

    /**
     * Gets the value of the rruEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getRruEnabled() {
        return rruEnabled;
    }

    /**
     * Sets the value of the rruEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setRruEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.rruEnabled = value;
    }

    /**
     * Gets the value of the rruPerQciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getRruPerQciEnabled() {
        return rruPerQciEnabled;
    }

    /**
     * Sets the value of the rruPerQciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setRruPerQciEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.rruPerQciEnabled = value;
    }

    /**
     * Gets the value of the rfMeasureEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getRfMeasureEnabled() {
        return rfMeasureEnabled;
    }

    /**
     * Sets the value of the rfMeasureEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setRfMeasureEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.rfMeasureEnabled = value;
    }

    /**
     * Gets the value of the rrcEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getRrcEnabled() {
        return rrcEnabled;
    }

    /**
     * Sets the value of the rrcEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setRrcEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.rrcEnabled = value;
    }

    /**
     * Gets the value of the ueAssociatedS1Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getUEAssociatedS1Enabled() {
        return ueAssociatedS1Enabled;
    }

    /**
     * Sets the value of the ueAssociatedS1Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setUEAssociatedS1Enabled(JAXBElement<EnabledDisabledValues> value) {
        this.ueAssociatedS1Enabled = value;
    }

}
