
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Lte3rdPartyCreateResult" type="{http://Airspan.Netspan.WebServices}Lte3rdPartyResponse" minOccurs="0"/&gt;
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
    "lte3RdPartyCreateResult"
})
@XmlRootElement(name = "Lte3rdPartyCreateResponse")
public class Lte3RdPartyCreateResponse {

    @XmlElement(name = "Lte3rdPartyCreateResult")
    protected Lte3RdPartyResponse lte3RdPartyCreateResult;

    /**
     * Gets the value of the lte3RdPartyCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Lte3RdPartyResponse }
     *     
     */
    public Lte3RdPartyResponse getLte3RdPartyCreateResult() {
        return lte3RdPartyCreateResult;
    }

    /**
     * Sets the value of the lte3RdPartyCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lte3RdPartyResponse }
     *     
     */
    public void setLte3RdPartyCreateResult(Lte3RdPartyResponse value) {
        this.lte3RdPartyCreateResult = value;
    }

}
