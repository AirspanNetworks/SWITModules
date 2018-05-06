
package Netspan.NBI_15_1.Backhaul;

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
 *         &lt;element name="IBridgeTermRadioProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/>
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
    "iBridgeTermRadioProfileListResult"
})
@XmlRootElement(name = "IBridgeTermRadioProfileListResponse")
public class IBridgeTermRadioProfileListResponse {

    @XmlElement(name = "IBridgeTermRadioProfileListResult")
    protected NameResult iBridgeTermRadioProfileListResult;

    /**
     * Gets the value of the iBridgeTermRadioProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getIBridgeTermRadioProfileListResult() {
        return iBridgeTermRadioProfileListResult;
    }

    /**
     * Sets the value of the iBridgeTermRadioProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setIBridgeTermRadioProfileListResult(NameResult value) {
        this.iBridgeTermRadioProfileListResult = value;
    }

}
