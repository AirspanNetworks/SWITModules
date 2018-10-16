
package Netspan.NBI_16_5.Server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CtsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CtsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileResult" type="{http://Airspan.Netspan.WebServices}CtsResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtsResponse", propOrder = {
    "profileResult"
})
public class CtsResponse
    extends WsResponse
{

    @XmlElement(name = "ProfileResult")
    protected List<CtsResult> profileResult;

    /**
     * Gets the value of the profileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtsResult }
     * 
     * 
     */
    public List<CtsResult> getProfileResult() {
        if (profileResult == null) {
            profileResult = new ArrayList<CtsResult>();
        }
        return this.profileResult;
    }

}
