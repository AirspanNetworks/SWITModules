
package Netspan.NBI_17_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierAggregationWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierAggregationWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Earfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Band" type="{http://Airspan.Netspan.WebServices}RelayBands" minOccurs="0"/&gt;
 *         &lt;element name="Pci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Bandwidth" type="{http://Airspan.Netspan.WebServices}RelaySccBandwidths" minOccurs="0"/&gt;
 *         &lt;element name="CaState" type="{http://Airspan.Netspan.WebServices}RelaySccCaStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierAggregationWs", propOrder = {
    "componentCarrier",
    "earfcn",
    "band",
    "pci",
    "bandwidth",
    "caState"
})
public class CarrierAggregationWs {

    @XmlElement(name = "ComponentCarrier")
    protected String componentCarrier;
    @XmlElementRef(name = "Earfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> earfcn;
    @XmlElementRef(name = "Band", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelayBands> band;
    @XmlElementRef(name = "Pci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci;
    @XmlElementRef(name = "Bandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelaySccBandwidths> bandwidth;
    @XmlElementRef(name = "CaState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelaySccCaStates> caState;

    /**
     * Gets the value of the componentCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentCarrier() {
        return componentCarrier;
    }

    /**
     * Sets the value of the componentCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentCarrier(String value) {
        this.componentCarrier = value;
    }

    /**
     * Gets the value of the earfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEarfcn() {
        return earfcn;
    }

    /**
     * Sets the value of the earfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEarfcn(JAXBElement<Integer> value) {
        this.earfcn = value;
    }

    /**
     * Gets the value of the band property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelayBands }{@code >}
     *     
     */
    public JAXBElement<RelayBands> getBand() {
        return band;
    }

    /**
     * Sets the value of the band property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelayBands }{@code >}
     *     
     */
    public void setBand(JAXBElement<RelayBands> value) {
        this.band = value;
    }

    /**
     * Gets the value of the pci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPci() {
        return pci;
    }

    /**
     * Sets the value of the pci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPci(JAXBElement<Integer> value) {
        this.pci = value;
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelaySccBandwidths }{@code >}
     *     
     */
    public JAXBElement<RelaySccBandwidths> getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelaySccBandwidths }{@code >}
     *     
     */
    public void setBandwidth(JAXBElement<RelaySccBandwidths> value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the caState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelaySccCaStates }{@code >}
     *     
     */
    public JAXBElement<RelaySccCaStates> getCaState() {
        return caState;
    }

    /**
     * Sets the value of the caState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelaySccCaStates }{@code >}
     *     
     */
    public void setCaState(JAXBElement<RelaySccCaStates> value) {
        this.caState = value;
    }

}
