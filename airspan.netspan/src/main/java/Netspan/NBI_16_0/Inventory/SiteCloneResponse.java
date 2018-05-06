
package Netspan.NBI_16_0.Inventory;

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
 *         &lt;element name="SiteCloneResult" type="{http://Airspan.Netspan.WebServices}SiteActionResult" minOccurs="0"/>
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
    "siteCloneResult"
})
@XmlRootElement(name = "SiteCloneResponse")
public class SiteCloneResponse {

    @XmlElement(name = "SiteCloneResult")
    protected SiteActionResult siteCloneResult;

    /**
     * Gets the value of the siteCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link SiteActionResult }
     *     
     */
    public SiteActionResult getSiteCloneResult() {
        return siteCloneResult;
    }

    /**
     * Sets the value of the siteCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteActionResult }
     *     
     */
    public void setSiteCloneResult(SiteActionResult value) {
        this.siteCloneResult = value;
    }

}
