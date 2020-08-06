
package Netspan.NBI_18_0.Lte;

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
 *         &lt;element name="FaultManagementProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteFaultManagementProfileGetResult" minOccurs="0"/&gt;
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
    "faultManagementProfileGetResult"
})
@XmlRootElement(name = "FaultManagementProfileGetResponse")
public class FaultManagementProfileGetResponse {

    @XmlElement(name = "FaultManagementProfileGetResult")
    protected LteFaultManagementProfileGetResult faultManagementProfileGetResult;

    /**
     * Gets the value of the faultManagementProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteFaultManagementProfileGetResult }
     *     
     */
    public LteFaultManagementProfileGetResult getFaultManagementProfileGetResult() {
        return faultManagementProfileGetResult;
    }

    /**
     * Sets the value of the faultManagementProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteFaultManagementProfileGetResult }
     *     
     */
    public void setFaultManagementProfileGetResult(LteFaultManagementProfileGetResult value) {
        this.faultManagementProfileGetResult = value;
    }

}
