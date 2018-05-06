
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteUlPktDataPriorityEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteUlPktDataPriorityEntryWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrafficType" type="{http://Airspan.Netspan.WebServices}LteNetworkProfileUlPktDataPriority"/>
 *         &lt;element name="Dscp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VlanPcp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteUlPktDataPriorityEntryWs", propOrder = {
    "trafficType",
    "dscp",
    "vlanPcp"
})
public class LteUlPktDataPriorityEntryWs {

    @XmlElement(name = "TrafficType", required = true)
    @XmlSchemaType(name = "string")
    protected LteNetworkProfileUlPktDataPriority trafficType;
    @XmlElementRef(name = "Dscp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dscp;
    @XmlElementRef(name = "VlanPcp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> vlanPcp;

    /**
     * Gets the value of the trafficType property.
     * 
     * @return
     *     possible object is
     *     {@link LteNetworkProfileUlPktDataPriority }
     *     
     */
    public LteNetworkProfileUlPktDataPriority getTrafficType() {
        return trafficType;
    }

    /**
     * Sets the value of the trafficType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNetworkProfileUlPktDataPriority }
     *     
     */
    public void setTrafficType(LteNetworkProfileUlPktDataPriority value) {
        this.trafficType = value;
    }

    /**
     * Gets the value of the dscp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDscp() {
        return dscp;
    }

    /**
     * Sets the value of the dscp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDscp(JAXBElement<Integer> value) {
        this.dscp = value;
    }

    /**
     * Gets the value of the vlanPcp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVlanPcp() {
        return vlanPcp;
    }

    /**
     * Sets the value of the vlanPcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVlanPcp(JAXBElement<Integer> value) {
        this.vlanPcp = value;
    }

}
