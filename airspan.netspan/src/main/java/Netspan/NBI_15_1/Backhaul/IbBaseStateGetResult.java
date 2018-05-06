
package Netspan.NBI_15_1.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbBaseStateGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbBaseStateGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="IBridgeBaseStateResult" type="{http://Airspan.Netspan.WebServices}IbBaseStateGetWs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbBaseStateGetResult", propOrder = {
    "iBridgeBaseStateResult",
    "nodeResult"
})
public class IbBaseStateGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridgeBaseStateResult")
    protected List<IbBaseStateGetWs> iBridgeBaseStateResult;
    @XmlElement(name = "NodeResult")
    protected List<NodeResult> nodeResult;

    /**
     * Gets the value of the iBridgeBaseStateResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridgeBaseStateResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridgeBaseStateResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IbBaseStateGetWs }
     * 
     * 
     */
    public List<IbBaseStateGetWs> getIBridgeBaseStateResult() {
        if (iBridgeBaseStateResult == null) {
            iBridgeBaseStateResult = new ArrayList<IbBaseStateGetWs>();
        }
        return this.iBridgeBaseStateResult;
    }

    /**
     * Gets the value of the nodeResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeResult }
     * 
     * 
     */
    public List<NodeResult> getNodeResult() {
        if (nodeResult == null) {
            nodeResult = new ArrayList<NodeResult>();
        }
        return this.nodeResult;
    }

}
