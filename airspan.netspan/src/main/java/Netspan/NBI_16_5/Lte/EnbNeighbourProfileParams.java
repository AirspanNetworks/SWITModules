
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for EnbNeighbourProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbNeighbourProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NrtDefaultConfig" type="{http://Airspan.Netspan.WebServices}NeighbourNrtDefaultConfig" minOccurs="0"/&gt;
 *         &lt;element name="NrtBandList" type="{http://Airspan.Netspan.WebServices}NeighbourNrtBandListContainer" minOccurs="0"/&gt;
 *         &lt;element name="NrtEarfcnList" type="{http://Airspan.Netspan.WebServices}NeighbourNrtEarfcnListContainer" minOccurs="0"/&gt;
 *         &lt;element name="HomeEnbDefaultConfig" type="{http://Airspan.Netspan.WebServices}NeighbourHomeEnbDefaultConfig" minOccurs="0"/&gt;
 *         &lt;element name="HomeEnbBandList" type="{http://Airspan.Netspan.WebServices}NeighbourHomeEnbBandListContainer" minOccurs="0"/&gt;
 *         &lt;element name="HomeEnbEarfcnList" type="{http://Airspan.Netspan.WebServices}NeighbourHomeEnbEarfcnListContainer" minOccurs="0"/&gt;
 *         &lt;element name="UtraEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="UtraArfcnList" type="{http://Airspan.Netspan.WebServices}NeighbourUtraEarfcnListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbNeighbourProfileParams", propOrder = {
    "nrtDefaultConfig",
    "nrtBandList",
    "nrtEarfcnList",
    "homeEnbDefaultConfig",
    "homeEnbBandList",
    "homeEnbEarfcnList",
    "utraEnabled",
    "utraArfcnList"
})
@XmlSeeAlso({
    EnbNeighbourProfile.class
})
public class EnbNeighbourProfileParams {

    @XmlElement(name = "NrtDefaultConfig")
    protected NeighbourNrtDefaultConfig nrtDefaultConfig;
    @XmlElement(name = "NrtBandList")
    protected NeighbourNrtBandListContainer nrtBandList;
    @XmlElement(name = "NrtEarfcnList")
    protected NeighbourNrtEarfcnListContainer nrtEarfcnList;
    @XmlElement(name = "HomeEnbDefaultConfig")
    protected NeighbourHomeEnbDefaultConfig homeEnbDefaultConfig;
    @XmlElement(name = "HomeEnbBandList")
    protected NeighbourHomeEnbBandListContainer homeEnbBandList;
    @XmlElement(name = "HomeEnbEarfcnList")
    protected NeighbourHomeEnbEarfcnListContainer homeEnbEarfcnList;
    @XmlElementRef(name = "UtraEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> utraEnabled;
    @XmlElement(name = "UtraArfcnList")
    protected NeighbourUtraEarfcnListContainer utraArfcnList;

    /**
     * Gets the value of the nrtDefaultConfig property.
     * 
     * @return
     *     possible object is
     *     {@link NeighbourNrtDefaultConfig }
     *     
     */
    public NeighbourNrtDefaultConfig getNrtDefaultConfig() {
        return nrtDefaultConfig;
    }

    /**
     * Sets the value of the nrtDefaultConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighbourNrtDefaultConfig }
     *     
     */
    public void setNrtDefaultConfig(NeighbourNrtDefaultConfig value) {
        this.nrtDefaultConfig = value;
    }

    /**
     * Gets the value of the nrtBandList property.
     * 
     * @return
     *     possible object is
     *     {@link NeighbourNrtBandListContainer }
     *     
     */
    public NeighbourNrtBandListContainer getNrtBandList() {
        return nrtBandList;
    }

    /**
     * Sets the value of the nrtBandList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighbourNrtBandListContainer }
     *     
     */
    public void setNrtBandList(NeighbourNrtBandListContainer value) {
        this.nrtBandList = value;
    }

    /**
     * Gets the value of the nrtEarfcnList property.
     * 
     * @return
     *     possible object is
     *     {@link NeighbourNrtEarfcnListContainer }
     *     
     */
    public NeighbourNrtEarfcnListContainer getNrtEarfcnList() {
        return nrtEarfcnList;
    }

    /**
     * Sets the value of the nrtEarfcnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighbourNrtEarfcnListContainer }
     *     
     */
    public void setNrtEarfcnList(NeighbourNrtEarfcnListContainer value) {
        this.nrtEarfcnList = value;
    }

    /**
     * Gets the value of the homeEnbDefaultConfig property.
     * 
     * @return
     *     possible object is
     *     {@link NeighbourHomeEnbDefaultConfig }
     *     
     */
    public NeighbourHomeEnbDefaultConfig getHomeEnbDefaultConfig() {
        return homeEnbDefaultConfig;
    }

    /**
     * Sets the value of the homeEnbDefaultConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighbourHomeEnbDefaultConfig }
     *     
     */
    public void setHomeEnbDefaultConfig(NeighbourHomeEnbDefaultConfig value) {
        this.homeEnbDefaultConfig = value;
    }

    /**
     * Gets the value of the homeEnbBandList property.
     * 
     * @return
     *     possible object is
     *     {@link NeighbourHomeEnbBandListContainer }
     *     
     */
    public NeighbourHomeEnbBandListContainer getHomeEnbBandList() {
        return homeEnbBandList;
    }

    /**
     * Sets the value of the homeEnbBandList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighbourHomeEnbBandListContainer }
     *     
     */
    public void setHomeEnbBandList(NeighbourHomeEnbBandListContainer value) {
        this.homeEnbBandList = value;
    }

    /**
     * Gets the value of the homeEnbEarfcnList property.
     * 
     * @return
     *     possible object is
     *     {@link NeighbourHomeEnbEarfcnListContainer }
     *     
     */
    public NeighbourHomeEnbEarfcnListContainer getHomeEnbEarfcnList() {
        return homeEnbEarfcnList;
    }

    /**
     * Sets the value of the homeEnbEarfcnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighbourHomeEnbEarfcnListContainer }
     *     
     */
    public void setHomeEnbEarfcnList(NeighbourHomeEnbEarfcnListContainer value) {
        this.homeEnbEarfcnList = value;
    }

    /**
     * Gets the value of the utraEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getUtraEnabled() {
        return utraEnabled;
    }

    /**
     * Sets the value of the utraEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setUtraEnabled(JAXBElement<EnabledStates> value) {
        this.utraEnabled = value;
    }

    /**
     * Gets the value of the utraArfcnList property.
     * 
     * @return
     *     possible object is
     *     {@link NeighbourUtraEarfcnListContainer }
     *     
     */
    public NeighbourUtraEarfcnListContainer getUtraArfcnList() {
        return utraArfcnList;
    }

    /**
     * Sets the value of the utraArfcnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighbourUtraEarfcnListContainer }
     *     
     */
    public void setUtraArfcnList(NeighbourUtraEarfcnListContainer value) {
        this.utraArfcnList = value;
    }

}
