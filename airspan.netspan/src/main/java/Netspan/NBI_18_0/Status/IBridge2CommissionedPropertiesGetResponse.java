
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
 *         &lt;element name="IBridge2CommissionedPropertiesGetResult" type="{http://Airspan.Netspan.WebServices}IBridge2CommissionedPropertiesGetResult" minOccurs="0"/&gt;
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
    "iBridge2CommissionedPropertiesGetResult"
})
@XmlRootElement(name = "IBridge2CommissionedPropertiesGetResponse")
public class IBridge2CommissionedPropertiesGetResponse {

    @XmlElement(name = "IBridge2CommissionedPropertiesGetResult")
    protected IBridge2CommissionedPropertiesGetResult iBridge2CommissionedPropertiesGetResult;

    /**
     * Gets the value of the iBridge2CommissionedPropertiesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2CommissionedPropertiesGetResult }
     *     
     */
    public IBridge2CommissionedPropertiesGetResult getIBridge2CommissionedPropertiesGetResult() {
        return iBridge2CommissionedPropertiesGetResult;
    }

    /**
     * Sets the value of the iBridge2CommissionedPropertiesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2CommissionedPropertiesGetResult }
     *     
     */
    public void setIBridge2CommissionedPropertiesGetResult(IBridge2CommissionedPropertiesGetResult value) {
        this.iBridge2CommissionedPropertiesGetResult = value;
    }

}
