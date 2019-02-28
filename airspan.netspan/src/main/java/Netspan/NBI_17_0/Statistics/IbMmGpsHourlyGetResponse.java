
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
 *         &lt;element name="IbMmGpsHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIbMmGpsResponse" minOccurs="0"/&gt;
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
    "ibMmGpsHourlyGetResult"
})
@XmlRootElement(name = "IbMmGpsHourlyGetResponse")
public class IbMmGpsHourlyGetResponse {

    @XmlElement(name = "IbMmGpsHourlyGetResult")
    protected StatsIbMmGpsResponse ibMmGpsHourlyGetResult;

    /**
     * Gets the value of the ibMmGpsHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIbMmGpsResponse }
     *     
     */
    public StatsIbMmGpsResponse getIbMmGpsHourlyGetResult() {
        return ibMmGpsHourlyGetResult;
    }

    /**
     * Sets the value of the ibMmGpsHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIbMmGpsResponse }
     *     
     */
    public void setIbMmGpsHourlyGetResult(StatsIbMmGpsResponse value) {
        this.ibMmGpsHourlyGetResult = value;
    }

}
