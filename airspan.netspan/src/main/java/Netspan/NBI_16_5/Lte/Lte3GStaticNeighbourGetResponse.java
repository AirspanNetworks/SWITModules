
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
 *         &lt;element name="Lte3gStaticNeighbourGetResult" type="{http://Airspan.Netspan.WebServices}Node3gNeighbourResponse" minOccurs="0"/&gt;
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
    "lte3GStaticNeighbourGetResult"
})
@XmlRootElement(name = "Lte3gStaticNeighbourGetResponse")
public class Lte3GStaticNeighbourGetResponse {

    @XmlElement(name = "Lte3gStaticNeighbourGetResult")
    protected Node3GNeighbourResponse lte3GStaticNeighbourGetResult;

    /**
     * Gets the value of the lte3GStaticNeighbourGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Node3GNeighbourResponse }
     *     
     */
    public Node3GNeighbourResponse getLte3GStaticNeighbourGetResult() {
        return lte3GStaticNeighbourGetResult;
    }

    /**
     * Sets the value of the lte3GStaticNeighbourGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node3GNeighbourResponse }
     *     
     */
    public void setLte3GStaticNeighbourGetResult(Node3GNeighbourResponse value) {
        this.lte3GStaticNeighbourGetResult = value;
    }

}
