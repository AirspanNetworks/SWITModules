
package Netspan.NBI_16_5.Inventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteActionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Site" type="{http://Airspan.Netspan.WebServices}SiteResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteActionResult", propOrder = {
    "site"
})
public class SiteActionResult
    extends WsResponse
{

    @XmlElement(name = "Site")
    protected List<SiteResult> site;

    /**
     * Gets the value of the site property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the site property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteResult }
     * 
     * 
     */
    public List<SiteResult> getSite() {
        if (site == null) {
            site = new ArrayList<SiteResult>();
        }
        return this.site;
    }

}
