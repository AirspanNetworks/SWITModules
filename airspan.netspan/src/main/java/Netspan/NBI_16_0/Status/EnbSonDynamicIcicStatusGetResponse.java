
package Netspan.NBI_16_0.Status;

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
 *         &lt;element name="EnbSonDynamicIcicStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteSonDynamicIcicGetResult" minOccurs="0"/>
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
    "enbSonDynamicIcicStatusGetResult"
})
@XmlRootElement(name = "EnbSonDynamicIcicStatusGetResponse")
public class EnbSonDynamicIcicStatusGetResponse {

    @XmlElement(name = "EnbSonDynamicIcicStatusGetResult")
    protected LteSonDynamicIcicGetResult enbSonDynamicIcicStatusGetResult;

    /**
     * Gets the value of the enbSonDynamicIcicStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonDynamicIcicGetResult }
     *     
     */
    public LteSonDynamicIcicGetResult getEnbSonDynamicIcicStatusGetResult() {
        return enbSonDynamicIcicStatusGetResult;
    }

    /**
     * Sets the value of the enbSonDynamicIcicStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonDynamicIcicGetResult }
     *     
     */
    public void setEnbSonDynamicIcicStatusGetResult(LteSonDynamicIcicGetResult value) {
        this.enbSonDynamicIcicStatusGetResult = value;
    }

}
