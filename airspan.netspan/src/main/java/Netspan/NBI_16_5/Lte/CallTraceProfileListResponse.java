
package Netspan.NBI_16_5.Lte;

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
 *         &lt;element name="CallTraceProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/&gt;
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
    "callTraceProfileListResult"
})
@XmlRootElement(name = "CallTraceProfileListResponse")
public class CallTraceProfileListResponse {

    @XmlElement(name = "CallTraceProfileListResult")
    protected NameResult callTraceProfileListResult;

    /**
     * Gets the value of the callTraceProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getCallTraceProfileListResult() {
        return callTraceProfileListResult;
    }

    /**
     * Sets the value of the callTraceProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setCallTraceProfileListResult(NameResult value) {
        this.callTraceProfileListResult = value;
    }

}
