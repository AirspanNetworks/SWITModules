
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
 *         &lt;element name="ThirdPartyUtranCellListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/>
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
    "thirdPartyUtranCellListResult"
})
@XmlRootElement(name = "ThirdPartyUtranCellListResponse")
public class ThirdPartyUtranCellListResponse {

    @XmlElement(name = "ThirdPartyUtranCellListResult")
    protected NameResult thirdPartyUtranCellListResult;

    /**
     * Gets the value of the thirdPartyUtranCellListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getThirdPartyUtranCellListResult() {
        return thirdPartyUtranCellListResult;
    }

    /**
     * Sets the value of the thirdPartyUtranCellListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setThirdPartyUtranCellListResult(NameResult value) {
        this.thirdPartyUtranCellListResult = value;
    }

}
