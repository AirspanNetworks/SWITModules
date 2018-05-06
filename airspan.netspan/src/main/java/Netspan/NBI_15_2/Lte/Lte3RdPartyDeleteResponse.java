
package Netspan.NBI_15_2.Lte;

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
 *         &lt;element name="Lte3rdPartyDeleteResult" type="{http://Airspan.Netspan.WebServices}Lte3rdPartyResponse" minOccurs="0"/>
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
    "lte3RdPartyDeleteResult"
})
@XmlRootElement(name = "Lte3rdPartyDeleteResponse")
public class Lte3RdPartyDeleteResponse {

    @XmlElement(name = "Lte3rdPartyDeleteResult")
    protected Lte3RdPartyResponse lte3RdPartyDeleteResult;

    /**
     * Gets the value of the lte3RdPartyDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link Lte3RdPartyResponse }
     *     
     */
    public Lte3RdPartyResponse getLte3RdPartyDeleteResult() {
        return lte3RdPartyDeleteResult;
    }

    /**
     * Sets the value of the lte3RdPartyDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lte3RdPartyResponse }
     *     
     */
    public void setLte3RdPartyDeleteResult(Lte3RdPartyResponse value) {
        this.lte3RdPartyDeleteResult = value;
    }

}
