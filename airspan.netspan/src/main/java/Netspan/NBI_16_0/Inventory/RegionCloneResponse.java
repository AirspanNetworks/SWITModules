
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
 *         &lt;element name="RegionCloneResult" type="{http://Airspan.Netspan.WebServices}RegionActionResult" minOccurs="0"/>
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
    "regionCloneResult"
})
@XmlRootElement(name = "RegionCloneResponse")
public class RegionCloneResponse {

    @XmlElement(name = "RegionCloneResult")
    protected RegionActionResult regionCloneResult;

    /**
     * Gets the value of the regionCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegionActionResult }
     *     
     */
    public RegionActionResult getRegionCloneResult() {
        return regionCloneResult;
    }

    /**
     * Sets the value of the regionCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionActionResult }
     *     
     */
    public void setRegionCloneResult(RegionActionResult value) {
        this.regionCloneResult = value;
    }

}
