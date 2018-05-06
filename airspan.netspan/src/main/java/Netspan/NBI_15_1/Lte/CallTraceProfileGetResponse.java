
package Netspan.NBI_15_1.Lte;

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
 *         &lt;element name="CallTraceProfileGetResult" type="{http://Airspan.Netspan.WebServices}CallTraceProfileGetResult" minOccurs="0"/>
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
    "callTraceProfileGetResult"
})
@XmlRootElement(name = "CallTraceProfileGetResponse")
public class CallTraceProfileGetResponse {

    @XmlElement(name = "CallTraceProfileGetResult")
    protected CallTraceProfileGetResult callTraceProfileGetResult;

    /**
     * Gets the value of the callTraceProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link CallTraceProfileGetResult }
     *     
     */
    public CallTraceProfileGetResult getCallTraceProfileGetResult() {
        return callTraceProfileGetResult;
    }

    /**
     * Sets the value of the callTraceProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallTraceProfileGetResult }
     *     
     */
    public void setCallTraceProfileGetResult(CallTraceProfileGetResult value) {
        this.callTraceProfileGetResult = value;
    }

}
