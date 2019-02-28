
package Netspan.NBI_17_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteMaintenanceWindowList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteMaintenanceWindowList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaintenanceWindowEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceWinActive" type="{http://Airspan.Netspan.WebServices}ActiveStatus" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeUtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxRandomDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceWindowEntry" type="{http://Airspan.Netspan.WebServices}LteMaintenanceWindowWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteMaintenanceWindowList", propOrder = {
    "maintenanceWindowEnabled",
    "maintenanceWinActive",
    "startTimeUtc",
    "maxRandomDelay",
    "maintenanceWindowEntry"
})
public class LteMaintenanceWindowList {

    @XmlElementRef(name = "MaintenanceWindowEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> maintenanceWindowEnabled;
    @XmlElementRef(name = "MaintenanceWinActive", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveStatus> maintenanceWinActive;
    @XmlElement(name = "StartTimeUtc")
    protected String startTimeUtc;
    @XmlElement(name = "MaxRandomDelay")
    protected String maxRandomDelay;
    @XmlElement(name = "MaintenanceWindowEntry")
    protected List<LteMaintenanceWindowWs> maintenanceWindowEntry;

    /**
     * Gets the value of the maintenanceWindowEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getMaintenanceWindowEnabled() {
        return maintenanceWindowEnabled;
    }

    /**
     * Sets the value of the maintenanceWindowEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setMaintenanceWindowEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.maintenanceWindowEnabled = value;
    }

    /**
     * Gets the value of the maintenanceWinActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActiveStatus }{@code >}
     *     
     */
    public JAXBElement<ActiveStatus> getMaintenanceWinActive() {
        return maintenanceWinActive;
    }

    /**
     * Sets the value of the maintenanceWinActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActiveStatus }{@code >}
     *     
     */
    public void setMaintenanceWinActive(JAXBElement<ActiveStatus> value) {
        this.maintenanceWinActive = value;
    }

    /**
     * Gets the value of the startTimeUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimeUtc() {
        return startTimeUtc;
    }

    /**
     * Sets the value of the startTimeUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeUtc(String value) {
        this.startTimeUtc = value;
    }

    /**
     * Gets the value of the maxRandomDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRandomDelay() {
        return maxRandomDelay;
    }

    /**
     * Sets the value of the maxRandomDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRandomDelay(String value) {
        this.maxRandomDelay = value;
    }

    /**
     * Gets the value of the maintenanceWindowEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceWindowEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceWindowEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteMaintenanceWindowWs }
     * 
     * 
     */
    public List<LteMaintenanceWindowWs> getMaintenanceWindowEntry() {
        if (maintenanceWindowEntry == null) {
            maintenanceWindowEntry = new ArrayList<LteMaintenanceWindowWs>();
        }
        return this.maintenanceWindowEntry;
    }

}
