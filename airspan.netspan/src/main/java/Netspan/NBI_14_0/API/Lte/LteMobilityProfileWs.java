
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for LteMobilityProfileWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteMobilityProfileWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte"/>
 *         &lt;element name="IdleModeIntraFrequency" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeIntraFreq" minOccurs="0"/>
 *         &lt;element name="IdleModeInterFrequency" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeInterFreq" minOccurs="0"/>
 *         &lt;element name="ConnectedModeIntraFrequency" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeFreq" minOccurs="0"/>
 *         &lt;element name="UseConnectedModeIntraPropertiesForInter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConnectedModeInterFrequency" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeFreq" minOccurs="0"/>
 *         &lt;element name="CsfbEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteMobilityProfileWs", propOrder = {
    "name",
    "hardwareCategory",
    "idleModeIntraFrequency",
    "idleModeInterFrequency",
    "connectedModeIntraFrequency",
    "useConnectedModeIntraPropertiesForInter",
    "connectedModeInterFrequency",
    "csfbEnabled"
})
public class LteMobilityProfileWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "HardwareCategory", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CategoriesLte hardwareCategory;
    @XmlElement(name = "IdleModeIntraFrequency")
    protected MobilityIdleModeIntraFreq idleModeIntraFrequency;
    @XmlElement(name = "IdleModeInterFrequency")
    protected MobilityIdleModeInterFreq idleModeInterFrequency;
    @XmlElement(name = "ConnectedModeIntraFrequency")
    protected MobilityConnectedModeFreq connectedModeIntraFrequency;
    @XmlElement(name = "UseConnectedModeIntraPropertiesForInter", required = true, type = Boolean.class, nillable = true)
    protected Boolean useConnectedModeIntraPropertiesForInter;
    @XmlElement(name = "ConnectedModeInterFrequency")
    protected MobilityConnectedModeFreq connectedModeInterFrequency;
    @XmlElement(name = "CsfbEnabled", required = true)
    @XmlSchemaType(name = "string")
    protected EnabledStates csfbEnabled;

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
     * Gets the value of the idleModeIntraFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityIdleModeIntraFreq }
     *     
     */
    public MobilityIdleModeIntraFreq getIdleModeIntraFrequency() {
        return idleModeIntraFrequency;
    }

    /**
     * Sets the value of the idleModeIntraFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityIdleModeIntraFreq }
     *     
     */
    public void setIdleModeIntraFrequency(MobilityIdleModeIntraFreq value) {
        this.idleModeIntraFrequency = value;
    }

    /**
     * Gets the value of the idleModeInterFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityIdleModeInterFreq }
     *     
     */
    public MobilityIdleModeInterFreq getIdleModeInterFrequency() {
        return idleModeInterFrequency;
    }

    /**
     * Sets the value of the idleModeInterFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityIdleModeInterFreq }
     *     
     */
    public void setIdleModeInterFrequency(MobilityIdleModeInterFreq value) {
        this.idleModeInterFrequency = value;
    }

    /**
     * Gets the value of the connectedModeIntraFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedModeFreq }
     *     
     */
    public MobilityConnectedModeFreq getConnectedModeIntraFrequency() {
        return connectedModeIntraFrequency;
    }

    /**
     * Sets the value of the connectedModeIntraFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedModeFreq }
     *     
     */
    public void setConnectedModeIntraFrequency(MobilityConnectedModeFreq value) {
        this.connectedModeIntraFrequency = value;
    }

    /**
     * Gets the value of the useConnectedModeIntraPropertiesForInter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseConnectedModeIntraPropertiesForInter() {
        return useConnectedModeIntraPropertiesForInter;
    }

    /**
     * Sets the value of the useConnectedModeIntraPropertiesForInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseConnectedModeIntraPropertiesForInter(Boolean value) {
        this.useConnectedModeIntraPropertiesForInter = value;
    }

    /**
     * Gets the value of the connectedModeInterFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedModeFreq }
     *     
     */
    public MobilityConnectedModeFreq getConnectedModeInterFrequency() {
        return connectedModeInterFrequency;
    }

    /**
     * Sets the value of the connectedModeInterFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedModeFreq }
     *     
     */
    public void setConnectedModeInterFrequency(MobilityConnectedModeFreq value) {
        this.connectedModeInterFrequency = value;
    }

    /**
     * Gets the value of the csfbEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledStates }
     *     
     */
    public EnabledStates getCsfbEnabled() {
        return csfbEnabled;
    }

    /**
     * Sets the value of the csfbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledStates }
     *     
     */
    public void setCsfbEnabled(EnabledStates value) {
        this.csfbEnabled = value;
    }

}
