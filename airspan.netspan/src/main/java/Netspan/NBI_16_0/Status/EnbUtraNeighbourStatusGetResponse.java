
package Netspan.NBI_16_0.Status;

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
 *         &lt;element name="EnbUtraNeighbourStatusGetResult" type="{http://Airspan.Netspan.WebServices}EnbUtraNeighbourStatusGetResult" minOccurs="0"/>
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
    "enbUtraNeighbourStatusGetResult"
})
@XmlRootElement(name = "EnbUtraNeighbourStatusGetResponse")
public class EnbUtraNeighbourStatusGetResponse {

    @XmlElement(name = "EnbUtraNeighbourStatusGetResult")
    protected EnbUtraNeighbourStatusGetResult enbUtraNeighbourStatusGetResult;

    /**
     * Gets the value of the enbUtraNeighbourStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link EnbUtraNeighbourStatusGetResult }
     *     
     */
    public EnbUtraNeighbourStatusGetResult getEnbUtraNeighbourStatusGetResult() {
        return enbUtraNeighbourStatusGetResult;
    }

    /**
     * Sets the value of the enbUtraNeighbourStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbUtraNeighbourStatusGetResult }
     *     
     */
    public void setEnbUtraNeighbourStatusGetResult(EnbUtraNeighbourStatusGetResult value) {
        this.enbUtraNeighbourStatusGetResult = value;
    }

}
