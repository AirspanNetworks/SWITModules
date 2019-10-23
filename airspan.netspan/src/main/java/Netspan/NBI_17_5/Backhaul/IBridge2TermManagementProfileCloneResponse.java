
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
 *         &lt;element name="IBridge2TermManagementProfileCloneResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "iBridge2TermManagementProfileCloneResult"
})
@XmlRootElement(name = "IBridge2TermManagementProfileCloneResponse")
public class IBridge2TermManagementProfileCloneResponse {

    @XmlElement(name = "IBridge2TermManagementProfileCloneResult")
    protected ProfileResponse iBridge2TermManagementProfileCloneResult;

    /**
     * Gets the value of the iBridge2TermManagementProfileCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridge2TermManagementProfileCloneResult() {
        return iBridge2TermManagementProfileCloneResult;
    }

    /**
     * Sets the value of the iBridge2TermManagementProfileCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridge2TermManagementProfileCloneResult(ProfileResponse value) {
        this.iBridge2TermManagementProfileCloneResult = value;
    }

}
