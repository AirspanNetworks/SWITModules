
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
 *         &lt;element name="IBridge2AlarmProfileCloneResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "iBridge2AlarmProfileCloneResult"
})
@XmlRootElement(name = "IBridge2AlarmProfileCloneResponse")
public class IBridge2AlarmProfileCloneResponse {

    @XmlElement(name = "IBridge2AlarmProfileCloneResult")
    protected ProfileResponse iBridge2AlarmProfileCloneResult;

    /**
     * Gets the value of the iBridge2AlarmProfileCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridge2AlarmProfileCloneResult() {
        return iBridge2AlarmProfileCloneResult;
    }

    /**
     * Sets the value of the iBridge2AlarmProfileCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridge2AlarmProfileCloneResult(ProfileResponse value) {
        this.iBridge2AlarmProfileCloneResult = value;
    }

}
