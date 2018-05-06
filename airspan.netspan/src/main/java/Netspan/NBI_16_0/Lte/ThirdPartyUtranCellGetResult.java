
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyUtranCellGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyUtranCellGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="ThirdPartyUtranCellResult" type="{http://Airspan.Netspan.WebServices}ThirdPartyUtranCellResultWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyUtranCellGetResult", propOrder = {
    "thirdPartyUtranCellResult"
})
public class ThirdPartyUtranCellGetResult
    extends WsResponse
{

    @XmlElement(name = "ThirdPartyUtranCellResult")
    protected List<ThirdPartyUtranCellResultWs> thirdPartyUtranCellResult;

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
     * {@link ThirdPartyUtranCellResultWs }
     * 
     * 
     */
    public List<ThirdPartyUtranCellResultWs> getThirdPartyUtranCellResult() {
        if (thirdPartyUtranCellResult == null) {
            thirdPartyUtranCellResult = new ArrayList<ThirdPartyUtranCellResultWs>();
        }
        return this.thirdPartyUtranCellResult;
    }

}
