
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
 *         &lt;element name="PagingDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLtePagingResponse" minOccurs="0"/&gt;
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
    "pagingDailyGetResult"
})
@XmlRootElement(name = "PagingDailyGetResponse")
public class PagingDailyGetResponse {

    @XmlElement(name = "PagingDailyGetResult")
    protected StatsLtePagingResponse pagingDailyGetResult;

    /**
     * Gets the value of the pagingDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLtePagingResponse }
     *     
     */
    public StatsLtePagingResponse getPagingDailyGetResult() {
        return pagingDailyGetResult;
    }

    /**
     * Sets the value of the pagingDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLtePagingResponse }
     *     
     */
    public void setPagingDailyGetResult(StatsLtePagingResponse value) {
        this.pagingDailyGetResult = value;
    }

}
