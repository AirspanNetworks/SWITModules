
package Netspan.NBI_16_5.Backhaul;

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
 *         &lt;element name="Ib440ConfigGetResult" type="{http://Airspan.Netspan.WebServices}Ib440ConfigGetResult" minOccurs="0"/&gt;
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
    "ib440ConfigGetResult"
})
@XmlRootElement(name = "Ib440ConfigGetResponse")
public class Ib440ConfigGetResponse {

    @XmlElement(name = "Ib440ConfigGetResult")
    protected Ib440ConfigGetResult ib440ConfigGetResult;

    /**
     * Gets the value of the ib440ConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Ib440ConfigGetResult }
     *     
     */
    public Ib440ConfigGetResult getIb440ConfigGetResult() {
        return ib440ConfigGetResult;
    }

    /**
     * Sets the value of the ib440ConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ib440ConfigGetResult }
     *     
     */
    public void setIb440ConfigGetResult(Ib440ConfigGetResult value) {
        this.ib440ConfigGetResult = value;
    }

}
