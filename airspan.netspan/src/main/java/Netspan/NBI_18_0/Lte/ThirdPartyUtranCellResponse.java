
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyUtranCellResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyUtranCellResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ThirdPartyUtranCellResult" type="{http://Airspan.Netspan.WebServices}ThirdPartyUtranCellResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyUtranCellResponse", propOrder = {
    "thirdPartyUtranCellResult"
})
public class ThirdPartyUtranCellResponse
    extends WsResponse
{

    @XmlElement(name = "ThirdPartyUtranCellResult")
    protected List<ThirdPartyUtranCellResult> thirdPartyUtranCellResult;

    /**
     * Gets the value of the thirdPartyUtranCellResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyUtranCellResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyUtranCellResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyUtranCellResult }
     * 
     * 
     */
    public List<ThirdPartyUtranCellResult> getThirdPartyUtranCellResult() {
        if (thirdPartyUtranCellResult == null) {
            thirdPartyUtranCellResult = new ArrayList<ThirdPartyUtranCellResult>();
        }
        return this.thirdPartyUtranCellResult;
    }

}
