
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for EnbCellAdvancedProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbCellAdvancedProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/>
 *         &lt;element name="RandomAccess" type="{http://Airspan.Netspan.WebServices}RandomAccessWs" minOccurs="0"/>
 *         &lt;element name="UplinkPowerControl" type="{http://Airspan.Netspan.WebServices}UplinkPowerControlWs" minOccurs="0"/>
 *         &lt;element name="Mobility" type="{http://Airspan.Netspan.WebServices}MobilityWs" minOccurs="0"/>
 *         &lt;element name="RrcTimers" type="{http://Airspan.Netspan.WebServices}CellRrcTimersWs" minOccurs="0"/>
 *         &lt;element name="VolteConfiguration" type="{http://Airspan.Netspan.WebServices}CellVolteConfigurationWs" minOccurs="0"/>
 *         &lt;element name="Anr" type="{http://Airspan.Netspan.WebServices}AnrWs" minOccurs="0"/>
 *         &lt;element name="Etws" type="{http://Airspan.Netspan.WebServices}EtwsWs" minOccurs="0"/>
 *         &lt;element name="Sib1" type="{http://Airspan.Netspan.WebServices}Sib1Ws" minOccurs="0"/>
 *         &lt;element name="ReselectionToUtran" type="{http://Airspan.Netspan.WebServices}ReselectionToUtranWs" minOccurs="0"/>
 *         &lt;element name="ReselectionToGeran" type="{http://Airspan.Netspan.WebServices}ReselectionToGeranWs" minOccurs="0"/>
 *         &lt;element name="EsonMcim" type="{http://Airspan.Netspan.WebServices}EsonMcimWs" minOccurs="0"/>
 *         &lt;element name="EsonMlb" type="{http://Airspan.Netspan.WebServices}EsonMlbWs" minOccurs="0"/>
 *         &lt;element name="EsonMro" type="{http://Airspan.Netspan.WebServices}EsonMroWs" minOccurs="0"/>
 *         &lt;element name="NeighborManagement" type="{http://Airspan.Netspan.WebServices}CellNeighborManagementWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbCellAdvancedProfile", propOrder = {
    "name",
    "hardwareCategory",
    "randomAccess",
    "uplinkPowerControl",
    "mobility",
    "rrcTimers",
    "volteConfiguration",
    "anr",
    "etws",
    "sib1",
    "reselectionToUtran",
    "reselectionToGeran",
    "esonMcim",
    "esonMlb",
    "esonMro",
    "neighborManagement"
})
public class EnbCellAdvancedProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElement(name = "RandomAccess")
    protected RandomAccessWs randomAccess;
    @XmlElement(name = "UplinkPowerControl")
    protected UplinkPowerControlWs uplinkPowerControl;
    @XmlElement(name = "Mobility")
    protected MobilityWs mobility;
    @XmlElement(name = "RrcTimers")
    protected CellRrcTimersWs rrcTimers;
    @XmlElement(name = "VolteConfiguration")
    protected CellVolteConfigurationWs volteConfiguration;
    @XmlElement(name = "Anr")
    protected AnrWs anr;
    @XmlElement(name = "Etws")
    protected EtwsWs etws;
    @XmlElement(name = "Sib1")
    protected Sib1Ws sib1;
    @XmlElement(name = "ReselectionToUtran")
    protected ReselectionToUtranWs reselectionToUtran;
    @XmlElement(name = "ReselectionToGeran")
    protected ReselectionToGeranWs reselectionToGeran;
    @XmlElement(name = "EsonMcim")
    protected EsonMcimWs esonMcim;
    @XmlElement(name = "EsonMlb")
    protected EsonMlbWs esonMlb;
    @XmlElement(name = "EsonMro")
    protected EsonMroWs esonMro;
    @XmlElement(name = "NeighborManagement")
    protected CellNeighborManagementWs neighborManagement;

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
     * Gets the value of the randomAccess property.
     * 
     * @return
     *     possible object is
     *     {@link RandomAccessWs }
     *     
     */
    public RandomAccessWs getRandomAccess() {
        return randomAccess;
    }

    /**
     * Sets the value of the randomAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link RandomAccessWs }
     *     
     */
    public void setRandomAccess(RandomAccessWs value) {
        this.randomAccess = value;
    }

    /**
     * Gets the value of the uplinkPowerControl property.
     * 
     * @return
     *     possible object is
     *     {@link UplinkPowerControlWs }
     *     
     */
    public UplinkPowerControlWs getUplinkPowerControl() {
        return uplinkPowerControl;
    }

    /**
     * Sets the value of the uplinkPowerControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UplinkPowerControlWs }
     *     
     */
    public void setUplinkPowerControl(UplinkPowerControlWs value) {
        this.uplinkPowerControl = value;
    }

    /**
     * Gets the value of the mobility property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityWs }
     *     
     */
    public MobilityWs getMobility() {
        return mobility;
    }

    /**
     * Sets the value of the mobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityWs }
     *     
     */
    public void setMobility(MobilityWs value) {
        this.mobility = value;
    }

    /**
     * Gets the value of the rrcTimers property.
     * 
     * @return
     *     possible object is
     *     {@link CellRrcTimersWs }
     *     
     */
    public CellRrcTimersWs getRrcTimers() {
        return rrcTimers;
    }

    /**
     * Sets the value of the rrcTimers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellRrcTimersWs }
     *     
     */
    public void setRrcTimers(CellRrcTimersWs value) {
        this.rrcTimers = value;
    }

    /**
     * Gets the value of the volteConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link CellVolteConfigurationWs }
     *     
     */
    public CellVolteConfigurationWs getVolteConfiguration() {
        return volteConfiguration;
    }

    /**
     * Sets the value of the volteConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellVolteConfigurationWs }
     *     
     */
    public void setVolteConfiguration(CellVolteConfigurationWs value) {
        this.volteConfiguration = value;
    }

    /**
     * Gets the value of the anr property.
     * 
     * @return
     *     possible object is
     *     {@link AnrWs }
     *     
     */
    public AnrWs getAnr() {
        return anr;
    }

    /**
     * Sets the value of the anr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnrWs }
     *     
     */
    public void setAnr(AnrWs value) {
        this.anr = value;
    }

    /**
     * Gets the value of the etws property.
     * 
     * @return
     *     possible object is
     *     {@link EtwsWs }
     *     
     */
    public EtwsWs getEtws() {
        return etws;
    }

    /**
     * Sets the value of the etws property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtwsWs }
     *     
     */
    public void setEtws(EtwsWs value) {
        this.etws = value;
    }

    /**
     * Gets the value of the sib1 property.
     * 
     * @return
     *     possible object is
     *     {@link Sib1Ws }
     *     
     */
    public Sib1Ws getSib1() {
        return sib1;
    }

    /**
     * Sets the value of the sib1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sib1Ws }
     *     
     */
    public void setSib1(Sib1Ws value) {
        this.sib1 = value;
    }

    /**
     * Gets the value of the reselectionToUtran property.
     * 
     * @return
     *     possible object is
     *     {@link ReselectionToUtranWs }
     *     
     */
    public ReselectionToUtranWs getReselectionToUtran() {
        return reselectionToUtran;
    }

    /**
     * Sets the value of the reselectionToUtran property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReselectionToUtranWs }
     *     
     */
    public void setReselectionToUtran(ReselectionToUtranWs value) {
        this.reselectionToUtran = value;
    }

    /**
     * Gets the value of the reselectionToGeran property.
     * 
     * @return
     *     possible object is
     *     {@link ReselectionToGeranWs }
     *     
     */
    public ReselectionToGeranWs getReselectionToGeran() {
        return reselectionToGeran;
    }

    /**
     * Sets the value of the reselectionToGeran property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReselectionToGeranWs }
     *     
     */
    public void setReselectionToGeran(ReselectionToGeranWs value) {
        this.reselectionToGeran = value;
    }

    /**
     * Gets the value of the esonMcim property.
     * 
     * @return
     *     possible object is
     *     {@link EsonMcimWs }
     *     
     */
    public EsonMcimWs getEsonMcim() {
        return esonMcim;
    }

    /**
     * Sets the value of the esonMcim property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsonMcimWs }
     *     
     */
    public void setEsonMcim(EsonMcimWs value) {
        this.esonMcim = value;
    }

    /**
     * Gets the value of the esonMlb property.
     * 
     * @return
     *     possible object is
     *     {@link EsonMlbWs }
     *     
     */
    public EsonMlbWs getEsonMlb() {
        return esonMlb;
    }

    /**
     * Sets the value of the esonMlb property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsonMlbWs }
     *     
     */
    public void setEsonMlb(EsonMlbWs value) {
        this.esonMlb = value;
    }

    /**
     * Gets the value of the esonMro property.
     * 
     * @return
     *     possible object is
     *     {@link EsonMroWs }
     *     
     */
    public EsonMroWs getEsonMro() {
        return esonMro;
    }

    /**
     * Sets the value of the esonMro property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsonMroWs }
     *     
     */
    public void setEsonMro(EsonMroWs value) {
        this.esonMro = value;
    }

    /**
     * Gets the value of the neighborManagement property.
     * 
     * @return
     *     possible object is
     *     {@link CellNeighborManagementWs }
     *     
     */
    public CellNeighborManagementWs getNeighborManagement() {
        return neighborManagement;
    }

    /**
     * Sets the value of the neighborManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellNeighborManagementWs }
     *     
     */
    public void setNeighborManagement(CellNeighborManagementWs value) {
        this.neighborManagement = value;
    }

}
