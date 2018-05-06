
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeResourcesWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeResourcesWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPULoadThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CPULoadThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RRCLoadThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RRCLoadThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MemoryLoadThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MemoryLoadThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NodeResourcesSampleIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NodeResourcesSampleInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NodeResourcesReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NodeResourcesReportInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LowResourcesHysteresisIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LowResourcesHysteresis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeResourcesWs", propOrder = {
    "cpuLoadThresholdIsDefault",
    "cpuLoadThreshold",
    "rrcLoadThresholdIsDefault",
    "rrcLoadThreshold",
    "memoryLoadThresholdIsDefault",
    "memoryLoadThreshold",
    "nodeResourcesSampleIntervalIsDefault",
    "nodeResourcesSampleInterval",
    "nodeResourcesReportIntervalIsDefault",
    "nodeResourcesReportInterval",
    "lowResourcesHysteresisIsDefault",
    "lowResourcesHysteresis"
})
public class NodeResourcesWs {

    @XmlElementRef(name = "CPULoadThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cpuLoadThresholdIsDefault;
    @XmlElementRef(name = "CPULoadThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpuLoadThreshold;
    @XmlElementRef(name = "RRCLoadThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcLoadThresholdIsDefault;
    @XmlElementRef(name = "RRCLoadThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcLoadThreshold;
    @XmlElementRef(name = "MemoryLoadThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> memoryLoadThresholdIsDefault;
    @XmlElementRef(name = "MemoryLoadThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> memoryLoadThreshold;
    @XmlElementRef(name = "NodeResourcesSampleIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nodeResourcesSampleIntervalIsDefault;
    @XmlElementRef(name = "NodeResourcesSampleInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nodeResourcesSampleInterval;
    @XmlElementRef(name = "NodeResourcesReportIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nodeResourcesReportIntervalIsDefault;
    @XmlElementRef(name = "NodeResourcesReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nodeResourcesReportInterval;
    @XmlElementRef(name = "LowResourcesHysteresisIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> lowResourcesHysteresisIsDefault;
    @XmlElementRef(name = "LowResourcesHysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lowResourcesHysteresis;

    /**
     * Gets the value of the cpuLoadThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCPULoadThresholdIsDefault() {
        return cpuLoadThresholdIsDefault;
    }

    /**
     * Sets the value of the cpuLoadThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCPULoadThresholdIsDefault(JAXBElement<Boolean> value) {
        this.cpuLoadThresholdIsDefault = value;
    }

    /**
     * Gets the value of the cpuLoadThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCPULoadThreshold() {
        return cpuLoadThreshold;
    }

    /**
     * Sets the value of the cpuLoadThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCPULoadThreshold(JAXBElement<Integer> value) {
        this.cpuLoadThreshold = value;
    }

    /**
     * Gets the value of the rrcLoadThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRRCLoadThresholdIsDefault() {
        return rrcLoadThresholdIsDefault;
    }

    /**
     * Sets the value of the rrcLoadThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRRCLoadThresholdIsDefault(JAXBElement<Boolean> value) {
        this.rrcLoadThresholdIsDefault = value;
    }

    /**
     * Gets the value of the rrcLoadThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRRCLoadThreshold() {
        return rrcLoadThreshold;
    }

    /**
     * Sets the value of the rrcLoadThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRRCLoadThreshold(JAXBElement<Integer> value) {
        this.rrcLoadThreshold = value;
    }

    /**
     * Gets the value of the memoryLoadThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMemoryLoadThresholdIsDefault() {
        return memoryLoadThresholdIsDefault;
    }

    /**
     * Sets the value of the memoryLoadThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMemoryLoadThresholdIsDefault(JAXBElement<Boolean> value) {
        this.memoryLoadThresholdIsDefault = value;
    }

    /**
     * Gets the value of the memoryLoadThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMemoryLoadThreshold() {
        return memoryLoadThreshold;
    }

    /**
     * Sets the value of the memoryLoadThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMemoryLoadThreshold(JAXBElement<Integer> value) {
        this.memoryLoadThreshold = value;
    }

    /**
     * Gets the value of the nodeResourcesSampleIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNodeResourcesSampleIntervalIsDefault() {
        return nodeResourcesSampleIntervalIsDefault;
    }

    /**
     * Sets the value of the nodeResourcesSampleIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNodeResourcesSampleIntervalIsDefault(JAXBElement<Boolean> value) {
        this.nodeResourcesSampleIntervalIsDefault = value;
    }

    /**
     * Gets the value of the nodeResourcesSampleInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNodeResourcesSampleInterval() {
        return nodeResourcesSampleInterval;
    }

    /**
     * Sets the value of the nodeResourcesSampleInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNodeResourcesSampleInterval(JAXBElement<Integer> value) {
        this.nodeResourcesSampleInterval = value;
    }

    /**
     * Gets the value of the nodeResourcesReportIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNodeResourcesReportIntervalIsDefault() {
        return nodeResourcesReportIntervalIsDefault;
    }

    /**
     * Sets the value of the nodeResourcesReportIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNodeResourcesReportIntervalIsDefault(JAXBElement<Boolean> value) {
        this.nodeResourcesReportIntervalIsDefault = value;
    }

    /**
     * Gets the value of the nodeResourcesReportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNodeResourcesReportInterval() {
        return nodeResourcesReportInterval;
    }

    /**
     * Sets the value of the nodeResourcesReportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNodeResourcesReportInterval(JAXBElement<Integer> value) {
        this.nodeResourcesReportInterval = value;
    }

    /**
     * Gets the value of the lowResourcesHysteresisIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLowResourcesHysteresisIsDefault() {
        return lowResourcesHysteresisIsDefault;
    }

    /**
     * Sets the value of the lowResourcesHysteresisIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLowResourcesHysteresisIsDefault(JAXBElement<Boolean> value) {
        this.lowResourcesHysteresisIsDefault = value;
    }

    /**
     * Gets the value of the lowResourcesHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLowResourcesHysteresis() {
        return lowResourcesHysteresis;
    }

    /**
     * Sets the value of the lowResourcesHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLowResourcesHysteresis(JAXBElement<Integer> value) {
        this.lowResourcesHysteresis = value;
    }

}
