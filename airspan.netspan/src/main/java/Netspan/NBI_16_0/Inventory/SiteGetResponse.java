
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
 *         &lt;element name="SiteGetResult" type="{http://Airspan.Netspan.WebServices}SiteDetailGetResult" minOccurs="0"/>
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
    "siteGetResult"
})
@XmlRootElement(name = "SiteGetResponse")
public class SiteGetResponse {

    @XmlElement(name = "SiteGetResult")
    protected SiteDetailGetResult siteGetResult;

    /**
     * Gets the value of the siteGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link SiteDetailGetResult }
     *     
     */
    public SiteDetailGetResult getSiteGetResult() {
        return siteGetResult;
    }

    /**
     * Sets the value of the siteGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteDetailGetResult }
     *     
     */
    public void setSiteGetResult(SiteDetailGetResult value) {
        this.siteGetResult = value;
    }

}
