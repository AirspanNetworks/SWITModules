
package Netspan.NBI_17_5.Status;

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
 *         &lt;element name="EnbBhQosStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteBhQosGetResult" minOccurs="0"/&gt;
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
    "enbBhQosStatusGetResult"
})
@XmlRootElement(name = "EnbBhQosStatusGetResponse")
public class EnbBhQosStatusGetResponse {

    @XmlElement(name = "EnbBhQosStatusGetResult")
    protected LteBhQosGetResult enbBhQosStatusGetResult;

    /**
     * Gets the value of the enbBhQosStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteBhQosGetResult }
     *     
     */
    public LteBhQosGetResult getEnbBhQosStatusGetResult() {
        return enbBhQosStatusGetResult;
    }

    /**
     * Sets the value of the enbBhQosStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteBhQosGetResult }
     *     
     */
    public void setEnbBhQosStatusGetResult(LteBhQosGetResult value) {
        this.enbBhQosStatusGetResult = value;
    }

}
