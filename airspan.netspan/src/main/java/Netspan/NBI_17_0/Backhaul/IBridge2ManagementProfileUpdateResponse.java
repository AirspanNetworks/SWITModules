
package Netspan.NBI_17_0.Backhaul;

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
 *         &lt;element name="IBridge2ManagementProfileUpdateResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "iBridge2ManagementProfileUpdateResult"
})
@XmlRootElement(name = "IBridge2ManagementProfileUpdateResponse")
public class IBridge2ManagementProfileUpdateResponse {

    @XmlElement(name = "IBridge2ManagementProfileUpdateResult")
    protected ProfileResponse iBridge2ManagementProfileUpdateResult;

    /**
     * Gets the value of the iBridge2ManagementProfileUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridge2ManagementProfileUpdateResult() {
        return iBridge2ManagementProfileUpdateResult;
    }

    /**
     * Sets the value of the iBridge2ManagementProfileUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridge2ManagementProfileUpdateResult(ProfileResponse value) {
        this.iBridge2ManagementProfileUpdateResult = value;
    }

}
