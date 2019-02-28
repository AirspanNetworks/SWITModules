
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
 *         &lt;element name="ManagementProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteManagementProfileGetResult" minOccurs="0"/&gt;
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
    "managementProfileGetResult"
})
@XmlRootElement(name = "ManagementProfileGetResponse")
public class ManagementProfileGetResponse {

    @XmlElement(name = "ManagementProfileGetResult")
    protected LteManagementProfileGetResult managementProfileGetResult;

    /**
     * Gets the value of the managementProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteManagementProfileGetResult }
     *     
     */
    public LteManagementProfileGetResult getManagementProfileGetResult() {
        return managementProfileGetResult;
    }

    /**
     * Sets the value of the managementProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteManagementProfileGetResult }
     *     
     */
    public void setManagementProfileGetResult(LteManagementProfileGetResult value) {
        this.managementProfileGetResult = value;
    }

}
