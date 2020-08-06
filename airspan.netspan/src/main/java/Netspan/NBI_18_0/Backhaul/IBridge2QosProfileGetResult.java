
package Netspan.NBI_18_0.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2QosProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2QosProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IBridge2QosProfileResult" type="{http://Airspan.Netspan.WebServices}IBridge2QosProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2QosProfileGetResult", propOrder = {
    "iBridge2QosProfileResult"
})
public class IBridge2QosProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridge2QosProfileResult")
    protected List<IBridge2QosProfileResult> iBridge2QosProfileResult;

    /**
     * Gets the value of the iBridge2QosProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridge2QosProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridge2QosProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridge2QosProfileResult }
     * 
     * 
     */
    public List<IBridge2QosProfileResult> getIBridge2QosProfileResult() {
        if (iBridge2QosProfileResult == null) {
            iBridge2QosProfileResult = new ArrayList<IBridge2QosProfileResult>();
        }
        return this.iBridge2QosProfileResult;
    }

}
