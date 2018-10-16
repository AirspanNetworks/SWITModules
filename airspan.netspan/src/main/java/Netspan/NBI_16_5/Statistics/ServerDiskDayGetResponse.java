
package Netspan.NBI_16_5.Statistics;

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
 *         &lt;element name="ServerDiskDayGetResult" type="{http://Airspan.Netspan.WebServices}StatsServerDiskResponse" minOccurs="0"/&gt;
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
    "serverDiskDayGetResult"
})
@XmlRootElement(name = "ServerDiskDayGetResponse")
public class ServerDiskDayGetResponse {

    @XmlElement(name = "ServerDiskDayGetResult")
    protected StatsServerDiskResponse serverDiskDayGetResult;

    /**
     * Gets the value of the serverDiskDayGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsServerDiskResponse }
     *     
     */
    public StatsServerDiskResponse getServerDiskDayGetResult() {
        return serverDiskDayGetResult;
    }

    /**
     * Sets the value of the serverDiskDayGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsServerDiskResponse }
     *     
     */
    public void setServerDiskDayGetResult(StatsServerDiskResponse value) {
        this.serverDiskDayGetResult = value;
    }

}
