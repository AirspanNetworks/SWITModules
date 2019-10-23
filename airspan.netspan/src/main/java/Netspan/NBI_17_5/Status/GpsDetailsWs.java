
package Netspan.NBI_17_5.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GpsDetailsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GpsDetailsWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comms" type="{http://Airspan.Netspan.WebServices}GpsCommsWs" minOccurs="0"/&gt;
 *         &lt;element name="TrackedSatellites" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VisibleSatellites" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Snr" type="{http://Airspan.Netspan.WebServices}GpsSnrWs" minOccurs="0"/&gt;
 *         &lt;element name="Satellite" type="{http://Airspan.Netspan.WebServices}Satellite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GpsFileStatus" type="{http://Airspan.Netspan.WebServices}GpsFileStatusValues" minOccurs="0"/&gt;
 *         &lt;element name="AlarmStatusList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GpsDetailsWs", propOrder = {
    "status",
    "comms",
    "trackedSatellites",
    "visibleSatellites",
    "snr",
    "satellite",
    "gpsFileStatus",
    "alarmStatusList"
})
public class GpsDetailsWs {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElementRef(name = "Comms", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<GpsCommsWs> comms;
    @XmlElementRef(name = "TrackedSatellites", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> trackedSatellites;
    @XmlElementRef(name = "VisibleSatellites", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> visibleSatellites;
    @XmlElementRef(name = "Snr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<GpsSnrWs> snr;
    @XmlElement(name = "Satellite")
    protected List<Satellite> satellite;
    @XmlElementRef(name = "GpsFileStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<GpsFileStatusValues> gpsFileStatus;
    @XmlElement(name = "AlarmStatusList")
    protected List<String> alarmStatusList;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the comms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GpsCommsWs }{@code >}
     *     
     */
    public JAXBElement<GpsCommsWs> getComms() {
        return comms;
    }

    /**
     * Sets the value of the comms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GpsCommsWs }{@code >}
     *     
     */
    public void setComms(JAXBElement<GpsCommsWs> value) {
        this.comms = value;
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
     * Gets the value of the snr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GpsSnrWs }{@code >}
     *     
     */
    public JAXBElement<GpsSnrWs> getSnr() {
        return snr;
    }

    /**
     * Sets the value of the snr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GpsSnrWs }{@code >}
     *     
     */
    public void setSnr(JAXBElement<GpsSnrWs> value) {
        this.snr = value;
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
     * Gets the value of the alarmStatusList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmStatusList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmStatusList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlarmStatusList() {
        if (alarmStatusList == null) {
            alarmStatusList = new ArrayList<String>();
        }
        return this.alarmStatusList;
    }

}
