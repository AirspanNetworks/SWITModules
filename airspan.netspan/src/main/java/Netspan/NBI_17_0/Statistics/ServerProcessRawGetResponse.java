
package Netspan.NBI_17_0.Statistics;

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
 *         &lt;element name="ServerProcessRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsServerProcessResponse" minOccurs="0"/&gt;
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
    "serverProcessRawGetResult"
})
@XmlRootElement(name = "ServerProcessRawGetResponse")
public class ServerProcessRawGetResponse {

    @XmlElement(name = "ServerProcessRawGetResult")
    protected StatsServerProcessResponse serverProcessRawGetResult;

    /**
     * Gets the value of the serverProcessRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsServerProcessResponse }
     *     
     */
    public StatsServerProcessResponse getServerProcessRawGetResult() {
        return serverProcessRawGetResult;
    }

    /**
     * Sets the value of the serverProcessRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsServerProcessResponse }
     *     
     */
    public void setServerProcessRawGetResult(StatsServerProcessResponse value) {
        this.serverProcessRawGetResult = value;
    }

}
