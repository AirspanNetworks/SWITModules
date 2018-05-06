
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
 *         &lt;element name="EnbConnectedUeStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteUeGetResult" minOccurs="0"/>
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
    "enbConnectedUeStatusGetResult"
})
@XmlRootElement(name = "EnbConnectedUeStatusGetResponse")
public class EnbConnectedUeStatusGetResponse {

    @XmlElement(name = "EnbConnectedUeStatusGetResult")
    protected LteUeGetResult enbConnectedUeStatusGetResult;

    /**
     * Gets the value of the enbConnectedUeStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteUeGetResult }
     *     
     */
    public LteUeGetResult getEnbConnectedUeStatusGetResult() {
        return enbConnectedUeStatusGetResult;
    }

    /**
     * Sets the value of the enbConnectedUeStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteUeGetResult }
     *     
     */
    public void setEnbConnectedUeStatusGetResult(LteUeGetResult value) {
        this.enbConnectedUeStatusGetResult = value;
    }

}
