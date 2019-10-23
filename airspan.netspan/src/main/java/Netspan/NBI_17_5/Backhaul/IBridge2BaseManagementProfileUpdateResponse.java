
package Netspan.NBI_17_5.Backhaul;

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
 *         &lt;element name="IBridge2BaseManagementProfileUpdateResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "iBridge2BaseManagementProfileUpdateResult"
})
@XmlRootElement(name = "IBridge2BaseManagementProfileUpdateResponse")
public class IBridge2BaseManagementProfileUpdateResponse {

    @XmlElement(name = "IBridge2BaseManagementProfileUpdateResult")
    protected ProfileResponse iBridge2BaseManagementProfileUpdateResult;

    /**
     * Gets the value of the iBridge2BaseManagementProfileUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridge2BaseManagementProfileUpdateResult() {
        return iBridge2BaseManagementProfileUpdateResult;
    }

    /**
     * Sets the value of the iBridge2BaseManagementProfileUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridge2BaseManagementProfileUpdateResult(ProfileResponse value) {
        this.iBridge2BaseManagementProfileUpdateResult = value;
    }

}
