
package Netspan.NBI_15_1.Status;

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
 *         &lt;element name="EnbCachedAnrStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteCachedAnrListResult" minOccurs="0"/>
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
    "enbCachedAnrStatusGetResult"
})
@XmlRootElement(name = "EnbCachedAnrStatusGetResponse")
public class EnbCachedAnrStatusGetResponse {

    @XmlElement(name = "EnbCachedAnrStatusGetResult")
    protected LteCachedAnrListResult enbCachedAnrStatusGetResult;

    /**
     * Gets the value of the enbCachedAnrStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteCachedAnrListResult }
     *     
     */
    public LteCachedAnrListResult getEnbCachedAnrStatusGetResult() {
        return enbCachedAnrStatusGetResult;
    }

    /**
     * Sets the value of the enbCachedAnrStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteCachedAnrListResult }
     *     
     */
    public void setEnbCachedAnrStatusGetResult(LteCachedAnrListResult value) {
        this.enbCachedAnrStatusGetResult = value;
    }

}
