
package Netspan.NBI_17_5.Lte;

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
 *         &lt;element name="SyncProfile" type="{http://Airspan.Netspan.WebServices}EnbSyncProfile" minOccurs="0"/&gt;
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
    "syncProfile"
})
@XmlRootElement(name = "SyncProfileCreate")
public class SyncProfileCreate {

    @XmlElement(name = "SyncProfile")
    protected EnbSyncProfile syncProfile;

    /**
     * Gets the value of the syncProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbSyncProfile }
     *     
     */
    public EnbSyncProfile getSyncProfile() {
        return syncProfile;
    }

    /**
     * Sets the value of the syncProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbSyncProfile }
     *     
     */
    public void setSyncProfile(EnbSyncProfile value) {
        this.syncProfile = value;
    }

}
