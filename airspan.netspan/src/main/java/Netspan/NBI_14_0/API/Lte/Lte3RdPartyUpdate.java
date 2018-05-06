
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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lte3rdParty" type="{http://Airspan.Netspan.WebServices}Lte3rdPartyWs" minOccurs="0"/>
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
    "name",
    "lte3RdParty"
})
@XmlRootElement(name = "Lte3rdPartyUpdate")
public class Lte3RdPartyUpdate {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Lte3rdParty")
    protected Lte3RdPartyWs lte3RdParty;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the lte3RdParty property.
     * 
     * @return
     *     possible object is
     *     {@link Lte3RdPartyWs }
     *     
     */
    public Lte3RdPartyWs getLte3RdParty() {
        return lte3RdParty;
    }

    /**
     * Sets the value of the lte3RdParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lte3RdPartyWs }
     *     
     */
    public void setLte3RdParty(Lte3RdPartyWs value) {
        this.lte3RdParty = value;
    }

}
