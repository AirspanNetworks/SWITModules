
package Netspan.NBI_16_0.Backhaul;

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
 *         &lt;element name="Ib440QosProfileUpdateResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "ib440QosProfileUpdateResult"
})
@XmlRootElement(name = "Ib440QosProfileUpdateResponse")
public class Ib440QosProfileUpdateResponse {

    @XmlElement(name = "Ib440QosProfileUpdateResult")
    protected ProfileResponse ib440QosProfileUpdateResult;

    /**
     * Gets the value of the ib440QosProfileUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIb440QosProfileUpdateResult() {
        return ib440QosProfileUpdateResult;
    }

    /**
     * Sets the value of the ib440QosProfileUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIb440QosProfileUpdateResult(ProfileResponse value) {
        this.ib440QosProfileUpdateResult = value;
    }

}
