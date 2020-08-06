
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
 *         &lt;element name="IBridge2InterfaceStatusGetResult" type="{http://Airspan.Netspan.WebServices}IBridge2InterfaceGetResult" minOccurs="0"/&gt;
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
    "iBridge2InterfaceStatusGetResult"
})
@XmlRootElement(name = "IBridge2InterfaceStatusGetResponse")
public class IBridge2InterfaceStatusGetResponse {

    @XmlElement(name = "IBridge2InterfaceStatusGetResult")
    protected IBridge2InterfaceGetResult iBridge2InterfaceStatusGetResult;

    /**
     * Gets the value of the iBridge2InterfaceStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2InterfaceGetResult }
     *     
     */
    public IBridge2InterfaceGetResult getIBridge2InterfaceStatusGetResult() {
        return iBridge2InterfaceStatusGetResult;
    }

    /**
     * Sets the value of the iBridge2InterfaceStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2InterfaceGetResult }
     *     
     */
    public void setIBridge2InterfaceStatusGetResult(IBridge2InterfaceGetResult value) {
        this.iBridge2InterfaceStatusGetResult = value;
    }

}
