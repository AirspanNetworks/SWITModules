
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraEnbLoadBalancingWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntraEnbLoadBalancingWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HoBackPreventionTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HoBackPreventionTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlGbrPrbLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DlGbrPrbLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlGbrPrbLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UlGbrPrbLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlNonGbrPrbLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DlNonGbrPrbLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlNonGbrPrbLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UlNonGbrPrbLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxUeToTransferIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxUeToTransfer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TargetRsrpThreshIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetRsrpThresh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraEnbLoadBalancingWs", propOrder = {
    "hoBackPreventionTimeIsDefault",
    "hoBackPreventionTime",
    "rrcLoadWeightIsDefault",
    "rrcLoadWeight",
    "dlGbrPrbLoadWeightIsDefault",
    "dlGbrPrbLoadWeight",
    "ulGbrPrbLoadWeightIsDefault",
    "ulGbrPrbLoadWeight",
    "dlNonGbrPrbLoadWeightIsDefault",
    "dlNonGbrPrbLoadWeight",
    "ulNonGbrPrbLoadWeightIsDefault",
    "ulNonGbrPrbLoadWeight",
    "maxUeToTransferIsDefault",
    "maxUeToTransfer",
    "targetRsrpThreshIsDefault",
    "targetRsrpThresh"
})
public class IntraEnbLoadBalancingWs {

    @XmlElementRef(name = "HoBackPreventionTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hoBackPreventionTimeIsDefault;
    @XmlElementRef(name = "HoBackPreventionTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoBackPreventionTime;
    @XmlElementRef(name = "RrcLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcLoadWeightIsDefault;
    @XmlElementRef(name = "RrcLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcLoadWeight;
    @XmlElementRef(name = "DlGbrPrbLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dlGbrPrbLoadWeightIsDefault;
    @XmlElementRef(name = "DlGbrPrbLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlGbrPrbLoadWeight;
    @XmlElementRef(name = "UlGbrPrbLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ulGbrPrbLoadWeightIsDefault;
    @XmlElementRef(name = "UlGbrPrbLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulGbrPrbLoadWeight;
    @XmlElementRef(name = "DlNonGbrPrbLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dlNonGbrPrbLoadWeightIsDefault;
    @XmlElementRef(name = "DlNonGbrPrbLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlNonGbrPrbLoadWeight;
    @XmlElementRef(name = "UlNonGbrPrbLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ulNonGbrPrbLoadWeightIsDefault;
    @XmlElementRef(name = "UlNonGbrPrbLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulNonGbrPrbLoadWeight;
    @XmlElementRef(name = "MaxUeToTransferIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxUeToTransferIsDefault;
    @XmlElementRef(name = "MaxUeToTransfer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxUeToTransfer;
    @XmlElementRef(name = "TargetRsrpThreshIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> targetRsrpThreshIsDefault;
    @XmlElementRef(name = "TargetRsrpThresh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> targetRsrpThresh;

    /**
     * Gets the value of the hoBackPreventionTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHoBackPreventionTimeIsDefault() {
        return hoBackPreventionTimeIsDefault;
    }

    /**
     * Sets the value of the hoBackPreventionTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHoBackPreventionTimeIsDefault(JAXBElement<Boolean> value) {
        this.hoBackPreventionTimeIsDefault = value;
    }

    /**
     * Gets the value of the hoBackPreventionTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoBackPreventionTime() {
        return hoBackPreventionTime;
    }

    /**
     * Sets the value of the hoBackPreventionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoBackPreventionTime(JAXBElement<Integer> value) {
        this.hoBackPreventionTime = value;
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
     * Gets the value of the dlGbrPrbLoadWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDlGbrPrbLoadWeightIsDefault() {
        return dlGbrPrbLoadWeightIsDefault;
    }

    /**
     * Sets the value of the dlGbrPrbLoadWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDlGbrPrbLoadWeightIsDefault(JAXBElement<Boolean> value) {
        this.dlGbrPrbLoadWeightIsDefault = value;
    }

    /**
     * Gets the value of the dlGbrPrbLoadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlGbrPrbLoadWeight() {
        return dlGbrPrbLoadWeight;
    }

    /**
     * Sets the value of the dlGbrPrbLoadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlGbrPrbLoadWeight(JAXBElement<Integer> value) {
        this.dlGbrPrbLoadWeight = value;
    }

    /**
     * Gets the value of the ulGbrPrbLoadWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUlGbrPrbLoadWeightIsDefault() {
        return ulGbrPrbLoadWeightIsDefault;
    }

    /**
     * Sets the value of the ulGbrPrbLoadWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUlGbrPrbLoadWeightIsDefault(JAXBElement<Boolean> value) {
        this.ulGbrPrbLoadWeightIsDefault = value;
    }

    /**
     * Gets the value of the ulGbrPrbLoadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlGbrPrbLoadWeight() {
        return ulGbrPrbLoadWeight;
    }

    /**
     * Sets the value of the ulGbrPrbLoadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlGbrPrbLoadWeight(JAXBElement<Integer> value) {
        this.ulGbrPrbLoadWeight = value;
    }

    /**
     * Gets the value of the dlNonGbrPrbLoadWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDlNonGbrPrbLoadWeightIsDefault() {
        return dlNonGbrPrbLoadWeightIsDefault;
    }

    /**
     * Sets the value of the dlNonGbrPrbLoadWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDlNonGbrPrbLoadWeightIsDefault(JAXBElement<Boolean> value) {
        this.dlNonGbrPrbLoadWeightIsDefault = value;
    }

    /**
     * Gets the value of the dlNonGbrPrbLoadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlNonGbrPrbLoadWeight() {
        return dlNonGbrPrbLoadWeight;
    }

    /**
     * Sets the value of the dlNonGbrPrbLoadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlNonGbrPrbLoadWeight(JAXBElement<Integer> value) {
        this.dlNonGbrPrbLoadWeight = value;
    }

    /**
     * Gets the value of the ulNonGbrPrbLoadWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUlNonGbrPrbLoadWeightIsDefault() {
        return ulNonGbrPrbLoadWeightIsDefault;
    }

    /**
     * Sets the value of the ulNonGbrPrbLoadWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUlNonGbrPrbLoadWeightIsDefault(JAXBElement<Boolean> value) {
        this.ulNonGbrPrbLoadWeightIsDefault = value;
    }

    /**
     * Gets the value of the ulNonGbrPrbLoadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlNonGbrPrbLoadWeight() {
        return ulNonGbrPrbLoadWeight;
    }

    /**
     * Sets the value of the ulNonGbrPrbLoadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlNonGbrPrbLoadWeight(JAXBElement<Integer> value) {
        this.ulNonGbrPrbLoadWeight = value;
    }

    /**
     * Gets the value of the maxUeToTransferIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxUeToTransferIsDefault() {
        return maxUeToTransferIsDefault;
    }

    /**
     * Sets the value of the maxUeToTransferIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxUeToTransferIsDefault(JAXBElement<Boolean> value) {
        this.maxUeToTransferIsDefault = value;
    }

    /**
     * Gets the value of the maxUeToTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxUeToTransfer() {
        return maxUeToTransfer;
    }

    /**
     * Sets the value of the maxUeToTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxUeToTransfer(JAXBElement<Integer> value) {
        this.maxUeToTransfer = value;
    }

    /**
     * Gets the value of the targetRsrpThreshIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTargetRsrpThreshIsDefault() {
        return targetRsrpThreshIsDefault;
    }

    /**
     * Sets the value of the targetRsrpThreshIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTargetRsrpThreshIsDefault(JAXBElement<Boolean> value) {
        this.targetRsrpThreshIsDefault = value;
    }

    /**
     * Gets the value of the targetRsrpThresh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTargetRsrpThresh() {
        return targetRsrpThresh;
    }

    /**
     * Sets the value of the targetRsrpThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTargetRsrpThresh(JAXBElement<Integer> value) {
        this.targetRsrpThresh = value;
    }

}
