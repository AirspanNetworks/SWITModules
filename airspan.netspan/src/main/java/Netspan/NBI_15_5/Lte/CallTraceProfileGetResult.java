
package Netspan.NBI_15_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallTraceProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallTraceProfileGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="CallTraceProfileResult" type="{http://Airspan.Netspan.WebServices}CallTraceProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallTraceProfileGetResult", propOrder = {
    "callTraceProfileResult"
})
public class CallTraceProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "CallTraceProfileResult")
    protected List<CallTraceProfileResult> callTraceProfileResult;

    /**
     * Gets the value of the callTraceProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callTraceProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallTraceProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallTraceProfileResult }
     * 
     * 
     */
    public List<CallTraceProfileResult> getCallTraceProfileResult() {
        if (callTraceProfileResult == null) {
            callTraceProfileResult = new ArrayList<CallTraceProfileResult>();
        }
        return this.callTraceProfileResult;
    }

}
