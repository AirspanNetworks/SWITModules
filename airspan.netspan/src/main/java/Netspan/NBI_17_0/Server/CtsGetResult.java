
package Netspan.NBI_17_0.Server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CtsGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CtsGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CtsResult" type="{http://Airspan.Netspan.WebServices}CtsResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtsGetResult", propOrder = {
    "ctsResult"
})
public class CtsGetResult
    extends WsResponse
{

    @XmlElement(name = "CtsResult")
    protected List<CtsResult> ctsResult;

    /**
     * Gets the value of the ctsResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctsResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtsResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtsResult }
     * 
     * 
     */
    public List<CtsResult> getCtsResult() {
        if (ctsResult == null) {
            ctsResult = new ArrayList<CtsResult>();
        }
        return this.ctsResult;
    }

}
