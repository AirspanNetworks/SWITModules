
package Netspan.NBI_17_0.Backhaul;

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
 *         &lt;element name="IBridge2ManagementProfileGetResult" type="{http://Airspan.Netspan.WebServices}IbMmManagementProfileGetResult" minOccurs="0"/&gt;
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
    "iBridge2ManagementProfileGetResult"
})
@XmlRootElement(name = "IBridge2ManagementProfileGetResponse")
public class IBridge2ManagementProfileGetResponse {

    @XmlElement(name = "IBridge2ManagementProfileGetResult")
    protected IbMmManagementProfileGetResult iBridge2ManagementProfileGetResult;

    /**
     * Gets the value of the iBridge2ManagementProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IbMmManagementProfileGetResult }
     *     
     */
    public IbMmManagementProfileGetResult getIBridge2ManagementProfileGetResult() {
        return iBridge2ManagementProfileGetResult;
    }

    /**
     * Sets the value of the iBridge2ManagementProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbMmManagementProfileGetResult }
     *     
     */
    public void setIBridge2ManagementProfileGetResult(IbMmManagementProfileGetResult value) {
        this.iBridge2ManagementProfileGetResult = value;
    }

}
