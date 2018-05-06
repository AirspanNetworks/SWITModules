
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
 *         &lt;element name="IRelayConfigGetResult" type="{http://Airspan.Netspan.WebServices}IRelayConfigGetResult" minOccurs="0"/>
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
    "iRelayConfigGetResult"
})
@XmlRootElement(name = "IRelayConfigGetResponse")
public class IRelayConfigGetResponse {

    @XmlElement(name = "IRelayConfigGetResult")
    protected IRelayConfigGetResult iRelayConfigGetResult;

    /**
     * Gets the value of the iRelayConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IRelayConfigGetResult }
     *     
     */
    public IRelayConfigGetResult getIRelayConfigGetResult() {
        return iRelayConfigGetResult;
    }

    /**
     * Sets the value of the iRelayConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IRelayConfigGetResult }
     *     
     */
    public void setIRelayConfigGetResult(IRelayConfigGetResult value) {
        this.iRelayConfigGetResult = value;
    }

}
