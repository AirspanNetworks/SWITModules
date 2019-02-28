
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
 *         &lt;element name="Ib440InterfaceStatusGetResult" type="{http://Airspan.Netspan.WebServices}Ib440InterfaceGetResult" minOccurs="0"/&gt;
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
    "ib440InterfaceStatusGetResult"
})
@XmlRootElement(name = "Ib440InterfaceStatusGetResponse")
public class Ib440InterfaceStatusGetResponse {

    @XmlElement(name = "Ib440InterfaceStatusGetResult")
    protected Ib440InterfaceGetResult ib440InterfaceStatusGetResult;

    /**
     * Gets the value of the ib440InterfaceStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Ib440InterfaceGetResult }
     *     
     */
    public Ib440InterfaceGetResult getIb440InterfaceStatusGetResult() {
        return ib440InterfaceStatusGetResult;
    }

    /**
     * Sets the value of the ib440InterfaceStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ib440InterfaceGetResult }
     *     
     */
    public void setIb440InterfaceStatusGetResult(Ib440InterfaceGetResult value) {
        this.ib440InterfaceStatusGetResult = value;
    }

}
