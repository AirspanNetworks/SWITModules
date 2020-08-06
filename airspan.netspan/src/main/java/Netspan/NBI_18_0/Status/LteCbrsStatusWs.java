
package Netspan.NBI_18_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteCbrsStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCbrsStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CbrsEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="CbsdState" type="{http://Airspan.Netspan.WebServices}CbrsStates" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cell1AssignedBandwidth" type="{http://Airspan.Netspan.WebServices}CbrsBandwidths" minOccurs="0"/&gt;
 *         &lt;element name="Cell1DlEarfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cell1AssignedFrequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cell1AssignedTxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Grant1ExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Grant1TransmissionExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Cell2AssignedBandwidth" type="{http://Airspan.Netspan.WebServices}CbrsBandwidths" minOccurs="0"/&gt;
 *         &lt;element name="Cell2DlEarfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cell2AssignedFrequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cell2AssignedTxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Grant2ExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Grant2TransmissionExpiryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CarrierAggregationMode" type="{http://Airspan.Netspan.WebServices}WsCarrierAggModes" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementBandwidthKhz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RcvdPowerMeasReports" type="{http://Airspan.Netspan.WebServices}ArrayOfLteCbrsMeasReportWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCbrsStatusWs", propOrder = {
    "cbrsEnabled",
    "cbsdState",
    "errorMessage",
    "cell1AssignedBandwidth",
    "cell1DlEarfcn",
    "cell1AssignedFrequency",
    "cell1AssignedTxPower",
    "grant1ExpiryTime",
    "grant1TransmissionExpiryTime",
    "cell2AssignedBandwidth",
    "cell2DlEarfcn",
    "cell2AssignedFrequency",
    "cell2AssignedTxPower",
    "grant2ExpiryTime",
    "grant2TransmissionExpiryTime",
    "carrierAggregationMode",
    "measurementBandwidthKhz",
    "rcvdPowerMeasReports"
})
public class LteCbrsStatusWs {

    @XmlElementRef(name = "CbrsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> cbrsEnabled;
    @XmlElementRef(name = "CbsdState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CbrsStates> cbsdState;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElementRef(name = "Cell1AssignedBandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cell1AssignedBandwidth;
    @XmlElementRef(name = "Cell1DlEarfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cell1DlEarfcn;
    @XmlElementRef(name = "Cell1AssignedFrequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cell1AssignedFrequency;
    @XmlElementRef(name = "Cell1AssignedTxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cell1AssignedTxPower;
    @XmlElementRef(name = "Grant1ExpiryTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> grant1ExpiryTime;
    @XmlElementRef(name = "Grant1TransmissionExpiryTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> grant1TransmissionExpiryTime;
    @XmlElementRef(name = "Cell2AssignedBandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cell2AssignedBandwidth;
    @XmlElementRef(name = "Cell2DlEarfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cell2DlEarfcn;
    @XmlElementRef(name = "Cell2AssignedFrequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cell2AssignedFrequency;
    @XmlElementRef(name = "Cell2AssignedTxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cell2AssignedTxPower;
    @XmlElementRef(name = "Grant2ExpiryTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> grant2ExpiryTime;
    @XmlElementRef(name = "Grant2TransmissionExpiryTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> grant2TransmissionExpiryTime;
    @XmlElementRef(name = "CarrierAggregationMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<WsCarrierAggModes> carrierAggregationMode;
    @XmlElementRef(name = "MeasurementBandwidthKhz", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> measurementBandwidthKhz;
    @XmlElement(name = "RcvdPowerMeasReports")
    protected ArrayOfLteCbrsMeasReportWs rcvdPowerMeasReports;

    /**
     * Gets the value of the cbrsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getCbrsEnabled() {
        return cbrsEnabled;
    }

    /**
     * Sets the value of the cbrsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setCbrsEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.cbrsEnabled = value;
    }

    /**
     * Gets the value of the cbsdState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CbrsStates }{@code >}
     *     
     */
    public JAXBElement<CbrsStates> getCbsdState() {
        return cbsdState;
    }

    /**
     * Sets the value of the cbsdState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CbrsStates }{@code >}
     *     
     */
    public void setCbsdState(JAXBElement<CbrsStates> value) {
        this.cbsdState = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the cell1AssignedBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCell1AssignedBandwidth() {
        return cell1AssignedBandwidth;
    }

    /**
     * Sets the value of the cell1AssignedBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCell1AssignedBandwidth(JAXBElement<String> value) {
        this.cell1AssignedBandwidth = value;
    }

    /**
     * Gets the value of the cell1DlEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCell1DlEarfcn() {
        return cell1DlEarfcn;
    }

    /**
     * Sets the value of the cell1DlEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCell1DlEarfcn(JAXBElement<Integer> value) {
        this.cell1DlEarfcn = value;
    }

    /**
     * Gets the value of the cell1AssignedFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCell1AssignedFrequency() {
        return cell1AssignedFrequency;
    }

    /**
     * Sets the value of the cell1AssignedFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCell1AssignedFrequency(JAXBElement<Integer> value) {
        this.cell1AssignedFrequency = value;
    }

    /**
     * Gets the value of the cell1AssignedTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCell1AssignedTxPower() {
        return cell1AssignedTxPower;
    }

    /**
     * Sets the value of the cell1AssignedTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCell1AssignedTxPower(JAXBElement<Integer> value) {
        this.cell1AssignedTxPower = value;
    }

    /**
     * Gets the value of the grant1ExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGrant1ExpiryTime() {
        return grant1ExpiryTime;
    }

    /**
     * Sets the value of the grant1ExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGrant1ExpiryTime(JAXBElement<XMLGregorianCalendar> value) {
        this.grant1ExpiryTime = value;
    }

    /**
     * Gets the value of the grant1TransmissionExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGrant1TransmissionExpiryTime() {
        return grant1TransmissionExpiryTime;
    }

    /**
     * Sets the value of the grant1TransmissionExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGrant1TransmissionExpiryTime(JAXBElement<XMLGregorianCalendar> value) {
        this.grant1TransmissionExpiryTime = value;
    }

    /**
     * Gets the value of the cell2AssignedBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCell2AssignedBandwidth() {
        return cell2AssignedBandwidth;
    }

    /**
     * Sets the value of the cell2AssignedBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCell2AssignedBandwidth(JAXBElement<String> value) {
        this.cell2AssignedBandwidth = value;
    }

    /**
     * Gets the value of the cell2DlEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCell2DlEarfcn() {
        return cell2DlEarfcn;
    }

    /**
     * Sets the value of the cell2DlEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCell2DlEarfcn(JAXBElement<Integer> value) {
        this.cell2DlEarfcn = value;
    }

    /**
     * Gets the value of the cell2AssignedFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCell2AssignedFrequency() {
        return cell2AssignedFrequency;
    }

    /**
     * Sets the value of the cell2AssignedFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCell2AssignedFrequency(JAXBElement<Integer> value) {
        this.cell2AssignedFrequency = value;
    }

    /**
     * Gets the value of the cell2AssignedTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCell2AssignedTxPower() {
        return cell2AssignedTxPower;
    }

    /**
     * Sets the value of the cell2AssignedTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCell2AssignedTxPower(JAXBElement<Integer> value) {
        this.cell2AssignedTxPower = value;
    }

    /**
     * Gets the value of the grant2ExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGrant2ExpiryTime() {
        return grant2ExpiryTime;
    }

    /**
     * Sets the value of the grant2ExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGrant2ExpiryTime(JAXBElement<XMLGregorianCalendar> value) {
        this.grant2ExpiryTime = value;
    }

    /**
     * Gets the value of the grant2TransmissionExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGrant2TransmissionExpiryTime() {
        return grant2TransmissionExpiryTime;
    }

    /**
     * Sets the value of the grant2TransmissionExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGrant2TransmissionExpiryTime(JAXBElement<XMLGregorianCalendar> value) {
        this.grant2TransmissionExpiryTime = value;
    }

    /**
     * Gets the value of the carrierAggregationMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsCarrierAggModes }{@code >}
     *     
     */
    public JAXBElement<WsCarrierAggModes> getCarrierAggregationMode() {
        return carrierAggregationMode;
    }

    /**
     * Sets the value of the carrierAggregationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsCarrierAggModes }{@code >}
     *     
     */
    public void setCarrierAggregationMode(JAXBElement<WsCarrierAggModes> value) {
        this.carrierAggregationMode = value;
    }

    /**
     * Gets the value of the measurementBandwidthKhz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeasurementBandwidthKhz() {
        return measurementBandwidthKhz;
    }

    /**
     * Sets the value of the measurementBandwidthKhz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeasurementBandwidthKhz(JAXBElement<Integer> value) {
        this.measurementBandwidthKhz = value;
    }

    /**
     * Gets the value of the rcvdPowerMeasReports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLteCbrsMeasReportWs }
     *     
     */
    public ArrayOfLteCbrsMeasReportWs getRcvdPowerMeasReports() {
        return rcvdPowerMeasReports;
    }

    /**
     * Sets the value of the rcvdPowerMeasReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLteCbrsMeasReportWs }
     *     
     */
    public void setRcvdPowerMeasReports(ArrayOfLteCbrsMeasReportWs value) {
        this.rcvdPowerMeasReports = value;
    }

}
