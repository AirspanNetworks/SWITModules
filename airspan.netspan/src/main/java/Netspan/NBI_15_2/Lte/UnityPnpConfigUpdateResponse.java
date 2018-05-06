
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnityPnpConfigUpdateResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "unityPnpConfigUpdateResult"
})
@XmlRootElement(name = "UnityPnpConfigUpdateResponse")
public class UnityPnpConfigUpdateResponse {

    @XmlElement(name = "UnityPnpConfigUpdateResult")
    protected NodeActionResult unityPnpConfigUpdateResult;

    /**
     * Gets the value of the unityPnpConfigUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getUnityPnpConfigUpdateResult() {
        return unityPnpConfigUpdateResult;
    }

    /**
     * Sets the value of the unityPnpConfigUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setUnityPnpConfigUpdateResult(NodeActionResult value) {
        this.unityPnpConfigUpdateResult = value;
    }

}
