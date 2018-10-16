
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
 *         &lt;element name="Lte3gStaticNeighbourDeleteResult" type="{http://Airspan.Netspan.WebServices}Lte3gNeighbourResponse" minOccurs="0"/&gt;
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
    "lte3GStaticNeighbourDeleteResult"
})
@XmlRootElement(name = "Lte3gStaticNeighbourDeleteResponse")
public class Lte3GStaticNeighbourDeleteResponse {

    @XmlElement(name = "Lte3gStaticNeighbourDeleteResult")
    protected Lte3GNeighbourResponse lte3GStaticNeighbourDeleteResult;

    /**
     * Gets the value of the lte3GStaticNeighbourDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link Lte3GNeighbourResponse }
     *     
     */
    public Lte3GNeighbourResponse getLte3GStaticNeighbourDeleteResult() {
        return lte3GStaticNeighbourDeleteResult;
    }

    /**
     * Sets the value of the lte3GStaticNeighbourDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lte3GNeighbourResponse }
     *     
     */
    public void setLte3GStaticNeighbourDeleteResult(Lte3GNeighbourResponse value) {
        this.lte3GStaticNeighbourDeleteResult = value;
    }

}
