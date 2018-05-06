
package Netspan.NBI_15_2.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbBaseRadioProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbBaseRadioProfileGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="IBridgeBaseRadioProfileResult" type="{http://Airspan.Netspan.WebServices}IBridgeBaseRadioProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbBaseRadioProfileGetResult", propOrder = {
    "iBridgeBaseRadioProfileResult"
})
public class IbBaseRadioProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridgeBaseRadioProfileResult")
    protected List<IBridgeBaseRadioProfileResult> iBridgeBaseRadioProfileResult;

    /**
     * Gets the value of the iBridgeBaseRadioProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridgeBaseRadioProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridgeBaseRadioProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeBaseRadioProfileResult }
     * 
     * 
     */
    public List<IBridgeBaseRadioProfileResult> getIBridgeBaseRadioProfileResult() {
        if (iBridgeBaseRadioProfileResult == null) {
            iBridgeBaseRadioProfileResult = new ArrayList<IBridgeBaseRadioProfileResult>();
        }
        return this.iBridgeBaseRadioProfileResult;
    }

}
