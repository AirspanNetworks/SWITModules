
package Netspan.NBI_16_5.Lte;

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
 *         &lt;element name="Lte3gNeighbourAnrDeleteResult" type="{http://Airspan.Netspan.WebServices}LteAnrNeighbourResponse" minOccurs="0"/&gt;
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
    "lte3GNeighbourAnrDeleteResult"
})
@XmlRootElement(name = "Lte3gNeighbourAnrDeleteResponse")
public class Lte3GNeighbourAnrDeleteResponse {

    @XmlElement(name = "Lte3gNeighbourAnrDeleteResult")
    protected LteAnrNeighbourResponse lte3GNeighbourAnrDeleteResult;

    /**
     * Gets the value of the lte3GNeighbourAnrDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteAnrNeighbourResponse }
     *     
     */
    public LteAnrNeighbourResponse getLte3GNeighbourAnrDeleteResult() {
        return lte3GNeighbourAnrDeleteResult;
    }

    /**
     * Sets the value of the lte3GNeighbourAnrDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteAnrNeighbourResponse }
     *     
     */
    public void setLte3GNeighbourAnrDeleteResult(LteAnrNeighbourResponse value) {
        this.lte3GNeighbourAnrDeleteResult = value;
    }

}
