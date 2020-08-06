
package Netspan.NBI_18_0.Status;

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
 *         &lt;element name="EnbSfpStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteSfpStatusGetResult" minOccurs="0"/&gt;
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
    "enbSfpStatusGetResult"
})
@XmlRootElement(name = "EnbSfpStatusGetResponse")
public class EnbSfpStatusGetResponse {

    @XmlElement(name = "EnbSfpStatusGetResult")
    protected LteSfpStatusGetResult enbSfpStatusGetResult;

    /**
     * Gets the value of the enbSfpStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSfpStatusGetResult }
     *     
     */
    public LteSfpStatusGetResult getEnbSfpStatusGetResult() {
        return enbSfpStatusGetResult;
    }

    /**
     * Sets the value of the enbSfpStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSfpStatusGetResult }
     *     
     */
    public void setEnbSfpStatusGetResult(LteSfpStatusGetResult value) {
        this.enbSfpStatusGetResult = value;
    }

}
