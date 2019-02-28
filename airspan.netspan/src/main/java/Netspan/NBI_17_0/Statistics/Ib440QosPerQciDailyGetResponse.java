
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
 *         &lt;element name="Ib440QosPerQciDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIb440QosPerQciResponse" minOccurs="0"/&gt;
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
    "ib440QosPerQciDailyGetResult"
})
@XmlRootElement(name = "Ib440QosPerQciDailyGetResponse")
public class Ib440QosPerQciDailyGetResponse {

    @XmlElement(name = "Ib440QosPerQciDailyGetResult")
    protected StatsIb440QosPerQciResponse ib440QosPerQciDailyGetResult;

    /**
     * Gets the value of the ib440QosPerQciDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIb440QosPerQciResponse }
     *     
     */
    public StatsIb440QosPerQciResponse getIb440QosPerQciDailyGetResult() {
        return ib440QosPerQciDailyGetResult;
    }

    /**
     * Sets the value of the ib440QosPerQciDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIb440QosPerQciResponse }
     *     
     */
    public void setIb440QosPerQciDailyGetResult(StatsIb440QosPerQciResponse value) {
        this.ib440QosPerQciDailyGetResult = value;
    }

}
