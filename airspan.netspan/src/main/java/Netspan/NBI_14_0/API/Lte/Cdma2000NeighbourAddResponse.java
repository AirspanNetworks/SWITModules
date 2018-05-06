
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
 *         &lt;element name="Cdma2000NeighbourAddResult" type="{http://Airspan.Netspan.WebServices}LteNeighbourResponse" minOccurs="0"/>
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
    "cdma2000NeighbourAddResult"
})
@XmlRootElement(name = "Cdma2000NeighbourAddResponse")
public class Cdma2000NeighbourAddResponse {

    @XmlElement(name = "Cdma2000NeighbourAddResult")
    protected LteNeighbourResponse cdma2000NeighbourAddResult;

    /**
     * Gets the value of the cdma2000NeighbourAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteNeighbourResponse }
     *     
     */
    public LteNeighbourResponse getCdma2000NeighbourAddResult() {
        return cdma2000NeighbourAddResult;
    }

    /**
     * Sets the value of the cdma2000NeighbourAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNeighbourResponse }
     *     
     */
    public void setCdma2000NeighbourAddResult(LteNeighbourResponse value) {
        this.cdma2000NeighbourAddResult = value;
    }

}
