
package Netspan.NBI_18_0.Software;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwWindowResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwWindowResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SoftwareWindowResult" type="{http://Airspan.Netspan.WebServices}SwWindowResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwWindowResponse", propOrder = {
    "softwareWindowResult"
})
public class SwWindowResponse
    extends WsResponse
{

    @XmlElement(name = "SoftwareWindowResult")
    protected List<SwWindowResult> softwareWindowResult;

    /**
     * Gets the value of the softwareWindowResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareWindowResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareWindowResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwWindowResult }
     * 
     * 
     */
    public List<SwWindowResult> getSoftwareWindowResult() {
        if (softwareWindowResult == null) {
            softwareWindowResult = new ArrayList<SwWindowResult>();
        }
        return this.softwareWindowResult;
    }

}
