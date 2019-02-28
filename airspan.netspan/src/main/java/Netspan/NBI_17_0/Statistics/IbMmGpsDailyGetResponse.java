
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
 *         &lt;element name="IbMmGpsDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIbMmGpsResponse" minOccurs="0"/&gt;
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
    "ibMmGpsDailyGetResult"
})
@XmlRootElement(name = "IbMmGpsDailyGetResponse")
public class IbMmGpsDailyGetResponse {

    @XmlElement(name = "IbMmGpsDailyGetResult")
    protected StatsIbMmGpsResponse ibMmGpsDailyGetResult;

    /**
     * Gets the value of the ibMmGpsDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIbMmGpsResponse }
     *     
     */
    public StatsIbMmGpsResponse getIbMmGpsDailyGetResult() {
        return ibMmGpsDailyGetResult;
    }

    /**
     * Sets the value of the ibMmGpsDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIbMmGpsResponse }
     *     
     */
    public void setIbMmGpsDailyGetResult(StatsIbMmGpsResponse value) {
        this.ibMmGpsDailyGetResult = value;
    }

}
