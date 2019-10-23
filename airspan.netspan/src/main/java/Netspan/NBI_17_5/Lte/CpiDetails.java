
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CpiDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CpiDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProtectedHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EncodedCpiSignedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DigitalSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpiDetails", propOrder = {
    "protectedHeader",
    "encodedCpiSignedData",
    "digitalSignature"
})
public class CpiDetails {

    @XmlElement(name = "ProtectedHeader")
    protected String protectedHeader;
    @XmlElement(name = "EncodedCpiSignedData")
    protected String encodedCpiSignedData;
    @XmlElement(name = "DigitalSignature")
    protected String digitalSignature;

    /**
     * Gets the value of the protectedHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedHeader() {
        return protectedHeader;
    }

    /**
     * Sets the value of the protectedHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedHeader(String value) {
        this.protectedHeader = value;
    }

    /**
     * Gets the value of the encodedCpiSignedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodedCpiSignedData() {
        return encodedCpiSignedData;
    }

    /**
     * Sets the value of the encodedCpiSignedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodedCpiSignedData(String value) {
        this.encodedCpiSignedData = value;
    }

    /**
     * Gets the value of the digitalSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalSignature() {
        return digitalSignature;
    }

    /**
     * Sets the value of the digitalSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalSignature(String value) {
        this.digitalSignature = value;
    }

}
