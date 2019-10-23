
package Netspan.NBI_17_5.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SasServerGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SasServerGet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}SasServerSet"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SasCertificateLoaded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CertIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertIssuedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertValidFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CertValidTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SasServerGet", propOrder = {
    "sasCertificateLoaded",
    "certIssuedBy",
    "certIssuedTo",
    "certValidFrom",
    "certValidTo"
})
public class SasServerGet2
    extends SasServerSet2
{

    @XmlElement(name = "SasCertificateLoaded")
    protected boolean sasCertificateLoaded;
    @XmlElement(name = "CertIssuedBy")
    protected String certIssuedBy;
    @XmlElement(name = "CertIssuedTo")
    protected String certIssuedTo;
    @XmlElementRef(name = "CertValidFrom", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> certValidFrom;
    @XmlElementRef(name = "CertValidTo", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> certValidTo;

    /**
     * Gets the value of the sasCertificateLoaded property.
     * 
     */
    public boolean isSasCertificateLoaded() {
        return sasCertificateLoaded;
    }

    /**
     * Sets the value of the sasCertificateLoaded property.
     * 
     */
    public void setSasCertificateLoaded(boolean value) {
        this.sasCertificateLoaded = value;
    }

    /**
     * Gets the value of the certIssuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertIssuedBy() {
        return certIssuedBy;
    }

    /**
     * Sets the value of the certIssuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertIssuedBy(String value) {
        this.certIssuedBy = value;
    }

    /**
     * Gets the value of the certIssuedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertIssuedTo() {
        return certIssuedTo;
    }

    /**
     * Sets the value of the certIssuedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertIssuedTo(String value) {
        this.certIssuedTo = value;
    }

    /**
     * Gets the value of the certValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCertValidFrom() {
        return certValidFrom;
    }

    /**
     * Sets the value of the certValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCertValidFrom(JAXBElement<XMLGregorianCalendar> value) {
        this.certValidFrom = value;
    }

    /**
     * Gets the value of the certValidTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCertValidTo() {
        return certValidTo;
    }

    /**
     * Sets the value of the certValidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCertValidTo(JAXBElement<XMLGregorianCalendar> value) {
        this.certValidTo = value;
    }

}
