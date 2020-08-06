
package Netspan.NBI_18_0.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib440ProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440ProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ib440ProfileResult" type="{http://Airspan.Netspan.WebServices}Ib11acQosProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440ProfileGetResult", propOrder = {
    "ib440ProfileResult"
})
public class Ib440ProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "Ib440ProfileResult")
    protected List<Ib11AcQosProfileResult> ib440ProfileResult;

    /**
     * Gets the value of the ib440ProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ib440ProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIb440ProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ib11AcQosProfileResult }
     * 
     * 
     */
    public List<Ib11AcQosProfileResult> getIb440ProfileResult() {
        if (ib440ProfileResult == null) {
            ib440ProfileResult = new ArrayList<Ib11AcQosProfileResult>();
        }
        return this.ib440ProfileResult;
    }

}
