
package Netspan.NBI_14_50.API.Status;

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
 *         &lt;element name="IRelayStatusGetResult" type="{http://Airspan.Netspan.WebServices}IRelayStatusGetResult" minOccurs="0"/>
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
    "iRelayStatusGetResult"
})
@XmlRootElement(name = "IRelayStatusGetResponse")
public class IRelayStatusGetResponse {

    @XmlElement(name = "IRelayStatusGetResult")
    protected IRelayStatusGetResult iRelayStatusGetResult;

    /**
     * Gets the value of the iRelayStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IRelayStatusGetResult }
     *     
     */
    public IRelayStatusGetResult getIRelayStatusGetResult() {
        return iRelayStatusGetResult;
    }

    /**
     * Sets the value of the iRelayStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IRelayStatusGetResult }
     *     
     */
    public void setIRelayStatusGetResult(IRelayStatusGetResult value) {
        this.iRelayStatusGetResult = value;
    }

}
