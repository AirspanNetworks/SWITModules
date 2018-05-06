
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
 *         &lt;element name="Cdma2000DeleteResult" type="{http://Airspan.Netspan.WebServices}Cdma2kResponse" minOccurs="0"/>
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
    "cdma2000DeleteResult"
})
@XmlRootElement(name = "Cdma2000DeleteResponse")
public class Cdma2000DeleteResponse {

    @XmlElement(name = "Cdma2000DeleteResult")
    protected Cdma2KResponse cdma2000DeleteResult;

    /**
     * Gets the value of the cdma2000DeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link Cdma2KResponse }
     *     
     */
    public Cdma2KResponse getCdma2000DeleteResult() {
        return cdma2000DeleteResult;
    }

    /**
     * Sets the value of the cdma2000DeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cdma2KResponse }
     *     
     */
    public void setCdma2000DeleteResult(Cdma2KResponse value) {
        this.cdma2000DeleteResult = value;
    }

}
