
package Netspan.NBI_16_5.Backhaul;

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
 *         &lt;element name="Ib440QosProfileDeleteResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "ib440QosProfileDeleteResult"
})
@XmlRootElement(name = "Ib440QosProfileDeleteResponse")
public class Ib440QosProfileDeleteResponse {

    @XmlElement(name = "Ib440QosProfileDeleteResult")
    protected ProfileResponse ib440QosProfileDeleteResult;

    /**
     * Gets the value of the ib440QosProfileDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIb440QosProfileDeleteResult() {
        return ib440QosProfileDeleteResult;
    }

    /**
     * Sets the value of the ib440QosProfileDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIb440QosProfileDeleteResult(ProfileResponse value) {
        this.ib440QosProfileDeleteResult = value;
    }

}
