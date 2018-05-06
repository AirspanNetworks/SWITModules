
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelayCdclListGetResult" type="{http://Airspan.Netspan.WebServices}RelayCdclListGetResult" minOccurs="0"/>
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
    "relayCdclListGetResult"
})
@XmlRootElement(name = "RelayCdclListGetResponse")
public class RelayCdclListGetResponse {

    @XmlElement(name = "RelayCdclListGetResult")
    protected RelayCdclListGetResult relayCdclListGetResult;

    /**
     * Gets the value of the relayCdclListGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayCdclListGetResult }
     *     
     */
    public RelayCdclListGetResult getRelayCdclListGetResult() {
        return relayCdclListGetResult;
    }

    /**
     * Sets the value of the relayCdclListGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayCdclListGetResult }
     *     
     */
    public void setRelayCdclListGetResult(RelayCdclListGetResult value) {
        this.relayCdclListGetResult = value;
    }

}
