
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lte3rdPartyResultWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lte3rdPartyResultWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://Airspan.Netspan.WebServices}Lte3rdPartyResultValues"/>
 *         &lt;element name="ResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lte3rdPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enb3RdParty" type="{http://Airspan.Netspan.WebServices}Enb3rdParty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lte3rdPartyResultWs", propOrder = {
    "resultCode",
    "resultString",
    "lte3RdPartyName",
    "enb3RdParty"
})
public class Lte3RdPartyResultWs {

    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected Lte3RdPartyResultValues resultCode;
    @XmlElement(name = "ResultString")
    protected String resultString;
    @XmlElement(name = "Lte3rdPartyName")
    protected String lte3RdPartyName;
    @XmlElement(name = "Enb3RdParty")
    protected Enb3RdParty enb3RdParty;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link Lte3RdPartyResultValues }
     *     
     */
    public Lte3RdPartyResultValues getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lte3RdPartyResultValues }
     *     
     */
    public void setResultCode(Lte3RdPartyResultValues value) {
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
     * Gets the value of the lte3RdPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLte3RdPartyName() {
        return lte3RdPartyName;
    }

    /**
     * Sets the value of the lte3RdPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLte3RdPartyName(String value) {
        this.lte3RdPartyName = value;
    }

    /**
     * Gets the value of the enb3RdParty property.
     * 
     * @return
     *     possible object is
     *     {@link Enb3RdParty }
     *     
     */
    public Enb3RdParty getEnb3RdParty() {
        return enb3RdParty;
    }

    /**
     * Sets the value of the enb3RdParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enb3RdParty }
     *     
     */
    public void setEnb3RdParty(Enb3RdParty value) {
        this.enb3RdParty = value;
    }

}
