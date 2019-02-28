
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
 *         &lt;element name="IBridge2ManagementProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/&gt;
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
    "iBridge2ManagementProfileListResult"
})
@XmlRootElement(name = "IBridge2ManagementProfileListResponse")
public class IBridge2ManagementProfileListResponse {

    @XmlElement(name = "IBridge2ManagementProfileListResult")
    protected NameResult iBridge2ManagementProfileListResult;

    /**
     * Gets the value of the iBridge2ManagementProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getIBridge2ManagementProfileListResult() {
        return iBridge2ManagementProfileListResult;
    }

    /**
     * Sets the value of the iBridge2ManagementProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setIBridge2ManagementProfileListResult(NameResult value) {
        this.iBridge2ManagementProfileListResult = value;
    }

}
