
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2ManagementParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2ManagementParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TdmaTrafficSplit" type="{http://Airspan.Netspan.WebServices}IBridge2TdmaTrafficSplit" minOccurs="0"/&gt;
 *         &lt;element name="TdmaWindow" type="{http://Airspan.Netspan.WebServices}IBridge2TdmaWindow" minOccurs="0"/&gt;
 *         &lt;element name="NtpServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryDns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryDns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagementVlan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManagementVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2ManagementParams", propOrder = {
    "tdmaTrafficSplit",
    "tdmaWindow",
    "ntpServer",
    "primaryDns",
    "secondaryDns",
    "managementVlan",
    "managementVlanId"
})
@XmlSeeAlso({
    IBridge2ManagementProfile.class
})
public class IBridge2ManagementParams {

    @XmlElementRef(name = "TdmaTrafficSplit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2TdmaTrafficSplit> tdmaTrafficSplit;
    @XmlElementRef(name = "TdmaWindow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tdmaWindow;
    @XmlElement(name = "NtpServer")
    protected String ntpServer;
    @XmlElement(name = "PrimaryDns")
    protected String primaryDns;
    @XmlElement(name = "SecondaryDns")
    protected String secondaryDns;
    @XmlElementRef(name = "ManagementVlan", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> managementVlan;
    @XmlElementRef(name = "ManagementVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> managementVlanId;

    /**
     * Gets the value of the tdmaTrafficSplit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2TdmaTrafficSplit }{@code >}
     *     
     */
    public JAXBElement<IBridge2TdmaTrafficSplit> getTdmaTrafficSplit() {
        return tdmaTrafficSplit;
    }

    /**
     * Sets the value of the tdmaTrafficSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2TdmaTrafficSplit }{@code >}
     *     
     */
    public void setTdmaTrafficSplit(JAXBElement<IBridge2TdmaTrafficSplit> value) {
        this.tdmaTrafficSplit = value;
    }

    /**
     * Gets the value of the tdmaWindow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTdmaWindow() {
        return tdmaWindow;
    }

    /**
     * Sets the value of the tdmaWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTdmaWindow(JAXBElement<String> value) {
        this.tdmaWindow = value;
    }

    /**
     * Gets the value of the ntpServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServer() {
        return ntpServer;
    }

    /**
     * Sets the value of the ntpServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServer(String value) {
        this.ntpServer = value;
    }

    /**
     * Gets the value of the primaryDns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDns() {
        return primaryDns;
    }

    /**
     * Sets the value of the primaryDns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDns(String value) {
        this.primaryDns = value;
    }

    /**
     * Gets the value of the secondaryDns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryDns() {
        return secondaryDns;
    }

    /**
     * Sets the value of the secondaryDns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryDns(String value) {
        this.secondaryDns = value;
    }

    /**
     * Gets the value of the managementVlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getManagementVlan() {
        return managementVlan;
    }

    /**
     * Sets the value of the managementVlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setManagementVlan(JAXBElement<Boolean> value) {
        this.managementVlan = value;
    }

    /**
     * Gets the value of the managementVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getManagementVlanId() {
        return managementVlanId;
    }

    /**
     * Sets the value of the managementVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setManagementVlanId(JAXBElement<Integer> value) {
        this.managementVlanId = value;
    }

}
