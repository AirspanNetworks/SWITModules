
package Netspan.NBI_15_2.Status;

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
 *         &lt;element name="RelayScanListGetResult" type="{http://Airspan.Netspan.WebServices}RelayScanListGetResult" minOccurs="0"/&gt;
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
    "relayScanListGetResult"
})
@XmlRootElement(name = "RelayScanListGetResponse")
public class RelayScanListGetResponse {

    @XmlElement(name = "RelayScanListGetResult")
    protected RelayScanListGetResult relayScanListGetResult;

    /**
     * Gets the value of the relayScanListGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayScanListGetResult }
     *     
     */
    public RelayScanListGetResult getRelayScanListGetResult() {
        return relayScanListGetResult;
    }

    /**
     * Sets the value of the relayScanListGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayScanListGetResult }
     *     
     */
    public void setRelayScanListGetResult(RelayScanListGetResult value) {
        this.relayScanListGetResult = value;
    }

}
