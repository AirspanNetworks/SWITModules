
package Netspan.NBI_18_0.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrapResyncResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrapResyncResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrapType" type="{http://Airspan.Netspan.WebServices}TrapType"/&gt;
 *         &lt;element name="ResultCode" type="{http://Airspan.Netspan.WebServices}TrapStatusValues"/&gt;
 *         &lt;element name="MissingTsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrapResyncResult", propOrder = {
    "trapType",
    "resultCode",
    "missingTsn"
})
public class TrapResyncResult {

    @XmlElement(name = "TrapType", required = true)
    @XmlSchemaType(name = "string")
    protected TrapType trapType;
    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected TrapStatusValues resultCode;
    @XmlElement(name = "MissingTsn")
    protected String missingTsn;

    /**
     * Gets the value of the trapType property.
     * 
     * @return
     *     possible object is
     *     {@link TrapType }
     *     
     */
    public TrapType getTrapType() {
        return trapType;
    }

    /**
     * Sets the value of the trapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapType }
     *     
     */
    public void setTrapType(TrapType value) {
        this.trapType = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrapStatusValues }
     *     
     */
    public TrapStatusValues getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapStatusValues }
     *     
     */
    public void setResultCode(TrapStatusValues value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the missingTsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissingTsn() {
        return missingTsn;
    }

    /**
     * Sets the value of the missingTsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissingTsn(String value) {
        this.missingTsn = value;
    }

}
