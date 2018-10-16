
package Netspan.NBI_16_5.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbBaseManagementProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbBaseManagementProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IBridgeBaseManagementProfileResult" type="{http://Airspan.Netspan.WebServices}IBridgeBaseManagementProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbBaseManagementProfileGetResult", propOrder = {
    "iBridgeBaseManagementProfileResult"
})
public class IbBaseManagementProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridgeBaseManagementProfileResult")
    protected List<IBridgeBaseManagementProfileResult> iBridgeBaseManagementProfileResult;

    /**
     * Gets the value of the iBridgeBaseManagementProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridgeBaseManagementProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridgeBaseManagementProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeBaseManagementProfileResult }
     * 
     * 
     */
    public List<IBridgeBaseManagementProfileResult> getIBridgeBaseManagementProfileResult() {
        if (iBridgeBaseManagementProfileResult == null) {
            iBridgeBaseManagementProfileResult = new ArrayList<IBridgeBaseManagementProfileResult>();
        }
        return this.iBridgeBaseManagementProfileResult;
    }

}
