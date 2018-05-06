
package Netspan.NBI_16_0.Lte;

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
 *         &lt;element name="Lte3gNeighbourAnrAddUpdateResult" type="{http://Airspan.Netspan.WebServices}Node3gNeighboursUpdateResponse" minOccurs="0"/>
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
    "lte3GNeighbourAnrAddUpdateResult"
})
@XmlRootElement(name = "Lte3gNeighbourAnrAddUpdateResponse")
public class Lte3GNeighbourAnrAddUpdateResponse {

    @XmlElement(name = "Lte3gNeighbourAnrAddUpdateResult")
    protected Node3GNeighboursUpdateResponse lte3GNeighbourAnrAddUpdateResult;

    /**
     * Gets the value of the lte3GNeighbourAnrAddUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Node3GNeighboursUpdateResponse }
     *     
     */
    public Node3GNeighboursUpdateResponse getLte3GNeighbourAnrAddUpdateResult() {
        return lte3GNeighbourAnrAddUpdateResult;
    }

    /**
     * Sets the value of the lte3GNeighbourAnrAddUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node3GNeighboursUpdateResponse }
     *     
     */
    public void setLte3GNeighbourAnrAddUpdateResult(Node3GNeighboursUpdateResponse value) {
        this.lte3GNeighbourAnrAddUpdateResult = value;
    }

}
