
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
 *         &lt;element name="RegionGetResult" type="{http://Airspan.Netspan.WebServices}RegionDetailGetResult" minOccurs="0"/>
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
    "regionGetResult"
})
@XmlRootElement(name = "RegionGetResponse")
public class RegionGetResponse {

    @XmlElement(name = "RegionGetResult")
    protected RegionDetailGetResult regionGetResult;

    /**
     * Gets the value of the regionGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegionDetailGetResult }
     *     
     */
    public RegionDetailGetResult getRegionGetResult() {
        return regionGetResult;
    }

    /**
     * Sets the value of the regionGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDetailGetResult }
     *     
     */
    public void setRegionGetResult(RegionDetailGetResult value) {
        this.regionGetResult = value;
    }

}
