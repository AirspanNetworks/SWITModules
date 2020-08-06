
package Netspan.NBI_18_0.Backhaul;

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
 *         &lt;element name="IBridge2WebUiAccessSetResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "iBridge2WebUiAccessSetResult"
})
@XmlRootElement(name = "IBridge2WebUiAccessSetResponse")
public class IBridge2WebUiAccessSetResponse {

    @XmlElement(name = "IBridge2WebUiAccessSetResult")
    protected NodeActionResult iBridge2WebUiAccessSetResult;

    /**
     * Gets the value of the iBridge2WebUiAccessSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getIBridge2WebUiAccessSetResult() {
        return iBridge2WebUiAccessSetResult;
    }

    /**
     * Sets the value of the iBridge2WebUiAccessSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setIBridge2WebUiAccessSetResult(NodeActionResult value) {
        this.iBridge2WebUiAccessSetResult = value;
    }

}
