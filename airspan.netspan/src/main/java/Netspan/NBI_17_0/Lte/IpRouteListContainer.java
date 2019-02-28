
package Netspan.NBI_17_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IpRouteListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IpRouteListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IpRoute" type="{http://Airspan.Netspan.WebServices}EnbIPRouteWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpRouteListContainer", propOrder = {
    "ipRoute"
})
public class IpRouteListContainer {

    @XmlElement(name = "IpRoute")
    protected List<EnbIPRouteWs> ipRoute;

    /**
     * Gets the value of the ipRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnbIPRouteWs }
     * 
     * 
     */
    public List<EnbIPRouteWs> getIpRoute() {
        if (ipRoute == null) {
            ipRoute = new ArrayList<EnbIPRouteWs>();
        }
        return this.ipRoute;
    }

}
