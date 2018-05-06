
package Netspan.NBI_14_50.API.Lte;

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
 *         &lt;element name="Lte3rdParty" type="{http://Airspan.Netspan.WebServices}Enb3rdParty" minOccurs="0"/>
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
    "lte3RdParty"
})
@XmlRootElement(name = "Lte3rdPartyCreate")
public class Lte3RdPartyCreate {

    @XmlElement(name = "Lte3rdParty")
    protected Enb3RdParty lte3RdParty;

    /**
     * Gets the value of the lte3RdParty property.
     * 
     * @return
     *     possible object is
     *     {@link Enb3RdParty }
     *     
     */
    public Enb3RdParty getLte3RdParty() {
        return lte3RdParty;
    }

    /**
     * Sets the value of the lte3RdParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enb3RdParty }
     *     
     */
    public void setLte3RdParty(Enb3RdParty value) {
        this.lte3RdParty = value;
    }

}
