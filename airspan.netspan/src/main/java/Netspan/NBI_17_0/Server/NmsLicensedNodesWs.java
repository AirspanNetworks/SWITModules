
package Netspan.NBI_17_0.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NmsLicensedNodesWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NmsLicensedNodesWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LicenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodesUsingFeature" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LicensesRequired" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AvailableLicenses" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NmsLicensedNodesWs", propOrder = {
    "licenseType",
    "nodesUsingFeature",
    "licensesRequired",
    "availableLicenses",
    "expiryDate"
})
public class NmsLicensedNodesWs {

    @XmlElement(name = "LicenseType")
    protected String licenseType;
    @XmlElement(name = "NodesUsingFeature")
    protected int nodesUsingFeature;
    @XmlElement(name = "LicensesRequired")
    protected int licensesRequired;
    @XmlElement(name = "AvailableLicenses")
    protected int availableLicenses;
    @XmlElementRef(name = "ExpiryDate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiryDate;

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseType(String value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the nodesUsingFeature property.
     * 
     */
    public int getNodesUsingFeature() {
        return nodesUsingFeature;
    }

    /**
     * Sets the value of the nodesUsingFeature property.
     * 
     */
    public void setNodesUsingFeature(int value) {
        this.nodesUsingFeature = value;
    }

    /**
     * Gets the value of the licensesRequired property.
     * 
     */
    public int getLicensesRequired() {
        return licensesRequired;
    }

    /**
     * Sets the value of the licensesRequired property.
     * 
     */
    public void setLicensesRequired(int value) {
        this.licensesRequired = value;
    }

    /**
     * Gets the value of the availableLicenses property.
     * 
     */
    public int getAvailableLicenses() {
        return availableLicenses;
    }

    /**
     * Sets the value of the availableLicenses property.
     * 
     */
    public void setAvailableLicenses(int value) {
        this.availableLicenses = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expiryDate = value;
    }

}
