
package Netspan.NBI_17_5.Backhaul;

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
 *         &lt;element name="Ib440QosProfileGetResult" type="{http://Airspan.Netspan.WebServices}Ib440ProfileGetResult" minOccurs="0"/&gt;
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
    "ib440QosProfileGetResult"
})
@XmlRootElement(name = "Ib440QosProfileGetResponse")
public class Ib440QosProfileGetResponse {

    @XmlElement(name = "Ib440QosProfileGetResult")
    protected Ib440ProfileGetResult ib440QosProfileGetResult;

    /**
     * Gets the value of the ib440QosProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Ib440ProfileGetResult }
     *     
     */
    public Ib440ProfileGetResult getIb440QosProfileGetResult() {
        return ib440QosProfileGetResult;
    }

    /**
     * Sets the value of the ib440QosProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ib440ProfileGetResult }
     *     
     */
    public void setIb440QosProfileGetResult(Ib440ProfileGetResult value) {
        this.ib440QosProfileGetResult = value;
    }

}
