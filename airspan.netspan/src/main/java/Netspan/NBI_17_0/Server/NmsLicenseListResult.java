
package Netspan.NBI_17_0.Server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NmsLicenseListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NmsLicenseListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="License" type="{http://Airspan.Netspan.WebServices}NmsLicenseWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NmsLicenseListResult", propOrder = {
    "license"
})
public class NmsLicenseListResult
    extends WsResponse
{

    @XmlElement(name = "License")
    protected List<NmsLicenseWs> license;

    /**
     * Gets the value of the license property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the license property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NmsLicenseWs }
     * 
     * 
     */
    public List<NmsLicenseWs> getLicense() {
        if (license == null) {
            license = new ArrayList<NmsLicenseWs>();
        }
        return this.license;
    }

}
