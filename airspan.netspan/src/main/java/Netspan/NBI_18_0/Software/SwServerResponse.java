
package Netspan.NBI_18_0.Software;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwServerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwServerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SoftwareServerResult" type="{http://Airspan.Netspan.WebServices}SwServerResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwServerResponse", propOrder = {
    "softwareServerResult"
})
public class SwServerResponse
    extends WsResponse
{

    @XmlElement(name = "SoftwareServerResult")
    protected List<SwServerResult> softwareServerResult;

    /**
     * Gets the value of the softwareServerResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareServerResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareServerResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwServerResult }
     * 
     * 
     */
    public List<SwServerResult> getSoftwareServerResult() {
        if (softwareServerResult == null) {
            softwareServerResult = new ArrayList<SwServerResult>();
        }
        return this.softwareServerResult;
    }

}
