
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
 *         &lt;element name="NmsLicenseNodeSummaryListResult" type="{http://Airspan.Netspan.WebServices}LicenseNodeSummaryListResult" minOccurs="0"/>
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
    "nmsLicenseNodeSummaryListResult"
})
@XmlRootElement(name = "NmsLicenseNodeSummaryListResponse")
public class NmsLicenseNodeSummaryListResponse {

    @XmlElement(name = "NmsLicenseNodeSummaryListResult")
    protected LicenseNodeSummaryListResult nmsLicenseNodeSummaryListResult;

    /**
     * Gets the value of the nmsLicenseNodeSummaryListResult property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseNodeSummaryListResult }
     *     
     */
    public LicenseNodeSummaryListResult getNmsLicenseNodeSummaryListResult() {
        return nmsLicenseNodeSummaryListResult;
    }

    /**
     * Sets the value of the nmsLicenseNodeSummaryListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseNodeSummaryListResult }
     *     
     */
    public void setNmsLicenseNodeSummaryListResult(LicenseNodeSummaryListResult value) {
        this.nmsLicenseNodeSummaryListResult = value;
    }

}
