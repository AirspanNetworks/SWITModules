
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
 *         &lt;element name="AnrNeighbour" type="{http://Airspan.Netspan.WebServices}Anr3gNeighbourWs" minOccurs="0"/&gt;
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
    "anrNeighbour"
})
@XmlRootElement(name = "Lte3gNeighbourAnrDelete")
public class Lte3GNeighbourAnrDelete {

    @XmlElement(name = "AnrNeighbour")
    protected Anr3GNeighbourWs anrNeighbour;

    /**
     * Gets the value of the anrNeighbour property.
     * 
     * @return
     *     possible object is
     *     {@link Anr3GNeighbourWs }
     *     
     */
    public Anr3GNeighbourWs getAnrNeighbour() {
        return anrNeighbour;
    }

    /**
     * Sets the value of the anrNeighbour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anr3GNeighbourWs }
     *     
     */
    public void setAnrNeighbour(Anr3GNeighbourWs value) {
        this.anrNeighbour = value;
    }

}
