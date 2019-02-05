
package Netspan.NBI_15_2.Statistics;

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
 *         &lt;element name="ErabRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteErabResponse" minOccurs="0"/&gt;
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
    "erabRawGetResult"
})
@XmlRootElement(name = "ErabRawGetResponse")
public class ErabRawGetResponse {

    @XmlElement(name = "ErabRawGetResult")
    protected StatsLteErabResponse erabRawGetResult;

    /**
     * Gets the value of the erabRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteErabResponse }
     *     
     */
    public StatsLteErabResponse getErabRawGetResult() {
        return erabRawGetResult;
    }

    /**
     * Sets the value of the erabRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteErabResponse }
     *     
     */
    public void setErabRawGetResult(StatsLteErabResponse value) {
        this.erabRawGetResult = value;
    }

}
