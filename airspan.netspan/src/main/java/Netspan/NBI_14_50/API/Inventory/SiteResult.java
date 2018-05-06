
package Netspan.NBI_14_50.API.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SiteResultCode" type="{http://Airspan.Netspan.WebServices}SiteResultValues"/>
 *         &lt;element name="SiteResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteResult", propOrder = {
    "siteResultCode",
    "siteResultString",
    "siteName"
})
public class SiteResult {

    @XmlElement(name = "SiteResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected SiteResultValues siteResultCode;
    @XmlElement(name = "SiteResultString")
    protected String siteResultString;
    @XmlElement(name = "SiteName")
    protected String siteName;

    /**
     * Gets the value of the siteResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link SiteResultValues }
     *     
     */
    public SiteResultValues getSiteResultCode() {
        return siteResultCode;
    }

    /**
     * Sets the value of the siteResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteResultValues }
     *     
     */
    public void setSiteResultCode(SiteResultValues value) {
        this.siteResultCode = value;
    }

    /**
     * Gets the value of the siteResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteResultString() {
        return siteResultString;
    }

    /**
     * Sets the value of the siteResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteResultString(String value) {
        this.siteResultString = value;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

}
