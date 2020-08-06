
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ibridge2GpsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ibridge2GpsStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Snr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoOfSatellites" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AvgSatelliteSnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ibridge2GpsStatus", propOrder = {
    "name",
    "nodeId",
    "longitude",
    "latitude",
    "altitude",
    "snr",
    "noOfSatellites",
    "avgSatelliteSnr"
})
public class Ibridge2GpsStatus {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Altitude")
    protected String altitude;
    @XmlElement(name = "Snr")
    protected String snr;
    @XmlElement(name = "NoOfSatellites")
    protected int noOfSatellites;
    @XmlElement(name = "AvgSatelliteSnr")
    protected String avgSatelliteSnr;

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
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitude(String value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the snr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnr() {
        return snr;
    }

    /**
     * Sets the value of the snr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnr(String value) {
        this.snr = value;
    }

    /**
     * Gets the value of the noOfSatellites property.
     * 
     */
    public int getNoOfSatellites() {
        return noOfSatellites;
    }

    /**
     * Sets the value of the noOfSatellites property.
     * 
     */
    public void setNoOfSatellites(int value) {
        this.noOfSatellites = value;
    }

    /**
     * Gets the value of the avgSatelliteSnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgSatelliteSnr() {
        return avgSatelliteSnr;
    }

    /**
     * Sets the value of the avgSatelliteSnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgSatelliteSnr(String value) {
        this.avgSatelliteSnr = value;
    }

}
