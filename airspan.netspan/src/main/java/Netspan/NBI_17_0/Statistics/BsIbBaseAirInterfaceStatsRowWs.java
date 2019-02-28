
package Netspan.NBI_17_0.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BsIbBaseAirInterfaceStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BsIbBaseAirInterfaceStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SysUpTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UlErrorPkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlPkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlBytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlPkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlBytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarqUlBursts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarqUlAcks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarqUlNacks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarqDlBursts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarqDlAcks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarqDlNacks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NoiseLevelLowCounter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NoiseLevelMedCounter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NoiseLevelHighCounter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NoiseLevel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PeakNoiseLevel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlHarqLoss" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlHarqLoss" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FbNullingQi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BsIbBaseAirInterfaceStatsRowWs", propOrder = {
    "node",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "sysUpTime",
    "ulErrorPkts",
    "ulPkts",
    "ulBytes",
    "dlPkts",
    "dlBytes",
    "harqUlBursts",
    "harqUlAcks",
    "harqUlNacks",
    "harqDlBursts",
    "harqDlAcks",
    "harqDlNacks",
    "noiseLevelLowCounter",
    "noiseLevelMedCounter",
    "noiseLevelHighCounter",
    "noiseLevel",
    "peakNoiseLevel",
    "ulHarqLoss",
    "dlHarqLoss",
    "fbNullingQi"
})
public class BsIbBaseAirInterfaceStatsRowWs {

    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "SysUpTime")
    protected long sysUpTime;
    @XmlElementRef(name = "UlErrorPkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulErrorPkts;
    @XmlElementRef(name = "UlPkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulPkts;
    @XmlElementRef(name = "UlBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulBytes;
    @XmlElementRef(name = "DlPkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlPkts;
    @XmlElementRef(name = "DlBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlBytes;
    @XmlElementRef(name = "HarqUlBursts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harqUlBursts;
    @XmlElementRef(name = "HarqUlAcks", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harqUlAcks;
    @XmlElementRef(name = "HarqUlNacks", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harqUlNacks;
    @XmlElementRef(name = "HarqDlBursts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harqDlBursts;
    @XmlElementRef(name = "HarqDlAcks", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harqDlAcks;
    @XmlElementRef(name = "HarqDlNacks", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harqDlNacks;
    @XmlElementRef(name = "NoiseLevelLowCounter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> noiseLevelLowCounter;
    @XmlElementRef(name = "NoiseLevelMedCounter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> noiseLevelMedCounter;
    @XmlElementRef(name = "NoiseLevelHighCounter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> noiseLevelHighCounter;
    @XmlElementRef(name = "NoiseLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> noiseLevel;
    @XmlElementRef(name = "PeakNoiseLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> peakNoiseLevel;
    @XmlElementRef(name = "UlHarqLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulHarqLoss;
    @XmlElementRef(name = "DlHarqLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlHarqLoss;
    @XmlElementRef(name = "FbNullingQi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fbNullingQi;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the dateAndTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeStart() {
        return dateAndTimeStart;
    }

    /**
     * Sets the value of the dateAndTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeStart(XMLGregorianCalendar value) {
        this.dateAndTimeStart = value;
    }

    /**
     * Gets the value of the dateAndTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeEnd() {
        return dateAndTimeEnd;
    }

    /**
     * Sets the value of the dateAndTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeEnd(XMLGregorianCalendar value) {
        this.dateAndTimeEnd = value;
    }

    /**
     * Gets the value of the sysUpTime property.
     * 
     */
    public long getSysUpTime() {
        return sysUpTime;
    }

    /**
     * Sets the value of the sysUpTime property.
     * 
     */
    public void setSysUpTime(long value) {
        this.sysUpTime = value;
    }

    /**
     * Gets the value of the ulErrorPkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlErrorPkts() {
        return ulErrorPkts;
    }

    /**
     * Sets the value of the ulErrorPkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlErrorPkts(JAXBElement<Double> value) {
        this.ulErrorPkts = value;
    }

    /**
     * Gets the value of the ulPkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlPkts() {
        return ulPkts;
    }

    /**
     * Sets the value of the ulPkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlPkts(JAXBElement<Double> value) {
        this.ulPkts = value;
    }

    /**
     * Gets the value of the ulBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlBytes() {
        return ulBytes;
    }

    /**
     * Sets the value of the ulBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlBytes(JAXBElement<Double> value) {
        this.ulBytes = value;
    }

    /**
     * Gets the value of the dlPkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlPkts() {
        return dlPkts;
    }

    /**
     * Sets the value of the dlPkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlPkts(JAXBElement<Double> value) {
        this.dlPkts = value;
    }

    /**
     * Gets the value of the dlBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlBytes() {
        return dlBytes;
    }

    /**
     * Sets the value of the dlBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlBytes(JAXBElement<Double> value) {
        this.dlBytes = value;
    }

    /**
     * Gets the value of the harqUlBursts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarqUlBursts() {
        return harqUlBursts;
    }

    /**
     * Sets the value of the harqUlBursts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarqUlBursts(JAXBElement<Double> value) {
        this.harqUlBursts = value;
    }

    /**
     * Gets the value of the harqUlAcks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarqUlAcks() {
        return harqUlAcks;
    }

    /**
     * Sets the value of the harqUlAcks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarqUlAcks(JAXBElement<Double> value) {
        this.harqUlAcks = value;
    }

    /**
     * Gets the value of the harqUlNacks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarqUlNacks() {
        return harqUlNacks;
    }

    /**
     * Sets the value of the harqUlNacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarqUlNacks(JAXBElement<Double> value) {
        this.harqUlNacks = value;
    }

    /**
     * Gets the value of the harqDlBursts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarqDlBursts() {
        return harqDlBursts;
    }

    /**
     * Sets the value of the harqDlBursts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarqDlBursts(JAXBElement<Double> value) {
        this.harqDlBursts = value;
    }

    /**
     * Gets the value of the harqDlAcks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarqDlAcks() {
        return harqDlAcks;
    }

    /**
     * Sets the value of the harqDlAcks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarqDlAcks(JAXBElement<Double> value) {
        this.harqDlAcks = value;
    }

    /**
     * Gets the value of the harqDlNacks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarqDlNacks() {
        return harqDlNacks;
    }

    /**
     * Sets the value of the harqDlNacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarqDlNacks(JAXBElement<Double> value) {
        this.harqDlNacks = value;
    }

    /**
     * Gets the value of the noiseLevelLowCounter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNoiseLevelLowCounter() {
        return noiseLevelLowCounter;
    }

    /**
     * Sets the value of the noiseLevelLowCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNoiseLevelLowCounter(JAXBElement<Double> value) {
        this.noiseLevelLowCounter = value;
    }

    /**
     * Gets the value of the noiseLevelMedCounter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNoiseLevelMedCounter() {
        return noiseLevelMedCounter;
    }

    /**
     * Sets the value of the noiseLevelMedCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNoiseLevelMedCounter(JAXBElement<Double> value) {
        this.noiseLevelMedCounter = value;
    }

    /**
     * Gets the value of the noiseLevelHighCounter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNoiseLevelHighCounter() {
        return noiseLevelHighCounter;
    }

    /**
     * Sets the value of the noiseLevelHighCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNoiseLevelHighCounter(JAXBElement<Double> value) {
        this.noiseLevelHighCounter = value;
    }

    /**
     * Gets the value of the noiseLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNoiseLevel() {
        return noiseLevel;
    }

    /**
     * Sets the value of the noiseLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNoiseLevel(JAXBElement<Double> value) {
        this.noiseLevel = value;
    }

    /**
     * Gets the value of the peakNoiseLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPeakNoiseLevel() {
        return peakNoiseLevel;
    }

    /**
     * Sets the value of the peakNoiseLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPeakNoiseLevel(JAXBElement<Double> value) {
        this.peakNoiseLevel = value;
    }

    /**
     * Gets the value of the ulHarqLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlHarqLoss() {
        return ulHarqLoss;
    }

    /**
     * Sets the value of the ulHarqLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlHarqLoss(JAXBElement<Double> value) {
        this.ulHarqLoss = value;
    }

    /**
     * Gets the value of the dlHarqLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlHarqLoss() {
        return dlHarqLoss;
    }

    /**
     * Sets the value of the dlHarqLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlHarqLoss(JAXBElement<Double> value) {
        this.dlHarqLoss = value;
    }

    /**
     * Gets the value of the fbNullingQi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFbNullingQi() {
        return fbNullingQi;
    }

    /**
     * Sets the value of the fbNullingQi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFbNullingQi(JAXBElement<Integer> value) {
        this.fbNullingQi = value;
    }

}
