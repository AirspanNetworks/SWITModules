
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
 *         &lt;element name="IBridge2ManagementProfileCloneResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "iBridge2ManagementProfileCloneResult"
})
@XmlRootElement(name = "IBridge2ManagementProfileCloneResponse")
public class IBridge2ManagementProfileCloneResponse {

    @XmlElement(name = "IBridge2ManagementProfileCloneResult")
    protected ProfileResponse iBridge2ManagementProfileCloneResult;

    /**
     * Gets the value of the iBridge2ManagementProfileCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridge2ManagementProfileCloneResult() {
        return iBridge2ManagementProfileCloneResult;
    }

    /**
     * Sets the value of the iBridge2ManagementProfileCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridge2ManagementProfileCloneResult(ProfileResponse value) {
        this.iBridge2ManagementProfileCloneResult = value;
    }

}
