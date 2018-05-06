
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsonMlbWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EsonMlbWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CapacitySampleIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CapacitySampleInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CapacityReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CapacityReportInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrbLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrbLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RrcLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RrcLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CpuLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CpuLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsonMlbWs", propOrder = {
    "capacitySampleIntervalIsDefault",
    "capacitySampleInterval",
    "capacityReportIntervalIsDefault",
    "capacityReportInterval",
    "prbLoadWeightIsDefault",
    "prbLoadWeight",
    "rrcLoadWeightIsDefault",
    "rrcLoadWeight",
    "cpuLoadWeightIsDefault",
    "cpuLoadWeight"
})
public class EsonMlbWs {

    @XmlElementRef(name = "CapacitySampleIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> capacitySampleIntervalIsDefault;
    @XmlElementRef(name = "CapacitySampleInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> capacitySampleInterval;
    @XmlElementRef(name = "CapacityReportIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> capacityReportIntervalIsDefault;
    @XmlElementRef(name = "CapacityReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> capacityReportInterval;
    @XmlElementRef(name = "PrbLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> prbLoadWeightIsDefault;
    @XmlElementRef(name = "PrbLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prbLoadWeight;
    @XmlElementRef(name = "RrcLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcLoadWeightIsDefault;
    @XmlElementRef(name = "RrcLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcLoadWeight;
    @XmlElementRef(name = "CpuLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cpuLoadWeightIsDefault;
    @XmlElementRef(name = "CpuLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpuLoadWeight;

    /**
     * Gets the value of the capacitySampleIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCapacitySampleIntervalIsDefault() {
        return capacitySampleIntervalIsDefault;
    }

    /**
     * Sets the value of the capacitySampleIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCapacitySampleIntervalIsDefault(JAXBElement<Boolean> value) {
        this.capacitySampleIntervalIsDefault = value;
    }

    /**
     * Gets the value of the capacitySampleInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCapacitySampleInterval() {
        return capacitySampleInterval;
    }

    /**
     * Sets the value of the capacitySampleInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCapacitySampleInterval(JAXBElement<Integer> value) {
        this.capacitySampleInterval = value;
    }

    /**
     * Gets the value of the capacityReportIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCapacityReportIntervalIsDefault() {
        return capacityReportIntervalIsDefault;
    }

    /**
     * Sets the value of the capacityReportIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCapacityReportIntervalIsDefault(JAXBElement<Boolean> value) {
        this.capacityReportIntervalIsDefault = value;
    }

    /**
     * Gets the value of the capacityReportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCapacityReportInterval() {
        return capacityReportInterval;
    }

    /**
     * Sets the value of the capacityReportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCapacityReportInterval(JAXBElement<Integer> value) {
        this.capacityReportInterval = value;
    }

    /**
     * Gets the value of the prbLoadWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrbLoadWeightIsDefault() {
        return prbLoadWeightIsDefault;
    }

    /**
     * Sets the value of the prbLoadWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrbLoadWeightIsDefault(JAXBElement<Boolean> value) {
        this.prbLoadWeightIsDefault = value;
    }

    /**
     * Gets the value of the prbLoadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrbLoadWeight() {
        return prbLoadWeight;
    }

    /**
     * Sets the value of the prbLoadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrbLoadWeight(JAXBElement<Integer> value) {
        this.prbLoadWeight = value;
    }

    /**
     * Gets the value of the rrcLoadWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcLoadWeightIsDefault() {
        return rrcLoadWeightIsDefault;
    }

    /**
     * Sets the value of the rrcLoadWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcLoadWeightIsDefault(JAXBElement<Boolean> value) {
        this.rrcLoadWeightIsDefault = value;
    }

    /**
     * Gets the value of the rrcLoadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcLoadWeight() {
        return rrcLoadWeight;
    }

    /**
     * Sets the value of the rrcLoadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcLoadWeight(JAXBElement<Integer> value) {
        this.rrcLoadWeight = value;
    }

    /**
     * Gets the value of the cpuLoadWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCpuLoadWeightIsDefault() {
        return cpuLoadWeightIsDefault;
    }

    /**
     * Sets the value of the cpuLoadWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCpuLoadWeightIsDefault(JAXBElement<Boolean> value) {
        this.cpuLoadWeightIsDefault = value;
    }

    /**
     * Gets the value of the cpuLoadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpuLoadWeight() {
        return cpuLoadWeight;
    }

    /**
     * Sets the value of the cpuLoadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpuLoadWeight(JAXBElement<Integer> value) {
        this.cpuLoadWeight = value;
    }

}
