
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteAdvancedProfileWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteAdvancedProfileWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RandomAccess" type="{http://Airspan.Netspan.WebServices}RandomAccessWs" minOccurs="0"/>
 *         &lt;element name="UplinkPowerControl" type="{http://Airspan.Netspan.WebServices}UplinkPowerControlWs" minOccurs="0"/>
 *         &lt;element name="Mobility" type="{http://Airspan.Netspan.WebServices}MobilityWs" minOccurs="0"/>
 *         &lt;element name="RrcTimers" type="{http://Airspan.Netspan.WebServices}RrcTimersWs" minOccurs="0"/>
 *         &lt;element name="PlugAndPlay" type="{http://Airspan.Netspan.WebServices}PlugAndPlayWs" minOccurs="0"/>
 *         &lt;element name="PlugAndPlayWarmRebootMask" type="{http://Airspan.Netspan.WebServices}PlugAndPlayWarmRebootMaskWs" minOccurs="0"/>
 *         &lt;element name="VolteConfiguration" type="{http://Airspan.Netspan.WebServices}VolteConfigurationkWs" minOccurs="0"/>
 *         &lt;element name="Anr" type="{http://Airspan.Netspan.WebServices}AnrWs" minOccurs="0"/>
 *         &lt;element name="Synchronisation" type="{http://Airspan.Netspan.WebServices}SynchronisationWs" minOccurs="0"/>
 *         &lt;element name="Eson" type="{http://Airspan.Netspan.WebServices}EsonWs" minOccurs="0"/>
 *         &lt;element name="EsonMcim" type="{http://Airspan.Netspan.WebServices}EsonMcimWs" minOccurs="0"/>
 *         &lt;element name="EsonMlb" type="{http://Airspan.Netspan.WebServices}EsonMlbWs" minOccurs="0"/>
 *         &lt;element name="EsonMro" type="{http://Airspan.Netspan.WebServices}EsonMroWs" minOccurs="0"/>
 *         &lt;element name="EmergencyCall" type="{http://Airspan.Netspan.WebServices}EmergencyCallWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteAdvancedProfileWs", propOrder = {
    "name",
    "randomAccess",
    "uplinkPowerControl",
    "mobility",
    "rrcTimers",
    "plugAndPlay",
    "plugAndPlayWarmRebootMask",
    "volteConfiguration",
    "anr",
    "synchronisation",
    "eson",
    "esonMcim",
    "esonMlb",
    "esonMro",
    "emergencyCall"
})
public class LteAdvancedProfileWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "RandomAccess")
    protected RandomAccessWs randomAccess;
    @XmlElement(name = "UplinkPowerControl")
    protected UplinkPowerControlWs uplinkPowerControl;
    @XmlElement(name = "Mobility")
    protected MobilityWs mobility;
    @XmlElement(name = "RrcTimers")
    protected RrcTimersWs rrcTimers;
    @XmlElement(name = "PlugAndPlay")
    protected PlugAndPlayWs plugAndPlay;
    @XmlElement(name = "PlugAndPlayWarmRebootMask")
    protected PlugAndPlayWarmRebootMaskWs plugAndPlayWarmRebootMask;
    @XmlElement(name = "VolteConfiguration")
    protected VolteConfigurationkWs volteConfiguration;
    @XmlElement(name = "Anr")
    protected AnrWs anr;
    @XmlElement(name = "Synchronisation")
    protected SynchronisationWs synchronisation;
    @XmlElement(name = "Eson")
    protected EsonWs eson;
    @XmlElement(name = "EsonMcim")
    protected EsonMcimWs esonMcim;
    @XmlElement(name = "EsonMlb")
    protected EsonMlbWs esonMlb;
    @XmlElement(name = "EsonMro")
    protected EsonMroWs esonMro;
    @XmlElement(name = "EmergencyCall")
    protected EmergencyCallWs emergencyCall;

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
     *     {@link RrcTimersWs }
     *     
     */
    public RrcTimersWs getRrcTimers() {
        return rrcTimers;
    }

    /**
     * Sets the value of the rrcTimers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RrcTimersWs }
     *     
     */
    public void setRrcTimers(RrcTimersWs value) {
        this.rrcTimers = value;
    }

    /**
     * Gets the value of the plugAndPlay property.
     * 
     * @return
     *     possible object is
     *     {@link PlugAndPlayWs }
     *     
     */
    public PlugAndPlayWs getPlugAndPlay() {
        return plugAndPlay;
    }

    /**
     * Sets the value of the plugAndPlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlugAndPlayWs }
     *     
     */
    public void setPlugAndPlay(PlugAndPlayWs value) {
        this.plugAndPlay = value;
    }

    /**
     * Gets the value of the plugAndPlayWarmRebootMask property.
     * 
     * @return
     *     possible object is
     *     {@link PlugAndPlayWarmRebootMaskWs }
     *     
     */
    public PlugAndPlayWarmRebootMaskWs getPlugAndPlayWarmRebootMask() {
        return plugAndPlayWarmRebootMask;
    }

    /**
     * Sets the value of the plugAndPlayWarmRebootMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlugAndPlayWarmRebootMaskWs }
     *     
     */
    public void setPlugAndPlayWarmRebootMask(PlugAndPlayWarmRebootMaskWs value) {
        this.plugAndPlayWarmRebootMask = value;
    }

    /**
     * Gets the value of the volteConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link VolteConfigurationkWs }
     *     
     */
    public VolteConfigurationkWs getVolteConfiguration() {
        return volteConfiguration;
    }

    /**
     * Sets the value of the volteConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolteConfigurationkWs }
     *     
     */
    public void setVolteConfiguration(VolteConfigurationkWs value) {
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
     * Gets the value of the synchronisation property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronisationWs }
     *     
     */
    public SynchronisationWs getSynchronisation() {
        return synchronisation;
    }

    /**
     * Sets the value of the synchronisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronisationWs }
     *     
     */
    public void setSynchronisation(SynchronisationWs value) {
        this.synchronisation = value;
    }

    /**
     * Gets the value of the eson property.
     * 
     * @return
     *     possible object is
     *     {@link EsonWs }
     *     
     */
    public EsonWs getEson() {
        return eson;
    }

    /**
     * Sets the value of the eson property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsonWs }
     *     
     */
    public void setEson(EsonWs value) {
        this.eson = value;
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
     * Gets the value of the emergencyCall property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyCallWs }
     *     
     */
    public EmergencyCallWs getEmergencyCall() {
        return emergencyCall;
    }

    /**
     * Sets the value of the emergencyCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyCallWs }
     *     
     */
    public void setEmergencyCall(EmergencyCallWs value) {
        this.emergencyCall = value;
    }

}
