
package Netspan.NBI_14_50.API.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IRelayProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IRelayProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NtpServerIPAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseNms1" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NtpServerIPAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseNms2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NtpServerIPAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseNms3" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NtpServerIPAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseNms4" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StatsGranularityPeriod" type="{http://Airspan.Netspan.WebServices}GranularityPeriod" minOccurs="0"/>
 *         &lt;element name="NodeLmtAccess" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="NodeSshAccess" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IRelayProfile", propOrder = {
    "name",
    "ntpServerIPAddress1",
    "useNms1",
    "ntpServerIPAddress2",
    "useNms2",
    "ntpServerIPAddress3",
    "useNms3",
    "ntpServerIPAddress4",
    "useNms4",
    "statsGranularityPeriod",
    "nodeLmtAccess",
    "nodeSshAccess"
})
public class IRelayProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NtpServerIPAddress1")
    protected String ntpServerIPAddress1;
    @XmlElement(name = "UseNms1", required = true, type = Boolean.class, nillable = true)
    protected Boolean useNms1;
    @XmlElement(name = "NtpServerIPAddress2")
    protected String ntpServerIPAddress2;
    @XmlElement(name = "UseNms2", required = true, type = Boolean.class, nillable = true)
    protected Boolean useNms2;
    @XmlElement(name = "NtpServerIPAddress3")
    protected String ntpServerIPAddress3;
    @XmlElement(name = "UseNms3", required = true, type = Boolean.class, nillable = true)
    protected Boolean useNms3;
    @XmlElement(name = "NtpServerIPAddress4")
    protected String ntpServerIPAddress4;
    @XmlElement(name = "UseNms4", required = true, type = Boolean.class, nillable = true)
    protected Boolean useNms4;
    @XmlElementRef(name = "StatsGranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statsGranularityPeriod;
    @XmlElementRef(name = "NodeLmtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> nodeLmtAccess;
    @XmlElementRef(name = "NodeSshAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> nodeSshAccess;

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
     * Gets the value of the ntpServerIPAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIPAddress1() {
        return ntpServerIPAddress1;
    }

    /**
     * Sets the value of the ntpServerIPAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIPAddress1(String value) {
        this.ntpServerIPAddress1 = value;
    }

    /**
     * Gets the value of the useNms1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNms1() {
        return useNms1;
    }

    /**
     * Sets the value of the useNms1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNms1(Boolean value) {
        this.useNms1 = value;
    }

    /**
     * Gets the value of the ntpServerIPAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIPAddress2() {
        return ntpServerIPAddress2;
    }

    /**
     * Sets the value of the ntpServerIPAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIPAddress2(String value) {
        this.ntpServerIPAddress2 = value;
    }

    /**
     * Gets the value of the useNms2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNms2() {
        return useNms2;
    }

    /**
     * Sets the value of the useNms2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNms2(Boolean value) {
        this.useNms2 = value;
    }

    /**
     * Gets the value of the ntpServerIPAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIPAddress3() {
        return ntpServerIPAddress3;
    }

    /**
     * Sets the value of the ntpServerIPAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIPAddress3(String value) {
        this.ntpServerIPAddress3 = value;
    }

    /**
     * Gets the value of the useNms3 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNms3() {
        return useNms3;
    }

    /**
     * Sets the value of the useNms3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNms3(Boolean value) {
        this.useNms3 = value;
    }

    /**
     * Gets the value of the ntpServerIPAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIPAddress4() {
        return ntpServerIPAddress4;
    }

    /**
     * Sets the value of the ntpServerIPAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIPAddress4(String value) {
        this.ntpServerIPAddress4 = value;
    }

    /**
     * Gets the value of the useNms4 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNms4() {
        return useNms4;
    }

    /**
     * Sets the value of the useNms4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNms4(Boolean value) {
        this.useNms4 = value;
    }

    /**
     * Gets the value of the statsGranularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatsGranularityPeriod() {
        return statsGranularityPeriod;
    }

    /**
     * Sets the value of the statsGranularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatsGranularityPeriod(JAXBElement<String> value) {
        this.statsGranularityPeriod = value;
    }

    /**
     * Gets the value of the nodeLmtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNodeLmtAccess() {
        return nodeLmtAccess;
    }

    /**
     * Sets the value of the nodeLmtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNodeLmtAccess(JAXBElement<EnabledDisabledStates> value) {
        this.nodeLmtAccess = value;
    }

    /**
     * Gets the value of the nodeSshAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNodeSshAccess() {
        return nodeSshAccess;
    }

    /**
     * Sets the value of the nodeSshAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNodeSshAccess(JAXBElement<EnabledDisabledStates> value) {
        this.nodeSshAccess = value;
    }

}
