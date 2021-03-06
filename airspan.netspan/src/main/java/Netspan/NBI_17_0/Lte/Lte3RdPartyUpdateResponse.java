
package Netspan.NBI_17_0.Lte;

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
 *         &lt;element name="Lte3rdPartyUpdateResult" type="{http://Airspan.Netspan.WebServices}Lte3rdPartyResponse" minOccurs="0"/&gt;
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
    "lte3RdPartyUpdateResult"
})
@XmlRootElement(name = "Lte3rdPartyUpdateResponse")
public class Lte3RdPartyUpdateResponse {

    @XmlElement(name = "Lte3rdPartyUpdateResult")
    protected Lte3RdPartyResponse lte3RdPartyUpdateResult;

    /**
     * Gets the value of the lte3RdPartyUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Lte3RdPartyResponse }
     *     
     */
    public Lte3RdPartyResponse getLte3RdPartyUpdateResult() {
        return lte3RdPartyUpdateResult;
    }

    /**
     * Sets the value of the lte3RdPartyUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lte3RdPartyResponse }
     *     
     */
    public void setLte3RdPartyUpdateResult(Lte3RdPartyResponse value) {
        this.lte3RdPartyUpdateResult = value;
    }

}
