
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
 *         &lt;element name="LteNeighbourSetResult" type="{http://Airspan.Netspan.WebServices}LteNbrConfigResponse" minOccurs="0"/&gt;
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
    "lteNeighbourSetResult"
})
@XmlRootElement(name = "LteNeighbourSetResponse")
public class LteNeighbourSetResponse {

    @XmlElement(name = "LteNeighbourSetResult")
    protected LteNbrConfigResponse lteNeighbourSetResult;

    /**
     * Gets the value of the lteNeighbourSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteNbrConfigResponse }
     *     
     */
    public LteNbrConfigResponse getLteNeighbourSetResult() {
        return lteNeighbourSetResult;
    }

    /**
     * Sets the value of the lteNeighbourSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNbrConfigResponse }
     *     
     */
    public void setLteNeighbourSetResult(LteNbrConfigResponse value) {
        this.lteNeighbourSetResult = value;
    }

}
