
package Netspan.NBI_15_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeDetailsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeDetailsWs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}AuPnpDetailWs">
 *       &lt;sequence>
 *         &lt;element name="Custom" type="{http://Airspan.Netspan.WebServices}NodeCustomProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeDetailsWs", propOrder = {
    "custom"
})
public class NodeDetailsWs
    extends AuPnpDetailWs
{

    @XmlElement(name = "Custom")
    protected List<NodeCustomProperty> custom;

    /**
     * Gets the value of the custom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeCustomProperty }
     * 
     * 
     */
    public List<NodeCustomProperty> getCustom() {
        if (custom == null) {
            custom = new ArrayList<NodeCustomProperty>();
        }
        return this.custom;
    }

}
