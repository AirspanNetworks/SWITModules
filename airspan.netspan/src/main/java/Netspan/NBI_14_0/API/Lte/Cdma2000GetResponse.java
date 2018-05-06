
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
 *         &lt;element name="Cdma2000GetResult" type="{http://Airspan.Netspan.WebServices}Cdma2kGetResult" minOccurs="0"/>
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
    "cdma2000GetResult"
})
@XmlRootElement(name = "Cdma2000GetResponse")
public class Cdma2000GetResponse {

    @XmlElement(name = "Cdma2000GetResult")
    protected Cdma2KGetResult cdma2000GetResult;

    /**
     * Gets the value of the cdma2000GetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Cdma2KGetResult }
     *     
     */
    public Cdma2KGetResult getCdma2000GetResult() {
        return cdma2000GetResult;
    }

    /**
     * Sets the value of the cdma2000GetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cdma2KGetResult }
     *     
     */
    public void setCdma2000GetResult(Cdma2KGetResult value) {
        this.cdma2000GetResult = value;
    }

}
