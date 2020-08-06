
package Netspan.NBI_18_0.Statistics;

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
 *         &lt;element name="RfMeasureRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRfMeasureResponse" minOccurs="0"/&gt;
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
    "rfMeasureRawGetResult"
})
@XmlRootElement(name = "RfMeasureRawGetResponse")
public class RfMeasureRawGetResponse {

    @XmlElement(name = "RfMeasureRawGetResult")
    protected StatsLteRfMeasureResponse rfMeasureRawGetResult;

    /**
     * Gets the value of the rfMeasureRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRfMeasureResponse }
     *     
     */
    public StatsLteRfMeasureResponse getRfMeasureRawGetResult() {
        return rfMeasureRawGetResult;
    }

    /**
     * Sets the value of the rfMeasureRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRfMeasureResponse }
     *     
     */
    public void setRfMeasureRawGetResult(StatsLteRfMeasureResponse value) {
        this.rfMeasureRawGetResult = value;
    }

}
