
package Netspan.NBI_14_0.API.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for Lte3rdPartyGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lte3rdPartyGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://Airspan.Netspan.WebServices}Lte3rdPartyResultValues"/>
 *         &lt;element name="ResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lte3rdPartyResult" type="{http://Airspan.Netspan.WebServices}Lte3rdPartyWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lte3rdPartyGetResult", propOrder = {
    "resultCode",
    "resultString",
    "lte3RdPartyResult"
})
public class Lte3RdPartyGetResult
    extends WsResponse
{

    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected Lte3RdPartyResultValues resultCode;
    @XmlElement(name = "ResultString")
    protected String resultString;
    @XmlElement(name = "Lte3rdPartyResult")
    protected List<Lte3RdPartyWs> lte3RdPartyResult;

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
     * Gets the value of the lte3RdPartyResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lte3RdPartyResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLte3RdPartyResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lte3RdPartyWs }
     * 
     * 
     */
    public List<Lte3RdPartyWs> getLte3RdPartyResult() {
        if (lte3RdPartyResult == null) {
            lte3RdPartyResult = new ArrayList<Lte3RdPartyWs>();
        }
        return this.lte3RdPartyResult;
    }

}
