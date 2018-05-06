
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
 *         &lt;element name="ErabPerQciRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteErabPerQciResponse" minOccurs="0"/>
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
    "erabPerQciRawGetResult"
})
@XmlRootElement(name = "ErabPerQciRawGetResponse")
public class ErabPerQciRawGetResponse {

    @XmlElement(name = "ErabPerQciRawGetResult")
    protected StatsLteErabPerQciResponse erabPerQciRawGetResult;

    /**
     * Gets the value of the erabPerQciRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteErabPerQciResponse }
     *     
     */
    public StatsLteErabPerQciResponse getErabPerQciRawGetResult() {
        return erabPerQciRawGetResult;
    }

    /**
     * Sets the value of the erabPerQciRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteErabPerQciResponse }
     *     
     */
    public void setErabPerQciRawGetResult(StatsLteErabPerQciResponse value) {
        this.erabPerQciRawGetResult = value;
    }

}
