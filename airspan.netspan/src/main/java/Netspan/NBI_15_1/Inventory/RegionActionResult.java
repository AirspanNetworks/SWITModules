
package Netspan.NBI_15_1.Inventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionActionResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Region" type="{http://Airspan.Netspan.WebServices}RegionResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionActionResult", propOrder = {
    "region"
})
public class RegionActionResult
    extends WsResponse
{

    @XmlElement(name = "Region")
    protected List<RegionResult> region;

    /**
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionResult }
     * 
     * 
     */
    public List<RegionResult> getRegion() {
        if (region == null) {
            region = new ArrayList<RegionResult>();
        }
        return this.region;
    }

}
