
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
 *         &lt;element name="EnbRetAntennaActionResetResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "enbRetAntennaActionResetResult"
})
@XmlRootElement(name = "EnbRetAntennaActionResetResponse")
public class EnbRetAntennaActionResetResponse {

    @XmlElement(name = "EnbRetAntennaActionResetResult")
    protected NodeActionResult enbRetAntennaActionResetResult;

    /**
     * Gets the value of the enbRetAntennaActionResetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getEnbRetAntennaActionResetResult() {
        return enbRetAntennaActionResetResult;
    }

    /**
     * Sets the value of the enbRetAntennaActionResetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setEnbRetAntennaActionResetResult(NodeActionResult value) {
        this.enbRetAntennaActionResetResult = value;
    }

}
