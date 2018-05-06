
package Netspan.NBI_15_1.Statistics;

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
 *         &lt;element name="Ib440QosPerQciRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsIb440QosPerQciResponse" minOccurs="0"/>
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
    "ib440QosPerQciRawGetResult"
})
@XmlRootElement(name = "Ib440QosPerQciRawGetResponse")
public class Ib440QosPerQciRawGetResponse {

    @XmlElement(name = "Ib440QosPerQciRawGetResult")
    protected StatsIb440QosPerQciResponse ib440QosPerQciRawGetResult;

    /**
     * Gets the value of the ib440QosPerQciRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIb440QosPerQciResponse }
     *     
     */
    public StatsIb440QosPerQciResponse getIb440QosPerQciRawGetResult() {
        return ib440QosPerQciRawGetResult;
    }

    /**
     * Sets the value of the ib440QosPerQciRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIb440QosPerQciResponse }
     *     
     */
    public void setIb440QosPerQciRawGetResult(StatsIb440QosPerQciResponse value) {
        this.ib440QosPerQciRawGetResult = value;
    }

}
