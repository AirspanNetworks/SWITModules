
package Netspan.NBI_15_2.Lte;

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
 * &lt;complexType name="EnbManagementProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://Airspan.Netspan.WebServices}GranularityPeriod" minOccurs="0"/&gt;
 *         &lt;element name="StatsCollectionIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerQciStatsIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerTargetCellStatsIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerMcsStatsIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AnrStatusCollectionIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbManagementProfile", propOrder = {
    "name",
    "hardwareCategory",
    "granularityPeriod",
    "statsCollectionIsEnabled",
    "perQciStatsIsEnabled",
    "perTargetCellStatsIsEnabled",
    "perMcsStatsIsEnabled",
    "anrStatusCollectionIsEnabled"
})
public class EnbManagementProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> granularityPeriod;
    @XmlElementRef(name = "StatsCollectionIsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> statsCollectionIsEnabled;
    @XmlElementRef(name = "PerQciStatsIsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> perQciStatsIsEnabled;
    @XmlElementRef(name = "PerTargetCellStatsIsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> perTargetCellStatsIsEnabled;
    @XmlElementRef(name = "PerMcsStatsIsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> perMcsStatsIsEnabled;
    @XmlElementRef(name = "AnrStatusCollectionIsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> anrStatusCollectionIsEnabled;

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
     * Gets the value of the statsCollectionIsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStatsCollectionIsEnabled() {
        return statsCollectionIsEnabled;
    }

    /**
     * Sets the value of the statsCollectionIsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStatsCollectionIsEnabled(JAXBElement<Boolean> value) {
        this.statsCollectionIsEnabled = value;
    }

    /**
     * Gets the value of the perQciStatsIsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPerQciStatsIsEnabled() {
        return perQciStatsIsEnabled;
    }

    /**
     * Sets the value of the perQciStatsIsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPerQciStatsIsEnabled(JAXBElement<Boolean> value) {
        this.perQciStatsIsEnabled = value;
    }

    /**
     * Gets the value of the perTargetCellStatsIsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPerTargetCellStatsIsEnabled() {
        return perTargetCellStatsIsEnabled;
    }

    /**
     * Sets the value of the perTargetCellStatsIsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPerTargetCellStatsIsEnabled(JAXBElement<Boolean> value) {
        this.perTargetCellStatsIsEnabled = value;
    }

    /**
     * Gets the value of the perMcsStatsIsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPerMcsStatsIsEnabled() {
        return perMcsStatsIsEnabled;
    }

    /**
     * Sets the value of the perMcsStatsIsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPerMcsStatsIsEnabled(JAXBElement<Boolean> value) {
        this.perMcsStatsIsEnabled = value;
    }

    /**
     * Gets the value of the anrStatusCollectionIsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAnrStatusCollectionIsEnabled() {
        return anrStatusCollectionIsEnabled;
    }

    /**
     * Sets the value of the anrStatusCollectionIsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAnrStatusCollectionIsEnabled(JAXBElement<Boolean> value) {
        this.anrStatusCollectionIsEnabled = value;
    }

}
