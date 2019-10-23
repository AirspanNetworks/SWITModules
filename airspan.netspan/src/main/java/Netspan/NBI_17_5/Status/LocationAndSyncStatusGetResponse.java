
package Netspan.NBI_17_5.Status;

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
 *         &lt;element name="LocationAndSyncStatusGetResult" type="{http://Airspan.Netspan.WebServices}LocationAndSyncStatusResult" minOccurs="0"/&gt;
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
    "locationAndSyncStatusGetResult"
})
@XmlRootElement(name = "LocationAndSyncStatusGetResponse")
public class LocationAndSyncStatusGetResponse {

    @XmlElement(name = "LocationAndSyncStatusGetResult")
    protected LocationAndSyncStatusResult locationAndSyncStatusGetResult;

    /**
     * Gets the value of the locationAndSyncStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LocationAndSyncStatusResult }
     *     
     */
    public LocationAndSyncStatusResult getLocationAndSyncStatusGetResult() {
        return locationAndSyncStatusGetResult;
    }

    /**
     * Sets the value of the locationAndSyncStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationAndSyncStatusResult }
     *     
     */
    public void setLocationAndSyncStatusGetResult(LocationAndSyncStatusResult value) {
        this.locationAndSyncStatusGetResult = value;
    }

}
