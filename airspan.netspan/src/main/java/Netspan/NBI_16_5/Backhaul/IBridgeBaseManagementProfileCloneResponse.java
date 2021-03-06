
package Netspan.NBI_16_5.Backhaul;

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
 *         &lt;element name="IBridgeBaseManagementProfileCloneResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "iBridgeBaseManagementProfileCloneResult"
})
@XmlRootElement(name = "IBridgeBaseManagementProfileCloneResponse")
public class IBridgeBaseManagementProfileCloneResponse {

    @XmlElement(name = "IBridgeBaseManagementProfileCloneResult")
    protected ProfileResponse iBridgeBaseManagementProfileCloneResult;

    /**
     * Gets the value of the iBridgeBaseManagementProfileCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridgeBaseManagementProfileCloneResult() {
        return iBridgeBaseManagementProfileCloneResult;
    }

    /**
     * Sets the value of the iBridgeBaseManagementProfileCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridgeBaseManagementProfileCloneResult(ProfileResponse value) {
        this.iBridgeBaseManagementProfileCloneResult = value;
    }

}
