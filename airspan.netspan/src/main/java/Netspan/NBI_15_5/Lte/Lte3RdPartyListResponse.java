
package Netspan.NBI_15_5.Lte;

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
 *         &lt;element name="Lte3rdPartyListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/>
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
    "lte3RdPartyListResult"
})
@XmlRootElement(name = "Lte3rdPartyListResponse")
public class Lte3RdPartyListResponse {

    @XmlElement(name = "Lte3rdPartyListResult")
    protected NameResult lte3RdPartyListResult;

    /**
     * Gets the value of the lte3RdPartyListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getLte3RdPartyListResult() {
        return lte3RdPartyListResult;
    }

    /**
     * Sets the value of the lte3RdPartyListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setLte3RdPartyListResult(NameResult value) {
        this.lte3RdPartyListResult = value;
    }

}
