
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
 *         &lt;element name="EnbResetRequiredStatusGetResult" type="{http://Airspan.Netspan.WebServices}EnbResetRequiredStatusGetResult" minOccurs="0"/>
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
    "enbResetRequiredStatusGetResult"
})
@XmlRootElement(name = "EnbResetRequiredStatusGetResponse")
public class EnbResetRequiredStatusGetResponse {

    @XmlElement(name = "EnbResetRequiredStatusGetResult")
    protected EnbResetRequiredStatusGetResult enbResetRequiredStatusGetResult;

    /**
     * Gets the value of the enbResetRequiredStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link EnbResetRequiredStatusGetResult }
     *     
     */
    public EnbResetRequiredStatusGetResult getEnbResetRequiredStatusGetResult() {
        return enbResetRequiredStatusGetResult;
    }

    /**
     * Sets the value of the enbResetRequiredStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbResetRequiredStatusGetResult }
     *     
     */
    public void setEnbResetRequiredStatusGetResult(EnbResetRequiredStatusGetResult value) {
        this.enbResetRequiredStatusGetResult = value;
    }

}
