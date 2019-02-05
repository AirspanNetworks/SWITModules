
package Netspan.NBI_15_2.Server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NmsUserGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NmsUserGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NmsUserResult" type="{http://Airspan.Netspan.WebServices}NmsUserResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NmsUserGetResult", propOrder = {
    "nmsUserResult"
})
public class NmsUserGetResult
    extends WsResponse
{

    @XmlElement(name = "NmsUserResult")
    protected List<NmsUserResult> nmsUserResult;

    /**
     * Gets the value of the nmsUserResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nmsUserResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNmsUserResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NmsUserResult }
     * 
     * 
     */
    public List<NmsUserResult> getNmsUserResult() {
        if (nmsUserResult == null) {
            nmsUserResult = new ArrayList<NmsUserResult>();
        }
        return this.nmsUserResult;
    }

}
