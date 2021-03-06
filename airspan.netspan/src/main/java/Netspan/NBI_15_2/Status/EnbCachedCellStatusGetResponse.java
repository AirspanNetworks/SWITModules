
package Netspan.NBI_15_2.Status;

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
 *         &lt;element name="EnbCachedCellStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteCellStatusCachedListResult" minOccurs="0"/&gt;
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
    "enbCachedCellStatusGetResult"
})
@XmlRootElement(name = "EnbCachedCellStatusGetResponse")
public class EnbCachedCellStatusGetResponse {

    @XmlElement(name = "EnbCachedCellStatusGetResult")
    protected LteCellStatusCachedListResult enbCachedCellStatusGetResult;

    /**
     * Gets the value of the enbCachedCellStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteCellStatusCachedListResult }
     *     
     */
    public LteCellStatusCachedListResult getEnbCachedCellStatusGetResult() {
        return enbCachedCellStatusGetResult;
    }

    /**
     * Sets the value of the enbCachedCellStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteCellStatusCachedListResult }
     *     
     */
    public void setEnbCachedCellStatusGetResult(LteCellStatusCachedListResult value) {
        this.enbCachedCellStatusGetResult = value;
    }

}
