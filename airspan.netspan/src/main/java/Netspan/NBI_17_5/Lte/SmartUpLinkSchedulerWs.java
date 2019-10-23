
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for SmartUpLinkSchedulerWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartUpLinkSchedulerWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnableSusIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableSus" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="ManSubRegionCfgIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManSubRegionCfg" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="UlAllocSubRegionIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UlAllocSubRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubRegionDrawPeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SubRegionDrawPeriodicity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxTtiUtilizationThresholdSusIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxTtiUtilizationThresholdSus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartUpLinkSchedulerWs", propOrder = {
    "enableSusIsDefault",
    "enableSus",
    "manSubRegionCfgIsDefault",
    "manSubRegionCfg",
    "ulAllocSubRegionIsDefault",
    "ulAllocSubRegion",
    "subRegionDrawPeriodicityIsDefault",
    "subRegionDrawPeriodicity",
    "maxTtiUtilizationThresholdSusIsDefault",
    "maxTtiUtilizationThresholdSus"
})
public class SmartUpLinkSchedulerWs {

    @XmlElementRef(name = "EnableSusIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> enableSusIsDefault;
    @XmlElementRef(name = "EnableSus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> enableSus;
    @XmlElementRef(name = "ManSubRegionCfgIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> manSubRegionCfgIsDefault;
    @XmlElementRef(name = "ManSubRegionCfg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> manSubRegionCfg;
    @XmlElementRef(name = "UlAllocSubRegionIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ulAllocSubRegionIsDefault;
    @XmlElementRef(name = "UlAllocSubRegion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulAllocSubRegion;
    @XmlElementRef(name = "SubRegionDrawPeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> subRegionDrawPeriodicityIsDefault;
    @XmlElementRef(name = "SubRegionDrawPeriodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> subRegionDrawPeriodicity;
    @XmlElementRef(name = "MaxTtiUtilizationThresholdSusIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxTtiUtilizationThresholdSusIsDefault;
    @XmlElementRef(name = "MaxTtiUtilizationThresholdSus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxTtiUtilizationThresholdSus;

    /**
     * Gets the value of the enableSusIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEnableSusIsDefault() {
        return enableSusIsDefault;
    }

    /**
     * Sets the value of the enableSusIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEnableSusIsDefault(JAXBElement<Boolean> value) {
        this.enableSusIsDefault = value;
    }

    /**
     * Gets the value of the enableSus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getEnableSus() {
        return enableSus;
    }

    /**
     * Sets the value of the enableSus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setEnableSus(JAXBElement<EnabledStates> value) {
        this.enableSus = value;
    }

    /**
     * Gets the value of the manSubRegionCfgIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getManSubRegionCfgIsDefault() {
        return manSubRegionCfgIsDefault;
    }

    /**
     * Sets the value of the manSubRegionCfgIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setManSubRegionCfgIsDefault(JAXBElement<Boolean> value) {
        this.manSubRegionCfgIsDefault = value;
    }

    /**
     * Gets the value of the manSubRegionCfg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getManSubRegionCfg() {
        return manSubRegionCfg;
    }

    /**
     * Sets the value of the manSubRegionCfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setManSubRegionCfg(JAXBElement<EnabledStates> value) {
        this.manSubRegionCfg = value;
    }

    /**
     * Gets the value of the ulAllocSubRegionIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUlAllocSubRegionIsDefault() {
        return ulAllocSubRegionIsDefault;
    }

    /**
     * Sets the value of the ulAllocSubRegionIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUlAllocSubRegionIsDefault(JAXBElement<Boolean> value) {
        this.ulAllocSubRegionIsDefault = value;
    }

    /**
     * Gets the value of the ulAllocSubRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlAllocSubRegion() {
        return ulAllocSubRegion;
    }

    /**
     * Sets the value of the ulAllocSubRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlAllocSubRegion(JAXBElement<Integer> value) {
        this.ulAllocSubRegion = value;
    }

    /**
     * Gets the value of the subRegionDrawPeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSubRegionDrawPeriodicityIsDefault() {
        return subRegionDrawPeriodicityIsDefault;
    }

    /**
     * Sets the value of the subRegionDrawPeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSubRegionDrawPeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.subRegionDrawPeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the subRegionDrawPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSubRegionDrawPeriodicity() {
        return subRegionDrawPeriodicity;
    }

    /**
     * Sets the value of the subRegionDrawPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSubRegionDrawPeriodicity(JAXBElement<Integer> value) {
        this.subRegionDrawPeriodicity = value;
    }

    /**
     * Gets the value of the maxTtiUtilizationThresholdSusIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxTtiUtilizationThresholdSusIsDefault() {
        return maxTtiUtilizationThresholdSusIsDefault;
    }

    /**
     * Sets the value of the maxTtiUtilizationThresholdSusIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxTtiUtilizationThresholdSusIsDefault(JAXBElement<Boolean> value) {
        this.maxTtiUtilizationThresholdSusIsDefault = value;
    }

    /**
     * Gets the value of the maxTtiUtilizationThresholdSus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxTtiUtilizationThresholdSus() {
        return maxTtiUtilizationThresholdSus;
    }

    /**
     * Sets the value of the maxTtiUtilizationThresholdSus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxTtiUtilizationThresholdSus(JAXBElement<Integer> value) {
        this.maxTtiUtilizationThresholdSus = value;
    }

}
