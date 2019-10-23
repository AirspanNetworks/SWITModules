
package Netspan.NBI_17_5.Status;

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
 *         &lt;element name="IBridge2ChannelAndPowerStatusGetResult" type="{http://Airspan.Netspan.WebServices}IBridge2ChannelAndPowerStatusGetResult" minOccurs="0"/&gt;
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
    "iBridge2ChannelAndPowerStatusGetResult"
})
@XmlRootElement(name = "IBridge2ChannelAndPowerStatusGetResponse")
public class IBridge2ChannelAndPowerStatusGetResponse {

    @XmlElement(name = "IBridge2ChannelAndPowerStatusGetResult")
    protected IBridge2ChannelAndPowerStatusGetResult iBridge2ChannelAndPowerStatusGetResult;

    /**
     * Gets the value of the iBridge2ChannelAndPowerStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2ChannelAndPowerStatusGetResult }
     *     
     */
    public IBridge2ChannelAndPowerStatusGetResult getIBridge2ChannelAndPowerStatusGetResult() {
        return iBridge2ChannelAndPowerStatusGetResult;
    }

    /**
     * Sets the value of the iBridge2ChannelAndPowerStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2ChannelAndPowerStatusGetResult }
     *     
     */
    public void setIBridge2ChannelAndPowerStatusGetResult(IBridge2ChannelAndPowerStatusGetResult value) {
        this.iBridge2ChannelAndPowerStatusGetResult = value;
    }

}
