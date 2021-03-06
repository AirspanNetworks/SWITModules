
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayRedirectDetailWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayRedirectDetailWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}BaseRedirect"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NmsSnmpServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NmsSnmpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SeGwAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSeGwInterfaceEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayRedirectDetailWs", propOrder = {
    "nmsSnmpServer",
    "nmsSnmpPort",
    "seGwAddress",
    "isSeGwInterfaceEnabled"
})
public class RelayRedirectDetailWs
    extends BaseRedirect
{

    @XmlElement(name = "NmsSnmpServer")
    protected String nmsSnmpServer;
    @XmlElementRef(name = "NmsSnmpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nmsSnmpPort;
    @XmlElement(name = "SeGwAddress")
    protected String seGwAddress;
    @XmlElement(name = "IsSeGwInterfaceEnabled")
    protected boolean isSeGwInterfaceEnabled;

    /**
     * Gets the value of the nmsSnmpServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmsSnmpServer() {
        return nmsSnmpServer;
    }

    /**
     * Sets the value of the nmsSnmpServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmsSnmpServer(String value) {
        this.nmsSnmpServer = value;
    }

    /**
     * Gets the value of the nmsSnmpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNmsSnmpPort() {
        return nmsSnmpPort;
    }

    /**
     * Sets the value of the nmsSnmpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNmsSnmpPort(JAXBElement<Integer> value) {
        this.nmsSnmpPort = value;
    }

    /**
     * Gets the value of the seGwAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeGwAddress() {
        return seGwAddress;
    }

    /**
     * Sets the value of the seGwAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeGwAddress(String value) {
        this.seGwAddress = value;
    }

    /**
     * Gets the value of the isSeGwInterfaceEnabled property.
     * 
     */
    public boolean isIsSeGwInterfaceEnabled() {
        return isSeGwInterfaceEnabled;
    }

    /**
     * Sets the value of the isSeGwInterfaceEnabled property.
     * 
     */
    public void setIsSeGwInterfaceEnabled(boolean value) {
        this.isSeGwInterfaceEnabled = value;
    }

}
