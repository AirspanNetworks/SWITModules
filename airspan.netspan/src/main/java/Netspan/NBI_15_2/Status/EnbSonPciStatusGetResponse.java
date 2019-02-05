
package Netspan.NBI_15_2.Status;

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
 *         &lt;element name="EnbSonPciStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteSonPciGetResult" minOccurs="0"/&gt;
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
    "enbSonPciStatusGetResult"
})
@XmlRootElement(name = "EnbSonPciStatusGetResponse")
public class EnbSonPciStatusGetResponse {

    @XmlElement(name = "EnbSonPciStatusGetResult")
    protected LteSonPciGetResult enbSonPciStatusGetResult;

    /**
     * Gets the value of the enbSonPciStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonPciGetResult }
     *     
     */
    public LteSonPciGetResult getEnbSonPciStatusGetResult() {
        return enbSonPciStatusGetResult;
    }

    /**
     * Sets the value of the enbSonPciStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonPciGetResult }
     *     
     */
    public void setEnbSonPciStatusGetResult(LteSonPciGetResult value) {
        this.enbSonPciStatusGetResult = value;
    }

}
