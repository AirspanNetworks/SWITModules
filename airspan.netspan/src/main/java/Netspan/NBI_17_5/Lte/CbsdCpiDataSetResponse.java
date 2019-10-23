
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
 *         &lt;element name="CbsdCpiDataSetResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "cbsdCpiDataSetResult"
})
@XmlRootElement(name = "CbsdCpiDataSetResponse")
public class CbsdCpiDataSetResponse {

    @XmlElement(name = "CbsdCpiDataSetResult")
    protected NodeActionResult cbsdCpiDataSetResult;

    /**
     * Gets the value of the cbsdCpiDataSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getCbsdCpiDataSetResult() {
        return cbsdCpiDataSetResult;
    }

    /**
     * Sets the value of the cbsdCpiDataSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setCbsdCpiDataSetResult(NodeActionResult value) {
        this.cbsdCpiDataSetResult = value;
    }

}
