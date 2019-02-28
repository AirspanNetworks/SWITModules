
package Netspan.NBI_17_0.Lte;

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
 *         &lt;element name="PnpConfigConvertFromNodeResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "pnpConfigConvertFromNodeResult"
})
@XmlRootElement(name = "PnpConfigConvertFromNodeResponse")
public class PnpConfigConvertFromNodeResponse {

    @XmlElement(name = "PnpConfigConvertFromNodeResult")
    protected NodeActionResult pnpConfigConvertFromNodeResult;

    /**
     * Gets the value of the pnpConfigConvertFromNodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getPnpConfigConvertFromNodeResult() {
        return pnpConfigConvertFromNodeResult;
    }

    /**
     * Sets the value of the pnpConfigConvertFromNodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setPnpConfigConvertFromNodeResult(NodeActionResult value) {
        this.pnpConfigConvertFromNodeResult = value;
    }

}
