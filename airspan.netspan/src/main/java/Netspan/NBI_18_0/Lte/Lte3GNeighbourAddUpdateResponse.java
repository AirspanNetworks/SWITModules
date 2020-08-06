
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
 *         &lt;element name="Lte3gNeighbourAddUpdateResult" type="{http://Airspan.Netspan.WebServices}Node3gNeighboursUpdateResponse" minOccurs="0"/&gt;
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
    "lte3GNeighbourAddUpdateResult"
})
@XmlRootElement(name = "Lte3gNeighbourAddUpdateResponse")
public class Lte3GNeighbourAddUpdateResponse {

    @XmlElement(name = "Lte3gNeighbourAddUpdateResult")
    protected Node3GNeighboursUpdateResponse lte3GNeighbourAddUpdateResult;

    /**
     * Gets the value of the lte3GNeighbourAddUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Node3GNeighboursUpdateResponse }
     *     
     */
    public Node3GNeighboursUpdateResponse getLte3GNeighbourAddUpdateResult() {
        return lte3GNeighbourAddUpdateResult;
    }

    /**
     * Sets the value of the lte3GNeighbourAddUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node3GNeighboursUpdateResponse }
     *     
     */
    public void setLte3GNeighbourAddUpdateResult(Node3GNeighboursUpdateResponse value) {
        this.lte3GNeighbourAddUpdateResult = value;
    }

}
