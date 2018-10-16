
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtePlmnEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtePlmnEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReservedOperatorUse" type="{http://Airspan.Netspan.WebServices}ReservedOpertionalUseValuesWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtePlmnEntryWs", propOrder = {
    "mcc",
    "mnc",
    "reservedOperatorUse"
})
public class LtePlmnEntryWs {

    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElementRef(name = "ReservedOperatorUse", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ReservedOpertionalUseValuesWs> reservedOperatorUse;

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcc(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the mnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnc() {
        return mnc;
    }

    /**
     * Sets the value of the mnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnc(String value) {
        this.mnc = value;
    }

    /**
     * Gets the value of the reservedOperatorUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservedOpertionalUseValuesWs }{@code >}
     *     
     */
    public JAXBElement<ReservedOpertionalUseValuesWs> getReservedOperatorUse() {
        return reservedOperatorUse;
    }

    /**
     * Sets the value of the reservedOperatorUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservedOpertionalUseValuesWs }{@code >}
     *     
     */
    public void setReservedOperatorUse(JAXBElement<ReservedOpertionalUseValuesWs> value) {
        this.reservedOperatorUse = value;
    }

}
