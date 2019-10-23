
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
 *         &lt;element name="EnbAirSonOptimizationStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteAirSonOptimizationStatusGetResult" minOccurs="0"/&gt;
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
    "enbAirSonOptimizationStatusGetResult"
})
@XmlRootElement(name = "EnbAirSonOptimizationStatusGetResponse")
public class EnbAirSonOptimizationStatusGetResponse {

    @XmlElement(name = "EnbAirSonOptimizationStatusGetResult")
    protected LteAirSonOptimizationStatusGetResult enbAirSonOptimizationStatusGetResult;

    /**
     * Gets the value of the enbAirSonOptimizationStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteAirSonOptimizationStatusGetResult }
     *     
     */
    public LteAirSonOptimizationStatusGetResult getEnbAirSonOptimizationStatusGetResult() {
        return enbAirSonOptimizationStatusGetResult;
    }

    /**
     * Sets the value of the enbAirSonOptimizationStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteAirSonOptimizationStatusGetResult }
     *     
     */
    public void setEnbAirSonOptimizationStatusGetResult(LteAirSonOptimizationStatusGetResult value) {
        this.enbAirSonOptimizationStatusGetResult = value;
    }

}
