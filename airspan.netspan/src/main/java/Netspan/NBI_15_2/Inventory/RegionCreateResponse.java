
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
 *         &lt;element name="RegionCreateResult" type="{http://Airspan.Netspan.WebServices}RegionActionResult" minOccurs="0"/&gt;
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
    "regionCreateResult"
})
@XmlRootElement(name = "RegionCreateResponse")
public class RegionCreateResponse {

    @XmlElement(name = "RegionCreateResult")
    protected RegionActionResult regionCreateResult;

    /**
     * Gets the value of the regionCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegionActionResult }
     *     
     */
    public RegionActionResult getRegionCreateResult() {
        return regionCreateResult;
    }

    /**
     * Sets the value of the regionCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionActionResult }
     *     
     */
    public void setRegionCreateResult(RegionActionResult value) {
        this.regionCreateResult = value;
    }

}
