
package Netspan.NBI_16_5.Software;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwServerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwServerResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultCode" type="{http://Airspan.Netspan.WebServices}SwServerResultValues"/&gt;
 *         &lt;element name="ResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareServer" type="{http://Airspan.Netspan.WebServices}SwServerWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwServerResult", propOrder = {
    "resultCode",
    "resultString",
    "name",
    "softwareServer"
})
public class SwServerResult {

    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected SwServerResultValues resultCode;
    @XmlElement(name = "ResultString")
    protected String resultString;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SoftwareServer")
    protected SwServerWs softwareServer;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link SwServerResultValues }
     *     
     */
    public SwServerResultValues getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwServerResultValues }
     *     
     */
    public void setResultCode(SwServerResultValues value) {
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
     * Gets the value of the softwareServer property.
     * 
     * @return
     *     possible object is
     *     {@link SwServerWs }
     *     
     */
    public SwServerWs getSoftwareServer() {
        return softwareServer;
    }

    /**
     * Sets the value of the softwareServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwServerWs }
     *     
     */
    public void setSoftwareServer(SwServerWs value) {
        this.softwareServer = value;
    }

}
