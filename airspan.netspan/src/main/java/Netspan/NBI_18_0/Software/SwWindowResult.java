
package Netspan.NBI_18_0.Software;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwWindowResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwWindowResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultCode" type="{http://Airspan.Netspan.WebServices}SwWindowResultValues"/&gt;
 *         &lt;element name="ResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareWindow" type="{http://Airspan.Netspan.WebServices}SwWindowWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwWindowResult", propOrder = {
    "resultCode",
    "resultString",
    "name",
    "softwareWindow"
})
public class SwWindowResult {

    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected SwWindowResultValues resultCode;
    @XmlElement(name = "ResultString")
    protected String resultString;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SoftwareWindow")
    protected SwWindowWs softwareWindow;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link SwWindowResultValues }
     *     
     */
    public SwWindowResultValues getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwWindowResultValues }
     *     
     */
    public void setResultCode(SwWindowResultValues value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultString() {
        return resultString;
    }

    /**
     * Sets the value of the resultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultString(String value) {
        this.resultString = value;
    }

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
     * Gets the value of the softwareWindow property.
     * 
     * @return
     *     possible object is
     *     {@link SwWindowWs }
     *     
     */
    public SwWindowWs getSoftwareWindow() {
        return softwareWindow;
    }

    /**
     * Sets the value of the softwareWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwWindowWs }
     *     
     */
    public void setSoftwareWindow(SwWindowWs value) {
        this.softwareWindow = value;
    }

}
