
package Netspan.NBI_15_2.Lte;

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
 *         &lt;element name="LteNeighbourDeleteAnrResult" type="{http://Airspan.Netspan.WebServices}LteAnrNeighbourResponse" minOccurs="0"/>
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
    "lteNeighbourDeleteAnrResult"
})
@XmlRootElement(name = "LteNeighbourDeleteAnrResponse")
public class LteNeighbourDeleteAnrResponse {

    @XmlElement(name = "LteNeighbourDeleteAnrResult")
    protected LteAnrNeighbourResponse lteNeighbourDeleteAnrResult;

    /**
     * Gets the value of the lteNeighbourDeleteAnrResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteAnrNeighbourResponse }
     *     
     */
    public LteAnrNeighbourResponse getLteNeighbourDeleteAnrResult() {
        return lteNeighbourDeleteAnrResult;
    }

    /**
     * Sets the value of the lteNeighbourDeleteAnrResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteAnrNeighbourResponse }
     *     
     */
    public void setLteNeighbourDeleteAnrResult(LteAnrNeighbourResponse value) {
        this.lteNeighbourDeleteAnrResult = value;
    }

}
