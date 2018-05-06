
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
 *         &lt;element name="PagingRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLtePagingResponse" minOccurs="0"/>
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
    "pagingRawGetResult"
})
@XmlRootElement(name = "PagingRawGetResponse")
public class PagingRawGetResponse {

    @XmlElement(name = "PagingRawGetResult")
    protected StatsLtePagingResponse pagingRawGetResult;

    /**
     * Gets the value of the pagingRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLtePagingResponse }
     *     
     */
    public StatsLtePagingResponse getPagingRawGetResult() {
        return pagingRawGetResult;
    }

    /**
     * Sets the value of the pagingRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLtePagingResponse }
     *     
     */
    public void setPagingRawGetResult(StatsLtePagingResponse value) {
        this.pagingRawGetResult = value;
    }

}
