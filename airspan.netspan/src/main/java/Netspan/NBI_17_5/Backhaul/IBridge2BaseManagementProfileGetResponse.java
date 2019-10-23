
package Netspan.NBI_17_5.Backhaul;

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
 *         &lt;element name="IBridge2BaseManagementProfileGetResult" type="{http://Airspan.Netspan.WebServices}IBridge2BaseManagementProfileGetResult" minOccurs="0"/&gt;
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
    "iBridge2BaseManagementProfileGetResult"
})
@XmlRootElement(name = "IBridge2BaseManagementProfileGetResponse")
public class IBridge2BaseManagementProfileGetResponse {

    @XmlElement(name = "IBridge2BaseManagementProfileGetResult")
    protected IBridge2BaseManagementProfileGetResult iBridge2BaseManagementProfileGetResult;

    /**
     * Gets the value of the iBridge2BaseManagementProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2BaseManagementProfileGetResult }
     *     
     */
    public IBridge2BaseManagementProfileGetResult getIBridge2BaseManagementProfileGetResult() {
        return iBridge2BaseManagementProfileGetResult;
    }

    /**
     * Sets the value of the iBridge2BaseManagementProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2BaseManagementProfileGetResult }
     *     
     */
    public void setIBridge2BaseManagementProfileGetResult(IBridge2BaseManagementProfileGetResult value) {
        this.iBridge2BaseManagementProfileGetResult = value;
    }

}
