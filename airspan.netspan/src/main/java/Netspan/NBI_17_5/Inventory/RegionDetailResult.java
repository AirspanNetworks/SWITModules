
package Netspan.NBI_17_5.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegionResultCode" type="{http://Airspan.Netspan.WebServices}RegionResultValues"/&gt;
 *         &lt;element name="RegionResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://Airspan.Netspan.WebServices}Region" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionDetailResult", propOrder = {
    "regionResultCode",
    "regionResultString",
    "region"
})
public class RegionDetailResult {

    @XmlElement(name = "RegionResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected RegionResultValues regionResultCode;
    @XmlElement(name = "RegionResultString")
    protected String regionResultString;
    @XmlElement(name = "Region")
    protected Region region;

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
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

}
