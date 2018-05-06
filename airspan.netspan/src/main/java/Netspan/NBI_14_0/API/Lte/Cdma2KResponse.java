
package Netspan.NBI_14_0.API.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cdma2kResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cdma2kResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Cdma2kResult" type="{http://Airspan.Netspan.WebServices}Cdma2kResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cdma2kResponse", propOrder = {
    "cdma2KResult"
})
public class Cdma2KResponse
    extends WsResponse
{

    @XmlElement(name = "Cdma2kResult")
    protected List<Cdma2KResult> cdma2KResult;

    /**
     * Gets the value of the cdma2KResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdma2KResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdma2KResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cdma2KResult }
     * 
     * 
     */
    public List<Cdma2KResult> getCdma2KResult() {
        if (cdma2KResult == null) {
            cdma2KResult = new ArrayList<Cdma2KResult>();
        }
        return this.cdma2KResult;
    }

}
