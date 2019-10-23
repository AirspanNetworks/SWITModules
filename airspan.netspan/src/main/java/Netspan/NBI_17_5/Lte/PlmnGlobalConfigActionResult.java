
package Netspan.NBI_17_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlmnGlobalConfigActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlmnGlobalConfigActionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlmnGlobalConfigResult" type="{http://Airspan.Netspan.WebServices}PlmnGlobalConfigResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlmnGlobalConfigActionResult", propOrder = {
    "plmnGlobalConfigResult"
})
public class PlmnGlobalConfigActionResult
    extends WsResponse
{

    @XmlElement(name = "PlmnGlobalConfigResult")
    protected List<PlmnGlobalConfigResult> plmnGlobalConfigResult;

    /**
     * Gets the value of the plmnGlobalConfigResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plmnGlobalConfigResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlmnGlobalConfigResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlmnGlobalConfigResult }
     * 
     * 
     */
    public List<PlmnGlobalConfigResult> getPlmnGlobalConfigResult() {
        if (plmnGlobalConfigResult == null) {
            plmnGlobalConfigResult = new ArrayList<PlmnGlobalConfigResult>();
        }
        return this.plmnGlobalConfigResult;
    }

}
