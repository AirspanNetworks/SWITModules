
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
 *         &lt;element name="IBridge2AlarmProfileGetResult" type="{http://Airspan.Netspan.WebServices}IbMmAlarmProfileGetResult" minOccurs="0"/&gt;
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
    "iBridge2AlarmProfileGetResult"
})
@XmlRootElement(name = "IBridge2AlarmProfileGetResponse")
public class IBridge2AlarmProfileGetResponse {

    @XmlElement(name = "IBridge2AlarmProfileGetResult")
    protected IbMmAlarmProfileGetResult iBridge2AlarmProfileGetResult;

    /**
     * Gets the value of the iBridge2AlarmProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IbMmAlarmProfileGetResult }
     *     
     */
    public IbMmAlarmProfileGetResult getIBridge2AlarmProfileGetResult() {
        return iBridge2AlarmProfileGetResult;
    }

    /**
     * Sets the value of the iBridge2AlarmProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbMmAlarmProfileGetResult }
     *     
     */
    public void setIBridge2AlarmProfileGetResult(IbMmAlarmProfileGetResult value) {
        this.iBridge2AlarmProfileGetResult = value;
    }

}
