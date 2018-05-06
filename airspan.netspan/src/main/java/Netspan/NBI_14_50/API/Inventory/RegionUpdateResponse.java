
package Netspan.NBI_14_50.API.Inventory;

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
 *         &lt;element name="RegionUpdateResult" type="{http://Airspan.Netspan.WebServices}RegionActionResult" minOccurs="0"/>
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
    "regionUpdateResult"
})
@XmlRootElement(name = "RegionUpdateResponse")
public class RegionUpdateResponse {

    @XmlElement(name = "RegionUpdateResult")
    protected RegionActionResult regionUpdateResult;

    /**
     * Gets the value of the regionUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegionActionResult }
     *     
     */
    public RegionActionResult getRegionUpdateResult() {
        return regionUpdateResult;
    }

    /**
     * Sets the value of the regionUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionActionResult }
     *     
     */
    public void setRegionUpdateResult(RegionActionResult value) {
        this.regionUpdateResult = value;
    }

}
