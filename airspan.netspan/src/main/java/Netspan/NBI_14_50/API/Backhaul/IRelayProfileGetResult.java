
package Netspan.NBI_14_50.API.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IRelayProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IRelayProfileGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="IRelayProfileResult" type="{http://Airspan.Netspan.WebServices}IRelayProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IRelayProfileGetResult", propOrder = {
    "iRelayProfileResult"
})
public class IRelayProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "IRelayProfileResult")
    protected List<IRelayProfileResult> iRelayProfileResult;

    /**
     * Gets the value of the iRelayProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iRelayProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIRelayProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IRelayProfileResult }
     * 
     * 
     */
    public List<IRelayProfileResult> getIRelayProfileResult() {
        if (iRelayProfileResult == null) {
            iRelayProfileResult = new ArrayList<IRelayProfileResult>();
        }
        return this.iRelayProfileResult;
    }

}
