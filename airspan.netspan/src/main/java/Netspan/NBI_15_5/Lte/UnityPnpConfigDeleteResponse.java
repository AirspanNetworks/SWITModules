
package Netspan.NBI_15_5.Lte;

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
 *         &lt;element name="UnityPnpConfigDeleteResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "unityPnpConfigDeleteResult"
})
@XmlRootElement(name = "UnityPnpConfigDeleteResponse")
public class UnityPnpConfigDeleteResponse {

    @XmlElement(name = "UnityPnpConfigDeleteResult")
    protected NodeActionResult unityPnpConfigDeleteResult;

    /**
     * Gets the value of the unityPnpConfigDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getUnityPnpConfigDeleteResult() {
        return unityPnpConfigDeleteResult;
    }

    /**
     * Sets the value of the unityPnpConfigDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setUnityPnpConfigDeleteResult(NodeActionResult value) {
        this.unityPnpConfigDeleteResult = value;
    }

}
