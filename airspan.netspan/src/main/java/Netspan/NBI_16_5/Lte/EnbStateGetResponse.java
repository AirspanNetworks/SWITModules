
package Netspan.NBI_16_5.Lte;

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
 *         &lt;element name="EnbStateGetResult" type="{http://Airspan.Netspan.WebServices}EnbStateGetResult" minOccurs="0"/&gt;
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
    "enbStateGetResult"
})
@XmlRootElement(name = "EnbStateGetResponse")
public class EnbStateGetResponse {

    @XmlElement(name = "EnbStateGetResult")
    protected EnbStateGetResult enbStateGetResult;

    /**
     * Gets the value of the enbStateGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link EnbStateGetResult }
     *     
     */
    public EnbStateGetResult getEnbStateGetResult() {
        return enbStateGetResult;
    }

    /**
     * Sets the value of the enbStateGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbStateGetResult }
     *     
     */
    public void setEnbStateGetResult(EnbStateGetResult value) {
        this.enbStateGetResult = value;
    }

}
