
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for LteManagementProfileWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteManagementProfileWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte"/>
 *         &lt;element name="GranularityPeriod" type="{http://Airspan.Netspan.WebServices}GranularityPeriod"/>
 *         &lt;element name="CellLevelRbQoSEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="CellLevelRbQoSPerQciEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="CsfbEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="EquipMeasureEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="ERabEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="ERabPerQciEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="HoEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="HoPerTargetCellEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="PagingEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="RachEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="RachAccessDelayEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="RachPreamblesSentEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="RruEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="RruPerQciEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="RfMeasureEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="RrcEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="UEAssociatedS1Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteManagementProfileWs", propOrder = {
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
public class LteManagementProfileWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "HardwareCategory", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CategoriesLte hardwareCategory;
    @XmlElement(name = "GranularityPeriod", required = true, nillable = true)
    protected String granularityPeriod;
    @XmlElement(name = "CellLevelRbQoSEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues cellLevelRbQoSEnabled;
    @XmlElement(name = "CellLevelRbQoSPerQciEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues cellLevelRbQoSPerQciEnabled;
    @XmlElement(name = "CsfbEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues csfbEnabled;
    @XmlElement(name = "EquipMeasureEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues equipMeasureEnabled;
    @XmlElement(name = "ERabEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues eRabEnabled;
    @XmlElement(name = "ERabPerQciEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues eRabPerQciEnabled;
    @XmlElement(name = "HoEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues hoEnabled;
    @XmlElement(name = "HoPerTargetCellEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues hoPerTargetCellEnabled;
    @XmlElement(name = "PagingEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues pagingEnabled;
    @XmlElement(name = "RachEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues rachEnabled;
    @XmlElement(name = "RachAccessDelayEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues rachAccessDelayEnabled;
    @XmlElement(name = "RachPreamblesSentEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues rachPreamblesSentEnabled;
    @XmlElement(name = "RruEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues rruEnabled;
    @XmlElement(name = "RruPerQciEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues rruPerQciEnabled;
    @XmlElement(name = "RfMeasureEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues rfMeasureEnabled;
    @XmlElement(name = "RrcEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues rrcEnabled;
    @XmlElement(name = "UEAssociatedS1Enabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues ueAssociatedS1Enabled;

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
     *     {@link CategoriesLte }
     *     
     */
    public CategoriesLte getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriesLte }
     *     
     */
    public void setHardwareCategory(CategoriesLte value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the granularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGranularityPeriod(String value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the cellLevelRbQoSEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getCellLevelRbQoSEnabled() {
        return cellLevelRbQoSEnabled;
    }

    /**
     * Sets the value of the cellLevelRbQoSEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setCellLevelRbQoSEnabled(EnabledDisabledValues value) {
        this.cellLevelRbQoSEnabled = value;
    }

    /**
     * Gets the value of the cellLevelRbQoSPerQciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getCellLevelRbQoSPerQciEnabled() {
        return cellLevelRbQoSPerQciEnabled;
    }

    /**
     * Sets the value of the cellLevelRbQoSPerQciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setCellLevelRbQoSPerQciEnabled(EnabledDisabledValues value) {
        this.cellLevelRbQoSPerQciEnabled = value;
    }

    /**
     * Gets the value of the csfbEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getCsfbEnabled() {
        return csfbEnabled;
    }

    /**
     * Sets the value of the csfbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setCsfbEnabled(EnabledDisabledValues value) {
        this.csfbEnabled = value;
    }

    /**
     * Gets the value of the equipMeasureEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getEquipMeasureEnabled() {
        return equipMeasureEnabled;
    }

    /**
     * Sets the value of the equipMeasureEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setEquipMeasureEnabled(EnabledDisabledValues value) {
        this.equipMeasureEnabled = value;
    }

    /**
     * Gets the value of the eRabEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getERabEnabled() {
        return eRabEnabled;
    }

    /**
     * Sets the value of the eRabEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setERabEnabled(EnabledDisabledValues value) {
        this.eRabEnabled = value;
    }

    /**
     * Gets the value of the eRabPerQciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getERabPerQciEnabled() {
        return eRabPerQciEnabled;
    }

    /**
     * Sets the value of the eRabPerQciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setERabPerQciEnabled(EnabledDisabledValues value) {
        this.eRabPerQciEnabled = value;
    }

    /**
     * Gets the value of the hoEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getHoEnabled() {
        return hoEnabled;
    }

    /**
     * Sets the value of the hoEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setHoEnabled(EnabledDisabledValues value) {
        this.hoEnabled = value;
    }

    /**
     * Gets the value of the hoPerTargetCellEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getHoPerTargetCellEnabled() {
        return hoPerTargetCellEnabled;
    }

    /**
     * Sets the value of the hoPerTargetCellEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setHoPerTargetCellEnabled(EnabledDisabledValues value) {
        this.hoPerTargetCellEnabled = value;
    }

    /**
     * Gets the value of the pagingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getPagingEnabled() {
        return pagingEnabled;
    }

    /**
     * Sets the value of the pagingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setPagingEnabled(EnabledDisabledValues value) {
        this.pagingEnabled = value;
    }

    /**
     * Gets the value of the rachEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getRachEnabled() {
        return rachEnabled;
    }

    /**
     * Sets the value of the rachEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setRachEnabled(EnabledDisabledValues value) {
        this.rachEnabled = value;
    }

    /**
     * Gets the value of the rachAccessDelayEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getRachAccessDelayEnabled() {
        return rachAccessDelayEnabled;
    }

    /**
     * Sets the value of the rachAccessDelayEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setRachAccessDelayEnabled(EnabledDisabledValues value) {
        this.rachAccessDelayEnabled = value;
    }

    /**
     * Gets the value of the rachPreamblesSentEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getRachPreamblesSentEnabled() {
        return rachPreamblesSentEnabled;
    }

    /**
     * Sets the value of the rachPreamblesSentEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setRachPreamblesSentEnabled(EnabledDisabledValues value) {
        this.rachPreamblesSentEnabled = value;
    }

    /**
     * Gets the value of the rruEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getRruEnabled() {
        return rruEnabled;
    }

    /**
     * Sets the value of the rruEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setRruEnabled(EnabledDisabledValues value) {
        this.rruEnabled = value;
    }

    /**
     * Gets the value of the rruPerQciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getRruPerQciEnabled() {
        return rruPerQciEnabled;
    }

    /**
     * Sets the value of the rruPerQciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setRruPerQciEnabled(EnabledDisabledValues value) {
        this.rruPerQciEnabled = value;
    }

    /**
     * Gets the value of the rfMeasureEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getRfMeasureEnabled() {
        return rfMeasureEnabled;
    }

    /**
     * Sets the value of the rfMeasureEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setRfMeasureEnabled(EnabledDisabledValues value) {
        this.rfMeasureEnabled = value;
    }

    /**
     * Gets the value of the rrcEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getRrcEnabled() {
        return rrcEnabled;
    }

    /**
     * Sets the value of the rrcEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setRrcEnabled(EnabledDisabledValues value) {
        this.rrcEnabled = value;
    }

    /**
     * Gets the value of the ueAssociatedS1Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getUEAssociatedS1Enabled() {
        return ueAssociatedS1Enabled;
    }

    /**
     * Sets the value of the ueAssociatedS1Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setUEAssociatedS1Enabled(EnabledDisabledValues value) {
        this.ueAssociatedS1Enabled = value;
    }

}
