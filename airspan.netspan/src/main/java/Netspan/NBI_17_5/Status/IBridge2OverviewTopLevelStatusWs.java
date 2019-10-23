
package Netspan.NBI_17_5.Status;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2OverviewTopLevelStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2OverviewTopLevelStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ssid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WirelessStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkUptime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LinkAvailabilty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2OverviewTopLevelStatusWs", propOrder = {
    "ssid",
    "linkMode",
    "wirelessStatus",
    "linkUptime",
    "linkAvailabilty"
})
public class IBridge2OverviewTopLevelStatusWs {

    @XmlElement(name = "Ssid")
    protected String ssid;
    @XmlElement(name = "LinkMode")
    protected String linkMode;
    @XmlElement(name = "WirelessStatus")
    protected String wirelessStatus;
    @XmlElementRef(name = "LinkUptime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> linkUptime;
    @XmlElement(name = "LinkAvailabilty")
    protected String linkAvailabilty;

    /**
     * Gets the value of the ssid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsid() {
        return ssid;
    }

    /**
     * Sets the value of the ssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsid(String value) {
        this.ssid = value;
    }

    /**
     * Gets the value of the linkMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkMode() {
        return linkMode;
    }

    /**
     * Sets the value of the linkMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkMode(String value) {
        this.linkMode = value;
    }

    /**
     * Gets the value of the wirelessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessStatus() {
        return wirelessStatus;
    }

    /**
     * Sets the value of the wirelessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessStatus(String value) {
        this.wirelessStatus = value;
    }

    /**
     * Gets the value of the linkUptime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLinkUptime() {
        return linkUptime;
    }

    /**
     * Sets the value of the linkUptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLinkUptime(JAXBElement<BigDecimal> value) {
        this.linkUptime = value;
    }

    /**
     * Gets the value of the linkAvailabilty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkAvailabilty() {
        return linkAvailabilty;
    }

    /**
     * Sets the value of the linkAvailabilty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkAvailabilty(String value) {
        this.linkAvailabilty = value;
    }

}
