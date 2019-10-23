
package Netspan.NBI_17_5.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbResetRequiredStatusGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbResetRequiredStatusGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnbResetRequiredStatusResult" type="{http://Airspan.Netspan.WebServices}EnbResetRequiredStatusResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbResetRequiredStatusGetResult", propOrder = {
    "enbResetRequiredStatusResult"
})
public class EnbResetRequiredStatusGetResult
    extends WsResponse
{

    @XmlElement(name = "EnbResetRequiredStatusResult")
    protected List<EnbResetRequiredStatusResult> enbResetRequiredStatusResult;

    /**
     * Gets the value of the enbResetRequiredStatusResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enbResetRequiredStatusResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnbResetRequiredStatusResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnbResetRequiredStatusResult }
     * 
     * 
     */
    public List<EnbResetRequiredStatusResult> getEnbResetRequiredStatusResult() {
        if (enbResetRequiredStatusResult == null) {
            enbResetRequiredStatusResult = new ArrayList<EnbResetRequiredStatusResult>();
        }
        return this.enbResetRequiredStatusResult;
    }

}
