
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CsfbWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CsfbWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="T304IratIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="T304Irat" type="{http://Airspan.Netspan.WebServices}T304IratValues" minOccurs="0"/&gt;
 *         &lt;element name="DualTransmissionModeCapabilityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DualTransmissionModeCapability" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NetworkControlOrderIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetworkControlOrder" type="{http://Airspan.Netspan.WebServices}NetworkControlOrderValues" minOccurs="0"/&gt;
 *         &lt;element name="PreCsfbMeasurementTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreCsfbMeasurementTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RimOverallTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RimOverallTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RimRetransmissionIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RimRetransmission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcDataConfirmationTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcDataConfirmationTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="T304GuardTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="T304GuardTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TRIIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TRI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TRIAEIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TRIAE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TRIRIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TRIR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CsfbWs", propOrder = {
    "t304IratIsDefault",
    "t304Irat",
    "dualTransmissionModeCapabilityIsDefault",
    "dualTransmissionModeCapability",
    "networkControlOrderIsDefault",
    "networkControlOrder",
    "preCsfbMeasurementTimerIsDefault",
    "preCsfbMeasurementTimer",
    "rimOverallTimerIsDefault",
    "rimOverallTimer",
    "rimRetransmissionIsDefault",
    "rimRetransmission",
    "rrcDataConfirmationTimerIsDefault",
    "rrcDataConfirmationTimer",
    "t304GuardTimerIsDefault",
    "t304GuardTimer",
    "triIsDefault",
    "tri",
    "triaeIsDefault",
    "triae",
    "trirIsDefault",
    "trir"
})
public class CsfbWs {

    @XmlElementRef(name = "T304IratIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> t304IratIsDefault;
    @XmlElementRef(name = "T304Irat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> t304Irat;
    @XmlElementRef(name = "DualTransmissionModeCapabilityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dualTransmissionModeCapabilityIsDefault;
    @XmlElementRef(name = "DualTransmissionModeCapability", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> dualTransmissionModeCapability;
    @XmlElementRef(name = "NetworkControlOrderIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> networkControlOrderIsDefault;
    @XmlElementRef(name = "NetworkControlOrder", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkControlOrder;
    @XmlElementRef(name = "PreCsfbMeasurementTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preCsfbMeasurementTimerIsDefault;
    @XmlElementRef(name = "PreCsfbMeasurementTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> preCsfbMeasurementTimer;
    @XmlElementRef(name = "RimOverallTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rimOverallTimerIsDefault;
    @XmlElementRef(name = "RimOverallTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rimOverallTimer;
    @XmlElementRef(name = "RimRetransmissionIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rimRetransmissionIsDefault;
    @XmlElementRef(name = "RimRetransmission", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rimRetransmission;
    @XmlElementRef(name = "RrcDataConfirmationTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcDataConfirmationTimerIsDefault;
    @XmlElementRef(name = "RrcDataConfirmationTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcDataConfirmationTimer;
    @XmlElementRef(name = "T304GuardTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> t304GuardTimerIsDefault;
    @XmlElementRef(name = "T304GuardTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> t304GuardTimer;
    @XmlElementRef(name = "TRIIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> triIsDefault;
    @XmlElementRef(name = "TRI", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tri;
    @XmlElementRef(name = "TRIAEIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> triaeIsDefault;
    @XmlElementRef(name = "TRIAE", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> triae;
    @XmlElementRef(name = "TRIRIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> trirIsDefault;
    @XmlElementRef(name = "TRIR", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> trir;

    /**
     * Gets the value of the t304IratIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getT304IratIsDefault() {
        return t304IratIsDefault;
    }

    /**
     * Sets the value of the t304IratIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setT304IratIsDefault(JAXBElement<Boolean> value) {
        this.t304IratIsDefault = value;
    }

    /**
     * Gets the value of the t304Irat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getT304Irat() {
        return t304Irat;
    }

    /**
     * Sets the value of the t304Irat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setT304Irat(JAXBElement<String> value) {
        this.t304Irat = value;
    }

    /**
     * Gets the value of the dualTransmissionModeCapabilityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDualTransmissionModeCapabilityIsDefault() {
        return dualTransmissionModeCapabilityIsDefault;
    }

    /**
     * Sets the value of the dualTransmissionModeCapabilityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDualTransmissionModeCapabilityIsDefault(JAXBElement<Boolean> value) {
        this.dualTransmissionModeCapabilityIsDefault = value;
    }

    /**
     * Gets the value of the dualTransmissionModeCapability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getDualTransmissionModeCapability() {
        return dualTransmissionModeCapability;
    }

    /**
     * Sets the value of the dualTransmissionModeCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setDualTransmissionModeCapability(JAXBElement<EnabledDisabledStates> value) {
        this.dualTransmissionModeCapability = value;
    }

    /**
     * Gets the value of the networkControlOrderIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNetworkControlOrderIsDefault() {
        return networkControlOrderIsDefault;
    }

    /**
     * Sets the value of the networkControlOrderIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNetworkControlOrderIsDefault(JAXBElement<Boolean> value) {
        this.networkControlOrderIsDefault = value;
    }

    /**
     * Gets the value of the networkControlOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkControlOrder() {
        return networkControlOrder;
    }

    /**
     * Sets the value of the networkControlOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkControlOrder(JAXBElement<String> value) {
        this.networkControlOrder = value;
    }

    /**
     * Gets the value of the preCsfbMeasurementTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreCsfbMeasurementTimerIsDefault() {
        return preCsfbMeasurementTimerIsDefault;
    }

    /**
     * Sets the value of the preCsfbMeasurementTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreCsfbMeasurementTimerIsDefault(JAXBElement<Boolean> value) {
        this.preCsfbMeasurementTimerIsDefault = value;
    }

    /**
     * Gets the value of the preCsfbMeasurementTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPreCsfbMeasurementTimer() {
        return preCsfbMeasurementTimer;
    }

    /**
     * Sets the value of the preCsfbMeasurementTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPreCsfbMeasurementTimer(JAXBElement<Integer> value) {
        this.preCsfbMeasurementTimer = value;
    }

    /**
     * Gets the value of the rimOverallTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRimOverallTimerIsDefault() {
        return rimOverallTimerIsDefault;
    }

    /**
     * Sets the value of the rimOverallTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRimOverallTimerIsDefault(JAXBElement<Boolean> value) {
        this.rimOverallTimerIsDefault = value;
    }

    /**
     * Gets the value of the rimOverallTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRimOverallTimer() {
        return rimOverallTimer;
    }

    /**
     * Sets the value of the rimOverallTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRimOverallTimer(JAXBElement<Integer> value) {
        this.rimOverallTimer = value;
    }

    /**
     * Gets the value of the rimRetransmissionIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRimRetransmissionIsDefault() {
        return rimRetransmissionIsDefault;
    }

    /**
     * Sets the value of the rimRetransmissionIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRimRetransmissionIsDefault(JAXBElement<Boolean> value) {
        this.rimRetransmissionIsDefault = value;
    }

    /**
     * Gets the value of the rimRetransmission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRimRetransmission() {
        return rimRetransmission;
    }

    /**
     * Sets the value of the rimRetransmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRimRetransmission(JAXBElement<Integer> value) {
        this.rimRetransmission = value;
    }

    /**
     * Gets the value of the rrcDataConfirmationTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcDataConfirmationTimerIsDefault() {
        return rrcDataConfirmationTimerIsDefault;
    }

    /**
     * Sets the value of the rrcDataConfirmationTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcDataConfirmationTimerIsDefault(JAXBElement<Boolean> value) {
        this.rrcDataConfirmationTimerIsDefault = value;
    }

    /**
     * Gets the value of the rrcDataConfirmationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcDataConfirmationTimer() {
        return rrcDataConfirmationTimer;
    }

    /**
     * Sets the value of the rrcDataConfirmationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcDataConfirmationTimer(JAXBElement<Integer> value) {
        this.rrcDataConfirmationTimer = value;
    }

    /**
     * Gets the value of the t304GuardTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getT304GuardTimerIsDefault() {
        return t304GuardTimerIsDefault;
    }

    /**
     * Sets the value of the t304GuardTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setT304GuardTimerIsDefault(JAXBElement<Boolean> value) {
        this.t304GuardTimerIsDefault = value;
    }

    /**
     * Gets the value of the t304GuardTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getT304GuardTimer() {
        return t304GuardTimer;
    }

    /**
     * Sets the value of the t304GuardTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setT304GuardTimer(JAXBElement<Integer> value) {
        this.t304GuardTimer = value;
    }

    /**
     * Gets the value of the triIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTRIIsDefault() {
        return triIsDefault;
    }

    /**
     * Sets the value of the triIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTRIIsDefault(JAXBElement<Boolean> value) {
        this.triIsDefault = value;
    }

    /**
     * Gets the value of the tri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTRI() {
        return tri;
    }

    /**
     * Sets the value of the tri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTRI(JAXBElement<Integer> value) {
        this.tri = value;
    }

    /**
     * Gets the value of the triaeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTRIAEIsDefault() {
        return triaeIsDefault;
    }

    /**
     * Sets the value of the triaeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTRIAEIsDefault(JAXBElement<Boolean> value) {
        this.triaeIsDefault = value;
    }

    /**
     * Gets the value of the triae property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTRIAE() {
        return triae;
    }

    /**
     * Sets the value of the triae property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTRIAE(JAXBElement<Integer> value) {
        this.triae = value;
    }

    /**
     * Gets the value of the trirIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTRIRIsDefault() {
        return trirIsDefault;
    }

    /**
     * Sets the value of the trirIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTRIRIsDefault(JAXBElement<Boolean> value) {
        this.trirIsDefault = value;
    }

    /**
     * Gets the value of the trir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTRIR() {
        return trir;
    }

    /**
     * Sets the value of the trir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTRIR(JAXBElement<Integer> value) {
        this.trir = value;
    }

}
