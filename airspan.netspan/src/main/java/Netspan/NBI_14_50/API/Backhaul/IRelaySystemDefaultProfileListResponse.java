
package Netspan.NBI_14_50.API.Backhaul;

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
 *         &lt;element name="IRelaySystemDefaultProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/>
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
    "iRelaySystemDefaultProfileListResult"
})
@XmlRootElement(name = "IRelaySystemDefaultProfileListResponse")
public class IRelaySystemDefaultProfileListResponse {

    @XmlElement(name = "IRelaySystemDefaultProfileListResult")
    protected NameResult iRelaySystemDefaultProfileListResult;

    /**
     * Gets the value of the iRelaySystemDefaultProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getIRelaySystemDefaultProfileListResult() {
        return iRelaySystemDefaultProfileListResult;
    }

    /**
     * Sets the value of the iRelaySystemDefaultProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setIRelaySystemDefaultProfileListResult(NameResult value) {
        this.iRelaySystemDefaultProfileListResult = value;
    }

}
