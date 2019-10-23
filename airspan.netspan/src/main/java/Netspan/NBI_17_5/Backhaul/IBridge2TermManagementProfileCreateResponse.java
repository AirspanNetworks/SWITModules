
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
 *         &lt;element name="IBridge2TermManagementProfileCreateResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "iBridge2TermManagementProfileCreateResult"
})
@XmlRootElement(name = "IBridge2TermManagementProfileCreateResponse")
public class IBridge2TermManagementProfileCreateResponse {

    @XmlElement(name = "IBridge2TermManagementProfileCreateResult")
    protected ProfileResponse iBridge2TermManagementProfileCreateResult;

    /**
     * Gets the value of the iBridge2TermManagementProfileCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridge2TermManagementProfileCreateResult() {
        return iBridge2TermManagementProfileCreateResult;
    }

    /**
     * Sets the value of the iBridge2TermManagementProfileCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridge2TermManagementProfileCreateResult(ProfileResponse value) {
        this.iBridge2TermManagementProfileCreateResult = value;
    }

}
