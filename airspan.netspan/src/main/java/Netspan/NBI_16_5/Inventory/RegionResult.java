
package Netspan.NBI_16_5.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegionResultCode" type="{http://Airspan.Netspan.WebServices}RegionResultValues"/&gt;
 *         &lt;element name="RegionResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionResult", propOrder = {
    "regionResultCode",
    "regionResultString",
    "regionName"
})
public class RegionResult {

    @XmlElement(name = "RegionResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected RegionResultValues regionResultCode;
    @XmlElement(name = "RegionResultString")
    protected String regionResultString;
    @XmlElement(name = "RegionName")
    protected String regionName;

    /**
     * Gets the value of the regionResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionResultValues }
     *     
     */
    public RegionResultValues getRegionResultCode() {
        return regionResultCode;
    }

    /**
     * Sets the value of the regionResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionResultValues }
     *     
     */
    public void setRegionResultCode(RegionResultValues value) {
        this.regionResultCode = value;
    }

    /**
     * Gets the value of the regionResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionResultString() {
        return regionResultString;
    }

    /**
     * Sets the value of the regionResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionResultString(String value) {
        this.regionResultString = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

}
