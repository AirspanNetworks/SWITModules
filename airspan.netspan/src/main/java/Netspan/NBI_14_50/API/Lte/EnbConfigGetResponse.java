
package Netspan.NBI_14_50.API.Lte;

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
 *         &lt;element name="EnbConfigGetResult" type="{http://Airspan.Netspan.WebServices}LteEnbConfigGetResult" minOccurs="0"/>
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
    "enbConfigGetResult"
})
@XmlRootElement(name = "EnbConfigGetResponse")
public class EnbConfigGetResponse {

    @XmlElement(name = "EnbConfigGetResult")
    protected LteEnbConfigGetResult enbConfigGetResult;

    /**
     * Gets the value of the enbConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteEnbConfigGetResult }
     *     
     */
    public LteEnbConfigGetResult getEnbConfigGetResult() {
        return enbConfigGetResult;
    }

    /**
     * Sets the value of the enbConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteEnbConfigGetResult }
     *     
     */
    public void setEnbConfigGetResult(LteEnbConfigGetResult value) {
        this.enbConfigGetResult = value;
    }

}
