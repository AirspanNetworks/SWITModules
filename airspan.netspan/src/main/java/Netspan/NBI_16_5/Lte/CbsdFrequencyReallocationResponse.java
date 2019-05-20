
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
 *         &lt;element name="CbsdFrequencyReallocationResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "cbsdFrequencyReallocationResult"
})
@XmlRootElement(name = "CbsdFrequencyReallocationResponse")
public class CbsdFrequencyReallocationResponse {

    @XmlElement(name = "CbsdFrequencyReallocationResult")
    protected NodeActionResult cbsdFrequencyReallocationResult;

    /**
     * Gets the value of the cbsdFrequencyReallocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getCbsdFrequencyReallocationResult() {
        return cbsdFrequencyReallocationResult;
    }

    /**
     * Sets the value of the cbsdFrequencyReallocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setCbsdFrequencyReallocationResult(NodeActionResult value) {
        this.cbsdFrequencyReallocationResult = value;
    }

}
