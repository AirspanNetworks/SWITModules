
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
 *         &lt;element name="IBridge2ManagementProfileDeleteResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "iBridge2ManagementProfileDeleteResult"
})
@XmlRootElement(name = "IBridge2ManagementProfileDeleteResponse")
public class IBridge2ManagementProfileDeleteResponse {

    @XmlElement(name = "IBridge2ManagementProfileDeleteResult")
    protected ProfileResponse iBridge2ManagementProfileDeleteResult;

    /**
     * Gets the value of the iBridge2ManagementProfileDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridge2ManagementProfileDeleteResult() {
        return iBridge2ManagementProfileDeleteResult;
    }

    /**
     * Sets the value of the iBridge2ManagementProfileDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridge2ManagementProfileDeleteResult(ProfileResponse value) {
        this.iBridge2ManagementProfileDeleteResult = value;
    }

}
