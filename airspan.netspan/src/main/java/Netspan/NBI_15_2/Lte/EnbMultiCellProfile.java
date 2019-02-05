
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for EnbMultiCellProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbMultiCellProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/&gt;
 *         &lt;element name="CarrierAggMode" type="{http://Airspan.Netspan.WebServices}CarrierAggregationModes" minOccurs="0"/&gt;
 *         &lt;element name="IntraEnbLoadBalancingMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="CompositeLoadDiffMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompositeLoadDiffMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CalculationInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbMultiCellProfile", propOrder = {
    "name",
    "hardwareCategory",
    "carrierAggMode",
    "intraEnbLoadBalancingMode",
    "compositeLoadDiffMax",
    "compositeLoadDiffMin",
    "calculationInterval"
})
public class EnbMultiCellProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElementRef(name = "CarrierAggMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CarrierAggregationModes> carrierAggMode;
    @XmlElementRef(name = "IntraEnbLoadBalancingMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> intraEnbLoadBalancingMode;
    @XmlElementRef(name = "CompositeLoadDiffMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> compositeLoadDiffMax;
    @XmlElementRef(name = "CompositeLoadDiffMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> compositeLoadDiffMin;
    @XmlElementRef(name = "CalculationInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> calculationInterval;

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
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIntraEnbLoadBalancingMode() {
        return intraEnbLoadBalancingMode;
    }

    /**
     * Sets the value of the intraEnbLoadBalancingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIntraEnbLoadBalancingMode(JAXBElement<EnabledDisabledStates> value) {
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

}
