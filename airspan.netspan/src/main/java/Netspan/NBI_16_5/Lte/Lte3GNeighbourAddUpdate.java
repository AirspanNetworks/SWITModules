
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
 *         &lt;element name="Node3gNeighbour" type="{http://Airspan.Netspan.WebServices}Node3gNeighbour" minOccurs="0"/&gt;
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
    "node3GNeighbour"
})
@XmlRootElement(name = "Lte3gNeighbourAddUpdate")
public class Lte3GNeighbourAddUpdate {

    @XmlElement(name = "Node3gNeighbour")
    protected Node3GNeighbour node3GNeighbour;

    /**
     * Gets the value of the node3GNeighbour property.
     * 
     * @return
     *     possible object is
     *     {@link Node3GNeighbour }
     *     
     */
    public Node3GNeighbour getNode3GNeighbour() {
        return node3GNeighbour;
    }

    /**
     * Sets the value of the node3GNeighbour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node3GNeighbour }
     *     
     */
    public void setNode3GNeighbour(Node3GNeighbour value) {
        this.node3GNeighbour = value;
    }

}
