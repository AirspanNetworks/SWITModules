
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteMobilityProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteMobilityProfileGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="MobilityProfileResult" type="{http://Airspan.Netspan.WebServices}LteMobilityProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteMobilityProfileGetResult", propOrder = {
    "mobilityProfileResult"
})
public class LteMobilityProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "MobilityProfileResult")
    protected List<LteMobilityProfileResult> mobilityProfileResult;

    /**
     * Gets the value of the mobilityProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilityProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilityProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteMobilityProfileResult }
     * 
     * 
     */
    public List<LteMobilityProfileResult> getMobilityProfileResult() {
        if (mobilityProfileResult == null) {
            mobilityProfileResult = new ArrayList<LteMobilityProfileResult>();
        }
        return this.mobilityProfileResult;
    }

}
