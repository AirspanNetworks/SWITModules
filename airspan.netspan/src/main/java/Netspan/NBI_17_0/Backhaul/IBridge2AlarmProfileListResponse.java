
package Netspan.NBI_17_0.Backhaul;

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
 *         &lt;element name="IBridge2AlarmProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/&gt;
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
    "iBridge2AlarmProfileListResult"
})
@XmlRootElement(name = "IBridge2AlarmProfileListResponse")
public class IBridge2AlarmProfileListResponse {

    @XmlElement(name = "IBridge2AlarmProfileListResult")
    protected NameResult iBridge2AlarmProfileListResult;

    /**
     * Gets the value of the iBridge2AlarmProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getIBridge2AlarmProfileListResult() {
        return iBridge2AlarmProfileListResult;
    }

    /**
     * Sets the value of the iBridge2AlarmProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setIBridge2AlarmProfileListResult(NameResult value) {
        this.iBridge2AlarmProfileListResult = value;
    }

}
