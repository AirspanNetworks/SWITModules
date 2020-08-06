
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityReqFreqBandListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityReqFreqBandListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestFrequencyBands" type="{http://Airspan.Netspan.WebServices}ReqFreqBand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityReqFreqBandListContainer", propOrder = {
    "requestFrequencyBands"
})
public class MobilityReqFreqBandListContainer {

    @XmlElement(name = "RequestFrequencyBands")
    protected List<ReqFreqBand> requestFrequencyBands;

    /**
     * Gets the value of the requestFrequencyBands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestFrequencyBands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestFrequencyBands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReqFreqBand }
     * 
     * 
     */
    public List<ReqFreqBand> getRequestFrequencyBands() {
        if (requestFrequencyBands == null) {
            requestFrequencyBands = new ArrayList<ReqFreqBand>();
        }
        return this.requestFrequencyBands;
    }

}
