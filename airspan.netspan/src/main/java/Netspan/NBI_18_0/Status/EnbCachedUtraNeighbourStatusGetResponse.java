
package Netspan.NBI_18_0.Status;

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
 *         &lt;element name="EnbCachedUtraNeighbourStatusGetResult" type="{http://Airspan.Netspan.WebServices}EnbUtraNeighbourStatusGetResult" minOccurs="0"/&gt;
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
    "enbCachedUtraNeighbourStatusGetResult"
})
@XmlRootElement(name = "EnbCachedUtraNeighbourStatusGetResponse")
public class EnbCachedUtraNeighbourStatusGetResponse {

    @XmlElement(name = "EnbCachedUtraNeighbourStatusGetResult")
    protected EnbUtraNeighbourStatusGetResult enbCachedUtraNeighbourStatusGetResult;

    /**
     * Gets the value of the enbCachedUtraNeighbourStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link EnbUtraNeighbourStatusGetResult }
     *     
     */
    public EnbUtraNeighbourStatusGetResult getEnbCachedUtraNeighbourStatusGetResult() {
        return enbCachedUtraNeighbourStatusGetResult;
    }

    /**
     * Sets the value of the enbCachedUtraNeighbourStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbUtraNeighbourStatusGetResult }
     *     
     */
    public void setEnbCachedUtraNeighbourStatusGetResult(EnbUtraNeighbourStatusGetResult value) {
        this.enbCachedUtraNeighbourStatusGetResult = value;
    }

}
