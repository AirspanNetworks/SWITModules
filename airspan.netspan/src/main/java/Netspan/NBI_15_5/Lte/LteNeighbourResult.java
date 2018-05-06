
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteNeighbourResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteNeighbourResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://Airspan.Netspan.WebServices}LteNeighbourResultValues"/>
 *         &lt;element name="ResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LteNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LteNeighbourName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteNeighbourResult", propOrder = {
    "resultCode",
    "resultString",
    "lteNodeName",
    "lteNeighbourName"
})
public class LteNeighbourResult {

    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected LteNeighbourResultValues resultCode;
    @XmlElement(name = "ResultString")
    protected String resultString;
    @XmlElement(name = "LteNodeName")
    protected String lteNodeName;
    @XmlElement(name = "LteNeighbourName")
    protected String lteNeighbourName;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link LteNeighbourResultValues }
     *     
     */
    public LteNeighbourResultValues getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNeighbourResultValues }
     *     
     */
    public void setResultCode(LteNeighbourResultValues value) {
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
     * Gets the value of the lteNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLteNodeName() {
        return lteNodeName;
    }

    /**
     * Sets the value of the lteNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLteNodeName(String value) {
        this.lteNodeName = value;
    }

    /**
     * Gets the value of the lteNeighbourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLteNeighbourName() {
        return lteNeighbourName;
    }

    /**
     * Sets the value of the lteNeighbourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLteNeighbourName(String value) {
        this.lteNeighbourName = value;
    }

}
