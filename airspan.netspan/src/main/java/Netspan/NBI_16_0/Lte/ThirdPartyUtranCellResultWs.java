
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyUtranCellResultWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyUtranCellResultWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://Airspan.Netspan.WebServices}ThirdPartyUtranCellResultValues"/>
 *         &lt;element name="ResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThirdPartyUtranCellName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtranCell" type="{http://Airspan.Netspan.WebServices}UtranCell" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyUtranCellResultWs", propOrder = {
    "resultCode",
    "resultString",
    "thirdPartyUtranCellName",
    "utranCell"
})
public class ThirdPartyUtranCellResultWs {

    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected ThirdPartyUtranCellResultValues resultCode;
    @XmlElement(name = "ResultString")
    protected String resultString;
    @XmlElement(name = "ThirdPartyUtranCellName")
    protected String thirdPartyUtranCellName;
    @XmlElement(name = "UtranCell")
    protected UtranCell utranCell;

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

    /**
     * Gets the value of the utranCell property.
     * 
     * @return
     *     possible object is
     *     {@link UtranCell }
     *     
     */
    public UtranCell getUtranCell() {
        return utranCell;
    }

    /**
     * Sets the value of the utranCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtranCell }
     *     
     */
    public void setUtranCell(UtranCell value) {
        this.utranCell = value;
    }

}
