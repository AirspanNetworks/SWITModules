
package Netspan.NBI_15_1.Statistics;

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
 *         &lt;element name="ServerDiskHourGetResult" type="{http://Airspan.Netspan.WebServices}StatsServerDiskResponse" minOccurs="0"/>
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
    "serverDiskHourGetResult"
})
@XmlRootElement(name = "ServerDiskHourGetResponse")
public class ServerDiskHourGetResponse {

    @XmlElement(name = "ServerDiskHourGetResult")
    protected StatsServerDiskResponse serverDiskHourGetResult;

    /**
     * Gets the value of the serverDiskHourGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsServerDiskResponse }
     *     
     */
    public StatsServerDiskResponse getServerDiskHourGetResult() {
        return serverDiskHourGetResult;
    }

    /**
     * Sets the value of the serverDiskHourGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsServerDiskResponse }
     *     
     */
    public void setServerDiskHourGetResult(StatsServerDiskResponse value) {
        this.serverDiskHourGetResult = value;
    }

}
