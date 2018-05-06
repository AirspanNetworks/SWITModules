
package Netspan.NBI_14_0.API.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GpsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GpsStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackedSatellites" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VisibleSatellites" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GpsComms" type="{http://Airspan.Netspan.WebServices}TrapStatusGpsComms"/>
 *         &lt;element name="GpsLock" type="{http://Airspan.Netspan.WebServices}TrapStatusGpsLock"/>
 *         &lt;element name="GpsSnr" type="{http://Airspan.Netspan.WebServices}TrapStatusGpsSnr"/>
 *         &lt;element name="Satellite" type="{http://Airspan.Netspan.WebServices}Satellite" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "satellite"
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
    @XmlElement(name = "TrackedSatellites", required = true, type = Integer.class, nillable = true)
    protected Integer trackedSatellites;
    @XmlElement(name = "VisibleSatellites", required = true, type = Integer.class, nillable = true)
    protected Integer visibleSatellites;
    @XmlElement(name = "GpsComms", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TrapStatusGpsComms gpsComms;
    @XmlElement(name = "GpsLock", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TrapStatusGpsLock gpsLock;
    @XmlElement(name = "GpsSnr", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TrapStatusGpsSnr gpsSnr;
    @XmlElement(name = "Satellite")
    protected List<Satellite> satellite;

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
     *     {@link Integer }
     *     
     */
    public Integer getTrackedSatellites() {
        return trackedSatellites;
    }

    /**
     * Sets the value of the trackedSatellites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrackedSatellites(Integer value) {
        this.trackedSatellites = value;
    }

    /**
     * Gets the value of the visibleSatellites property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisibleSatellites() {
        return visibleSatellites;
    }

    /**
     * Sets the value of the visibleSatellites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisibleSatellites(Integer value) {
        this.visibleSatellites = value;
    }

    /**
     * Gets the value of the gpsComms property.
     * 
     * @return
     *     possible object is
     *     {@link TrapStatusGpsComms }
     *     
     */
    public TrapStatusGpsComms getGpsComms() {
        return gpsComms;
    }

    /**
     * Sets the value of the gpsComms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapStatusGpsComms }
     *     
     */
    public void setGpsComms(TrapStatusGpsComms value) {
        this.gpsComms = value;
    }

    /**
     * Gets the value of the gpsLock property.
     * 
     * @return
     *     possible object is
     *     {@link TrapStatusGpsLock }
     *     
     */
    public TrapStatusGpsLock getGpsLock() {
        return gpsLock;
    }

    /**
     * Sets the value of the gpsLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapStatusGpsLock }
     *     
     */
    public void setGpsLock(TrapStatusGpsLock value) {
        this.gpsLock = value;
    }

    /**
     * Gets the value of the gpsSnr property.
     * 
     * @return
     *     possible object is
     *     {@link TrapStatusGpsSnr }
     *     
     */
    public TrapStatusGpsSnr getGpsSnr() {
        return gpsSnr;
    }

    /**
     * Sets the value of the gpsSnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapStatusGpsSnr }
     *     
     */
    public void setGpsSnr(TrapStatusGpsSnr value) {
        this.gpsSnr = value;
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

}
