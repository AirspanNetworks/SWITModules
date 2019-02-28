
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
 *         &lt;element name="ThirdPartyUtranCellCloneResult" type="{http://Airspan.Netspan.WebServices}ThirdPartyUtranCellResponse" minOccurs="0"/&gt;
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
    "thirdPartyUtranCellCloneResult"
})
@XmlRootElement(name = "ThirdPartyUtranCellCloneResponse")
public class ThirdPartyUtranCellCloneResponse {

    @XmlElement(name = "ThirdPartyUtranCellCloneResult")
    protected ThirdPartyUtranCellResponse thirdPartyUtranCellCloneResult;

    /**
     * Gets the value of the thirdPartyUtranCellCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyUtranCellResponse }
     *     
     */
    public ThirdPartyUtranCellResponse getThirdPartyUtranCellCloneResult() {
        return thirdPartyUtranCellCloneResult;
    }

    /**
     * Sets the value of the thirdPartyUtranCellCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyUtranCellResponse }
     *     
     */
    public void setThirdPartyUtranCellCloneResult(ThirdPartyUtranCellResponse value) {
        this.thirdPartyUtranCellCloneResult = value;
    }

}
