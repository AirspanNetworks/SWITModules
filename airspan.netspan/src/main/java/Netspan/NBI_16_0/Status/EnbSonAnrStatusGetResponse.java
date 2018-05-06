
package Netspan.NBI_16_0.Status;

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
 *         &lt;element name="EnbSonAnrStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteSonAnrGetResult" minOccurs="0"/>
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
    "enbSonAnrStatusGetResult"
})
@XmlRootElement(name = "EnbSonAnrStatusGetResponse")
public class EnbSonAnrStatusGetResponse {

    @XmlElement(name = "EnbSonAnrStatusGetResult")
    protected LteSonAnrGetResult enbSonAnrStatusGetResult;

    /**
     * Gets the value of the enbSonAnrStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonAnrGetResult }
     *     
     */
    public LteSonAnrGetResult getEnbSonAnrStatusGetResult() {
        return enbSonAnrStatusGetResult;
    }

    /**
     * Sets the value of the enbSonAnrStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonAnrGetResult }
     *     
     */
    public void setEnbSonAnrStatusGetResult(LteSonAnrGetResult value) {
        this.enbSonAnrStatusGetResult = value;
    }

}
