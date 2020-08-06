
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EciBlackListEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EciBlackListEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bit0" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit1" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit2" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit3" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit4" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit5" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit6" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit7" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit8" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit9" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit10" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit11" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit12" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit13" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit14" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit15" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit16" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit17" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit18" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit19" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit20" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit21" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit22" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit23" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit24" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit25" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit26" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="Bit27" type="{http://Airspan.Netspan.WebServices}EciBlaclListStatesWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EciBlackListEntryWs", propOrder = {
    "bit0",
    "bit1",
    "bit2",
    "bit3",
    "bit4",
    "bit5",
    "bit6",
    "bit7",
    "bit8",
    "bit9",
    "bit10",
    "bit11",
    "bit12",
    "bit13",
    "bit14",
    "bit15",
    "bit16",
    "bit17",
    "bit18",
    "bit19",
    "bit20",
    "bit21",
    "bit22",
    "bit23",
    "bit24",
    "bit25",
    "bit26",
    "bit27"
})
public class EciBlackListEntryWs {

    @XmlElementRef(name = "Bit0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit0;
    @XmlElementRef(name = "Bit1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit1;
    @XmlElementRef(name = "Bit2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit2;
    @XmlElementRef(name = "Bit3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit3;
    @XmlElementRef(name = "Bit4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit4;
    @XmlElementRef(name = "Bit5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit5;
    @XmlElementRef(name = "Bit6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit6;
    @XmlElementRef(name = "Bit7", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit7;
    @XmlElementRef(name = "Bit8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit8;
    @XmlElementRef(name = "Bit9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit9;
    @XmlElementRef(name = "Bit10", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit10;
    @XmlElementRef(name = "Bit11", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit11;
    @XmlElementRef(name = "Bit12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit12;
    @XmlElementRef(name = "Bit13", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit13;
    @XmlElementRef(name = "Bit14", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit14;
    @XmlElementRef(name = "Bit15", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit15;
    @XmlElementRef(name = "Bit16", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit16;
    @XmlElementRef(name = "Bit17", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit17;
    @XmlElementRef(name = "Bit18", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit18;
    @XmlElementRef(name = "Bit19", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit19;
    @XmlElementRef(name = "Bit20", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit20;
    @XmlElementRef(name = "Bit21", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit21;
    @XmlElementRef(name = "Bit22", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit22;
    @XmlElementRef(name = "Bit23", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit23;
    @XmlElementRef(name = "Bit24", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit24;
    @XmlElementRef(name = "Bit25", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit25;
    @XmlElementRef(name = "Bit26", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit26;
    @XmlElementRef(name = "Bit27", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bit27;

    /**
     * Gets the value of the bit0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit0() {
        return bit0;
    }

    /**
     * Sets the value of the bit0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit0(JAXBElement<String> value) {
        this.bit0 = value;
    }

    /**
     * Gets the value of the bit1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit1() {
        return bit1;
    }

    /**
     * Sets the value of the bit1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit1(JAXBElement<String> value) {
        this.bit1 = value;
    }

    /**
     * Gets the value of the bit2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit2() {
        return bit2;
    }

    /**
     * Sets the value of the bit2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit2(JAXBElement<String> value) {
        this.bit2 = value;
    }

    /**
     * Gets the value of the bit3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit3() {
        return bit3;
    }

    /**
     * Sets the value of the bit3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit3(JAXBElement<String> value) {
        this.bit3 = value;
    }

    /**
     * Gets the value of the bit4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit4() {
        return bit4;
    }

    /**
     * Sets the value of the bit4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit4(JAXBElement<String> value) {
        this.bit4 = value;
    }

    /**
     * Gets the value of the bit5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit5() {
        return bit5;
    }

    /**
     * Sets the value of the bit5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit5(JAXBElement<String> value) {
        this.bit5 = value;
    }

    /**
     * Gets the value of the bit6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit6() {
        return bit6;
    }

    /**
     * Sets the value of the bit6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit6(JAXBElement<String> value) {
        this.bit6 = value;
    }

    /**
     * Gets the value of the bit7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit7() {
        return bit7;
    }

    /**
     * Sets the value of the bit7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit7(JAXBElement<String> value) {
        this.bit7 = value;
    }

    /**
     * Gets the value of the bit8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit8() {
        return bit8;
    }

    /**
     * Sets the value of the bit8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit8(JAXBElement<String> value) {
        this.bit8 = value;
    }

    /**
     * Gets the value of the bit9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit9() {
        return bit9;
    }

    /**
     * Sets the value of the bit9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit9(JAXBElement<String> value) {
        this.bit9 = value;
    }

    /**
     * Gets the value of the bit10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit10() {
        return bit10;
    }

    /**
     * Sets the value of the bit10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit10(JAXBElement<String> value) {
        this.bit10 = value;
    }

    /**
     * Gets the value of the bit11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit11() {
        return bit11;
    }

    /**
     * Sets the value of the bit11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit11(JAXBElement<String> value) {
        this.bit11 = value;
    }

    /**
     * Gets the value of the bit12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit12() {
        return bit12;
    }

    /**
     * Sets the value of the bit12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit12(JAXBElement<String> value) {
        this.bit12 = value;
    }

    /**
     * Gets the value of the bit13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit13() {
        return bit13;
    }

    /**
     * Sets the value of the bit13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit13(JAXBElement<String> value) {
        this.bit13 = value;
    }

    /**
     * Gets the value of the bit14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit14() {
        return bit14;
    }

    /**
     * Sets the value of the bit14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit14(JAXBElement<String> value) {
        this.bit14 = value;
    }

    /**
     * Gets the value of the bit15 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit15() {
        return bit15;
    }

    /**
     * Sets the value of the bit15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit15(JAXBElement<String> value) {
        this.bit15 = value;
    }

    /**
     * Gets the value of the bit16 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit16() {
        return bit16;
    }

    /**
     * Sets the value of the bit16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit16(JAXBElement<String> value) {
        this.bit16 = value;
    }

    /**
     * Gets the value of the bit17 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit17() {
        return bit17;
    }

    /**
     * Sets the value of the bit17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit17(JAXBElement<String> value) {
        this.bit17 = value;
    }

    /**
     * Gets the value of the bit18 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit18() {
        return bit18;
    }

    /**
     * Sets the value of the bit18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit18(JAXBElement<String> value) {
        this.bit18 = value;
    }

    /**
     * Gets the value of the bit19 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit19() {
        return bit19;
    }

    /**
     * Sets the value of the bit19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit19(JAXBElement<String> value) {
        this.bit19 = value;
    }

    /**
     * Gets the value of the bit20 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit20() {
        return bit20;
    }

    /**
     * Sets the value of the bit20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit20(JAXBElement<String> value) {
        this.bit20 = value;
    }

    /**
     * Gets the value of the bit21 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit21() {
        return bit21;
    }

    /**
     * Sets the value of the bit21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit21(JAXBElement<String> value) {
        this.bit21 = value;
    }

    /**
     * Gets the value of the bit22 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit22() {
        return bit22;
    }

    /**
     * Sets the value of the bit22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit22(JAXBElement<String> value) {
        this.bit22 = value;
    }

    /**
     * Gets the value of the bit23 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit23() {
        return bit23;
    }

    /**
     * Sets the value of the bit23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit23(JAXBElement<String> value) {
        this.bit23 = value;
    }

    /**
     * Gets the value of the bit24 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit24() {
        return bit24;
    }

    /**
     * Sets the value of the bit24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit24(JAXBElement<String> value) {
        this.bit24 = value;
    }

    /**
     * Gets the value of the bit25 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit25() {
        return bit25;
    }

    /**
     * Sets the value of the bit25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit25(JAXBElement<String> value) {
        this.bit25 = value;
    }

    /**
     * Gets the value of the bit26 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit26() {
        return bit26;
    }

    /**
     * Sets the value of the bit26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit26(JAXBElement<String> value) {
        this.bit26 = value;
    }

    /**
     * Gets the value of the bit27 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBit27() {
        return bit27;
    }

    /**
     * Sets the value of the bit27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBit27(JAXBElement<String> value) {
        this.bit27 = value;
    }

}
