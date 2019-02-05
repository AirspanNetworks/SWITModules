
package Netspan.NBI_15_2.Server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileResult" type="{http://Airspan.Netspan.WebServices}UserResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserResponse", propOrder = {
    "profileResult"
})
public class UserResponse
    extends WsResponse
{

    @XmlElement(name = "ProfileResult")
    protected List<UserResult> profileResult;

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
     * {@link UserResult }
     * 
     * 
     */
    public List<UserResult> getProfileResult() {
        if (profileResult == null) {
            profileResult = new ArrayList<UserResult>();
        }
        return this.profileResult;
    }

}
