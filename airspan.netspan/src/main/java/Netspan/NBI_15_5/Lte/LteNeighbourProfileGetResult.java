
package Netspan.NBI_15_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteNeighbourProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteNeighbourProfileGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="NeighbourProfileResult" type="{http://Airspan.Netspan.WebServices}LteNeighbourProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteNeighbourProfileGetResult", propOrder = {
    "neighbourProfileResult"
})
public class LteNeighbourProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "NeighbourProfileResult")
    protected List<LteNeighbourProfileResult> neighbourProfileResult;

    /**
     * Gets the value of the neighbourProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neighbourProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeighbourProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteNeighbourProfileResult }
     * 
     * 
     */
    public List<LteNeighbourProfileResult> getNeighbourProfileResult() {
        if (neighbourProfileResult == null) {
            neighbourProfileResult = new ArrayList<LteNeighbourProfileResult>();
        }
        return this.neighbourProfileResult;
    }

}
