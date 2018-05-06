
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
 *         &lt;element name="PnpConfigListResult" type="{http://Airspan.Netspan.WebServices}NodeListResult" minOccurs="0"/>
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
    "pnpConfigListResult"
})
@XmlRootElement(name = "PnpConfigListResponse")
public class PnpConfigListResponse {

    @XmlElement(name = "PnpConfigListResult")
    protected NodeListResult pnpConfigListResult;

    /**
     * Gets the value of the pnpConfigListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeListResult }
     *     
     */
    public NodeListResult getPnpConfigListResult() {
        return pnpConfigListResult;
    }

    /**
     * Sets the value of the pnpConfigListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeListResult }
     *     
     */
    public void setPnpConfigListResult(NodeListResult value) {
        this.pnpConfigListResult = value;
    }

}
