
package Netspan.NBI_15_2.Lte;

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
 *         &lt;element name="PnpConfigUpdateResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "pnpConfigUpdateResult"
})
@XmlRootElement(name = "PnpConfigUpdateResponse")
public class PnpConfigUpdateResponse {

    @XmlElement(name = "PnpConfigUpdateResult")
    protected NodeActionResult pnpConfigUpdateResult;

    /**
     * Gets the value of the pnpConfigUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getPnpConfigUpdateResult() {
        return pnpConfigUpdateResult;
    }

    /**
     * Sets the value of the pnpConfigUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setPnpConfigUpdateResult(NodeActionResult value) {
        this.pnpConfigUpdateResult = value;
    }

}
