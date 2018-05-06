
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
 *         &lt;element name="ServerProcessHourGetResult" type="{http://Airspan.Netspan.WebServices}StatsServerProcessResponse" minOccurs="0"/>
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
    "serverProcessHourGetResult"
})
@XmlRootElement(name = "ServerProcessHourGetResponse")
public class ServerProcessHourGetResponse {

    @XmlElement(name = "ServerProcessHourGetResult")
    protected StatsServerProcessResponse serverProcessHourGetResult;

    /**
     * Gets the value of the serverProcessHourGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsServerProcessResponse }
     *     
     */
    public StatsServerProcessResponse getServerProcessHourGetResult() {
        return serverProcessHourGetResult;
    }

    /**
     * Sets the value of the serverProcessHourGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsServerProcessResponse }
     *     
     */
    public void setServerProcessHourGetResult(StatsServerProcessResponse value) {
        this.serverProcessHourGetResult = value;
    }

}
