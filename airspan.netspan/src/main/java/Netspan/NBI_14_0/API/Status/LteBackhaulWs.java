
package Netspan.NBI_14_0.API.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteBackhaulWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteBackhaulWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EthernetDuplex" type="{http://Airspan.Netspan.WebServices}DuplexType"/>
 *         &lt;element name="EthernetRate" type="{http://Airspan.Netspan.WebServices}EthernetRateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteBackhaulWs", propOrder = {
    "name",
    "ethernetDuplex",
    "ethernetRate"
})
public class LteBackhaulWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "EthernetDuplex", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected DuplexType ethernetDuplex;
    @XmlElement(name = "EthernetRate", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EthernetRateType ethernetRate;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ethernetDuplex property.
     * 
     * @return
     *     possible object is
     *     {@link DuplexType }
     *     
     */
    public DuplexType getEthernetDuplex() {
        return ethernetDuplex;
    }

    /**
     * Sets the value of the ethernetDuplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplexType }
     *     
     */
    public void setEthernetDuplex(DuplexType value) {
        this.ethernetDuplex = value;
    }

    /**
     * Gets the value of the ethernetRate property.
     * 
     * @return
     *     possible object is
     *     {@link EthernetRateType }
     *     
     */
    public EthernetRateType getEthernetRate() {
        return ethernetRate;
    }

    /**
     * Sets the value of the ethernetRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthernetRateType }
     *     
     */
    public void setEthernetRate(EthernetRateType value) {
        this.ethernetRate = value;
    }

}
