
package Netspan.NBI_17_5.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2BaseManagementProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2BaseManagementProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IBridge2BaseManagementProfileResult" type="{http://Airspan.Netspan.WebServices}IBridge2BaseManagementProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2BaseManagementProfileGetResult", propOrder = {
    "iBridge2BaseManagementProfileResult"
})
public class IBridge2BaseManagementProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridge2BaseManagementProfileResult")
    protected List<IBridge2BaseManagementProfileResult> iBridge2BaseManagementProfileResult;

    /**
     * Gets the value of the iBridge2BaseManagementProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridge2BaseManagementProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridge2BaseManagementProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridge2BaseManagementProfileResult }
     * 
     * 
     */
    public List<IBridge2BaseManagementProfileResult> getIBridge2BaseManagementProfileResult() {
        if (iBridge2BaseManagementProfileResult == null) {
            iBridge2BaseManagementProfileResult = new ArrayList<IBridge2BaseManagementProfileResult>();
        }
        return this.iBridge2BaseManagementProfileResult;
    }

}
