
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbManagementProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbManagementProfileParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GranularityPeriod" type="{http://Airspan.Netspan.WebServices}GranularityPeriod" minOccurs="0"/>
 *         &lt;element name="StatsCollectionIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PerQciStatsIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PerTargetCellStatsIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PerMcsStatsIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AnrStatusCollectionIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaintenanceWindowIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaintenanceWindowConfiguration" type="{http://Airspan.Netspan.WebServices}MaintenanceWindowConfigurationWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbManagementProfileParams", propOrder = {
    "granularityPeriod",
    "statsCollectionIsEnabled",
    "perQciStatsIsEnabled",
    "perTargetCellStatsIsEnabled",
    "perMcsStatsIsEnabled",
    "anrStatusCollectionIsEnabled",
    "maintenanceWindowIsEnabled",
    "maintenanceWindowConfiguration"
})
@XmlSeeAlso({
    EnbManagementProfile.class
})
public class EnbManagementProfileParams {

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
    @XmlElementRef(name = "MaintenanceWindowIsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maintenanceWindowIsEnabled;
    @XmlElement(name = "MaintenanceWindowConfiguration")
    protected MaintenanceWindowConfigurationWs maintenanceWindowConfiguration;

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

    /**
     * Gets the value of the maintenanceWindowIsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaintenanceWindowIsEnabled() {
        return maintenanceWindowIsEnabled;
    }

    /**
     * Sets the value of the maintenanceWindowIsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaintenanceWindowIsEnabled(JAXBElement<Boolean> value) {
        this.maintenanceWindowIsEnabled = value;
    }

    /**
     * Gets the value of the maintenanceWindowConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceWindowConfigurationWs }
     *     
     */
    public MaintenanceWindowConfigurationWs getMaintenanceWindowConfiguration() {
        return maintenanceWindowConfiguration;
    }

    /**
     * Sets the value of the maintenanceWindowConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceWindowConfigurationWs }
     *     
     */
    public void setMaintenanceWindowConfiguration(MaintenanceWindowConfigurationWs value) {
        this.maintenanceWindowConfiguration = value;
    }

}
