
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
 *         &lt;element name="Lte3gStaticNeighbourDeleteAllResult" type="{http://Airspan.Netspan.WebServices}Lte3gNeighbourResponse" minOccurs="0"/>
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
    "lte3GStaticNeighbourDeleteAllResult"
})
@XmlRootElement(name = "Lte3gStaticNeighbourDeleteAllResponse")
public class Lte3GStaticNeighbourDeleteAllResponse {

    @XmlElement(name = "Lte3gStaticNeighbourDeleteAllResult")
    protected Lte3GNeighbourResponse lte3GStaticNeighbourDeleteAllResult;

    /**
     * Gets the value of the lte3GStaticNeighbourDeleteAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link Lte3GNeighbourResponse }
     *     
     */
    public Lte3GNeighbourResponse getLte3GStaticNeighbourDeleteAllResult() {
        return lte3GStaticNeighbourDeleteAllResult;
    }

    /**
     * Sets the value of the lte3GStaticNeighbourDeleteAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lte3GNeighbourResponse }
     *     
     */
    public void setLte3GStaticNeighbourDeleteAllResult(Lte3GNeighbourResponse value) {
        this.lte3GStaticNeighbourDeleteAllResult = value;
    }

}
