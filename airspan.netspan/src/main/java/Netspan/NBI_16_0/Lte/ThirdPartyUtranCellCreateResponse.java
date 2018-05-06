
package Netspan.NBI_16_0.Lte;

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
 *         &lt;element name="ThirdPartyUtranCellCreateResult" type="{http://Airspan.Netspan.WebServices}ThirdPartyUtranCellResponse" minOccurs="0"/>
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
    "thirdPartyUtranCellCreateResult"
})
@XmlRootElement(name = "ThirdPartyUtranCellCreateResponse")
public class ThirdPartyUtranCellCreateResponse {

    @XmlElement(name = "ThirdPartyUtranCellCreateResult")
    protected ThirdPartyUtranCellResponse thirdPartyUtranCellCreateResult;

    /**
     * Gets the value of the thirdPartyUtranCellCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyUtranCellResponse }
     *     
     */
    public ThirdPartyUtranCellResponse getThirdPartyUtranCellCreateResult() {
        return thirdPartyUtranCellCreateResult;
    }

    /**
     * Sets the value of the thirdPartyUtranCellCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyUtranCellResponse }
     *     
     */
    public void setThirdPartyUtranCellCreateResult(ThirdPartyUtranCellResponse value) {
        this.thirdPartyUtranCellCreateResult = value;
    }

}
