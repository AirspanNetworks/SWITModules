
package Netspan.NBI_15_5.Server;

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
 *         &lt;element name="NmsLicenseSummaryListResult" type="{http://Airspan.Netspan.WebServices}NmsLicenseSummaryListResult" minOccurs="0"/>
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
    "nmsLicenseSummaryListResult"
})
@XmlRootElement(name = "NmsLicenseSummaryListResponse")
public class NmsLicenseSummaryListResponse {

    @XmlElement(name = "NmsLicenseSummaryListResult")
    protected NmsLicenseSummaryListResult nmsLicenseSummaryListResult;

    /**
     * Gets the value of the nmsLicenseSummaryListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NmsLicenseSummaryListResult }
     *     
     */
    public NmsLicenseSummaryListResult getNmsLicenseSummaryListResult() {
        return nmsLicenseSummaryListResult;
    }

    /**
     * Sets the value of the nmsLicenseSummaryListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NmsLicenseSummaryListResult }
     *     
     */
    public void setNmsLicenseSummaryListResult(NmsLicenseSummaryListResult value) {
        this.nmsLicenseSummaryListResult = value;
    }

}
