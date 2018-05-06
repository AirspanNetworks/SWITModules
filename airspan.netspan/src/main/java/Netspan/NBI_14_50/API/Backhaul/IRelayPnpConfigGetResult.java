
package Netspan.NBI_14_50.API.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IRelayPnpConfigGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IRelayPnpConfigGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="IRelayPnpConfig" type="{http://Airspan.Netspan.WebServices}IRelayPnpConfigWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IRelayPnpConfigGetResult", propOrder = {
    "iRelayPnpConfig"
})
public class IRelayPnpConfigGetResult
    extends WsResponse
{

    @XmlElement(name = "IRelayPnpConfig")
    protected List<IRelayPnpConfigWs> iRelayPnpConfig;

    /**
     * Gets the value of the iRelayPnpConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iRelayPnpConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIRelayPnpConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IRelayPnpConfigWs }
     * 
     * 
     */
    public List<IRelayPnpConfigWs> getIRelayPnpConfig() {
        if (iRelayPnpConfig == null) {
            iRelayPnpConfig = new ArrayList<IRelayPnpConfigWs>();
        }
        return this.iRelayPnpConfig;
    }

}
