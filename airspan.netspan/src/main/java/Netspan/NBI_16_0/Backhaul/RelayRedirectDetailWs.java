
package Netspan.NBI_16_0.Backhaul;

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
 * &lt;complexType name="RelayRedirectDetailWs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}BaseRedirect">
 *       &lt;sequence>
 *         &lt;element name="NmsSnmpServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NmsSnmpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayRedirectDetailWs", propOrder = {
    "nmsSnmpServer",
    "nmsSnmpPort"
})
public class RelayRedirectDetailWs
    extends BaseRedirect
{

    @XmlElement(name = "NmsSnmpServer")
    protected String nmsSnmpServer;
    @XmlElementRef(name = "NmsSnmpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nmsSnmpPort;

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

}
