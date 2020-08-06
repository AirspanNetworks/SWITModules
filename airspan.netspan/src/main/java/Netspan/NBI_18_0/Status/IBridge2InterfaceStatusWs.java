
package Netspan.NBI_18_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2InterfaceStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2InterfaceStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InterfaceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InterfaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdminStatus" type="{http://Airspan.Netspan.WebServices}AdminStatuses"/&gt;
 *         &lt;element name="OperationalStatus" type="{http://Airspan.Netspan.WebServices}OperationalStatuses"/&gt;
 *         &lt;element name="Mtu" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SpeedMbps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2InterfaceStatusWs", propOrder = {
    "index",
    "interfaceDescription",
    "interfaceName",
    "adminStatus",
    "operationalStatus",
    "mtu",
    "speedMbps"
})
public class IBridge2InterfaceStatusWs {

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "InterfaceDescription")
    protected String interfaceDescription;
    @XmlElement(name = "InterfaceName")
    protected String interfaceName;
    @XmlElement(name = "AdminStatus", required = true)
    @XmlSchemaType(name = "string")
    protected AdminStatuses adminStatus;
    @XmlElement(name = "OperationalStatus", required = true)
    @XmlSchemaType(name = "string")
    protected OperationalStatuses operationalStatus;
    @XmlElement(name = "Mtu")
    protected int mtu;
    @XmlElementRef(name = "SpeedMbps", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> speedMbps;

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the interfaceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceDescription() {
        return interfaceDescription;
    }

    /**
     * Sets the value of the interfaceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceDescription(String value) {
        this.interfaceDescription = value;
    }

    /**
     * Gets the value of the interfaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the value of the interfaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceName(String value) {
        this.interfaceName = value;
    }

    /**
     * Gets the value of the adminStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdminStatuses }
     *     
     */
    public AdminStatuses getAdminStatus() {
        return adminStatus;
    }

    /**
     * Sets the value of the adminStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminStatuses }
     *     
     */
    public void setAdminStatus(AdminStatuses value) {
        this.adminStatus = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalStatuses }
     *     
     */
    public OperationalStatuses getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalStatuses }
     *     
     */
    public void setOperationalStatus(OperationalStatuses value) {
        this.operationalStatus = value;
    }

    /**
     * Gets the value of the mtu property.
     * 
     */
    public int getMtu() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     */
    public void setMtu(int value) {
        this.mtu = value;
    }

    /**
     * Gets the value of the speedMbps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSpeedMbps() {
        return speedMbps;
    }

    /**
     * Sets the value of the speedMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSpeedMbps(JAXBElement<Integer> value) {
        this.speedMbps = value;
    }

}
