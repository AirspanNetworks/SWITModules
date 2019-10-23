
package Netspan.NBI_17_5.Lte;

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
 *         &lt;element name="ThirdPartyUtranCellDeleteResult" type="{http://Airspan.Netspan.WebServices}ThirdPartyUtranCellResponse" minOccurs="0"/&gt;
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
    "thirdPartyUtranCellDeleteResult"
})
@XmlRootElement(name = "ThirdPartyUtranCellDeleteResponse")
public class ThirdPartyUtranCellDeleteResponse {

    @XmlElement(name = "ThirdPartyUtranCellDeleteResult")
    protected ThirdPartyUtranCellResponse thirdPartyUtranCellDeleteResult;

    /**
     * Gets the value of the thirdPartyUtranCellDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyUtranCellResponse }
     *     
     */
    public ThirdPartyUtranCellResponse getThirdPartyUtranCellDeleteResult() {
        return thirdPartyUtranCellDeleteResult;
    }

    /**
     * Sets the value of the thirdPartyUtranCellDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyUtranCellResponse }
     *     
     */
    public void setThirdPartyUtranCellDeleteResult(ThirdPartyUtranCellResponse value) {
        this.thirdPartyUtranCellDeleteResult = value;
    }

}
