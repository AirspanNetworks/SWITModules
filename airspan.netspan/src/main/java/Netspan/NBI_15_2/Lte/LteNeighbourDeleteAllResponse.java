
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LteNeighbourDeleteAllResult" type="{http://Airspan.Netspan.WebServices}LteNeighbourResponse" minOccurs="0"/&gt;
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
    "lteNeighbourDeleteAllResult"
})
@XmlRootElement(name = "LteNeighbourDeleteAllResponse")
public class LteNeighbourDeleteAllResponse {

    @XmlElement(name = "LteNeighbourDeleteAllResult")
    protected LteNeighbourResponse lteNeighbourDeleteAllResult;

    /**
     * Gets the value of the lteNeighbourDeleteAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteNeighbourResponse }
     *     
     */
    public LteNeighbourResponse getLteNeighbourDeleteAllResult() {
        return lteNeighbourDeleteAllResult;
    }

    /**
     * Sets the value of the lteNeighbourDeleteAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNeighbourResponse }
     *     
     */
    public void setLteNeighbourDeleteAllResult(LteNeighbourResponse value) {
        this.lteNeighbourDeleteAllResult = value;
    }

}
