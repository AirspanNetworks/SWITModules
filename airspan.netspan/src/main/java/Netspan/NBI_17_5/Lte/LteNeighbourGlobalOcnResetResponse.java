
package Netspan.NBI_17_5.Lte;

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
 *         &lt;element name="LteNeighbourGlobalOcnResetResult" type="{http://Airspan.Netspan.WebServices}LteNeighbourResponse" minOccurs="0"/&gt;
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
    "lteNeighbourGlobalOcnResetResult"
})
@XmlRootElement(name = "LteNeighbourGlobalOcnResetResponse")
public class LteNeighbourGlobalOcnResetResponse {

    @XmlElement(name = "LteNeighbourGlobalOcnResetResult")
    protected LteNeighbourResponse lteNeighbourGlobalOcnResetResult;

    /**
     * Gets the value of the lteNeighbourGlobalOcnResetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteNeighbourResponse }
     *     
     */
    public LteNeighbourResponse getLteNeighbourGlobalOcnResetResult() {
        return lteNeighbourGlobalOcnResetResult;
    }

    /**
     * Sets the value of the lteNeighbourGlobalOcnResetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNeighbourResponse }
     *     
     */
    public void setLteNeighbourGlobalOcnResetResult(LteNeighbourResponse value) {
        this.lteNeighbourGlobalOcnResetResult = value;
    }

}
