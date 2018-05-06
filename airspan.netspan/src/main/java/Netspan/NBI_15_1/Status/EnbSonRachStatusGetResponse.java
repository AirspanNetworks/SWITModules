
package Netspan.NBI_15_1.Status;

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
 *         &lt;element name="EnbSonRachStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteSonRachGetResult" minOccurs="0"/>
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
    "enbSonRachStatusGetResult"
})
@XmlRootElement(name = "EnbSonRachStatusGetResponse")
public class EnbSonRachStatusGetResponse {

    @XmlElement(name = "EnbSonRachStatusGetResult")
    protected LteSonRachGetResult enbSonRachStatusGetResult;

    /**
     * Gets the value of the enbSonRachStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonRachGetResult }
     *     
     */
    public LteSonRachGetResult getEnbSonRachStatusGetResult() {
        return enbSonRachStatusGetResult;
    }

    /**
     * Sets the value of the enbSonRachStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonRachGetResult }
     *     
     */
    public void setEnbSonRachStatusGetResult(LteSonRachGetResult value) {
        this.enbSonRachStatusGetResult = value;
    }

}
