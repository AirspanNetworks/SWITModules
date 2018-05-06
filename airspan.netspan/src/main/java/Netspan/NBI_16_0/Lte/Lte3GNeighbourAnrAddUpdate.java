
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
 *         &lt;element name="Node3gNeighbour" type="{http://Airspan.Netspan.WebServices}Node3gNeighbourAnrWs" minOccurs="0"/>
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
    "node3GNeighbour"
})
@XmlRootElement(name = "Lte3gNeighbourAnrAddUpdate")
public class Lte3GNeighbourAnrAddUpdate {

    @XmlElement(name = "Node3gNeighbour")
    protected Node3GNeighbourAnrWs node3GNeighbour;

    /**
     * Gets the value of the node3GNeighbour property.
     * 
     * @return
     *     possible object is
     *     {@link Node3GNeighbourAnrWs }
     *     
     */
    public Node3GNeighbourAnrWs getNode3GNeighbour() {
        return node3GNeighbour;
    }

    /**
     * Sets the value of the node3GNeighbour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node3GNeighbourAnrWs }
     *     
     */
    public void setNode3GNeighbour(Node3GNeighbourAnrWs value) {
        this.node3GNeighbour = value;
    }

}
