
package Netspan.NBI_18_0.FaultManagement;

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
 *         &lt;element name="NetspanSFServerErrorResult" type="{http://Airspan.Netspan.WebServices}NodeAlarmResult" minOccurs="0"/&gt;
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
    "netspanSFServerErrorResult"
})
@XmlRootElement(name = "NetspanSFServerErrorResponse")
public class NetspanSFServerErrorResponse {

    @XmlElement(name = "NetspanSFServerErrorResult")
    protected NodeAlarmResult netspanSFServerErrorResult;

    /**
     * Gets the value of the netspanSFServerErrorResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeAlarmResult }
     *     
     */
    public NodeAlarmResult getNetspanSFServerErrorResult() {
        return netspanSFServerErrorResult;
    }

    /**
     * Sets the value of the netspanSFServerErrorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeAlarmResult }
     *     
     */
    public void setNetspanSFServerErrorResult(NodeAlarmResult value) {
        this.netspanSFServerErrorResult = value;
    }

}
