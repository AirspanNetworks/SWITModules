
package Netspan.NBI_18_0.Status;

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
 *         &lt;element name="IBridge2OverviewStatusGetResult" type="{http://Airspan.Netspan.WebServices}IBridge2OverviewStatusGetResult" minOccurs="0"/&gt;
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
    "iBridge2OverviewStatusGetResult"
})
@XmlRootElement(name = "IBridge2OverviewStatusGetResponse")
public class IBridge2OverviewStatusGetResponse {

    @XmlElement(name = "IBridge2OverviewStatusGetResult")
    protected IBridge2OverviewStatusGetResult iBridge2OverviewStatusGetResult;

    /**
     * Gets the value of the iBridge2OverviewStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2OverviewStatusGetResult }
     *     
     */
    public IBridge2OverviewStatusGetResult getIBridge2OverviewStatusGetResult() {
        return iBridge2OverviewStatusGetResult;
    }

    /**
     * Sets the value of the iBridge2OverviewStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2OverviewStatusGetResult }
     *     
     */
    public void setIBridge2OverviewStatusGetResult(IBridge2OverviewStatusGetResult value) {
        this.iBridge2OverviewStatusGetResult = value;
    }

}
