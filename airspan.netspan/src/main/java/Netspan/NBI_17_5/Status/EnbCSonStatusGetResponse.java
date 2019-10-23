
package Netspan.NBI_17_5.Status;

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
 *         &lt;element name="EnbCSonStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteSonMcimGetResult" minOccurs="0"/&gt;
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
    "enbCSonStatusGetResult"
})
@XmlRootElement(name = "EnbCSonStatusGetResponse")
public class EnbCSonStatusGetResponse {

    @XmlElement(name = "EnbCSonStatusGetResult")
    protected LteSonMcimGetResult enbCSonStatusGetResult;

    /**
     * Gets the value of the enbCSonStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonMcimGetResult }
     *     
     */
    public LteSonMcimGetResult getEnbCSonStatusGetResult() {
        return enbCSonStatusGetResult;
    }

    /**
     * Sets the value of the enbCSonStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonMcimGetResult }
     *     
     */
    public void setEnbCSonStatusGetResult(LteSonMcimGetResult value) {
        this.enbCSonStatusGetResult = value;
    }

}
