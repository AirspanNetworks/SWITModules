
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
 *         &lt;element name="Cdma2k" type="{http://Airspan.Netspan.WebServices}Cdma2kWs" minOccurs="0"/>
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
    "cdma2K"
})
@XmlRootElement(name = "Cdma2000Create")
public class Cdma2000Create {

    @XmlElement(name = "Cdma2k")
    protected Cdma2KWs cdma2K;

    /**
     * Gets the value of the cdma2K property.
     * 
     * @return
     *     possible object is
     *     {@link Cdma2KWs }
     *     
     */
    public Cdma2KWs getCdma2K() {
        return cdma2K;
    }

    /**
     * Sets the value of the cdma2K property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cdma2KWs }
     *     
     */
    public void setCdma2K(Cdma2KWs value) {
        this.cdma2K = value;
    }

}
