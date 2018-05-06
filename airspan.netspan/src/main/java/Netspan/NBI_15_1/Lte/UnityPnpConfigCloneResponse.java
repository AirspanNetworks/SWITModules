
package Netspan.NBI_15_1.Lte;

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
 *         &lt;element name="UnityPnpConfigCloneResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "unityPnpConfigCloneResult"
})
@XmlRootElement(name = "UnityPnpConfigCloneResponse")
public class UnityPnpConfigCloneResponse {

    @XmlElement(name = "UnityPnpConfigCloneResult")
    protected NodeActionResult unityPnpConfigCloneResult;

    /**
     * Gets the value of the unityPnpConfigCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getUnityPnpConfigCloneResult() {
        return unityPnpConfigCloneResult;
    }

    /**
     * Sets the value of the unityPnpConfigCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setUnityPnpConfigCloneResult(NodeActionResult value) {
        this.unityPnpConfigCloneResult = value;
    }

}
