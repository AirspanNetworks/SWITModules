
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
 *         &lt;element name="ThirdPartyUtranCellGetResult" type="{http://Airspan.Netspan.WebServices}ThirdPartyUtranCellGetResult" minOccurs="0"/&gt;
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
    "thirdPartyUtranCellGetResult"
})
@XmlRootElement(name = "ThirdPartyUtranCellGetResponse")
public class ThirdPartyUtranCellGetResponse {

    @XmlElement(name = "ThirdPartyUtranCellGetResult")
    protected ThirdPartyUtranCellGetResult thirdPartyUtranCellGetResult;

    /**
     * Gets the value of the thirdPartyUtranCellGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyUtranCellGetResult }
     *     
     */
    public ThirdPartyUtranCellGetResult getThirdPartyUtranCellGetResult() {
        return thirdPartyUtranCellGetResult;
    }

    /**
     * Sets the value of the thirdPartyUtranCellGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyUtranCellGetResult }
     *     
     */
    public void setThirdPartyUtranCellGetResult(ThirdPartyUtranCellGetResult value) {
        this.thirdPartyUtranCellGetResult = value;
    }

}
