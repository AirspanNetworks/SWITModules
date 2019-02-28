
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlmnGlobalConfigResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlmnGlobalConfigResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlmnGlobalConfigResultCode" type="{http://Airspan.Netspan.WebServices}PlmnGlobalConfigResultValues"/&gt;
 *         &lt;element name="PlmnGlobalConfigResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlmnGlobalConfigResult", propOrder = {
    "plmnGlobalConfigResultCode",
    "plmnGlobalConfigResultString",
    "mcc",
    "mnc"
})
public class PlmnGlobalConfigResult {

    @XmlElement(name = "PlmnGlobalConfigResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected PlmnGlobalConfigResultValues plmnGlobalConfigResultCode;
    @XmlElement(name = "PlmnGlobalConfigResultString")
    protected String plmnGlobalConfigResultString;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;

    /**
     * Gets the value of the plmnGlobalConfigResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnGlobalConfigResultValues }
     *     
     */
    public PlmnGlobalConfigResultValues getPlmnGlobalConfigResultCode() {
        return plmnGlobalConfigResultCode;
    }

    /**
     * Sets the value of the plmnGlobalConfigResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnGlobalConfigResultValues }
     *     
     */
    public void setPlmnGlobalConfigResultCode(PlmnGlobalConfigResultValues value) {
        this.plmnGlobalConfigResultCode = value;
    }

    /**
     * Gets the value of the plmnGlobalConfigResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlmnGlobalConfigResultString() {
        return plmnGlobalConfigResultString;
    }

    /**
     * Sets the value of the plmnGlobalConfigResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlmnGlobalConfigResultString(String value) {
        this.plmnGlobalConfigResultString = value;
    }

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

}
