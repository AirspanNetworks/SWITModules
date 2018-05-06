
package Netspan.NBI_15_1.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lte3rdPartyGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lte3rdPartyGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Lte3rdPartyResult" type="{http://Airspan.Netspan.WebServices}Lte3rdPartyResultWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lte3rdPartyGetResult", propOrder = {
    "lte3RdPartyResult"
})
public class Lte3RdPartyGetResult
    extends WsResponse
{

    @XmlElement(name = "Lte3rdPartyResult")
    protected List<Lte3RdPartyResultWs> lte3RdPartyResult;

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
     * {@link Lte3RdPartyResultWs }
     * 
     * 
     */
    public List<Lte3RdPartyResultWs> getLte3RdPartyResult() {
        if (lte3RdPartyResult == null) {
            lte3RdPartyResult = new ArrayList<Lte3RdPartyResultWs>();
        }
        return this.lte3RdPartyResult;
    }

}
