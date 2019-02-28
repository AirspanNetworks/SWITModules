
package Netspan.NBI_17_0.Server;

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
 *         &lt;element name="NmsLicenseNodeSummaryListResult" type="{http://Airspan.Netspan.WebServices}LicenseNodeSummaryListResult" minOccurs="0"/&gt;
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
