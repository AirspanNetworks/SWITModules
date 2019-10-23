
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2TermManagementParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2TermManagementParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NtpServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryDns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryDns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagementVlan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManagementVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LedBrightness" type="{http://Airspan.Netspan.WebServices}LedBrightness" minOccurs="0"/&gt;
 *         &lt;element name="TwoPointFourGhzChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxClients" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2TermManagementParams", propOrder = {
    "ntpServer",
    "primaryDns",
    "secondaryDns",
    "managementVlan",
    "managementVlanId",
    "ledBrightness",
    "twoPointFourGhzChannel",
    "maxClients"
})
@XmlSeeAlso({
    IBridge2TermManagementProfile.class
})
public class IBridge2TermManagementParams {

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
    @XmlElementRef(name = "LedBrightness", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<LedBrightness> ledBrightness;
    @XmlElementRef(name = "TwoPointFourGhzChannel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> twoPointFourGhzChannel;
    @XmlElementRef(name = "MaxClients", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxClients;

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

    /**
     * Gets the value of the ledBrightness property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LedBrightness }{@code >}
     *     
     */
    public JAXBElement<LedBrightness> getLedBrightness() {
        return ledBrightness;
    }

    /**
     * Sets the value of the ledBrightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LedBrightness }{@code >}
     *     
     */
    public void setLedBrightness(JAXBElement<LedBrightness> value) {
        this.ledBrightness = value;
    }

    /**
     * Gets the value of the twoPointFourGhzChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTwoPointFourGhzChannel() {
        return twoPointFourGhzChannel;
    }

    /**
     * Sets the value of the twoPointFourGhzChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTwoPointFourGhzChannel(JAXBElement<Integer> value) {
        this.twoPointFourGhzChannel = value;
    }

    /**
     * Gets the value of the maxClients property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxClients() {
        return maxClients;
    }

    /**
     * Sets the value of the maxClients property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxClients(JAXBElement<Integer> value) {
        this.maxClients = value;
    }

}
