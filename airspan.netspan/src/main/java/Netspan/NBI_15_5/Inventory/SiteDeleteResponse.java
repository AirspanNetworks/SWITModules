
package Netspan.NBI_15_5.Inventory;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SiteDeleteResult" type="{http://Airspan.Netspan.WebServices}SiteActionResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "siteDeleteResult"
})
@XmlRootElement(name = "SiteDeleteResponse")
public class SiteDeleteResponse {

    @XmlElement(name = "SiteDeleteResult")
    protected SiteActionResult siteDeleteResult;

    /**
     * Gets the value of the siteDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link SiteActionResult }
     *     
     */
    public SiteActionResult getSiteDeleteResult() {
        return siteDeleteResult;
    }

    /**
     * Sets the value of the siteDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteActionResult }
     *     
     */
    public void setSiteDeleteResult(SiteActionResult value) {
        this.siteDeleteResult = value;
    }

}
