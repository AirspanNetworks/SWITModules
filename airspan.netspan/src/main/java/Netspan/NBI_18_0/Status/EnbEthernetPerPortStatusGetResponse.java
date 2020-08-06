
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
 *         &lt;element name="EnbEthernetPerPortStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteEthernetPerPortStatusGetResult" minOccurs="0"/&gt;
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
    "enbEthernetPerPortStatusGetResult"
})
@XmlRootElement(name = "EnbEthernetPerPortStatusGetResponse")
public class EnbEthernetPerPortStatusGetResponse {

    @XmlElement(name = "EnbEthernetPerPortStatusGetResult")
    protected LteEthernetPerPortStatusGetResult enbEthernetPerPortStatusGetResult;

    /**
     * Gets the value of the enbEthernetPerPortStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteEthernetPerPortStatusGetResult }
     *     
     */
    public LteEthernetPerPortStatusGetResult getEnbEthernetPerPortStatusGetResult() {
        return enbEthernetPerPortStatusGetResult;
    }

    /**
     * Sets the value of the enbEthernetPerPortStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteEthernetPerPortStatusGetResult }
     *     
     */
    public void setEnbEthernetPerPortStatusGetResult(LteEthernetPerPortStatusGetResult value) {
        this.enbEthernetPerPortStatusGetResult = value;
    }

}
