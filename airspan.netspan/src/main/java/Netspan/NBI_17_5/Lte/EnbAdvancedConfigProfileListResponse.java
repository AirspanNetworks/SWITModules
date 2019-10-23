
package Netspan.NBI_17_5.Lte;

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
 *         &lt;element name="EnbAdvancedConfigProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/&gt;
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
    "enbAdvancedConfigProfileListResult"
})
@XmlRootElement(name = "EnbAdvancedConfigProfileListResponse")
public class EnbAdvancedConfigProfileListResponse {

    @XmlElement(name = "EnbAdvancedConfigProfileListResult")
    protected NameResult enbAdvancedConfigProfileListResult;

    /**
     * Gets the value of the enbAdvancedConfigProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getEnbAdvancedConfigProfileListResult() {
        return enbAdvancedConfigProfileListResult;
    }

    /**
     * Sets the value of the enbAdvancedConfigProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setEnbAdvancedConfigProfileListResult(NameResult value) {
        this.enbAdvancedConfigProfileListResult = value;
    }

}
