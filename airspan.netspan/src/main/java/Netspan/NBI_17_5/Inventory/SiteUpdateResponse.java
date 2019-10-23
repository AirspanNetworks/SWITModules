
package Netspan.NBI_17_5.Inventory;

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
 *         &lt;element name="SiteUpdateResult" type="{http://Airspan.Netspan.WebServices}SiteActionResult" minOccurs="0"/&gt;
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
    "siteUpdateResult"
})
@XmlRootElement(name = "SiteUpdateResponse")
public class SiteUpdateResponse {

    @XmlElement(name = "SiteUpdateResult")
    protected SiteActionResult siteUpdateResult;

    /**
     * Gets the value of the siteUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SiteActionResult }
     *     
     */
    public SiteActionResult getSiteUpdateResult() {
        return siteUpdateResult;
    }

    /**
     * Sets the value of the siteUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteActionResult }
     *     
     */
    public void setSiteUpdateResult(SiteActionResult value) {
        this.siteUpdateResult = value;
    }

}
