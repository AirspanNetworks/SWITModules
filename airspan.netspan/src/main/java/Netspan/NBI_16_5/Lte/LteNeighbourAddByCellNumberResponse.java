
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
 *         &lt;element name="LteNeighbourAddByCellNumberResult" type="{http://Airspan.Netspan.WebServices}LteNeighbourResponse" minOccurs="0"/&gt;
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
    "lteNeighbourAddByCellNumberResult"
})
@XmlRootElement(name = "LteNeighbourAddByCellNumberResponse")
public class LteNeighbourAddByCellNumberResponse {

    @XmlElement(name = "LteNeighbourAddByCellNumberResult")
    protected LteNeighbourResponse lteNeighbourAddByCellNumberResult;

    /**
     * Gets the value of the lteNeighbourAddByCellNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteNeighbourResponse }
     *     
     */
    public LteNeighbourResponse getLteNeighbourAddByCellNumberResult() {
        return lteNeighbourAddByCellNumberResult;
    }

    /**
     * Sets the value of the lteNeighbourAddByCellNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNeighbourResponse }
     *     
     */
    public void setLteNeighbourAddByCellNumberResult(LteNeighbourResponse value) {
        this.lteNeighbourAddByCellNumberResult = value;
    }

}
