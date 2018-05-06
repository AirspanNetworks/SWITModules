
package Netspan.NBI_15_2.FaultManagement;

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
 *         &lt;element name="NetspanSFNodeConfigErrorResult" type="{http://Airspan.Netspan.WebServices}NodeAlarmResult" minOccurs="0"/>
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
    "netspanSFNodeConfigErrorResult"
})
@XmlRootElement(name = "NetspanSFNodeConfigErrorResponse")
public class NetspanSFNodeConfigErrorResponse {

    @XmlElement(name = "NetspanSFNodeConfigErrorResult")
    protected NodeAlarmResult netspanSFNodeConfigErrorResult;

    /**
     * Gets the value of the netspanSFNodeConfigErrorResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeAlarmResult }
     *     
     */
    public NodeAlarmResult getNetspanSFNodeConfigErrorResult() {
        return netspanSFNodeConfigErrorResult;
    }

    /**
     * Sets the value of the netspanSFNodeConfigErrorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeAlarmResult }
     *     
     */
    public void setNetspanSFNodeConfigErrorResult(NodeAlarmResult value) {
        this.netspanSFNodeConfigErrorResult = value;
    }

}
