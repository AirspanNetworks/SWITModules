
package Netspan.NBI_14_0.API.Lte;

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
 *         &lt;element name="Cdma2000CloneResult" type="{http://Airspan.Netspan.WebServices}Cdma2kResponse" minOccurs="0"/>
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
    "cdma2000CloneResult"
})
@XmlRootElement(name = "Cdma2000CloneResponse")
public class Cdma2000CloneResponse {

    @XmlElement(name = "Cdma2000CloneResult")
    protected Cdma2KResponse cdma2000CloneResult;

    /**
     * Gets the value of the cdma2000CloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link Cdma2KResponse }
     *     
     */
    public Cdma2KResponse getCdma2000CloneResult() {
        return cdma2000CloneResult;
    }

    /**
     * Sets the value of the cdma2000CloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cdma2KResponse }
     *     
     */
    public void setCdma2000CloneResult(Cdma2KResponse value) {
        this.cdma2000CloneResult = value;
    }

}
