
package Netspan.NBI_15_1.Lte;

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
 *         &lt;element name="LteNeighbourDeleteResult" type="{http://Airspan.Netspan.WebServices}LteNeighbourResponse" minOccurs="0"/>
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
    "lteNeighbourDeleteResult"
})
@XmlRootElement(name = "LteNeighbourDeleteResponse")
public class LteNeighbourDeleteResponse {

    @XmlElement(name = "LteNeighbourDeleteResult")
    protected LteNeighbourResponse lteNeighbourDeleteResult;

    /**
     * Gets the value of the lteNeighbourDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteNeighbourResponse }
     *     
     */
    public LteNeighbourResponse getLteNeighbourDeleteResult() {
        return lteNeighbourDeleteResult;
    }

    /**
     * Sets the value of the lteNeighbourDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNeighbourResponse }
     *     
     */
    public void setLteNeighbourDeleteResult(LteNeighbourResponse value) {
        this.lteNeighbourDeleteResult = value;
    }

}
