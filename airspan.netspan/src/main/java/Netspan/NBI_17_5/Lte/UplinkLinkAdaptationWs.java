
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for UplinkLinkAdaptationWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UplinkLinkAdaptationWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UplinkEfficiencyModeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UplinkEfficiencyMode" type="{http://Airspan.Netspan.WebServices}EfficiencyType" minOccurs="0"/&gt;
 *         &lt;element name="TargetMcsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetMcs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellEfficiencyFactorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CellEfficiencyFactor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinimalUplinkGrantAllocationSizeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimalUplinkGrantAllocationSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Uplink64QamSupportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Uplink64QamSupportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Uplink64QamTargetMcsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Uplink64QamTargetMcs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UplinkLinkAdaptationWs", propOrder = {
    "uplinkEfficiencyModeIsDefault",
    "uplinkEfficiencyMode",
    "targetMcsIsDefault",
    "targetMcs",
    "cellEfficiencyFactorIsDefault",
    "cellEfficiencyFactor",
    "minimalUplinkGrantAllocationSizeIsDefault",
    "minimalUplinkGrantAllocationSize",
    "uplink64QamSupportEnableIsDefault",
    "uplink64QamSupportEnable",
    "uplink64QamTargetMcsIsDefault",
    "uplink64QamTargetMcs"
})
public class UplinkLinkAdaptationWs {

    @XmlElementRef(name = "UplinkEfficiencyModeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplinkEfficiencyModeIsDefault;
    @XmlElementRef(name = "UplinkEfficiencyMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EfficiencyType> uplinkEfficiencyMode;
    @XmlElementRef(name = "TargetMcsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> targetMcsIsDefault;
    @XmlElementRef(name = "TargetMcs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> targetMcs;
    @XmlElementRef(name = "CellEfficiencyFactorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cellEfficiencyFactorIsDefault;
    @XmlElementRef(name = "CellEfficiencyFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellEfficiencyFactor;
    @XmlElementRef(name = "MinimalUplinkGrantAllocationSizeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> minimalUplinkGrantAllocationSizeIsDefault;
    @XmlElementRef(name = "MinimalUplinkGrantAllocationSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minimalUplinkGrantAllocationSize;
    @XmlElementRef(name = "Uplink64QamSupportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplink64QamSupportEnableIsDefault;
    @XmlElementRef(name = "Uplink64QamSupportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> uplink64QamSupportEnable;
    @XmlElementRef(name = "Uplink64QamTargetMcsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplink64QamTargetMcsIsDefault;
    @XmlElementRef(name = "Uplink64QamTargetMcs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uplink64QamTargetMcs;

    /**
     * Gets the value of the uplinkEfficiencyModeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplinkEfficiencyModeIsDefault() {
        return uplinkEfficiencyModeIsDefault;
    }

    /**
     * Sets the value of the uplinkEfficiencyModeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplinkEfficiencyModeIsDefault(JAXBElement<Boolean> value) {
        this.uplinkEfficiencyModeIsDefault = value;
    }

    /**
     * Gets the value of the uplinkEfficiencyMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EfficiencyType }{@code >}
     *     
     */
    public JAXBElement<EfficiencyType> getUplinkEfficiencyMode() {
        return uplinkEfficiencyMode;
    }

    /**
     * Sets the value of the uplinkEfficiencyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EfficiencyType }{@code >}
     *     
     */
    public void setUplinkEfficiencyMode(JAXBElement<EfficiencyType> value) {
        this.uplinkEfficiencyMode = value;
    }

    /**
     * Gets the value of the targetMcsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTargetMcsIsDefault() {
        return targetMcsIsDefault;
    }

    /**
     * Sets the value of the targetMcsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTargetMcsIsDefault(JAXBElement<Boolean> value) {
        this.targetMcsIsDefault = value;
    }

    /**
     * Gets the value of the targetMcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTargetMcs() {
        return targetMcs;
    }

    /**
     * Sets the value of the targetMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTargetMcs(JAXBElement<Integer> value) {
        this.targetMcs = value;
    }

    /**
     * Gets the value of the cellEfficiencyFactorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCellEfficiencyFactorIsDefault() {
        return cellEfficiencyFactorIsDefault;
    }

    /**
     * Sets the value of the cellEfficiencyFactorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCellEfficiencyFactorIsDefault(JAXBElement<Boolean> value) {
        this.cellEfficiencyFactorIsDefault = value;
    }

    /**
     * Gets the value of the cellEfficiencyFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellEfficiencyFactor() {
        return cellEfficiencyFactor;
    }

    /**
     * Sets the value of the cellEfficiencyFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellEfficiencyFactor(JAXBElement<Integer> value) {
        this.cellEfficiencyFactor = value;
    }

    /**
     * Gets the value of the minimalUplinkGrantAllocationSizeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMinimalUplinkGrantAllocationSizeIsDefault() {
        return minimalUplinkGrantAllocationSizeIsDefault;
    }

    /**
     * Sets the value of the minimalUplinkGrantAllocationSizeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMinimalUplinkGrantAllocationSizeIsDefault(JAXBElement<Boolean> value) {
        this.minimalUplinkGrantAllocationSizeIsDefault = value;
    }

    /**
     * Gets the value of the minimalUplinkGrantAllocationSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinimalUplinkGrantAllocationSize() {
        return minimalUplinkGrantAllocationSize;
    }

    /**
     * Sets the value of the minimalUplinkGrantAllocationSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinimalUplinkGrantAllocationSize(JAXBElement<Integer> value) {
        this.minimalUplinkGrantAllocationSize = value;
    }

    /**
     * Gets the value of the uplink64QamSupportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplink64QamSupportEnableIsDefault() {
        return uplink64QamSupportEnableIsDefault;
    }

    /**
     * Sets the value of the uplink64QamSupportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplink64QamSupportEnableIsDefault(JAXBElement<Boolean> value) {
        this.uplink64QamSupportEnableIsDefault = value;
    }

    /**
     * Gets the value of the uplink64QamSupportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getUplink64QamSupportEnable() {
        return uplink64QamSupportEnable;
    }

    /**
     * Sets the value of the uplink64QamSupportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setUplink64QamSupportEnable(JAXBElement<EnabledStates> value) {
        this.uplink64QamSupportEnable = value;
    }

    /**
     * Gets the value of the uplink64QamTargetMcsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplink64QamTargetMcsIsDefault() {
        return uplink64QamTargetMcsIsDefault;
    }

    /**
     * Sets the value of the uplink64QamTargetMcsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplink64QamTargetMcsIsDefault(JAXBElement<Boolean> value) {
        this.uplink64QamTargetMcsIsDefault = value;
    }

    /**
     * Gets the value of the uplink64QamTargetMcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUplink64QamTargetMcs() {
        return uplink64QamTargetMcs;
    }

    /**
     * Sets the value of the uplink64QamTargetMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUplink64QamTargetMcs(JAXBElement<Integer> value) {
        this.uplink64QamTargetMcs = value;
    }

}
