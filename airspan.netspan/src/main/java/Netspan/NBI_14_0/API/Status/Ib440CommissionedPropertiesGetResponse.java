
package Netspan.NBI_14_0.API.Status;

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
 *         &lt;element name="Ib440CommissionedPropertiesGetResult" type="{http://Airspan.Netspan.WebServices}Ib440CommissionedPropertiesGetResult" minOccurs="0"/>
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
    "ib440CommissionedPropertiesGetResult"
})
@XmlRootElement(name = "Ib440CommissionedPropertiesGetResponse")
public class Ib440CommissionedPropertiesGetResponse {

    @XmlElement(name = "Ib440CommissionedPropertiesGetResult")
    protected Ib440CommissionedPropertiesGetResult ib440CommissionedPropertiesGetResult;

    /**
     * Gets the value of the ib440CommissionedPropertiesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Ib440CommissionedPropertiesGetResult }
     *     
     */
    public Ib440CommissionedPropertiesGetResult getIb440CommissionedPropertiesGetResult() {
        return ib440CommissionedPropertiesGetResult;
    }

    /**
     * Sets the value of the ib440CommissionedPropertiesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ib440CommissionedPropertiesGetResult }
     *     
     */
    public void setIb440CommissionedPropertiesGetResult(Ib440CommissionedPropertiesGetResult value) {
        this.ib440CommissionedPropertiesGetResult = value;
    }

}
