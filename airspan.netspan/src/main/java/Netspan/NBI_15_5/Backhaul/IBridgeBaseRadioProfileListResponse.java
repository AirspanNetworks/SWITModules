
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
 *         &lt;element name="IBridgeBaseRadioProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/>
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
    "iBridgeBaseRadioProfileListResult"
})
@XmlRootElement(name = "IBridgeBaseRadioProfileListResponse")
public class IBridgeBaseRadioProfileListResponse {

    @XmlElement(name = "IBridgeBaseRadioProfileListResult")
    protected NameResult iBridgeBaseRadioProfileListResult;

    /**
     * Gets the value of the iBridgeBaseRadioProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getIBridgeBaseRadioProfileListResult() {
        return iBridgeBaseRadioProfileListResult;
    }

    /**
     * Sets the value of the iBridgeBaseRadioProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setIBridgeBaseRadioProfileListResult(NameResult value) {
        this.iBridgeBaseRadioProfileListResult = value;
    }

}
