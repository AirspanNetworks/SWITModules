
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
 *         &lt;element name="EnbIpThroughputStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteIpThroughputGetResult" minOccurs="0"/&gt;
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
    "enbIpThroughputStatusGetResult"
})
@XmlRootElement(name = "EnbIpThroughputStatusGetResponse")
public class EnbIpThroughputStatusGetResponse {

    @XmlElement(name = "EnbIpThroughputStatusGetResult")
    protected LteIpThroughputGetResult enbIpThroughputStatusGetResult;

    /**
     * Gets the value of the enbIpThroughputStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteIpThroughputGetResult }
     *     
     */
    public LteIpThroughputGetResult getEnbIpThroughputStatusGetResult() {
        return enbIpThroughputStatusGetResult;
    }

    /**
     * Sets the value of the enbIpThroughputStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteIpThroughputGetResult }
     *     
     */
    public void setEnbIpThroughputStatusGetResult(LteIpThroughputGetResult value) {
        this.enbIpThroughputStatusGetResult = value;
    }

}
