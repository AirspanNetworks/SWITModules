
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
 *         &lt;element name="PnpConfigGetResult" type="{http://Airspan.Netspan.WebServices}LtePnpConfigGetResult" minOccurs="0"/>
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
    "pnpConfigGetResult"
})
@XmlRootElement(name = "PnpConfigGetResponse")
public class PnpConfigGetResponse {

    @XmlElement(name = "PnpConfigGetResult")
    protected LtePnpConfigGetResult pnpConfigGetResult;

    /**
     * Gets the value of the pnpConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LtePnpConfigGetResult }
     *     
     */
    public LtePnpConfigGetResult getPnpConfigGetResult() {
        return pnpConfigGetResult;
    }

    /**
     * Sets the value of the pnpConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtePnpConfigGetResult }
     *     
     */
    public void setPnpConfigGetResult(LtePnpConfigGetResult value) {
        this.pnpConfigGetResult = value;
    }

}
