
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteFaultManagementProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteFaultManagementProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FaultManagementProfileResult" type="{http://Airspan.Netspan.WebServices}LteFaultManagementProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteFaultManagementProfileGetResult", propOrder = {
    "faultManagementProfileResult"
})
public class LteFaultManagementProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "FaultManagementProfileResult")
    protected List<LteFaultManagementProfileResult> faultManagementProfileResult;

    /**
     * Gets the value of the faultManagementProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultManagementProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultManagementProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteFaultManagementProfileResult }
     * 
     * 
     */
    public List<LteFaultManagementProfileResult> getFaultManagementProfileResult() {
        if (faultManagementProfileResult == null) {
            faultManagementProfileResult = new ArrayList<LteFaultManagementProfileResult>();
        }
        return this.faultManagementProfileResult;
    }

}
