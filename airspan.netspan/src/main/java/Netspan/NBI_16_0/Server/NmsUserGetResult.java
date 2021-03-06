
package Netspan.NBI_16_0.Server;

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
 * &lt;complexType name="NmsUserGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="NmsUserResult" type="{http://Airspan.Netspan.WebServices}NmsUserResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
