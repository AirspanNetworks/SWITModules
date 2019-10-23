
package Netspan.NBI_17_5.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteResultCode" type="{http://Airspan.Netspan.WebServices}SiteResultValues"/&gt;
 *         &lt;element name="SiteResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Site" type="{http://Airspan.Netspan.WebServices}Site" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteDetailResult", propOrder = {
    "siteResultCode",
    "siteResultString",
    "site"
})
public class SiteDetailResult {

    @XmlElement(name = "SiteResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected SiteResultValues siteResultCode;
    @XmlElement(name = "SiteResultString")
    protected String siteResultString;
    @XmlElement(name = "Site")
    protected Site site;

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
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
    }

}
