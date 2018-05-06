
package Netspan.NBI_15_2.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeTermSystemDefaultProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeTermSystemDefaultProfileGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="IBridgeBaseSystemDefaultProfileResult" type="{http://Airspan.Netspan.WebServices}IBridgeTermSystemDefaultProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeTermSystemDefaultProfileGetResult", propOrder = {
    "iBridgeBaseSystemDefaultProfileResult"
})
public class IBridgeTermSystemDefaultProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "IBridgeBaseSystemDefaultProfileResult")
    protected List<IBridgeTermSystemDefaultProfileResult> iBridgeBaseSystemDefaultProfileResult;

    /**
     * Gets the value of the iBridgeBaseSystemDefaultProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iBridgeBaseSystemDefaultProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBridgeBaseSystemDefaultProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeTermSystemDefaultProfileResult }
     * 
     * 
     */
    public List<IBridgeTermSystemDefaultProfileResult> getIBridgeBaseSystemDefaultProfileResult() {
        if (iBridgeBaseSystemDefaultProfileResult == null) {
            iBridgeBaseSystemDefaultProfileResult = new ArrayList<IBridgeTermSystemDefaultProfileResult>();
        }
        return this.iBridgeBaseSystemDefaultProfileResult;
    }

}
