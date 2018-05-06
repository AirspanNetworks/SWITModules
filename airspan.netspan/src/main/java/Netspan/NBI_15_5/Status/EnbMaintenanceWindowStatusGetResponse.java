
package Netspan.NBI_15_5.Status;

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
 *         &lt;element name="EnbMaintenanceWindowStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteMaintenanceWindowGetResult" minOccurs="0"/>
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
    "enbMaintenanceWindowStatusGetResult"
})
@XmlRootElement(name = "EnbMaintenanceWindowStatusGetResponse")
public class EnbMaintenanceWindowStatusGetResponse {

    @XmlElement(name = "EnbMaintenanceWindowStatusGetResult")
    protected LteMaintenanceWindowGetResult enbMaintenanceWindowStatusGetResult;

    /**
     * Gets the value of the enbMaintenanceWindowStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteMaintenanceWindowGetResult }
     *     
     */
    public LteMaintenanceWindowGetResult getEnbMaintenanceWindowStatusGetResult() {
        return enbMaintenanceWindowStatusGetResult;
    }

    /**
     * Sets the value of the enbMaintenanceWindowStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteMaintenanceWindowGetResult }
     *     
     */
    public void setEnbMaintenanceWindowStatusGetResult(LteMaintenanceWindowGetResult value) {
        this.enbMaintenanceWindowStatusGetResult = value;
    }

}
