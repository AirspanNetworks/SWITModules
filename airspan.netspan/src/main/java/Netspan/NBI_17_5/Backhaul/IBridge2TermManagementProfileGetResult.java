
package Netspan.NBI_17_5.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2TermManagementProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2TermManagementProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IBridge2TermManagementProfileResult" type="{http://Airspan.Netspan.WebServices}IBridge2TermManagementProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2TermManagementProfileGetResult", propOrder = {
    "iBridge2TermManagementProfileResult"
})
public class IBridge2TermManagementProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridge2TermManagementProfileResult")
    protected List<IBridge2TermManagementProfileResult> iBridge2TermManagementProfileResult;

    /**
     * Gets the value of the iBridge2TermManagementProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridge2TermManagementProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridge2TermManagementProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridge2TermManagementProfileResult }
     * 
     * 
     */
    public List<IBridge2TermManagementProfileResult> getIBridge2TermManagementProfileResult() {
        if (iBridge2TermManagementProfileResult == null) {
            iBridge2TermManagementProfileResult = new ArrayList<IBridge2TermManagementProfileResult>();
        }
        return this.iBridge2TermManagementProfileResult;
    }

}
