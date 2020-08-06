
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RohcQciDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RohcQciDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Qci" type="{http://Airspan.Netspan.WebServices}RohcQciValues"/&gt;
 *         &lt;element name="IsRohcRtpQciEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRohcUdpQciEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRohcTcpQciEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RohcQciDetails", propOrder = {
    "qci",
    "isRohcRtpQciEnabled",
    "isRohcUdpQciEnabled",
    "isRohcTcpQciEnabled"
})
public class RohcQciDetails {

    @XmlElement(name = "Qci", required = true)
    @XmlSchemaType(name = "string")
    protected RohcQciValues qci;
    @XmlElementRef(name = "IsRohcRtpQciEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isRohcRtpQciEnabled;
    @XmlElementRef(name = "IsRohcUdpQciEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isRohcUdpQciEnabled;
    @XmlElementRef(name = "IsRohcTcpQciEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isRohcTcpQciEnabled;

    /**
     * Gets the value of the qci property.
     * 
     * @return
     *     possible object is
     *     {@link RohcQciValues }
     *     
     */
    public RohcQciValues getQci() {
        return qci;
    }

    /**
     * Sets the value of the qci property.
     * 
     * @param value
     *     allowed object is
     *     {@link RohcQciValues }
     *     
     */
    public void setQci(RohcQciValues value) {
        this.qci = value;
    }

    /**
     * Gets the value of the isRohcRtpQciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRohcRtpQciEnabled() {
        return isRohcRtpQciEnabled;
    }

    /**
     * Sets the value of the isRohcRtpQciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRohcRtpQciEnabled(JAXBElement<Boolean> value) {
        this.isRohcRtpQciEnabled = value;
    }

    /**
     * Gets the value of the isRohcUdpQciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRohcUdpQciEnabled() {
        return isRohcUdpQciEnabled;
    }

    /**
     * Sets the value of the isRohcUdpQciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRohcUdpQciEnabled(JAXBElement<Boolean> value) {
        this.isRohcUdpQciEnabled = value;
    }

    /**
     * Gets the value of the isRohcTcpQciEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRohcTcpQciEnabled() {
        return isRohcTcpQciEnabled;
    }

    /**
     * Sets the value of the isRohcTcpQciEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRohcTcpQciEnabled(JAXBElement<Boolean> value) {
        this.isRohcTcpQciEnabled = value;
    }

}
