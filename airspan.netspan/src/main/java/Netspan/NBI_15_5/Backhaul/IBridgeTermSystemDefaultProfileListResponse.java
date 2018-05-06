
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
 *         &lt;element name="IBridgeTermSystemDefaultProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/>
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
    "iBridgeTermSystemDefaultProfileListResult"
})
@XmlRootElement(name = "IBridgeTermSystemDefaultProfileListResponse")
public class IBridgeTermSystemDefaultProfileListResponse {

    @XmlElement(name = "IBridgeTermSystemDefaultProfileListResult")
    protected NameResult iBridgeTermSystemDefaultProfileListResult;

    /**
     * Gets the value of the iBridgeTermSystemDefaultProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getIBridgeTermSystemDefaultProfileListResult() {
        return iBridgeTermSystemDefaultProfileListResult;
    }

    /**
     * Sets the value of the iBridgeTermSystemDefaultProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setIBridgeTermSystemDefaultProfileListResult(NameResult value) {
        this.iBridgeTermSystemDefaultProfileListResult = value;
    }

}
