
package Netspan.NBI_14_50.API.Backhaul;

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
 *         &lt;element name="IRelayProfileGetResult" type="{http://Airspan.Netspan.WebServices}IRelayProfileGetResult" minOccurs="0"/>
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
    "iRelayProfileGetResult"
})
@XmlRootElement(name = "IRelayProfileGetResponse")
public class IRelayProfileGetResponse {

    @XmlElement(name = "IRelayProfileGetResult")
    protected IRelayProfileGetResult iRelayProfileGetResult;

    /**
     * Gets the value of the iRelayProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IRelayProfileGetResult }
     *     
     */
    public IRelayProfileGetResult getIRelayProfileGetResult() {
        return iRelayProfileGetResult;
    }

    /**
     * Sets the value of the iRelayProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IRelayProfileGetResult }
     *     
     */
    public void setIRelayProfileGetResult(IRelayProfileGetResult value) {
        this.iRelayProfileGetResult = value;
    }

}
