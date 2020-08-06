
package Netspan.NBI_18_0.Lte;

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
 *         &lt;element name="EnbFromEcgiGetResult" type="{http://Airspan.Netspan.WebServices}NodeEnodebIdResult" minOccurs="0"/&gt;
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
    "enbFromEcgiGetResult"
})
@XmlRootElement(name = "EnbFromEcgiGetResponse")
public class EnbFromEcgiGetResponse {

    @XmlElement(name = "EnbFromEcgiGetResult")
    protected NodeEnodebIdResult enbFromEcgiGetResult;

    /**
     * Gets the value of the enbFromEcgiGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeEnodebIdResult }
     *     
     */
    public NodeEnodebIdResult getEnbFromEcgiGetResult() {
        return enbFromEcgiGetResult;
    }

    /**
     * Sets the value of the enbFromEcgiGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeEnodebIdResult }
     *     
     */
    public void setEnbFromEcgiGetResult(NodeEnodebIdResult value) {
        this.enbFromEcgiGetResult = value;
    }

}
