
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteSyncProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSyncProfileGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="SyncProfileResult" type="{http://Airspan.Netspan.WebServices}LteSyncProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSyncProfileGetResult", propOrder = {
    "syncProfileResult"
})
public class LteSyncProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "SyncProfileResult")
    protected List<LteSyncProfileResult> syncProfileResult;

    /**
     * Gets the value of the syncProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the syncProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSyncProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteSyncProfileResult }
     * 
     * 
     */
    public List<LteSyncProfileResult> getSyncProfileResult() {
        if (syncProfileResult == null) {
            syncProfileResult = new ArrayList<LteSyncProfileResult>();
        }
        return this.syncProfileResult;
    }

}
