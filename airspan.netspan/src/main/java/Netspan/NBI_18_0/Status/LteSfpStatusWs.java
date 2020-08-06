
package Netspan.NBI_18_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteSfpStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSfpStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SfpSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SfpConnected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SfpVender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SfpSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SfpRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SfpFiberWavelength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SfpLinkSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmTemperature" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmTemperatureStatus" type="{http://Airspan.Netspan.WebServices}SfpDdmStatusValuesWs" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmVoltage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmVoltageStatus" type="{http://Airspan.Netspan.WebServices}SfpDdmStatusValuesWs" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmBias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmBiasStatus" type="{http://Airspan.Netspan.WebServices}SfpDdmStatusValuesWs" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmTxPower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmTxPowerStatus" type="{http://Airspan.Netspan.WebServices}SfpDdmStatusValuesWs" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmRxPower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SfpDdmRxPowerStatus" type="{http://Airspan.Netspan.WebServices}SfpDdmStatusValuesWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSfpStatusWs", propOrder = {
    "sfpSupported",
    "sfpConnected",
    "sfpVender",
    "sfpId",
    "sfpSerialNumber",
    "sfpRevision",
    "sfpFiberWavelength",
    "sfpLinkSpeed",
    "sfpDdmSupported",
    "sfpDdmTemperature",
    "sfpDdmTemperatureStatus",
    "sfpDdmVoltage",
    "sfpDdmVoltageStatus",
    "sfpDdmBias",
    "sfpDdmBiasStatus",
    "sfpDdmTxPower",
    "sfpDdmTxPowerStatus",
    "sfpDdmRxPower",
    "sfpDdmRxPowerStatus"
})
public class LteSfpStatusWs {

    @XmlElementRef(name = "SfpSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sfpSupported;
    @XmlElementRef(name = "SfpConnected", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sfpConnected;
    @XmlElement(name = "SfpVender")
    protected String sfpVender;
    @XmlElement(name = "SfpId")
    protected String sfpId;
    @XmlElement(name = "SfpSerialNumber")
    protected String sfpSerialNumber;
    @XmlElement(name = "SfpRevision")
    protected String sfpRevision;
    @XmlElement(name = "SfpFiberWavelength")
    protected String sfpFiberWavelength;
    @XmlElement(name = "SfpLinkSpeed")
    protected String sfpLinkSpeed;
    @XmlElementRef(name = "SfpDdmSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sfpDdmSupported;
    @XmlElementRef(name = "SfpDdmTemperature", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfpDdmTemperature;
    @XmlElementRef(name = "SfpDdmTemperatureStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SfpDdmStatusValuesWs> sfpDdmTemperatureStatus;
    @XmlElementRef(name = "SfpDdmVoltage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfpDdmVoltage;
    @XmlElementRef(name = "SfpDdmVoltageStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SfpDdmStatusValuesWs> sfpDdmVoltageStatus;
    @XmlElementRef(name = "SfpDdmBias", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfpDdmBias;
    @XmlElementRef(name = "SfpDdmBiasStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SfpDdmStatusValuesWs> sfpDdmBiasStatus;
    @XmlElementRef(name = "SfpDdmTxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> sfpDdmTxPower;
    @XmlElementRef(name = "SfpDdmTxPowerStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SfpDdmStatusValuesWs> sfpDdmTxPowerStatus;
    @XmlElementRef(name = "SfpDdmRxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> sfpDdmRxPower;
    @XmlElementRef(name = "SfpDdmRxPowerStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SfpDdmStatusValuesWs> sfpDdmRxPowerStatus;

    /**
     * Gets the value of the sfpSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSfpSupported() {
        return sfpSupported;
    }

    /**
     * Sets the value of the sfpSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSfpSupported(JAXBElement<Boolean> value) {
        this.sfpSupported = value;
    }

    /**
     * Gets the value of the sfpConnected property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSfpConnected() {
        return sfpConnected;
    }

    /**
     * Sets the value of the sfpConnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSfpConnected(JAXBElement<Boolean> value) {
        this.sfpConnected = value;
    }

    /**
     * Gets the value of the sfpVender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfpVender() {
        return sfpVender;
    }

    /**
     * Sets the value of the sfpVender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfpVender(String value) {
        this.sfpVender = value;
    }

    /**
     * Gets the value of the sfpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfpId() {
        return sfpId;
    }

    /**
     * Sets the value of the sfpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfpId(String value) {
        this.sfpId = value;
    }

    /**
     * Gets the value of the sfpSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfpSerialNumber() {
        return sfpSerialNumber;
    }

    /**
     * Sets the value of the sfpSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfpSerialNumber(String value) {
        this.sfpSerialNumber = value;
    }

    /**
     * Gets the value of the sfpRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfpRevision() {
        return sfpRevision;
    }

    /**
     * Sets the value of the sfpRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfpRevision(String value) {
        this.sfpRevision = value;
    }

    /**
     * Gets the value of the sfpFiberWavelength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfpFiberWavelength() {
        return sfpFiberWavelength;
    }

    /**
     * Sets the value of the sfpFiberWavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfpFiberWavelength(String value) {
        this.sfpFiberWavelength = value;
    }

    /**
     * Gets the value of the sfpLinkSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfpLinkSpeed() {
        return sfpLinkSpeed;
    }

    /**
     * Sets the value of the sfpLinkSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfpLinkSpeed(String value) {
        this.sfpLinkSpeed = value;
    }

    /**
     * Gets the value of the sfpDdmSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSfpDdmSupported() {
        return sfpDdmSupported;
    }

    /**
     * Sets the value of the sfpDdmSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSfpDdmSupported(JAXBElement<Boolean> value) {
        this.sfpDdmSupported = value;
    }

    /**
     * Gets the value of the sfpDdmTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSfpDdmTemperature() {
        return sfpDdmTemperature;
    }

    /**
     * Sets the value of the sfpDdmTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSfpDdmTemperature(JAXBElement<Integer> value) {
        this.sfpDdmTemperature = value;
    }

    /**
     * Gets the value of the sfpDdmTemperatureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}
     *     
     */
    public JAXBElement<SfpDdmStatusValuesWs> getSfpDdmTemperatureStatus() {
        return sfpDdmTemperatureStatus;
    }

    /**
     * Sets the value of the sfpDdmTemperatureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}
     *     
     */
    public void setSfpDdmTemperatureStatus(JAXBElement<SfpDdmStatusValuesWs> value) {
        this.sfpDdmTemperatureStatus = value;
    }

    /**
     * Gets the value of the sfpDdmVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSfpDdmVoltage() {
        return sfpDdmVoltage;
    }

    /**
     * Sets the value of the sfpDdmVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSfpDdmVoltage(JAXBElement<Integer> value) {
        this.sfpDdmVoltage = value;
    }

    /**
     * Gets the value of the sfpDdmVoltageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}
     *     
     */
    public JAXBElement<SfpDdmStatusValuesWs> getSfpDdmVoltageStatus() {
        return sfpDdmVoltageStatus;
    }

    /**
     * Sets the value of the sfpDdmVoltageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}
     *     
     */
    public void setSfpDdmVoltageStatus(JAXBElement<SfpDdmStatusValuesWs> value) {
        this.sfpDdmVoltageStatus = value;
    }

    /**
     * Gets the value of the sfpDdmBias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSfpDdmBias() {
        return sfpDdmBias;
    }

    /**
     * Sets the value of the sfpDdmBias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSfpDdmBias(JAXBElement<Integer> value) {
        this.sfpDdmBias = value;
    }

    /**
     * Gets the value of the sfpDdmBiasStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}
     *     
     */
    public JAXBElement<SfpDdmStatusValuesWs> getSfpDdmBiasStatus() {
        return sfpDdmBiasStatus;
    }

    /**
     * Sets the value of the sfpDdmBiasStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}
     *     
     */
    public void setSfpDdmBiasStatus(JAXBElement<SfpDdmStatusValuesWs> value) {
        this.sfpDdmBiasStatus = value;
    }

    /**
     * Gets the value of the sfpDdmTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSfpDdmTxPower() {
        return sfpDdmTxPower;
    }

    /**
     * Sets the value of the sfpDdmTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSfpDdmTxPower(JAXBElement<Double> value) {
        this.sfpDdmTxPower = value;
    }

    /**
     * Gets the value of the sfpDdmTxPowerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}
     *     
     */
    public JAXBElement<SfpDdmStatusValuesWs> getSfpDdmTxPowerStatus() {
        return sfpDdmTxPowerStatus;
    }

    /**
     * Sets the value of the sfpDdmTxPowerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}
     *     
     */
    public void setSfpDdmTxPowerStatus(JAXBElement<SfpDdmStatusValuesWs> value) {
        this.sfpDdmTxPowerStatus = value;
    }

    /**
     * Gets the value of the sfpDdmRxPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSfpDdmRxPower() {
        return sfpDdmRxPower;
    }

    /**
     * Sets the value of the sfpDdmRxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSfpDdmRxPower(JAXBElement<Double> value) {
        this.sfpDdmRxPower = value;
    }

    /**
     * Gets the value of the sfpDdmRxPowerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}
     *     
     */
    public JAXBElement<SfpDdmStatusValuesWs> getSfpDdmRxPowerStatus() {
        return sfpDdmRxPowerStatus;
    }

    /**
     * Sets the value of the sfpDdmRxPowerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}
     *     
     */
    public void setSfpDdmRxPowerStatus(JAXBElement<SfpDdmStatusValuesWs> value) {
        this.sfpDdmRxPowerStatus = value;
    }

}
