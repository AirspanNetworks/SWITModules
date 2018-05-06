
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteSystemDefaultGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSystemDefaultGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="SystemDefaultProfileResult" type="{http://Airspan.Netspan.WebServices}LteSystemDefaultProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSystemDefaultGetResult", propOrder = {
    "systemDefaultProfileResult"
})
public class LteSystemDefaultGetResult
    extends WsResponse
{

    @XmlElement(name = "SystemDefaultProfileResult")
    protected List<LteSystemDefaultProfileResult> systemDefaultProfileResult;

    /**
     * Gets the value of the systemDefaultProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemDefaultProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemDefaultProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteSystemDefaultProfileResult }
     * 
     * 
     */
    public List<LteSystemDefaultProfileResult> getSystemDefaultProfileResult() {
        if (systemDefaultProfileResult == null) {
            systemDefaultProfileResult = new ArrayList<LteSystemDefaultProfileResult>();
        }
        return this.systemDefaultProfileResult;
    }

}
