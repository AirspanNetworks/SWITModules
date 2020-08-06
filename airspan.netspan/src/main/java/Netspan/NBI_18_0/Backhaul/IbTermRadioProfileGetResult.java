
package Netspan.NBI_18_0.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IbTermRadioProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbTermRadioProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IBridgeTermRadioProfileResult" type="{http://Airspan.Netspan.WebServices}IBridgeTermRadioProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbTermRadioProfileGetResult", propOrder = {
    "iBridgeTermRadioProfileResult"
})
public class IbTermRadioProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridgeTermRadioProfileResult")
    protected List<IBridgeTermRadioProfileResult> iBridgeTermRadioProfileResult;

    /**
     * Gets the value of the iBridgeTermRadioProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridgeTermRadioProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridgeTermRadioProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeTermRadioProfileResult }
     * 
     * 
     */
    public List<IBridgeTermRadioProfileResult> getIBridgeTermRadioProfileResult() {
        if (iBridgeTermRadioProfileResult == null) {
            iBridgeTermRadioProfileResult = new ArrayList<IBridgeTermRadioProfileResult>();
        }
        return this.iBridgeTermRadioProfileResult;
    }

}
