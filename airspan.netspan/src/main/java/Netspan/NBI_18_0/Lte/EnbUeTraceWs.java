
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbUeTraceWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbUeTraceWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TraceCollectionMethodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TraceCollectionMethod" type="{http://Airspan.Netspan.WebServices}TraceCollectionType" minOccurs="0"/&gt;
 *         &lt;element name="MaxFileSizeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxFileSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxFileRecordDurationIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxFileRecordDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PpsLoadThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PpsLoadThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PpsLoadHysteresisIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PpsLoadHysteresis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LoadCheckIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadCheck" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MemoryThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MemoryThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransferProtocalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransferProtocal" type="{http://Airspan.Netspan.WebServices}TransferProtocalType" minOccurs="0"/&gt;
 *         &lt;element name="CompressRecordIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompressRecord" type="{http://Airspan.Netspan.WebServices}TrueFalseStates" minOccurs="0"/&gt;
 *         &lt;element name="TraceIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TraceInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbUeTraceWs", propOrder = {
    "traceCollectionMethodIsDefault",
    "traceCollectionMethod",
    "maxFileSizeIsDefault",
    "maxFileSize",
    "maxFileRecordDurationIsDefault",
    "maxFileRecordDuration",
    "ppsLoadThresholdIsDefault",
    "ppsLoadThreshold",
    "ppsLoadHysteresisIsDefault",
    "ppsLoadHysteresis",
    "loadCheckIsDefault",
    "loadCheck",
    "memoryThresholdIsDefault",
    "memoryThreshold",
    "transferProtocalIsDefault",
    "transferProtocal",
    "compressRecordIsDefault",
    "compressRecord",
    "traceIntervalIsDefault",
    "traceInterval"
})
public class EnbUeTraceWs {

    @XmlElementRef(name = "TraceCollectionMethodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> traceCollectionMethodIsDefault;
    @XmlElementRef(name = "TraceCollectionMethod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TraceCollectionType> traceCollectionMethod;
    @XmlElementRef(name = "MaxFileSizeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxFileSizeIsDefault;
    @XmlElementRef(name = "MaxFileSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxFileSize;
    @XmlElementRef(name = "MaxFileRecordDurationIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxFileRecordDurationIsDefault;
    @XmlElementRef(name = "MaxFileRecordDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxFileRecordDuration;
    @XmlElementRef(name = "PpsLoadThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ppsLoadThresholdIsDefault;
    @XmlElementRef(name = "PpsLoadThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ppsLoadThreshold;
    @XmlElementRef(name = "PpsLoadHysteresisIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ppsLoadHysteresisIsDefault;
    @XmlElementRef(name = "PpsLoadHysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ppsLoadHysteresis;
    @XmlElementRef(name = "LoadCheckIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> loadCheckIsDefault;
    @XmlElementRef(name = "LoadCheck", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> loadCheck;
    @XmlElementRef(name = "MemoryThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> memoryThresholdIsDefault;
    @XmlElementRef(name = "MemoryThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> memoryThreshold;
    @XmlElementRef(name = "TransferProtocalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> transferProtocalIsDefault;
    @XmlElementRef(name = "TransferProtocal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TransferProtocalType> transferProtocal;
    @XmlElementRef(name = "CompressRecordIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> compressRecordIsDefault;
    @XmlElementRef(name = "CompressRecord", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TrueFalseStates> compressRecord;
    @XmlElementRef(name = "TraceIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> traceIntervalIsDefault;
    @XmlElementRef(name = "TraceInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> traceInterval;

    /**
     * Gets the value of the traceCollectionMethodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTraceCollectionMethodIsDefault() {
        return traceCollectionMethodIsDefault;
    }

    /**
     * Sets the value of the traceCollectionMethodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTraceCollectionMethodIsDefault(JAXBElement<Boolean> value) {
        this.traceCollectionMethodIsDefault = value;
    }

    /**
     * Gets the value of the traceCollectionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TraceCollectionType }{@code >}
     *     
     */
    public JAXBElement<TraceCollectionType> getTraceCollectionMethod() {
        return traceCollectionMethod;
    }

    /**
     * Sets the value of the traceCollectionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TraceCollectionType }{@code >}
     *     
     */
    public void setTraceCollectionMethod(JAXBElement<TraceCollectionType> value) {
        this.traceCollectionMethod = value;
    }

    /**
     * Gets the value of the maxFileSizeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxFileSizeIsDefault() {
        return maxFileSizeIsDefault;
    }

    /**
     * Sets the value of the maxFileSizeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxFileSizeIsDefault(JAXBElement<Boolean> value) {
        this.maxFileSizeIsDefault = value;
    }

    /**
     * Gets the value of the maxFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * Sets the value of the maxFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxFileSize(JAXBElement<Integer> value) {
        this.maxFileSize = value;
    }

    /**
     * Gets the value of the maxFileRecordDurationIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxFileRecordDurationIsDefault() {
        return maxFileRecordDurationIsDefault;
    }

    /**
     * Sets the value of the maxFileRecordDurationIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxFileRecordDurationIsDefault(JAXBElement<Boolean> value) {
        this.maxFileRecordDurationIsDefault = value;
    }

    /**
     * Gets the value of the maxFileRecordDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxFileRecordDuration() {
        return maxFileRecordDuration;
    }

    /**
     * Sets the value of the maxFileRecordDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxFileRecordDuration(JAXBElement<Integer> value) {
        this.maxFileRecordDuration = value;
    }

    /**
     * Gets the value of the ppsLoadThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPpsLoadThresholdIsDefault() {
        return ppsLoadThresholdIsDefault;
    }

    /**
     * Sets the value of the ppsLoadThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPpsLoadThresholdIsDefault(JAXBElement<Boolean> value) {
        this.ppsLoadThresholdIsDefault = value;
    }

    /**
     * Gets the value of the ppsLoadThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPpsLoadThreshold() {
        return ppsLoadThreshold;
    }

    /**
     * Sets the value of the ppsLoadThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPpsLoadThreshold(JAXBElement<Integer> value) {
        this.ppsLoadThreshold = value;
    }

    /**
     * Gets the value of the ppsLoadHysteresisIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPpsLoadHysteresisIsDefault() {
        return ppsLoadHysteresisIsDefault;
    }

    /**
     * Sets the value of the ppsLoadHysteresisIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPpsLoadHysteresisIsDefault(JAXBElement<Boolean> value) {
        this.ppsLoadHysteresisIsDefault = value;
    }

    /**
     * Gets the value of the ppsLoadHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPpsLoadHysteresis() {
        return ppsLoadHysteresis;
    }

    /**
     * Sets the value of the ppsLoadHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPpsLoadHysteresis(JAXBElement<Integer> value) {
        this.ppsLoadHysteresis = value;
    }

    /**
     * Gets the value of the loadCheckIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLoadCheckIsDefault() {
        return loadCheckIsDefault;
    }

    /**
     * Sets the value of the loadCheckIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLoadCheckIsDefault(JAXBElement<Boolean> value) {
        this.loadCheckIsDefault = value;
    }

    /**
     * Gets the value of the loadCheck property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLoadCheck() {
        return loadCheck;
    }

    /**
     * Sets the value of the loadCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLoadCheck(JAXBElement<Integer> value) {
        this.loadCheck = value;
    }

    /**
     * Gets the value of the memoryThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMemoryThresholdIsDefault() {
        return memoryThresholdIsDefault;
    }

    /**
     * Sets the value of the memoryThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMemoryThresholdIsDefault(JAXBElement<Boolean> value) {
        this.memoryThresholdIsDefault = value;
    }

    /**
     * Gets the value of the memoryThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMemoryThreshold() {
        return memoryThreshold;
    }

    /**
     * Sets the value of the memoryThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMemoryThreshold(JAXBElement<Integer> value) {
        this.memoryThreshold = value;
    }

    /**
     * Gets the value of the transferProtocalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTransferProtocalIsDefault() {
        return transferProtocalIsDefault;
    }

    /**
     * Sets the value of the transferProtocalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTransferProtocalIsDefault(JAXBElement<Boolean> value) {
        this.transferProtocalIsDefault = value;
    }

    /**
     * Gets the value of the transferProtocal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferProtocalType }{@code >}
     *     
     */
    public JAXBElement<TransferProtocalType> getTransferProtocal() {
        return transferProtocal;
    }

    /**
     * Sets the value of the transferProtocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferProtocalType }{@code >}
     *     
     */
    public void setTransferProtocal(JAXBElement<TransferProtocalType> value) {
        this.transferProtocal = value;
    }

    /**
     * Gets the value of the compressRecordIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCompressRecordIsDefault() {
        return compressRecordIsDefault;
    }

    /**
     * Sets the value of the compressRecordIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCompressRecordIsDefault(JAXBElement<Boolean> value) {
        this.compressRecordIsDefault = value;
    }

    /**
     * Gets the value of the compressRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrueFalseStates }{@code >}
     *     
     */
    public JAXBElement<TrueFalseStates> getCompressRecord() {
        return compressRecord;
    }

    /**
     * Sets the value of the compressRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrueFalseStates }{@code >}
     *     
     */
    public void setCompressRecord(JAXBElement<TrueFalseStates> value) {
        this.compressRecord = value;
    }

    /**
     * Gets the value of the traceIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTraceIntervalIsDefault() {
        return traceIntervalIsDefault;
    }

    /**
     * Sets the value of the traceIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTraceIntervalIsDefault(JAXBElement<Boolean> value) {
        this.traceIntervalIsDefault = value;
    }

    /**
     * Gets the value of the traceInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTraceInterval() {
        return traceInterval;
    }

    /**
     * Sets the value of the traceInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTraceInterval(JAXBElement<Integer> value) {
        this.traceInterval = value;
    }

}
