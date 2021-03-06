
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
 *         &lt;element name="IBridgeBaseSystemDefaultProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/&gt;
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
    "iBridgeBaseSystemDefaultProfileListResult"
})
@XmlRootElement(name = "IBridgeBaseSystemDefaultProfileListResponse")
public class IBridgeBaseSystemDefaultProfileListResponse {

    @XmlElement(name = "IBridgeBaseSystemDefaultProfileListResult")
    protected NameResult iBridgeBaseSystemDefaultProfileListResult;

    /**
     * Gets the value of the iBridgeBaseSystemDefaultProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getIBridgeBaseSystemDefaultProfileListResult() {
        return iBridgeBaseSystemDefaultProfileListResult;
    }

    /**
     * Sets the value of the iBridgeBaseSystemDefaultProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setIBridgeBaseSystemDefaultProfileListResult(NameResult value) {
        this.iBridgeBaseSystemDefaultProfileListResult = value;
    }

}
