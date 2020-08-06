
package Netspan.NBI_18_0.Inventory;

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
 *         &lt;element name="RegionDeleteResult" type="{http://Airspan.Netspan.WebServices}RegionActionResult" minOccurs="0"/&gt;
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
    "regionDeleteResult"
})
@XmlRootElement(name = "RegionDeleteResponse")
public class RegionDeleteResponse {

    @XmlElement(name = "RegionDeleteResult")
    protected RegionActionResult regionDeleteResult;

    /**
     * Gets the value of the regionDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegionActionResult }
     *     
     */
    public RegionActionResult getRegionDeleteResult() {
        return regionDeleteResult;
    }

    /**
     * Sets the value of the regionDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionActionResult }
     *     
     */
    public void setRegionDeleteResult(RegionActionResult value) {
        this.regionDeleteResult = value;
    }

}
