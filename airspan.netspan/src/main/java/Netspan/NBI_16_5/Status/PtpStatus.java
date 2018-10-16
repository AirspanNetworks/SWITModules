
package Netspan.NBI_16_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PtpStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtpStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MasterConnectivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Holdover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoldExpiredTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoldoverExpired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveMasterStatus" type="{http://Airspan.Netspan.WebServices}ActivePtpTypes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtpStatus", propOrder = {
    "name",
    "nodeId",
    "masterConnectivity",
    "syncStatus",
    "holdover",
    "holdExpiredTime",
    "holdoverExpired",
    "activeMasterStatus"
})
public class PtpStatus {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElement(name = "MasterConnectivity")
    protected String masterConnectivity;
    @XmlElement(name = "SyncStatus")
    protected String syncStatus;
    @XmlElement(name = "Holdover")
    protected String holdover;
    @XmlElementRef(name = "HoldExpiredTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> holdExpiredTime;
    @XmlElement(name = "HoldoverExpired")
    protected String holdoverExpired;
    @XmlElementRef(name = "ActiveMasterStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ActivePtpTypes> activeMasterStatus;

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
     * Gets the value of the masterConnectivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterConnectivity() {
        return masterConnectivity;
    }

    /**
     * Sets the value of the masterConnectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterConnectivity(String value) {
        this.masterConnectivity = value;
    }

    /**
     * Gets the value of the syncStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncStatus() {
        return syncStatus;
    }

    /**
     * Sets the value of the syncStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncStatus(String value) {
        this.syncStatus = value;
    }

    /**
     * Gets the value of the holdover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldover() {
        return holdover;
    }

    /**
     * Sets the value of the holdover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldover(String value) {
        this.holdover = value;
    }

    /**
     * Gets the value of the holdExpiredTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoldExpiredTime() {
        return holdExpiredTime;
    }

    /**
     * Sets the value of the holdExpiredTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoldExpiredTime(JAXBElement<Integer> value) {
        this.holdExpiredTime = value;
    }

    /**
     * Gets the value of the holdoverExpired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldoverExpired() {
        return holdoverExpired;
    }

    /**
     * Sets the value of the holdoverExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldoverExpired(String value) {
        this.holdoverExpired = value;
    }

    /**
     * Gets the value of the activeMasterStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivePtpTypes }{@code >}
     *     
     */
    public JAXBElement<ActivePtpTypes> getActiveMasterStatus() {
        return activeMasterStatus;
    }

    /**
     * Sets the value of the activeMasterStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivePtpTypes }{@code >}
     *     
     */
    public void setActiveMasterStatus(JAXBElement<ActivePtpTypes> value) {
        this.activeMasterStatus = value;
    }

}
