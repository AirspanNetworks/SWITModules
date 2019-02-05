
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for CellDynamicCfiWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellDynamicCfiWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ControlChannelOverloadOptimizationIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ControlChannelOverloadOptimization" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="ChannelFormatIndicatorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChannelFormatIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CfiMonitoringIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CfiMonitoringInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxCfiIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxCfi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinCfiIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinCfi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxPddchFailRateIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxPddchFailRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TargetPddchPopulationRateIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TargetPddchPopulationRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PdcchOverAllocationThIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PdcchOverAllocationTh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellDynamicCfiWs", propOrder = {
    "controlChannelOverloadOptimizationIsDefault",
    "controlChannelOverloadOptimization",
    "channelFormatIndicatorIsDefault",
    "channelFormatIndicator",
    "cfiMonitoringIntervalIsDefault",
    "cfiMonitoringInterval",
    "maxCfiIsDefault",
    "maxCfi",
    "minCfiIsDefault",
    "minCfi",
    "maxPddchFailRateIsDefault",
    "maxPddchFailRate",
    "targetPddchPopulationRateIsDefault",
    "targetPddchPopulationRate",
    "pdcchOverAllocationThIsDefault",
    "pdcchOverAllocationTh"
})
public class CellDynamicCfiWs {

    @XmlElementRef(name = "ControlChannelOverloadOptimizationIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> controlChannelOverloadOptimizationIsDefault;
    @XmlElementRef(name = "ControlChannelOverloadOptimization", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> controlChannelOverloadOptimization;
    @XmlElementRef(name = "ChannelFormatIndicatorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> channelFormatIndicatorIsDefault;
    @XmlElementRef(name = "ChannelFormatIndicator", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> channelFormatIndicator;
    @XmlElementRef(name = "CfiMonitoringIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cfiMonitoringIntervalIsDefault;
    @XmlElementRef(name = "CfiMonitoringInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cfiMonitoringInterval;
    @XmlElementRef(name = "MaxCfiIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxCfiIsDefault;
    @XmlElementRef(name = "MaxCfi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxCfi;
    @XmlElementRef(name = "MinCfiIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> minCfiIsDefault;
    @XmlElementRef(name = "MinCfi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minCfi;
    @XmlElementRef(name = "MaxPddchFailRateIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxPddchFailRateIsDefault;
    @XmlElementRef(name = "MaxPddchFailRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxPddchFailRate;
    @XmlElementRef(name = "TargetPddchPopulationRateIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> targetPddchPopulationRateIsDefault;
    @XmlElementRef(name = "TargetPddchPopulationRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> targetPddchPopulationRate;
    @XmlElementRef(name = "PdcchOverAllocationThIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pdcchOverAllocationThIsDefault;
    @XmlElementRef(name = "PdcchOverAllocationTh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdcchOverAllocationTh;

    /**
     * Gets the value of the controlChannelOverloadOptimizationIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getControlChannelOverloadOptimizationIsDefault() {
        return controlChannelOverloadOptimizationIsDefault;
    }

    /**
     * Sets the value of the controlChannelOverloadOptimizationIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setControlChannelOverloadOptimizationIsDefault(JAXBElement<Boolean> value) {
        this.controlChannelOverloadOptimizationIsDefault = value;
    }

    /**
     * Gets the value of the controlChannelOverloadOptimization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getControlChannelOverloadOptimization() {
        return controlChannelOverloadOptimization;
    }

    /**
     * Sets the value of the controlChannelOverloadOptimization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setControlChannelOverloadOptimization(JAXBElement<EnabledStates> value) {
        this.controlChannelOverloadOptimization = value;
    }

    /**
     * Gets the value of the channelFormatIndicatorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getChannelFormatIndicatorIsDefault() {
        return channelFormatIndicatorIsDefault;
    }

    /**
     * Sets the value of the channelFormatIndicatorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setChannelFormatIndicatorIsDefault(JAXBElement<Boolean> value) {
        this.channelFormatIndicatorIsDefault = value;
    }

    /**
     * Gets the value of the channelFormatIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChannelFormatIndicator() {
        return channelFormatIndicator;
    }

    /**
     * Sets the value of the channelFormatIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChannelFormatIndicator(JAXBElement<Integer> value) {
        this.channelFormatIndicator = value;
    }

    /**
     * Gets the value of the cfiMonitoringIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCfiMonitoringIntervalIsDefault() {
        return cfiMonitoringIntervalIsDefault;
    }

    /**
     * Sets the value of the cfiMonitoringIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCfiMonitoringIntervalIsDefault(JAXBElement<Boolean> value) {
        this.cfiMonitoringIntervalIsDefault = value;
    }

    /**
     * Gets the value of the cfiMonitoringInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCfiMonitoringInterval() {
        return cfiMonitoringInterval;
    }

    /**
     * Sets the value of the cfiMonitoringInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCfiMonitoringInterval(JAXBElement<Integer> value) {
        this.cfiMonitoringInterval = value;
    }

    /**
     * Gets the value of the maxCfiIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxCfiIsDefault() {
        return maxCfiIsDefault;
    }

    /**
     * Sets the value of the maxCfiIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxCfiIsDefault(JAXBElement<Boolean> value) {
        this.maxCfiIsDefault = value;
    }

    /**
     * Gets the value of the maxCfi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxCfi() {
        return maxCfi;
    }

    /**
     * Sets the value of the maxCfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxCfi(JAXBElement<Integer> value) {
        this.maxCfi = value;
    }

    /**
     * Gets the value of the minCfiIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMinCfiIsDefault() {
        return minCfiIsDefault;
    }

    /**
     * Sets the value of the minCfiIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMinCfiIsDefault(JAXBElement<Boolean> value) {
        this.minCfiIsDefault = value;
    }

    /**
     * Gets the value of the minCfi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinCfi() {
        return minCfi;
    }

    /**
     * Sets the value of the minCfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinCfi(JAXBElement<Integer> value) {
        this.minCfi = value;
    }

    /**
     * Gets the value of the maxPddchFailRateIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxPddchFailRateIsDefault() {
        return maxPddchFailRateIsDefault;
    }

    /**
     * Sets the value of the maxPddchFailRateIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxPddchFailRateIsDefault(JAXBElement<Boolean> value) {
        this.maxPddchFailRateIsDefault = value;
    }

    /**
     * Gets the value of the maxPddchFailRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxPddchFailRate() {
        return maxPddchFailRate;
    }

    /**
     * Sets the value of the maxPddchFailRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxPddchFailRate(JAXBElement<Integer> value) {
        this.maxPddchFailRate = value;
    }

    /**
     * Gets the value of the targetPddchPopulationRateIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTargetPddchPopulationRateIsDefault() {
        return targetPddchPopulationRateIsDefault;
    }

    /**
     * Sets the value of the targetPddchPopulationRateIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTargetPddchPopulationRateIsDefault(JAXBElement<Boolean> value) {
        this.targetPddchPopulationRateIsDefault = value;
    }

    /**
     * Gets the value of the targetPddchPopulationRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTargetPddchPopulationRate() {
        return targetPddchPopulationRate;
    }

    /**
     * Sets the value of the targetPddchPopulationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTargetPddchPopulationRate(JAXBElement<Integer> value) {
        this.targetPddchPopulationRate = value;
    }

    /**
     * Gets the value of the pdcchOverAllocationThIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPdcchOverAllocationThIsDefault() {
        return pdcchOverAllocationThIsDefault;
    }

    /**
     * Sets the value of the pdcchOverAllocationThIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPdcchOverAllocationThIsDefault(JAXBElement<Boolean> value) {
        this.pdcchOverAllocationThIsDefault = value;
    }

    /**
     * Gets the value of the pdcchOverAllocationTh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdcchOverAllocationTh() {
        return pdcchOverAllocationTh;
    }

    /**
     * Sets the value of the pdcchOverAllocationTh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdcchOverAllocationTh(JAXBElement<Integer> value) {
        this.pdcchOverAllocationTh = value;
    }

}
