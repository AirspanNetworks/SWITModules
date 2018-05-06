
package Netspan.NBI_14_50.API.Status;

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
 *         &lt;element name="Ib440RfStatusGetResult" type="{http://Airspan.Netspan.WebServices}Ib440RfGetResult" minOccurs="0"/>
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
    "ib440RfStatusGetResult"
})
@XmlRootElement(name = "Ib440RfStatusGetResponse")
public class Ib440RfStatusGetResponse {

    @XmlElement(name = "Ib440RfStatusGetResult")
    protected Ib440RfGetResult ib440RfStatusGetResult;

    /**
     * Gets the value of the ib440RfStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Ib440RfGetResult }
     *     
     */
    public Ib440RfGetResult getIb440RfStatusGetResult() {
        return ib440RfStatusGetResult;
    }

    /**
     * Sets the value of the ib440RfStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ib440RfGetResult }
     *     
     */
    public void setIb440RfStatusGetResult(Ib440RfGetResult value) {
        this.ib440RfStatusGetResult = value;
    }

}
