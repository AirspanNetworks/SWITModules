
package Netspan.NBI_18_0.Backhaul;

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
 *         &lt;element name="IBridge2AlarmProfileDeleteResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "iBridge2AlarmProfileDeleteResult"
})
@XmlRootElement(name = "IBridge2AlarmProfileDeleteResponse")
public class IBridge2AlarmProfileDeleteResponse {

    @XmlElement(name = "IBridge2AlarmProfileDeleteResult")
    protected ProfileResponse iBridge2AlarmProfileDeleteResult;

    /**
     * Gets the value of the iBridge2AlarmProfileDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridge2AlarmProfileDeleteResult() {
        return iBridge2AlarmProfileDeleteResult;
    }

    /**
     * Sets the value of the iBridge2AlarmProfileDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridge2AlarmProfileDeleteResult(ProfileResponse value) {
        this.iBridge2AlarmProfileDeleteResult = value;
    }

}
