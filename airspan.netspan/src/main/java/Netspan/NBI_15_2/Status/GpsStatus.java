
package Netspan.NBI_15_2.Status;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GpsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GpsStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackedSatellites" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VisibleSatellites" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GpsComms" type="{http://Airspan.Netspan.WebServices}TrapStatusGpsComms" minOccurs="0"/&gt;
 *         &lt;element name="GpsLock" type="{http://Airspan.Netspan.WebServices}TrapStatusGpsLock" minOccurs="0"/&gt;
 *         &lt;element name="GpsSnr" type="{http://Airspan.Netspan.WebServices}TrapStatusGpsSnr" minOccurs="0"/&gt;
 *         &lt;element name="GpsFileStatus" type="{http://Airspan.Netspan.WebServices}GpsFileStatusValues" minOccurs="0"/&gt;
 *         &lt;element name="Satellite" type="{http://Airspan.Netspan.WebServices}Satellite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LocationAccuracy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PnpRefLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PnpRefLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GpsStatus", propOrder = {
    "name",
    "nodeId",
    "longitude",
    "latitude",
    "height",
    "trackedSatellites",
    "visibleSatellites",
    "gpsComms",
    "gpsLock",
    "gpsSnr",
    "gpsFileStatus",
    "satellite",
    "locationAccuracy",
    "pnpRefLongitude",
    "pnpRefLatitude"
})
public class GpsStatus {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Height")
    protected String height;
    @XmlElementRef(name = "TrackedSatellites", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> trackedSatellites;
    @XmlElementRef(name = "VisibleSatellites", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> visibleSatellites;
    @XmlElementRef(name = "GpsComms", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TrapStatusGpsComms> gpsComms;
    @XmlElementRef(name = "GpsLock", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TrapStatusGpsLock> gpsLock;
    @XmlElementRef(name = "GpsSnr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TrapStatusGpsSnr> gpsSnr;
    @XmlElementRef(name = "GpsFileStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<GpsFileStatusValues> gpsFileStatus;
    @XmlElement(name = "Satellite")
    protected List<Satellite> satellite;
    @XmlElementRef(name = "LocationAccuracy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> locationAccuracy;
    @XmlElementRef(name = "PnpRefLongitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnpRefLongitude;
    @XmlElementRef(name = "PnpRefLatitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnpRefLatitude;

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
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeId(String value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the trackedSatellites property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTrackedSatellites() {
        return trackedSatellites;
    }

    /**
     * Sets the value of the trackedSatellites property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTrackedSatellites(JAXBElement<Integer> value) {
        this.trackedSatellites = value;
    }

    /**
     * Gets the value of the visibleSatellites property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVisibleSatellites() {
        return visibleSatellites;
    }

    /**
     * Sets the value of the visibleSatellites property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVisibleSatellites(JAXBElement<Integer> value) {
        this.visibleSatellites = value;
    }

    /**
     * Gets the value of the gpsComms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrapStatusGpsComms }{@code >}
     *     
     */
    public JAXBElement<TrapStatusGpsComms> getGpsComms() {
        return gpsComms;
    }

    /**
     * Sets the value of the gpsComms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrapStatusGpsComms }{@code >}
     *     
     */
    public void setGpsComms(JAXBElement<TrapStatusGpsComms> value) {
        this.gpsComms = value;
    }

    /**
     * Gets the value of the gpsLock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrapStatusGpsLock }{@code >}
     *     
     */
    public JAXBElement<TrapStatusGpsLock> getGpsLock() {
        return gpsLock;
    }

    /**
     * Sets the value of the gpsLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrapStatusGpsLock }{@code >}
     *     
     */
    public void setGpsLock(JAXBElement<TrapStatusGpsLock> value) {
        this.gpsLock = value;
    }

    /**
     * Gets the value of the gpsSnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrapStatusGpsSnr }{@code >}
     *     
     */
    public JAXBElement<TrapStatusGpsSnr> getGpsSnr() {
        return gpsSnr;
    }

    /**
     * Sets the value of the gpsSnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrapStatusGpsSnr }{@code >}
     *     
     */
    public void setGpsSnr(JAXBElement<TrapStatusGpsSnr> value) {
        this.gpsSnr = value;
    }

    /**
     * Gets the value of the gpsFileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GpsFileStatusValues }{@code >}
     *     
     */
    public JAXBElement<GpsFileStatusValues> getGpsFileStatus() {
        return gpsFileStatus;
    }

    /**
     * Sets the value of the gpsFileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GpsFileStatusValues }{@code >}
     *     
     */
    public void setGpsFileStatus(JAXBElement<GpsFileStatusValues> value) {
        this.gpsFileStatus = value;
    }

    /**
     * Gets the value of the satellite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the satellite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSatellite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Satellite }
     * 
     * 
     */
    public List<Satellite> getSatellite() {
        if (satellite == null) {
            satellite = new ArrayList<Satellite>();
        }
        return this.satellite;
    }

    /**
     * Gets the value of the locationAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLocationAccuracy() {
        return locationAccuracy;
    }

    /**
     * Sets the value of the locationAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLocationAccuracy(JAXBElement<BigDecimal> value) {
        this.locationAccuracy = value;
    }

    /**
     * Gets the value of the pnpRefLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPnpRefLongitude() {
        return pnpRefLongitude;
    }

    /**
     * Sets the value of the pnpRefLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPnpRefLongitude(JAXBElement<BigDecimal> value) {
        this.pnpRefLongitude = value;
    }

    /**
     * Gets the value of the pnpRefLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPnpRefLatitude() {
        return pnpRefLatitude;
    }

    /**
     * Sets the value of the pnpRefLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPnpRefLatitude(JAXBElement<BigDecimal> value) {
        this.pnpRefLatitude = value;
    }

}
