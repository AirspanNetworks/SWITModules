
package Netspan.NBI_17_0.Status;

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
 *         &lt;element name="EnbSonRsiStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteSonRsiGetResult" minOccurs="0"/&gt;
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
    "enbSonRsiStatusGetResult"
})
@XmlRootElement(name = "EnbSonRsiStatusGetResponse")
public class EnbSonRsiStatusGetResponse {

    @XmlElement(name = "EnbSonRsiStatusGetResult")
    protected LteSonRsiGetResult enbSonRsiStatusGetResult;

    /**
     * Gets the value of the enbSonRsiStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonRsiGetResult }
     *     
     */
    public LteSonRsiGetResult getEnbSonRsiStatusGetResult() {
        return enbSonRsiStatusGetResult;
    }

    /**
     * Sets the value of the enbSonRsiStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonRsiGetResult }
     *     
     */
    public void setEnbSonRsiStatusGetResult(LteSonRsiGetResult value) {
        this.enbSonRsiStatusGetResult = value;
    }

}
