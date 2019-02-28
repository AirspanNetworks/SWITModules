
package Netspan.NBI_17_0.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbMmManagementProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbMmManagementProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IBridge2ManagementProfileResult" type="{http://Airspan.Netspan.WebServices}IBridge2ManagementProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbMmManagementProfileGetResult", propOrder = {
    "iBridge2ManagementProfileResult"
})
public class IbMmManagementProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridge2ManagementProfileResult")
    protected List<IBridge2ManagementProfileResult> iBridge2ManagementProfileResult;

    /**
     * Gets the value of the iBridge2ManagementProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridge2ManagementProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridge2ManagementProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridge2ManagementProfileResult }
     * 
     * 
     */
    public List<IBridge2ManagementProfileResult> getIBridge2ManagementProfileResult() {
        if (iBridge2ManagementProfileResult == null) {
            iBridge2ManagementProfileResult = new ArrayList<IBridge2ManagementProfileResult>();
        }
        return this.iBridge2ManagementProfileResult;
    }

}
