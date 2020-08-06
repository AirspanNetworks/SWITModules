
package Netspan.NBI_18_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteRachStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRachStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrachRootSeqIdx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrachZeroCorrelZoneCfg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrachCfgIdx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrachFreqOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfRaPreambles" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SizeOfPreambleGroupA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreambleInitialTargetPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRachStatusWs", propOrder = {
    "cellNumber",
    "cellId",
    "prachRootSeqIdx",
    "prachZeroCorrelZoneCfg",
    "prachCfgIdx",
    "prachFreqOffset",
    "numberOfRaPreambles",
    "sizeOfPreambleGroupA",
    "preambleInitialTargetPower"
})
public class LteRachStatusWs {

    @XmlElement(name = "CellNumber")
    protected int cellNumber;
    @XmlElement(name = "CellId")
    protected String cellId;
    @XmlElementRef(name = "PrachRootSeqIdx", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachRootSeqIdx;
    @XmlElementRef(name = "PrachZeroCorrelZoneCfg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachZeroCorrelZoneCfg;
    @XmlElementRef(name = "PrachCfgIdx", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachCfgIdx;
    @XmlElementRef(name = "PrachFreqOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachFreqOffset;
    @XmlElementRef(name = "NumberOfRaPreambles", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfRaPreambles;
    @XmlElementRef(name = "SizeOfPreambleGroupA", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sizeOfPreambleGroupA;
    @XmlElementRef(name = "PreambleInitialTargetPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> preambleInitialTargetPower;

    /**
     * Gets the value of the cellNumber property.
     * 
     */
    public int getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     */
    public void setCellNumber(int value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellId(String value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the prachRootSeqIdx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachRootSeqIdx() {
        return prachRootSeqIdx;
    }

    /**
     * Sets the value of the prachRootSeqIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachRootSeqIdx(JAXBElement<Integer> value) {
        this.prachRootSeqIdx = value;
    }

    /**
     * Gets the value of the prachZeroCorrelZoneCfg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachZeroCorrelZoneCfg() {
        return prachZeroCorrelZoneCfg;
    }

    /**
     * Sets the value of the prachZeroCorrelZoneCfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachZeroCorrelZoneCfg(JAXBElement<Integer> value) {
        this.prachZeroCorrelZoneCfg = value;
    }

    /**
     * Gets the value of the prachCfgIdx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachCfgIdx() {
        return prachCfgIdx;
    }

    /**
     * Sets the value of the prachCfgIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachCfgIdx(JAXBElement<Integer> value) {
        this.prachCfgIdx = value;
    }

    /**
     * Gets the value of the prachFreqOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachFreqOffset() {
        return prachFreqOffset;
    }

    /**
     * Sets the value of the prachFreqOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachFreqOffset(JAXBElement<Integer> value) {
        this.prachFreqOffset = value;
    }

    /**
     * Gets the value of the numberOfRaPreambles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfRaPreambles() {
        return numberOfRaPreambles;
    }

    /**
     * Sets the value of the numberOfRaPreambles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfRaPreambles(JAXBElement<Integer> value) {
        this.numberOfRaPreambles = value;
    }

    /**
     * Gets the value of the sizeOfPreambleGroupA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSizeOfPreambleGroupA() {
        return sizeOfPreambleGroupA;
    }

    /**
     * Sets the value of the sizeOfPreambleGroupA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSizeOfPreambleGroupA(JAXBElement<Integer> value) {
        this.sizeOfPreambleGroupA = value;
    }

    /**
     * Gets the value of the preambleInitialTargetPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPreambleInitialTargetPower() {
        return preambleInitialTargetPower;
    }

    /**
     * Sets the value of the preambleInitialTargetPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPreambleInitialTargetPower(JAXBElement<Integer> value) {
        this.preambleInitialTargetPower = value;
    }

}
