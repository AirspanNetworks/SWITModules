
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge11acQosProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge11acQosProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}IBridge440HardwareTypes" minOccurs="0"/&gt;
 *         &lt;element name="BandwidthRestriction" type="{http://Airspan.Netspan.WebServices}BandwidthRestrictions" minOccurs="0"/&gt;
 *         &lt;element name="UlBandwidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlBandwidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosProfileTrafficClassesList" type="{http://Airspan.Netspan.WebServices}Ib11acQosProfileTrafficClassesListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge11acQosProfile", propOrder = {
    "name",
    "hardwareCategory",
    "bandwidthRestriction",
    "ulBandwidth",
    "dlBandwidth",
    "qosProfileTrafficClassesList"
})
public class IBridge11AcQosProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge440HardwareTypes> hardwareCategory;
    @XmlElementRef(name = "BandwidthRestriction", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BandwidthRestrictions> bandwidthRestriction;
    @XmlElementRef(name = "UlBandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulBandwidth;
    @XmlElementRef(name = "DlBandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlBandwidth;
    @XmlElement(name = "QosProfileTrafficClassesList")
    protected Ib11AcQosProfileTrafficClassesListContainer qosProfileTrafficClassesList;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge440HardwareTypes }{@code >}
     *     
     */
    public JAXBElement<IBridge440HardwareTypes> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge440HardwareTypes }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<IBridge440HardwareTypes> value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the bandwidthRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BandwidthRestrictions }{@code >}
     *     
     */
    public JAXBElement<BandwidthRestrictions> getBandwidthRestriction() {
        return bandwidthRestriction;
    }

    /**
     * Sets the value of the bandwidthRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BandwidthRestrictions }{@code >}
     *     
     */
    public void setBandwidthRestriction(JAXBElement<BandwidthRestrictions> value) {
        this.bandwidthRestriction = value;
    }

    /**
     * Gets the value of the ulBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlBandwidth() {
        return ulBandwidth;
    }

    /**
     * Sets the value of the ulBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlBandwidth(JAXBElement<Double> value) {
        this.ulBandwidth = value;
    }

    /**
     * Gets the value of the dlBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlBandwidth() {
        return dlBandwidth;
    }

    /**
     * Sets the value of the dlBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlBandwidth(JAXBElement<Double> value) {
        this.dlBandwidth = value;
    }

    /**
     * Gets the value of the qosProfileTrafficClassesList property.
     * 
     * @return
     *     possible object is
     *     {@link Ib11AcQosProfileTrafficClassesListContainer }
     *     
     */
    public Ib11AcQosProfileTrafficClassesListContainer getQosProfileTrafficClassesList() {
        return qosProfileTrafficClassesList;
    }

    /**
     * Sets the value of the qosProfileTrafficClassesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ib11AcQosProfileTrafficClassesListContainer }
     *     
     */
    public void setQosProfileTrafficClassesList(Ib11AcQosProfileTrafficClassesListContainer value) {
        this.qosProfileTrafficClassesList = value;
    }

}
