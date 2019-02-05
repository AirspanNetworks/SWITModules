
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for NeighbourNrtPciWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighbourNrtPciWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PciStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PciEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AllowX2" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="HoType" type="{http://Airspan.Netspan.WebServices}NrtHoTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighbourNrtPciWs", propOrder = {
    "pciStart",
    "pciEnd",
    "allowX2",
    "hoType"
})
public class NeighbourNrtPciWs {

    @XmlElementRef(name = "PciStart", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pciStart;
    @XmlElementRef(name = "PciEnd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pciEnd;
    @XmlElementRef(name = "AllowX2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> allowX2;
    @XmlElementRef(name = "HoType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<NrtHoTypes> hoType;

    /**
     * Gets the value of the pciStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPciStart() {
        return pciStart;
    }

    /**
     * Sets the value of the pciStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPciStart(JAXBElement<Integer> value) {
        this.pciStart = value;
    }

    /**
     * Gets the value of the pciEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPciEnd() {
        return pciEnd;
    }

    /**
     * Sets the value of the pciEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPciEnd(JAXBElement<Integer> value) {
        this.pciEnd = value;
    }

    /**
     * Gets the value of the allowX2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getAllowX2() {
        return allowX2;
    }

    /**
     * Sets the value of the allowX2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setAllowX2(JAXBElement<EnabledStates> value) {
        this.allowX2 = value;
    }

    /**
     * Gets the value of the hoType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NrtHoTypes }{@code >}
     *     
     */
    public JAXBElement<NrtHoTypes> getHoType() {
        return hoType;
    }

    /**
     * Sets the value of the hoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NrtHoTypes }{@code >}
     *     
     */
    public void setHoType(JAXBElement<NrtHoTypes> value) {
        this.hoType = value;
    }

}
