
package Netspan.NBI_15_5.Status;

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
 * &lt;complexType name="LteMaintenanceWindowList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaintenanceWindowEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="MaintenanceWinActive" type="{http://Airspan.Netspan.WebServices}ActiveStatus" minOccurs="0"/>
 *         &lt;element name="MaintenanceWindowEntry" type="{http://Airspan.Netspan.WebServices}LteMaintenanceWindowWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteMaintenanceWindowList", propOrder = {
    "maintenanceWindowEnabled",
    "maintenanceWinActive",
    "maintenanceWindowEntry"
})
public class LteMaintenanceWindowList {

    @XmlElementRef(name = "MaintenanceWindowEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> maintenanceWindowEnabled;
    @XmlElementRef(name = "MaintenanceWinActive", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveStatus> maintenanceWinActive;
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
