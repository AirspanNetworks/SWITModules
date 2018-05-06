
package Netspan.NBI_15_5.Statistics;

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
 *         &lt;element name="MmeRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteMmeResponse" minOccurs="0"/>
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
    "mmeRawGetResult"
})
@XmlRootElement(name = "MmeRawGetResponse")
public class MmeRawGetResponse {

    @XmlElement(name = "MmeRawGetResult")
    protected StatsLteMmeResponse mmeRawGetResult;

    /**
     * Gets the value of the mmeRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteMmeResponse }
     *     
     */
    public StatsLteMmeResponse getMmeRawGetResult() {
        return mmeRawGetResult;
    }

    /**
     * Sets the value of the mmeRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteMmeResponse }
     *     
     */
    public void setMmeRawGetResult(StatsLteMmeResponse value) {
        this.mmeRawGetResult = value;
    }

}
