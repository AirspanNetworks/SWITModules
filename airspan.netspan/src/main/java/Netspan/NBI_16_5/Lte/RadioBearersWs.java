
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadioBearersWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioBearersWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RlcMode" type="{http://Airspan.Netspan.WebServices}RlcModeWs" minOccurs="0"/&gt;
 *         &lt;element name="TstatusProhibit" type="{http://Airspan.Netspan.WebServices}TstatusProhibitWs" minOccurs="0"/&gt;
 *         &lt;element name="DlTreordering" type="{http://Airspan.Netspan.WebServices}TreorderingWs" minOccurs="0"/&gt;
 *         &lt;element name="UlTreordering" type="{http://Airspan.Netspan.WebServices}TreorderingWs" minOccurs="0"/&gt;
 *         &lt;element name="PollPdu" type="{http://Airspan.Netspan.WebServices}PollPduWs" minOccurs="0"/&gt;
 *         &lt;element name="PollByte" type="{http://Airspan.Netspan.WebServices}PollByteWs" minOccurs="0"/&gt;
 *         &lt;element name="TpollRetransmit" type="{http://Airspan.Netspan.WebServices}TpollRetransmitWs" minOccurs="0"/&gt;
 *         &lt;element name="MaxRetxThreshold" type="{http://Airspan.Netspan.WebServices}MaxRetxThresholdWs" minOccurs="0"/&gt;
 *         &lt;element name="DlDiscardTimer" type="{http://Airspan.Netspan.WebServices}DiscardTimerWs" minOccurs="0"/&gt;
 *         &lt;element name="UlDiscardTimer" type="{http://Airspan.Netspan.WebServices}DiscardTimerWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioBearersWs", propOrder = {
    "rlcMode",
    "tstatusProhibit",
    "dlTreordering",
    "ulTreordering",
    "pollPdu",
    "pollByte",
    "tpollRetransmit",
    "maxRetxThreshold",
    "dlDiscardTimer",
    "ulDiscardTimer"
})
public class RadioBearersWs {

    @XmlElement(name = "RlcMode")
    protected RlcModeWs rlcMode;
    @XmlElement(name = "TstatusProhibit")
    protected TstatusProhibitWs tstatusProhibit;
    @XmlElement(name = "DlTreordering")
    protected TreorderingWs dlTreordering;
    @XmlElement(name = "UlTreordering")
    protected TreorderingWs ulTreordering;
    @XmlElement(name = "PollPdu")
    protected PollPduWs pollPdu;
    @XmlElement(name = "PollByte")
    protected PollByteWs pollByte;
    @XmlElement(name = "TpollRetransmit")
    protected TpollRetransmitWs tpollRetransmit;
    @XmlElement(name = "MaxRetxThreshold")
    protected MaxRetxThresholdWs maxRetxThreshold;
    @XmlElement(name = "DlDiscardTimer")
    protected DiscardTimerWs dlDiscardTimer;
    @XmlElement(name = "UlDiscardTimer")
    protected DiscardTimerWs ulDiscardTimer;

    /**
     * Gets the value of the rlcMode property.
     * 
     * @return
     *     possible object is
     *     {@link RlcModeWs }
     *     
     */
    public RlcModeWs getRlcMode() {
        return rlcMode;
    }

    /**
     * Sets the value of the rlcMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RlcModeWs }
     *     
     */
    public void setRlcMode(RlcModeWs value) {
        this.rlcMode = value;
    }

    /**
     * Gets the value of the tstatusProhibit property.
     * 
     * @return
     *     possible object is
     *     {@link TstatusProhibitWs }
     *     
     */
    public TstatusProhibitWs getTstatusProhibit() {
        return tstatusProhibit;
    }

    /**
     * Sets the value of the tstatusProhibit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TstatusProhibitWs }
     *     
     */
    public void setTstatusProhibit(TstatusProhibitWs value) {
        this.tstatusProhibit = value;
    }

    /**
     * Gets the value of the dlTreordering property.
     * 
     * @return
     *     possible object is
     *     {@link TreorderingWs }
     *     
     */
    public TreorderingWs getDlTreordering() {
        return dlTreordering;
    }

    /**
     * Sets the value of the dlTreordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreorderingWs }
     *     
     */
    public void setDlTreordering(TreorderingWs value) {
        this.dlTreordering = value;
    }

    /**
     * Gets the value of the ulTreordering property.
     * 
     * @return
     *     possible object is
     *     {@link TreorderingWs }
     *     
     */
    public TreorderingWs getUlTreordering() {
        return ulTreordering;
    }

    /**
     * Sets the value of the ulTreordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreorderingWs }
     *     
     */
    public void setUlTreordering(TreorderingWs value) {
        this.ulTreordering = value;
    }

    /**
     * Gets the value of the pollPdu property.
     * 
     * @return
     *     possible object is
     *     {@link PollPduWs }
     *     
     */
    public PollPduWs getPollPdu() {
        return pollPdu;
    }

    /**
     * Sets the value of the pollPdu property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollPduWs }
     *     
     */
    public void setPollPdu(PollPduWs value) {
        this.pollPdu = value;
    }

    /**
     * Gets the value of the pollByte property.
     * 
     * @return
     *     possible object is
     *     {@link PollByteWs }
     *     
     */
    public PollByteWs getPollByte() {
        return pollByte;
    }

    /**
     * Sets the value of the pollByte property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollByteWs }
     *     
     */
    public void setPollByte(PollByteWs value) {
        this.pollByte = value;
    }

    /**
     * Gets the value of the tpollRetransmit property.
     * 
     * @return
     *     possible object is
     *     {@link TpollRetransmitWs }
     *     
     */
    public TpollRetransmitWs getTpollRetransmit() {
        return tpollRetransmit;
    }

    /**
     * Sets the value of the tpollRetransmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpollRetransmitWs }
     *     
     */
    public void setTpollRetransmit(TpollRetransmitWs value) {
        this.tpollRetransmit = value;
    }

    /**
     * Gets the value of the maxRetxThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link MaxRetxThresholdWs }
     *     
     */
    public MaxRetxThresholdWs getMaxRetxThreshold() {
        return maxRetxThreshold;
    }

    /**
     * Sets the value of the maxRetxThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxRetxThresholdWs }
     *     
     */
    public void setMaxRetxThreshold(MaxRetxThresholdWs value) {
        this.maxRetxThreshold = value;
    }

    /**
     * Gets the value of the dlDiscardTimer property.
     * 
     * @return
     *     possible object is
     *     {@link DiscardTimerWs }
     *     
     */
    public DiscardTimerWs getDlDiscardTimer() {
        return dlDiscardTimer;
    }

    /**
     * Sets the value of the dlDiscardTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscardTimerWs }
     *     
     */
    public void setDlDiscardTimer(DiscardTimerWs value) {
        this.dlDiscardTimer = value;
    }

    /**
     * Gets the value of the ulDiscardTimer property.
     * 
     * @return
     *     possible object is
     *     {@link DiscardTimerWs }
     *     
     */
    public DiscardTimerWs getUlDiscardTimer() {
        return ulDiscardTimer;
    }

    /**
     * Sets the value of the ulDiscardTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscardTimerWs }
     *     
     */
    public void setUlDiscardTimer(DiscardTimerWs value) {
        this.ulDiscardTimer = value;
    }

}
