
package Netspan.NBI_15_2.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteCreateResult" type="{http://Airspan.Netspan.WebServices}SiteActionResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "siteCreateResult"
})
@XmlRootElement(name = "SiteCreateResponse")
public class SiteCreateResponse {

    @XmlElement(name = "SiteCreateResult")
    protected SiteActionResult siteCreateResult;

    /**
     * Gets the value of the siteCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SiteActionResult }
     *     
     */
    public SiteActionResult getSiteCreateResult() {
        return siteCreateResult;
    }

    /**
     * Sets the value of the siteCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteActionResult }
     *     
     */
    public void setSiteCreateResult(SiteActionResult value) {
        this.siteCreateResult = value;
    }

}
