
package Netspan.NBI_16_5.Backhaul;

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
 *         &lt;element name="Ib440ConfigSetResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "ib440ConfigSetResult"
})
@XmlRootElement(name = "Ib440ConfigSetResponse")
public class Ib440ConfigSetResponse {

    @XmlElement(name = "Ib440ConfigSetResult")
    protected NodeActionResult ib440ConfigSetResult;

    /**
     * Gets the value of the ib440ConfigSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIb440ConfigSetResult() {
        return ib440ConfigSetResult;
    }

    /**
     * Sets the value of the ib440ConfigSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIb440ConfigSetResult(NodeActionResult value) {
        this.ib440ConfigSetResult = value;
    }

}
