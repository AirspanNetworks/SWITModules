
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;
import Netspan.API.Lte.CarrierAggregationModes;


/**
 * <p>Java class for EnbMultiCellProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbMultiCellProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierAggMode" type="{http://Airspan.Netspan.WebServices}CarrierAggregationModes" minOccurs="0"/&gt;
 *         &lt;element name="IntraEnbLoadBalancingMode" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="CompositeLoadDiffMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompositeLoadDiffMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CalculationInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraEnbLoadBalancingConfigMeas" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbMultiCellProfileParams", propOrder = {
    "carrierAggMode",
    "intraEnbLoadBalancingMode",
    "compositeLoadDiffMax",
    "compositeLoadDiffMin",
    "calculationInterval",
    "intraEnbLoadBalancingConfigMeas"
})
@XmlSeeAlso({
    EnbMultiCellProfile.class
})
public class EnbMultiCellProfileParams {

    @XmlElementRef(name = "CarrierAggMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CarrierAggregationModes> carrierAggMode;
    @XmlElementRef(name = "IntraEnbLoadBalancingMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> intraEnbLoadBalancingMode;
    @XmlElementRef(name = "CompositeLoadDiffMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> compositeLoadDiffMax;
    @XmlElementRef(name = "CompositeLoadDiffMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> compositeLoadDiffMin;
    @XmlElementRef(name = "CalculationInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> calculationInterval;
    @XmlElementRef(name = "IntraEnbLoadBalancingConfigMeas", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> intraEnbLoadBalancingConfigMeas;

    /**
     * Gets the value of the carrierAggMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CarrierAggregationModes }{@code >}
     *     
     */
    public JAXBElement<CarrierAggregationModes> getCarrierAggMode() {
        return carrierAggMode;
    }

    /**
     * Sets the value of the carrierAggMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CarrierAggregationModes }{@code >}
     *     
     */
    public void setCarrierAggMode(JAXBElement<CarrierAggregationModes> value) {
        this.carrierAggMode = value;
    }

    /**
     * Gets the value of the intraEnbLoadBalancingMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIntraEnbLoadBalancingMode() {
        return intraEnbLoadBalancingMode;
    }

    /**
     * Sets the value of the intraEnbLoadBalancingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIntraEnbLoadBalancingMode(JAXBElement<EnabledStates> value) {
        this.intraEnbLoadBalancingMode = value;
    }

    /**
     * Gets the value of the compositeLoadDiffMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCompositeLoadDiffMax() {
        return compositeLoadDiffMax;
    }

    /**
     * Sets the value of the compositeLoadDiffMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCompositeLoadDiffMax(JAXBElement<Integer> value) {
        this.compositeLoadDiffMax = value;
    }

    /**
     * Gets the value of the compositeLoadDiffMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCompositeLoadDiffMin() {
        return compositeLoadDiffMin;
    }

    /**
     * Sets the value of the compositeLoadDiffMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCompositeLoadDiffMin(JAXBElement<Integer> value) {
        this.compositeLoadDiffMin = value;
    }

    /**
     * Gets the value of the calculationInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCalculationInterval() {
        return calculationInterval;
    }

    /**
     * Sets the value of the calculationInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCalculationInterval(JAXBElement<Integer> value) {
        this.calculationInterval = value;
    }

    /**
     * Gets the value of the intraEnbLoadBalancingConfigMeas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIntraEnbLoadBalancingConfigMeas() {
        return intraEnbLoadBalancingConfigMeas;
    }

    /**
     * Sets the value of the intraEnbLoadBalancingConfigMeas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIntraEnbLoadBalancingConfigMeas(JAXBElement<EnabledStates> value) {
        this.intraEnbLoadBalancingConfigMeas = value;
    }

}
