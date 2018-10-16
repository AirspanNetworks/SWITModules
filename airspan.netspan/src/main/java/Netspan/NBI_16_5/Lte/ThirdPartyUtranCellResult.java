
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyUtranCellResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyUtranCellResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultCode" type="{http://Airspan.Netspan.WebServices}ThirdPartyUtranCellResultValues"/&gt;
 *         &lt;element name="ResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyUtranCellName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyUtranCellResult", propOrder = {
    "resultCode",
    "resultString",
    "thirdPartyUtranCellName"
})
public class ThirdPartyUtranCellResult {

    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected ThirdPartyUtranCellResultValues resultCode;
    @XmlElement(name = "ResultString")
    protected String resultString;
    @XmlElement(name = "ThirdPartyUtranCellName")
    protected String thirdPartyUtranCellName;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyUtranCellResultValues }
     *     
     */
    public ThirdPartyUtranCellResultValues getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyUtranCellResultValues }
     *     
     */
    public void setResultCode(ThirdPartyUtranCellResultValues value) {
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
     * Gets the value of the thirdPartyUtranCellName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyUtranCellName() {
        return thirdPartyUtranCellName;
    }

    /**
     * Sets the value of the thirdPartyUtranCellName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyUtranCellName(String value) {
        this.thirdPartyUtranCellName = value;
    }

}
