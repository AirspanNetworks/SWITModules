
package Netspan.NBI_18_0.Backhaul;

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
 *         &lt;element name="IBridge2QosProfileGetResult" type="{http://Airspan.Netspan.WebServices}IBridge2QosProfileGetResult" minOccurs="0"/&gt;
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
    "iBridge2QosProfileGetResult"
})
@XmlRootElement(name = "IBridge2QosProfileGetResponse")
public class IBridge2QosProfileGetResponse {

    @XmlElement(name = "IBridge2QosProfileGetResult")
    protected IBridge2QosProfileGetResult iBridge2QosProfileGetResult;

    /**
     * Gets the value of the iBridge2QosProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2QosProfileGetResult }
     *     
     */
    public IBridge2QosProfileGetResult getIBridge2QosProfileGetResult() {
        return iBridge2QosProfileGetResult;
    }

    /**
     * Sets the value of the iBridge2QosProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2QosProfileGetResult }
     *     
     */
    public void setIBridge2QosProfileGetResult(IBridge2QosProfileGetResult value) {
        this.iBridge2QosProfileGetResult = value;
    }

}
