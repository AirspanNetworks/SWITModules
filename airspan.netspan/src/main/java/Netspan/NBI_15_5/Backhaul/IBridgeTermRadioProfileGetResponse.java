
package Netspan.NBI_15_5.Backhaul;

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
 *         &lt;element name="IBridgeTermRadioProfileGetResult" type="{http://Airspan.Netspan.WebServices}IbTermRadioProfileGetResult" minOccurs="0"/>
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
    "iBridgeTermRadioProfileGetResult"
})
@XmlRootElement(name = "IBridgeTermRadioProfileGetResponse")
public class IBridgeTermRadioProfileGetResponse {

    @XmlElement(name = "IBridgeTermRadioProfileGetResult")
    protected IbTermRadioProfileGetResult iBridgeTermRadioProfileGetResult;

    /**
     * Gets the value of the iBridgeTermRadioProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IbTermRadioProfileGetResult }
     *     
     */
    public IbTermRadioProfileGetResult getIBridgeTermRadioProfileGetResult() {
        return iBridgeTermRadioProfileGetResult;
    }

    /**
     * Sets the value of the iBridgeTermRadioProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbTermRadioProfileGetResult }
     *     
     */
    public void setIBridgeTermRadioProfileGetResult(IbTermRadioProfileGetResult value) {
        this.iBridgeTermRadioProfileGetResult = value;
    }

}
