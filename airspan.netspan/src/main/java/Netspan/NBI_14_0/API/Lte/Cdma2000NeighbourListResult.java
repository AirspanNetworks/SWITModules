
package Netspan.NBI_14_0.API.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cdma2000NeighbourListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cdma2000NeighbourListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Cdma2000Neighbour" type="{http://Airspan.Netspan.WebServices}Cdma2kNeighbourWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cdma2000NeighbourListResult", propOrder = {
    "cdma2000Neighbour"
})
public class Cdma2000NeighbourListResult
    extends WsResponse
{

    @XmlElement(name = "Cdma2000Neighbour")
    protected List<Cdma2KNeighbourWs> cdma2000Neighbour;

    /**
     * Gets the value of the cdma2000Neighbour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdma2000Neighbour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdma2000Neighbour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cdma2KNeighbourWs }
     * 
     * 
     */
    public List<Cdma2KNeighbourWs> getCdma2000Neighbour() {
        if (cdma2000Neighbour == null) {
            cdma2000Neighbour = new ArrayList<Cdma2KNeighbourWs>();
        }
        return this.cdma2000Neighbour;
    }

}
