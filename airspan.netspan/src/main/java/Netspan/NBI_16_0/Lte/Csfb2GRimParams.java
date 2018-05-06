
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Csfb2gRimParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Csfb2gRimParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseStationColorCodePrimary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BaseStationColorCodeSecondary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CellIdentityPrimary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CellIdentitySecondary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocationAreaCodePrimary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocationAreaCodeSecondary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MccPrimary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MccSecondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MncPrimary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MncSecondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkColorCodePrimary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NetworkColorCodeSecondary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RoutingAreaCodePrimary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RoutingAreaCodeSecondary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Csfb2gRimParams", propOrder = {
    "baseStationColorCodePrimary",
    "baseStationColorCodeSecondary",
    "cellIdentityPrimary",
    "cellIdentitySecondary",
    "locationAreaCodePrimary",
    "locationAreaCodeSecondary",
    "mccPrimary",
    "mccSecondary",
    "mncPrimary",
    "mncSecondary",
    "networkColorCodePrimary",
    "networkColorCodeSecondary",
    "routingAreaCodePrimary",
    "routingAreaCodeSecondary"
})
public class Csfb2GRimParams {

    @XmlElementRef(name = "BaseStationColorCodePrimary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> baseStationColorCodePrimary;
    @XmlElementRef(name = "BaseStationColorCodeSecondary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> baseStationColorCodeSecondary;
    @XmlElementRef(name = "CellIdentityPrimary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellIdentityPrimary;
    @XmlElementRef(name = "CellIdentitySecondary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellIdentitySecondary;
    @XmlElementRef(name = "LocationAreaCodePrimary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> locationAreaCodePrimary;
    @XmlElementRef(name = "LocationAreaCodeSecondary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> locationAreaCodeSecondary;
    @XmlElement(name = "MccPrimary")
    protected String mccPrimary;
    @XmlElement(name = "MccSecondary")
    protected String mccSecondary;
    @XmlElement(name = "MncPrimary")
    protected String mncPrimary;
    @XmlElement(name = "MncSecondary")
    protected String mncSecondary;
    @XmlElementRef(name = "NetworkColorCodePrimary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> networkColorCodePrimary;
    @XmlElementRef(name = "NetworkColorCodeSecondary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> networkColorCodeSecondary;
    @XmlElementRef(name = "RoutingAreaCodePrimary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> routingAreaCodePrimary;
    @XmlElementRef(name = "RoutingAreaCodeSecondary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> routingAreaCodeSecondary;

    /**
     * Gets the value of the baseStationColorCodePrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBaseStationColorCodePrimary() {
        return baseStationColorCodePrimary;
    }

    /**
     * Sets the value of the baseStationColorCodePrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBaseStationColorCodePrimary(JAXBElement<Integer> value) {
        this.baseStationColorCodePrimary = value;
    }

    /**
     * Gets the value of the baseStationColorCodeSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBaseStationColorCodeSecondary() {
        return baseStationColorCodeSecondary;
    }

    /**
     * Sets the value of the baseStationColorCodeSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBaseStationColorCodeSecondary(JAXBElement<Integer> value) {
        this.baseStationColorCodeSecondary = value;
    }

    /**
     * Gets the value of the cellIdentityPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellIdentityPrimary() {
        return cellIdentityPrimary;
    }

    /**
     * Sets the value of the cellIdentityPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellIdentityPrimary(JAXBElement<Integer> value) {
        this.cellIdentityPrimary = value;
    }

    /**
     * Gets the value of the cellIdentitySecondary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellIdentitySecondary() {
        return cellIdentitySecondary;
    }

    /**
     * Sets the value of the cellIdentitySecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellIdentitySecondary(JAXBElement<Integer> value) {
        this.cellIdentitySecondary = value;
    }

    /**
     * Gets the value of the locationAreaCodePrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocationAreaCodePrimary() {
        return locationAreaCodePrimary;
    }

    /**
     * Sets the value of the locationAreaCodePrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocationAreaCodePrimary(JAXBElement<Integer> value) {
        this.locationAreaCodePrimary = value;
    }

    /**
     * Gets the value of the locationAreaCodeSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocationAreaCodeSecondary() {
        return locationAreaCodeSecondary;
    }

    /**
     * Sets the value of the locationAreaCodeSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocationAreaCodeSecondary(JAXBElement<Integer> value) {
        this.locationAreaCodeSecondary = value;
    }

    /**
     * Gets the value of the mccPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMccPrimary() {
        return mccPrimary;
    }

    /**
     * Sets the value of the mccPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMccPrimary(String value) {
        this.mccPrimary = value;
    }

    /**
     * Gets the value of the mccSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMccSecondary() {
        return mccSecondary;
    }

    /**
     * Sets the value of the mccSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMccSecondary(String value) {
        this.mccSecondary = value;
    }

    /**
     * Gets the value of the mncPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMncPrimary() {
        return mncPrimary;
    }

    /**
     * Sets the value of the mncPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMncPrimary(String value) {
        this.mncPrimary = value;
    }

    /**
     * Gets the value of the mncSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMncSecondary() {
        return mncSecondary;
    }

    /**
     * Sets the value of the mncSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMncSecondary(String value) {
        this.mncSecondary = value;
    }

    /**
     * Gets the value of the networkColorCodePrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNetworkColorCodePrimary() {
        return networkColorCodePrimary;
    }

    /**
     * Sets the value of the networkColorCodePrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNetworkColorCodePrimary(JAXBElement<Integer> value) {
        this.networkColorCodePrimary = value;
    }

    /**
     * Gets the value of the networkColorCodeSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNetworkColorCodeSecondary() {
        return networkColorCodeSecondary;
    }

    /**
     * Sets the value of the networkColorCodeSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNetworkColorCodeSecondary(JAXBElement<Integer> value) {
        this.networkColorCodeSecondary = value;
    }

    /**
     * Gets the value of the routingAreaCodePrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRoutingAreaCodePrimary() {
        return routingAreaCodePrimary;
    }

    /**
     * Sets the value of the routingAreaCodePrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRoutingAreaCodePrimary(JAXBElement<Integer> value) {
        this.routingAreaCodePrimary = value;
    }

    /**
     * Gets the value of the routingAreaCodeSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRoutingAreaCodeSecondary() {
        return routingAreaCodeSecondary;
    }

    /**
     * Sets the value of the routingAreaCodeSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRoutingAreaCodeSecondary(JAXBElement<Integer> value) {
        this.routingAreaCodeSecondary = value;
    }

}
