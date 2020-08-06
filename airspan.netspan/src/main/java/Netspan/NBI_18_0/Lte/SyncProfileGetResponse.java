
package Netspan.NBI_18_0.Lte;

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
 *         &lt;element name="SyncProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteSyncProfileGetResult" minOccurs="0"/&gt;
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
    "syncProfileGetResult"
})
@XmlRootElement(name = "SyncProfileGetResponse")
public class SyncProfileGetResponse {

    @XmlElement(name = "SyncProfileGetResult")
    protected LteSyncProfileGetResult syncProfileGetResult;

    /**
     * Gets the value of the syncProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSyncProfileGetResult }
     *     
     */
    public LteSyncProfileGetResult getSyncProfileGetResult() {
        return syncProfileGetResult;
    }

    /**
     * Sets the value of the syncProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSyncProfileGetResult }
     *     
     */
    public void setSyncProfileGetResult(LteSyncProfileGetResult value) {
        this.syncProfileGetResult = value;
    }

}
