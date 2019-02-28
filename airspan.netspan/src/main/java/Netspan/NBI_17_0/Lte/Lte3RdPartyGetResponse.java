
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
 *         &lt;element name="Lte3rdPartyGetResult" type="{http://Airspan.Netspan.WebServices}Lte3rdPartyGetResult" minOccurs="0"/&gt;
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
    "lte3RdPartyGetResult"
})
@XmlRootElement(name = "Lte3rdPartyGetResponse")
public class Lte3RdPartyGetResponse {

    @XmlElement(name = "Lte3rdPartyGetResult")
    protected Lte3RdPartyGetResult lte3RdPartyGetResult;

    /**
     * Gets the value of the lte3RdPartyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Lte3RdPartyGetResult }
     *     
     */
    public Lte3RdPartyGetResult getLte3RdPartyGetResult() {
        return lte3RdPartyGetResult;
    }

    /**
     * Sets the value of the lte3RdPartyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lte3RdPartyGetResult }
     *     
     */
    public void setLte3RdPartyGetResult(Lte3RdPartyGetResult value) {
        this.lte3RdPartyGetResult = value;
    }

}
