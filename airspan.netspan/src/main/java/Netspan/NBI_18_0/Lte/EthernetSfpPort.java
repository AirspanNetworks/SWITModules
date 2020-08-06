
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EthernetSfpPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EthernetSfpPort"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortName" type="{http://Airspan.Netspan.WebServices}PortNames" minOccurs="0"/&gt;
 *         &lt;element name="PortType" type="{http://Airspan.Netspan.WebServices}PortTypes" minOccurs="0"/&gt;
 *         &lt;element name="AdminState" type="{http://Airspan.Netspan.WebServices}PortAdminState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EthernetSfpPort", propOrder = {
    "portName",
    "portType",
    "adminState"
})
public class EthernetSfpPort {

    @XmlElementRef(name = "PortName", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PortNames> portName;
    @XmlElementRef(name = "PortType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PortTypes> portType;
    @XmlElementRef(name = "AdminState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PortAdminState> adminState;

    /**
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PortNames }{@code >}
     *     
     */
    public JAXBElement<PortNames> getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PortNames }{@code >}
     *     
     */
    public void setPortName(JAXBElement<PortNames> value) {
        this.portName = value;
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PortTypes }{@code >}
     *     
     */
    public JAXBElement<PortTypes> getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PortTypes }{@code >}
     *     
     */
    public void setPortType(JAXBElement<PortTypes> value) {
        this.portType = value;
    }

    /**
     * Gets the value of the adminState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PortAdminState }{@code >}
     *     
     */
    public JAXBElement<PortAdminState> getAdminState() {
        return adminState;
    }

    /**
     * Sets the value of the adminState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PortAdminState }{@code >}
     *     
     */
    public void setAdminState(JAXBElement<PortAdminState> value) {
        this.adminState = value;
    }

}
