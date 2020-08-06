
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lte3rdPartyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lte3rdPartyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Lte3rdPartyResult" type="{http://Airspan.Netspan.WebServices}Lte3rdPartyResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lte3rdPartyResponse", propOrder = {
    "lte3RdPartyResult"
})
public class Lte3RdPartyResponse
    extends WsResponse
{

    @XmlElement(name = "Lte3rdPartyResult")
    protected List<Lte3RdPartyResult> lte3RdPartyResult;

    /**
     * Gets the value of the lte3RdPartyResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lte3RdPartyResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLte3RdPartyResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lte3RdPartyResult }
     * 
     * 
     */
    public List<Lte3RdPartyResult> getLte3RdPartyResult() {
        if (lte3RdPartyResult == null) {
            lte3RdPartyResult = new ArrayList<Lte3RdPartyResult>();
        }
        return this.lte3RdPartyResult;
    }

}
