
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandoverWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandoverWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceTx2ReloCprepIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SourceTx2ReloCprep" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SourceTs1ReloCprepIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SourceTs1ReloCprep" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SourceTx2ReloCoverallIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SourceTx2ReloCoverall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SourceTs1ReloCoverallIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SourceTs1ReloCoverall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TargetFwhoContextFetchTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetFwhoContextFetchTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TargetX2S1RelocExecutionTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetX2S1RelocExecutionTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PacketForwardingEnabledIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PacketForwardingEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="PacketForwardingDlUmIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PacketForwardingDlUm" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="AllowHoWithoutHrlIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowHoWithoutHrl" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="ForceFullConfigIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForceFullConfig" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseCsiRsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseCsiRs" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandoverWs", propOrder = {
    "sourceTx2ReloCprepIsDefault",
    "sourceTx2ReloCprep",
    "sourceTs1ReloCprepIsDefault",
    "sourceTs1ReloCprep",
    "sourceTx2ReloCoverallIsDefault",
    "sourceTx2ReloCoverall",
    "sourceTs1ReloCoverallIsDefault",
    "sourceTs1ReloCoverall",
    "targetFwhoContextFetchTimerIsDefault",
    "targetFwhoContextFetchTimer",
    "targetX2S1RelocExecutionTimerIsDefault",
    "targetX2S1RelocExecutionTimer",
    "packetForwardingEnabledIsDefault",
    "packetForwardingEnabled",
    "packetForwardingDlUmIsDefault",
    "packetForwardingDlUm",
    "allowHoWithoutHrlIsDefault",
    "allowHoWithoutHrl",
    "forceFullConfigIsDefault",
    "forceFullConfig",
    "releaseCsiRsIsDefault",
    "releaseCsiRs"
})
public class HandoverWs {

    @XmlElementRef(name = "SourceTx2ReloCprepIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sourceTx2ReloCprepIsDefault;
    @XmlElementRef(name = "SourceTx2ReloCprep", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sourceTx2ReloCprep;
    @XmlElementRef(name = "SourceTs1ReloCprepIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sourceTs1ReloCprepIsDefault;
    @XmlElementRef(name = "SourceTs1ReloCprep", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sourceTs1ReloCprep;
    @XmlElementRef(name = "SourceTx2ReloCoverallIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sourceTx2ReloCoverallIsDefault;
    @XmlElementRef(name = "SourceTx2ReloCoverall", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sourceTx2ReloCoverall;
    @XmlElementRef(name = "SourceTs1ReloCoverallIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sourceTs1ReloCoverallIsDefault;
    @XmlElementRef(name = "SourceTs1ReloCoverall", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sourceTs1ReloCoverall;
    @XmlElementRef(name = "TargetFwhoContextFetchTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> targetFwhoContextFetchTimerIsDefault;
    @XmlElementRef(name = "TargetFwhoContextFetchTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> targetFwhoContextFetchTimer;
    @XmlElementRef(name = "TargetX2S1RelocExecutionTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> targetX2S1RelocExecutionTimerIsDefault;
    @XmlElementRef(name = "TargetX2S1RelocExecutionTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> targetX2S1RelocExecutionTimer;
    @XmlElementRef(name = "PacketForwardingEnabledIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> packetForwardingEnabledIsDefault;
    @XmlElementRef(name = "PacketForwardingEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> packetForwardingEnabled;
    @XmlElementRef(name = "PacketForwardingDlUmIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> packetForwardingDlUmIsDefault;
    @XmlElementRef(name = "PacketForwardingDlUm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> packetForwardingDlUm;
    @XmlElementRef(name = "AllowHoWithoutHrlIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowHoWithoutHrlIsDefault;
    @XmlElementRef(name = "AllowHoWithoutHrl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> allowHoWithoutHrl;
    @XmlElementRef(name = "ForceFullConfigIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> forceFullConfigIsDefault;
    @XmlElementRef(name = "ForceFullConfig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> forceFullConfig;
    @XmlElementRef(name = "ReleaseCsiRsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> releaseCsiRsIsDefault;
    @XmlElementRef(name = "ReleaseCsiRs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> releaseCsiRs;

    /**
     * Gets the value of the sourceTx2ReloCprepIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSourceTx2ReloCprepIsDefault() {
        return sourceTx2ReloCprepIsDefault;
    }

    /**
     * Sets the value of the sourceTx2ReloCprepIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSourceTx2ReloCprepIsDefault(JAXBElement<Boolean> value) {
        this.sourceTx2ReloCprepIsDefault = value;
    }

    /**
     * Gets the value of the sourceTx2ReloCprep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSourceTx2ReloCprep() {
        return sourceTx2ReloCprep;
    }

    /**
     * Sets the value of the sourceTx2ReloCprep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSourceTx2ReloCprep(JAXBElement<Integer> value) {
        this.sourceTx2ReloCprep = value;
    }

    /**
     * Gets the value of the sourceTs1ReloCprepIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSourceTs1ReloCprepIsDefault() {
        return sourceTs1ReloCprepIsDefault;
    }

    /**
     * Sets the value of the sourceTs1ReloCprepIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSourceTs1ReloCprepIsDefault(JAXBElement<Boolean> value) {
        this.sourceTs1ReloCprepIsDefault = value;
    }

    /**
     * Gets the value of the sourceTs1ReloCprep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSourceTs1ReloCprep() {
        return sourceTs1ReloCprep;
    }

    /**
     * Sets the value of the sourceTs1ReloCprep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSourceTs1ReloCprep(JAXBElement<Integer> value) {
        this.sourceTs1ReloCprep = value;
    }

    /**
     * Gets the value of the sourceTx2ReloCoverallIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSourceTx2ReloCoverallIsDefault() {
        return sourceTx2ReloCoverallIsDefault;
    }

    /**
     * Sets the value of the sourceTx2ReloCoverallIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSourceTx2ReloCoverallIsDefault(JAXBElement<Boolean> value) {
        this.sourceTx2ReloCoverallIsDefault = value;
    }

    /**
     * Gets the value of the sourceTx2ReloCoverall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSourceTx2ReloCoverall() {
        return sourceTx2ReloCoverall;
    }

    /**
     * Sets the value of the sourceTx2ReloCoverall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSourceTx2ReloCoverall(JAXBElement<Integer> value) {
        this.sourceTx2ReloCoverall = value;
    }

    /**
     * Gets the value of the sourceTs1ReloCoverallIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSourceTs1ReloCoverallIsDefault() {
        return sourceTs1ReloCoverallIsDefault;
    }

    /**
     * Sets the value of the sourceTs1ReloCoverallIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSourceTs1ReloCoverallIsDefault(JAXBElement<Boolean> value) {
        this.sourceTs1ReloCoverallIsDefault = value;
    }

    /**
     * Gets the value of the sourceTs1ReloCoverall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSourceTs1ReloCoverall() {
        return sourceTs1ReloCoverall;
    }

    /**
     * Sets the value of the sourceTs1ReloCoverall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSourceTs1ReloCoverall(JAXBElement<Integer> value) {
        this.sourceTs1ReloCoverall = value;
    }

    /**
     * Gets the value of the targetFwhoContextFetchTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTargetFwhoContextFetchTimerIsDefault() {
        return targetFwhoContextFetchTimerIsDefault;
    }

    /**
     * Sets the value of the targetFwhoContextFetchTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTargetFwhoContextFetchTimerIsDefault(JAXBElement<Boolean> value) {
        this.targetFwhoContextFetchTimerIsDefault = value;
    }

    /**
     * Gets the value of the targetFwhoContextFetchTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTargetFwhoContextFetchTimer() {
        return targetFwhoContextFetchTimer;
    }

    /**
     * Sets the value of the targetFwhoContextFetchTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTargetFwhoContextFetchTimer(JAXBElement<Integer> value) {
        this.targetFwhoContextFetchTimer = value;
    }

    /**
     * Gets the value of the targetX2S1RelocExecutionTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTargetX2S1RelocExecutionTimerIsDefault() {
        return targetX2S1RelocExecutionTimerIsDefault;
    }

    /**
     * Sets the value of the targetX2S1RelocExecutionTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTargetX2S1RelocExecutionTimerIsDefault(JAXBElement<Boolean> value) {
        this.targetX2S1RelocExecutionTimerIsDefault = value;
    }

    /**
     * Gets the value of the targetX2S1RelocExecutionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTargetX2S1RelocExecutionTimer() {
        return targetX2S1RelocExecutionTimer;
    }

    /**
     * Sets the value of the targetX2S1RelocExecutionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTargetX2S1RelocExecutionTimer(JAXBElement<Integer> value) {
        this.targetX2S1RelocExecutionTimer = value;
    }

    /**
     * Gets the value of the packetForwardingEnabledIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPacketForwardingEnabledIsDefault() {
        return packetForwardingEnabledIsDefault;
    }

    /**
     * Sets the value of the packetForwardingEnabledIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPacketForwardingEnabledIsDefault(JAXBElement<Boolean> value) {
        this.packetForwardingEnabledIsDefault = value;
    }

    /**
     * Gets the value of the packetForwardingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getPacketForwardingEnabled() {
        return packetForwardingEnabled;
    }

    /**
     * Sets the value of the packetForwardingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setPacketForwardingEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.packetForwardingEnabled = value;
    }

    /**
     * Gets the value of the packetForwardingDlUmIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPacketForwardingDlUmIsDefault() {
        return packetForwardingDlUmIsDefault;
    }

    /**
     * Sets the value of the packetForwardingDlUmIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPacketForwardingDlUmIsDefault(JAXBElement<Boolean> value) {
        this.packetForwardingDlUmIsDefault = value;
    }

    /**
     * Gets the value of the packetForwardingDlUm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getPacketForwardingDlUm() {
        return packetForwardingDlUm;
    }

    /**
     * Sets the value of the packetForwardingDlUm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setPacketForwardingDlUm(JAXBElement<EnabledDisabledStates> value) {
        this.packetForwardingDlUm = value;
    }

    /**
     * Gets the value of the allowHoWithoutHrlIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowHoWithoutHrlIsDefault() {
        return allowHoWithoutHrlIsDefault;
    }

    /**
     * Sets the value of the allowHoWithoutHrlIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowHoWithoutHrlIsDefault(JAXBElement<Boolean> value) {
        this.allowHoWithoutHrlIsDefault = value;
    }

    /**
     * Gets the value of the allowHoWithoutHrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getAllowHoWithoutHrl() {
        return allowHoWithoutHrl;
    }

    /**
     * Sets the value of the allowHoWithoutHrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setAllowHoWithoutHrl(JAXBElement<EnabledDisabledStates> value) {
        this.allowHoWithoutHrl = value;
    }

    /**
     * Gets the value of the forceFullConfigIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getForceFullConfigIsDefault() {
        return forceFullConfigIsDefault;
    }

    /**
     * Sets the value of the forceFullConfigIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setForceFullConfigIsDefault(JAXBElement<Boolean> value) {
        this.forceFullConfigIsDefault = value;
    }

    /**
     * Gets the value of the forceFullConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getForceFullConfig() {
        return forceFullConfig;
    }

    /**
     * Sets the value of the forceFullConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setForceFullConfig(JAXBElement<EnabledDisabledStates> value) {
        this.forceFullConfig = value;
    }

    /**
     * Gets the value of the releaseCsiRsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReleaseCsiRsIsDefault() {
        return releaseCsiRsIsDefault;
    }

    /**
     * Sets the value of the releaseCsiRsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReleaseCsiRsIsDefault(JAXBElement<Boolean> value) {
        this.releaseCsiRsIsDefault = value;
    }

    /**
     * Gets the value of the releaseCsiRs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getReleaseCsiRs() {
        return releaseCsiRs;
    }

    /**
     * Sets the value of the releaseCsiRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setReleaseCsiRs(JAXBElement<EnabledDisabledStates> value) {
        this.releaseCsiRs = value;
    }

}
