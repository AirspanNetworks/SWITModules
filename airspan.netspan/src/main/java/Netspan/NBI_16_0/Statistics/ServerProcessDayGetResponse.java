
package Netspan.NBI_16_0.Statistics;

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
 *         &lt;element name="ServerProcessDayGetResult" type="{http://Airspan.Netspan.WebServices}StatsServerProcessResponse" minOccurs="0"/>
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
    "serverProcessDayGetResult"
})
@XmlRootElement(name = "ServerProcessDayGetResponse")
public class ServerProcessDayGetResponse {

    @XmlElement(name = "ServerProcessDayGetResult")
    protected StatsServerProcessResponse serverProcessDayGetResult;

    /**
     * Gets the value of the serverProcessDayGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsServerProcessResponse }
     *     
     */
    public StatsServerProcessResponse getServerProcessDayGetResult() {
        return serverProcessDayGetResult;
    }

    /**
     * Sets the value of the serverProcessDayGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsServerProcessResponse }
     *     
     */
    public void setServerProcessDayGetResult(StatsServerProcessResponse value) {
        this.serverProcessDayGetResult = value;
    }

}
