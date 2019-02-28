
package Netspan.NBI_17_0.Status;

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
 *         &lt;element name="EnbEmbmsStatusGetResult" type="{http://Airspan.Netspan.WebServices}NodeEmbmsGetResult" minOccurs="0"/&gt;
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
    "enbEmbmsStatusGetResult"
})
@XmlRootElement(name = "EnbEmbmsStatusGetResponse")
public class EnbEmbmsStatusGetResponse {

    @XmlElement(name = "EnbEmbmsStatusGetResult")
    protected NodeEmbmsGetResult enbEmbmsStatusGetResult;

    /**
     * Gets the value of the enbEmbmsStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeEmbmsGetResult }
     *     
     */
    public NodeEmbmsGetResult getEnbEmbmsStatusGetResult() {
        return enbEmbmsStatusGetResult;
    }

    /**
     * Sets the value of the enbEmbmsStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeEmbmsGetResult }
     *     
     */
    public void setEnbEmbmsStatusGetResult(NodeEmbmsGetResult value) {
        this.enbEmbmsStatusGetResult = value;
    }

}
