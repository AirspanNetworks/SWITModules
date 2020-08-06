
package Netspan.NBI_18_0.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnbStates;


/**
 * <p>Java class for AuPnpDetailWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuPnpDetailWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}AuDetailsWs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PnpHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnpServiceState" type="{http://Airspan.Netspan.WebServices}EnbStates" minOccurs="0"/&gt;
 *         &lt;element name="PnpLocationMode" type="{http://Airspan.Netspan.WebServices}PnpModeValues" minOccurs="0"/&gt;
 *         &lt;element name="PnpLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PnpLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PnpLatLongRadius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PnpSwImageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareScheduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSwScheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SwSchedule" type="{http://Airspan.Netspan.WebServices}AuPnpSwSchedule" minOccurs="0"/&gt;
 *         &lt;element name="IsDownloadOnlySwScheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DownloadOnlySwSchedule" type="{http://Airspan.Netspan.WebServices}AuPnpSwSchedule" minOccurs="0"/&gt;
 *         &lt;element name="WifiConfig" type="{http://Airspan.Netspan.WebServices}WifiConfig" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuPnpDetailWs", propOrder = {
    "pnpHardwareId",
    "pnpServiceState",
    "pnpLocationMode",
    "pnpLatitude",
    "pnpLongitude",
    "pnpLatLongRadius",
    "pnpSwImageName",
    "softwareScheduleName",
    "isSwScheduled",
    "swSchedule",
    "isDownloadOnlySwScheduled",
    "downloadOnlySwSchedule",
    "wifiConfig"
})
@XmlSeeAlso({
    NodeDetailsWs.class
})
public class AuPnpDetailWs
    extends AuDetailsWs
{

    @XmlElement(name = "PnpHardwareId")
    protected String pnpHardwareId;
    @XmlElementRef(name = "PnpServiceState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnbStates> pnpServiceState;
    @XmlElementRef(name = "PnpLocationMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PnpModeValues> pnpLocationMode;
    @XmlElementRef(name = "PnpLatitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnpLatitude;
    @XmlElementRef(name = "PnpLongitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnpLongitude;
    @XmlElementRef(name = "PnpLatLongRadius", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pnpLatLongRadius;
    @XmlElement(name = "PnpSwImageName")
    protected String pnpSwImageName;
    @XmlElement(name = "SoftwareScheduleName")
    protected String softwareScheduleName;
    @XmlElementRef(name = "IsSwScheduled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSwScheduled;
    @XmlElement(name = "SwSchedule")
    protected AuPnpSwSchedule swSchedule;
    @XmlElementRef(name = "IsDownloadOnlySwScheduled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDownloadOnlySwScheduled;
    @XmlElement(name = "DownloadOnlySwSchedule")
    protected AuPnpSwSchedule downloadOnlySwSchedule;
    @XmlElement(name = "WifiConfig")
    protected WifiConfig wifiConfig;

    /**
     * Gets the value of the pnpHardwareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnpHardwareId() {
        return pnpHardwareId;
    }

    /**
     * Sets the value of the pnpHardwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnpHardwareId(String value) {
        this.pnpHardwareId = value;
    }

    /**
     * Gets the value of the pnpServiceState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnbStates }{@code >}
     *     
     */
    public JAXBElement<EnbStates> getPnpServiceState() {
        return pnpServiceState;
    }

    /**
     * Sets the value of the pnpServiceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnbStates }{@code >}
     *     
     */
    public void setPnpServiceState(JAXBElement<EnbStates> value) {
        this.pnpServiceState = value;
    }

    /**
     * Gets the value of the pnpLocationMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PnpModeValues }{@code >}
     *     
     */
    public JAXBElement<PnpModeValues> getPnpLocationMode() {
        return pnpLocationMode;
    }

    /**
     * Sets the value of the pnpLocationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PnpModeValues }{@code >}
     *     
     */
    public void setPnpLocationMode(JAXBElement<PnpModeValues> value) {
        this.pnpLocationMode = value;
    }

    /**
     * Gets the value of the pnpLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPnpLatitude() {
        return pnpLatitude;
    }

    /**
     * Sets the value of the pnpLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPnpLatitude(JAXBElement<BigDecimal> value) {
        this.pnpLatitude = value;
    }

    /**
     * Gets the value of the pnpLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPnpLongitude() {
        return pnpLongitude;
    }

    /**
     * Sets the value of the pnpLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPnpLongitude(JAXBElement<BigDecimal> value) {
        this.pnpLongitude = value;
    }

    /**
     * Gets the value of the pnpLatLongRadius property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPnpLatLongRadius() {
        return pnpLatLongRadius;
    }

    /**
     * Sets the value of the pnpLatLongRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPnpLatLongRadius(JAXBElement<Integer> value) {
        this.pnpLatLongRadius = value;
    }

    /**
     * Gets the value of the pnpSwImageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnpSwImageName() {
        return pnpSwImageName;
    }

    /**
     * Sets the value of the pnpSwImageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnpSwImageName(String value) {
        this.pnpSwImageName = value;
    }

    /**
     * Gets the value of the softwareScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareScheduleName() {
        return softwareScheduleName;
    }

    /**
     * Sets the value of the softwareScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareScheduleName(String value) {
        this.softwareScheduleName = value;
    }

    /**
     * Gets the value of the isSwScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSwScheduled() {
        return isSwScheduled;
    }

    /**
     * Sets the value of the isSwScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSwScheduled(JAXBElement<Boolean> value) {
        this.isSwScheduled = value;
    }

    /**
     * Gets the value of the swSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link AuPnpSwSchedule }
     *     
     */
    public AuPnpSwSchedule getSwSchedule() {
        return swSchedule;
    }

    /**
     * Sets the value of the swSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuPnpSwSchedule }
     *     
     */
    public void setSwSchedule(AuPnpSwSchedule value) {
        this.swSchedule = value;
    }

    /**
     * Gets the value of the isDownloadOnlySwScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDownloadOnlySwScheduled() {
        return isDownloadOnlySwScheduled;
    }

    /**
     * Sets the value of the isDownloadOnlySwScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDownloadOnlySwScheduled(JAXBElement<Boolean> value) {
        this.isDownloadOnlySwScheduled = value;
    }

    /**
     * Gets the value of the downloadOnlySwSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link AuPnpSwSchedule }
     *     
     */
    public AuPnpSwSchedule getDownloadOnlySwSchedule() {
        return downloadOnlySwSchedule;
    }

    /**
     * Sets the value of the downloadOnlySwSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuPnpSwSchedule }
     *     
     */
    public void setDownloadOnlySwSchedule(AuPnpSwSchedule value) {
        this.downloadOnlySwSchedule = value;
    }

    /**
     * Gets the value of the wifiConfig property.
     * 
     * @return
     *     possible object is
     *     {@link WifiConfig }
     *     
     */
    public WifiConfig getWifiConfig() {
        return wifiConfig;
    }

    /**
     * Sets the value of the wifiConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link WifiConfig }
     *     
     */
    public void setWifiConfig(WifiConfig value) {
        this.wifiConfig = value;
    }

}
