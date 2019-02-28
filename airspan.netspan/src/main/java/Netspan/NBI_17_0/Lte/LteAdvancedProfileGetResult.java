
package Netspan.NBI_17_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteAdvancedProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteAdvancedProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvancedProfileResult" type="{http://Airspan.Netspan.WebServices}LteAdvancedProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteAdvancedProfileGetResult", propOrder = {
    "advancedProfileResult"
})
public class LteAdvancedProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "AdvancedProfileResult")
    protected List<LteAdvancedProfileResult> advancedProfileResult;

    /**
     * Gets the value of the advancedProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancedProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancedProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteAdvancedProfileResult }
     * 
     * 
     */
    public List<LteAdvancedProfileResult> getAdvancedProfileResult() {
        if (advancedProfileResult == null) {
            advancedProfileResult = new ArrayList<LteAdvancedProfileResult>();
        }
        return this.advancedProfileResult;
    }

}
