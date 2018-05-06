
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
 *         &lt;element name="Cdma2000CreateResult" type="{http://Airspan.Netspan.WebServices}Cdma2kResponse" minOccurs="0"/>
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
    "cdma2000CreateResult"
})
@XmlRootElement(name = "Cdma2000CreateResponse")
public class Cdma2000CreateResponse {

    @XmlElement(name = "Cdma2000CreateResult")
    protected Cdma2KResponse cdma2000CreateResult;

    /**
     * Gets the value of the cdma2000CreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Cdma2KResponse }
     *     
     */
    public Cdma2KResponse getCdma2000CreateResult() {
        return cdma2000CreateResult;
    }

    /**
     * Sets the value of the cdma2000CreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cdma2KResponse }
     *     
     */
    public void setCdma2000CreateResult(Cdma2KResponse value) {
        this.cdma2000CreateResult = value;
    }

}
