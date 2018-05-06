
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CsfbCdma2kSib8Params complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CsfbCdma2kSib8Params">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MultipleSid" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="MultipleNid" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="HomeReg" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="ForeignSidReg" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="ForeignNidReg" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="ParameterReg" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="PowerUpReg" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="PowerDownReg" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="RegistrationPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RegistrationZone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalZone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZoneTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CsfbCdma2kSib8Params", propOrder = {
    "sid",
    "nid",
    "multipleSid",
    "multipleNid",
    "homeReg",
    "foreignSidReg",
    "foreignNidReg",
    "parameterReg",
    "powerUpReg",
    "powerDownReg",
    "registrationPeriod",
    "registrationZone",
    "totalZone",
    "zoneTimer"
})
public class CsfbCdma2KSib8Params {

    @XmlElementRef(name = "Sid", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sid;
    @XmlElementRef(name = "Nid", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nid;
    @XmlElementRef(name = "MultipleSid", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> multipleSid;
    @XmlElementRef(name = "MultipleNid", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> multipleNid;
    @XmlElementRef(name = "HomeReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> homeReg;
    @XmlElementRef(name = "ForeignSidReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> foreignSidReg;
    @XmlElementRef(name = "ForeignNidReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> foreignNidReg;
    @XmlElementRef(name = "ParameterReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> parameterReg;
    @XmlElementRef(name = "PowerUpReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> powerUpReg;
    @XmlElementRef(name = "PowerDownReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> powerDownReg;
    @XmlElementRef(name = "RegistrationPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> registrationPeriod;
    @XmlElementRef(name = "RegistrationZone", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> registrationZone;
    @XmlElementRef(name = "TotalZone", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalZone;
    @XmlElementRef(name = "ZoneTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> zoneTimer;

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSid(JAXBElement<Integer> value) {
        this.sid = value;
    }

    /**
     * Gets the value of the nid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNid() {
        return nid;
    }

    /**
     * Sets the value of the nid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNid(JAXBElement<Integer> value) {
        this.nid = value;
    }

    /**
     * Gets the value of the multipleSid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getMultipleSid() {
        return multipleSid;
    }

    /**
     * Sets the value of the multipleSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setMultipleSid(JAXBElement<EnabledDisabledValues> value) {
        this.multipleSid = value;
    }

    /**
     * Gets the value of the multipleNid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getMultipleNid() {
        return multipleNid;
    }

    /**
     * Sets the value of the multipleNid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setMultipleNid(JAXBElement<EnabledDisabledValues> value) {
        this.multipleNid = value;
    }

    /**
     * Gets the value of the homeReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getHomeReg() {
        return homeReg;
    }

    /**
     * Sets the value of the homeReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setHomeReg(JAXBElement<EnabledDisabledValues> value) {
        this.homeReg = value;
    }

    /**
     * Gets the value of the foreignSidReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getForeignSidReg() {
        return foreignSidReg;
    }

    /**
     * Sets the value of the foreignSidReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setForeignSidReg(JAXBElement<EnabledDisabledValues> value) {
        this.foreignSidReg = value;
    }

    /**
     * Gets the value of the foreignNidReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getForeignNidReg() {
        return foreignNidReg;
    }

    /**
     * Sets the value of the foreignNidReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setForeignNidReg(JAXBElement<EnabledDisabledValues> value) {
        this.foreignNidReg = value;
    }

    /**
     * Gets the value of the parameterReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getParameterReg() {
        return parameterReg;
    }

    /**
     * Sets the value of the parameterReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setParameterReg(JAXBElement<EnabledDisabledValues> value) {
        this.parameterReg = value;
    }

    /**
     * Gets the value of the powerUpReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getPowerUpReg() {
        return powerUpReg;
    }

    /**
     * Sets the value of the powerUpReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setPowerUpReg(JAXBElement<EnabledDisabledValues> value) {
        this.powerUpReg = value;
    }

    /**
     * Gets the value of the powerDownReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getPowerDownReg() {
        return powerDownReg;
    }

    /**
     * Sets the value of the powerDownReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setPowerDownReg(JAXBElement<EnabledDisabledValues> value) {
        this.powerDownReg = value;
    }

    /**
     * Gets the value of the registrationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRegistrationPeriod() {
        return registrationPeriod;
    }

    /**
     * Sets the value of the registrationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRegistrationPeriod(JAXBElement<Integer> value) {
        this.registrationPeriod = value;
    }

    /**
     * Gets the value of the registrationZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRegistrationZone() {
        return registrationZone;
    }

    /**
     * Sets the value of the registrationZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRegistrationZone(JAXBElement<Integer> value) {
        this.registrationZone = value;
    }

    /**
     * Gets the value of the totalZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalZone() {
        return totalZone;
    }

    /**
     * Sets the value of the totalZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalZone(JAXBElement<Integer> value) {
        this.totalZone = value;
    }

    /**
     * Gets the value of the zoneTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZoneTimer() {
        return zoneTimer;
    }

    /**
     * Sets the value of the zoneTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZoneTimer(JAXBElement<Integer> value) {
        this.zoneTimer = value;
    }

}
