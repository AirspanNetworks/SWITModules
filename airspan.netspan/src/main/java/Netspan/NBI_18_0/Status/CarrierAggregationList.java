
package Netspan.NBI_18_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierAggregationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierAggregationList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierAggregationEntry" type="{http://Airspan.Netspan.WebServices}CarrierAggregationWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierAggregationList", propOrder = {
    "carrierAggregationEntry"
})
public class CarrierAggregationList {

    @XmlElement(name = "CarrierAggregationEntry")
    protected List<CarrierAggregationWs> carrierAggregationEntry;

    /**
     * Gets the value of the carrierAggregationEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierAggregationEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierAggregationEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierAggregationWs }
     * 
     * 
     */
    public List<CarrierAggregationWs> getCarrierAggregationEntry() {
        if (carrierAggregationEntry == null) {
            carrierAggregationEntry = new ArrayList<CarrierAggregationWs>();
        }
        return this.carrierAggregationEntry;
    }

}
