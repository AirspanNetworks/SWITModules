
package Netspan.NBI_15_5.Lte;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NeighbourProfileDeleteResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "neighbourProfileDeleteResult"
})
@XmlRootElement(name = "NeighbourProfileDeleteResponse")
public class NeighbourProfileDeleteResponse {

    @XmlElement(name = "NeighbourProfileDeleteResult")
    protected ProfileResponse neighbourProfileDeleteResult;

    /**
     * Gets the value of the neighbourProfileDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getNeighbourProfileDeleteResult() {
        return neighbourProfileDeleteResult;
    }

    /**
     * Sets the value of the neighbourProfileDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setNeighbourProfileDeleteResult(ProfileResponse value) {
        this.neighbourProfileDeleteResult = value;
    }

}
