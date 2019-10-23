
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayGlobalConfigDeleteDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayGlobalConfigDeleteDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubBandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayGlobalConfigDeleteDetail", propOrder = {
    "subBandId"
})
public class RelayGlobalConfigDeleteDetail {

    @XmlElement(name = "SubBandId")
    protected String subBandId;

    /**
     * Gets the value of the subBandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBandId() {
        return subBandId;
    }

    /**
     * Sets the value of the subBandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBandId(String value) {
        this.subBandId = value;
    }

}
