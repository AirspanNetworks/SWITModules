
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
 *         &lt;element name="NeighbourProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteNeighbourProfileGetResult" minOccurs="0"/&gt;
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
    "neighbourProfileGetResult"
})
@XmlRootElement(name = "NeighbourProfileGetResponse")
public class NeighbourProfileGetResponse {

    @XmlElement(name = "NeighbourProfileGetResult")
    protected LteNeighbourProfileGetResult neighbourProfileGetResult;

    /**
     * Gets the value of the neighbourProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteNeighbourProfileGetResult }
     *     
     */
    public LteNeighbourProfileGetResult getNeighbourProfileGetResult() {
        return neighbourProfileGetResult;
    }

    /**
     * Sets the value of the neighbourProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNeighbourProfileGetResult }
     *     
     */
    public void setNeighbourProfileGetResult(LteNeighbourProfileGetResult value) {
        this.neighbourProfileGetResult = value;
    }

}
