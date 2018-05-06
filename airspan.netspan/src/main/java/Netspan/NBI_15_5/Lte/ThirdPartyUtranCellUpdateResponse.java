
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
 *         &lt;element name="ThirdPartyUtranCellUpdateResult" type="{http://Airspan.Netspan.WebServices}ThirdPartyUtranCellResponse" minOccurs="0"/>
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
    "thirdPartyUtranCellUpdateResult"
})
@XmlRootElement(name = "ThirdPartyUtranCellUpdateResponse")
public class ThirdPartyUtranCellUpdateResponse {

    @XmlElement(name = "ThirdPartyUtranCellUpdateResult")
    protected ThirdPartyUtranCellResponse thirdPartyUtranCellUpdateResult;

    /**
     * Gets the value of the thirdPartyUtranCellUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyUtranCellResponse }
     *     
     */
    public ThirdPartyUtranCellResponse getThirdPartyUtranCellUpdateResult() {
        return thirdPartyUtranCellUpdateResult;
    }

    /**
     * Sets the value of the thirdPartyUtranCellUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyUtranCellResponse }
     *     
     */
    public void setThirdPartyUtranCellUpdateResult(ThirdPartyUtranCellResponse value) {
        this.thirdPartyUtranCellUpdateResult = value;
    }

}
