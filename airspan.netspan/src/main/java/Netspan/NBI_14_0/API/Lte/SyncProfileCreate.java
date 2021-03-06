
package Netspan.NBI_14_0.API.Lte;

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
 *         &lt;element name="SyncProfile" type="{http://Airspan.Netspan.WebServices}LteSyncProfileWs" minOccurs="0"/>
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
    "syncProfile"
})
@XmlRootElement(name = "SyncProfileCreate")
public class SyncProfileCreate {

    @XmlElement(name = "SyncProfile")
    protected LteSyncProfileWs syncProfile;

    /**
     * Gets the value of the syncProfile property.
     * 
     * @return
     *     possible object is
     *     {@link LteSyncProfileWs }
     *     
     */
    public LteSyncProfileWs getSyncProfile() {
        return syncProfile;
    }

    /**
     * Sets the value of the syncProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSyncProfileWs }
     *     
     */
    public void setSyncProfile(LteSyncProfileWs value) {
        this.syncProfile = value;
    }

}
