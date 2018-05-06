
package Netspan.NBI_16_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteBhQosStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteBhQosStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptableCalls" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BearerStatusD1" type="{http://Airspan.Netspan.WebServices}BearerStates" minOccurs="0"/>
 *         &lt;element name="BearerStatusD2" type="{http://Airspan.Netspan.WebServices}BearerStates" minOccurs="0"/>
 *         &lt;element name="MovingHighLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeasResult" type="{http://Airspan.Netspan.WebServices}MeasResultStates" minOccurs="0"/>
 *         &lt;element name="ZeroOngoingCalls" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IpCbrStatus" type="{http://Airspan.Netspan.WebServices}CbrStates" minOccurs="0"/>
 *         &lt;element name="IpAddressIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BwMeasurementResult" type="{http://Airspan.Netspan.WebServices}BwMeasurementResultStates" minOccurs="0"/>
 *         &lt;element name="CpeBw" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CpeDlBw" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CpeUlBw" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Delta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DlMeasurement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MbrRequestedBw" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MbrRequestedCalls" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UlMeasurement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VolteBh" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="FtpIPAddress" type="{http://Airspan.Netspan.WebServices}FtpIpAddressStatusWs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServerIPAddress" type="{http://Airspan.Netspan.WebServices}ServerIPAddressListStatusWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteBhQosStatusWs", propOrder = {
    "acceptableCalls",
    "bearerStatusD1",
    "bearerStatusD2",
    "movingHighLimit",
    "msisdn",
    "measResult",
    "zeroOngoingCalls",
    "ipCbrStatus",
    "ipAddressIndex",
    "bwMeasurementResult",
    "cpeBw",
    "cpeDlBw",
    "cpeUlBw",
    "delta",
    "dlMeasurement",
    "mbrRequestedBw",
    "mbrRequestedCalls",
    "ulMeasurement",
    "volteBh",
    "ftpIPAddress",
    "serverIPAddress"
})
public class LteBhQosStatusWs {

    @XmlElementRef(name = "AcceptableCalls", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> acceptableCalls;
    @XmlElementRef(name = "BearerStatusD1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BearerStates> bearerStatusD1;
    @XmlElementRef(name = "BearerStatusD2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BearerStates> bearerStatusD2;
    @XmlElementRef(name = "MovingHighLimit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> movingHighLimit;
    @XmlElement(name = "Msisdn")
    protected String msisdn;
    @XmlElementRef(name = "MeasResult", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasResultStates> measResult;
    @XmlElementRef(name = "ZeroOngoingCalls", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> zeroOngoingCalls;
    @XmlElementRef(name = "IpCbrStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CbrStates> ipCbrStatus;
    @XmlElementRef(name = "IpAddressIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipAddressIndex;
    @XmlElementRef(name = "BwMeasurementResult", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BwMeasurementResultStates> bwMeasurementResult;
    @XmlElementRef(name = "CpeBw", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpeBw;
    @XmlElementRef(name = "CpeDlBw", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpeDlBw;
    @XmlElementRef(name = "CpeUlBw", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpeUlBw;
    @XmlElementRef(name = "Delta", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> delta;
    @XmlElementRef(name = "DlMeasurement", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMeasurement;
    @XmlElementRef(name = "MbrRequestedBw", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mbrRequestedBw;
    @XmlElementRef(name = "MbrRequestedCalls", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mbrRequestedCalls;
    @XmlElementRef(name = "UlMeasurement", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulMeasurement;
    @XmlElementRef(name = "VolteBh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> volteBh;
    @XmlElement(name = "FtpIPAddress")
    protected List<FtpIpAddressStatusWs> ftpIPAddress;
    @XmlElement(name = "ServerIPAddress")
    protected List<ServerIPAddressListStatusWs> serverIPAddress;

    /**
     * Gets the value of the acceptableCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAcceptableCalls() {
        return acceptableCalls;
    }

    /**
     * Sets the value of the acceptableCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAcceptableCalls(JAXBElement<Integer> value) {
        this.acceptableCalls = value;
    }

    /**
     * Gets the value of the bearerStatusD1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BearerStates }{@code >}
     *     
     */
    public JAXBElement<BearerStates> getBearerStatusD1() {
        return bearerStatusD1;
    }

    /**
     * Sets the value of the bearerStatusD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BearerStates }{@code >}
     *     
     */
    public void setBearerStatusD1(JAXBElement<BearerStates> value) {
        this.bearerStatusD1 = value;
    }

    /**
     * Gets the value of the bearerStatusD2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BearerStates }{@code >}
     *     
     */
    public JAXBElement<BearerStates> getBearerStatusD2() {
        return bearerStatusD2;
    }

    /**
     * Sets the value of the bearerStatusD2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BearerStates }{@code >}
     *     
     */
    public void setBearerStatusD2(JAXBElement<BearerStates> value) {
        this.bearerStatusD2 = value;
    }

    /**
     * Gets the value of the movingHighLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMovingHighLimit() {
        return movingHighLimit;
    }

    /**
     * Sets the value of the movingHighLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMovingHighLimit(JAXBElement<Integer> value) {
        this.movingHighLimit = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the measResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasResultStates }{@code >}
     *     
     */
    public JAXBElement<MeasResultStates> getMeasResult() {
        return measResult;
    }

    /**
     * Sets the value of the measResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasResultStates }{@code >}
     *     
     */
    public void setMeasResult(JAXBElement<MeasResultStates> value) {
        this.measResult = value;
    }

    /**
     * Gets the value of the zeroOngoingCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZeroOngoingCalls() {
        return zeroOngoingCalls;
    }

    /**
     * Sets the value of the zeroOngoingCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZeroOngoingCalls(JAXBElement<Integer> value) {
        this.zeroOngoingCalls = value;
    }

    /**
     * Gets the value of the ipCbrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CbrStates }{@code >}
     *     
     */
    public JAXBElement<CbrStates> getIpCbrStatus() {
        return ipCbrStatus;
    }

    /**
     * Sets the value of the ipCbrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CbrStates }{@code >}
     *     
     */
    public void setIpCbrStatus(JAXBElement<CbrStates> value) {
        this.ipCbrStatus = value;
    }

    /**
     * Gets the value of the ipAddressIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIpAddressIndex() {
        return ipAddressIndex;
    }

    /**
     * Sets the value of the ipAddressIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIpAddressIndex(JAXBElement<Integer> value) {
        this.ipAddressIndex = value;
    }

    /**
     * Gets the value of the bwMeasurementResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BwMeasurementResultStates }{@code >}
     *     
     */
    public JAXBElement<BwMeasurementResultStates> getBwMeasurementResult() {
        return bwMeasurementResult;
    }

    /**
     * Sets the value of the bwMeasurementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BwMeasurementResultStates }{@code >}
     *     
     */
    public void setBwMeasurementResult(JAXBElement<BwMeasurementResultStates> value) {
        this.bwMeasurementResult = value;
    }

    /**
     * Gets the value of the cpeBw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpeBw() {
        return cpeBw;
    }

    /**
     * Sets the value of the cpeBw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpeBw(JAXBElement<Integer> value) {
        this.cpeBw = value;
    }

    /**
     * Gets the value of the cpeDlBw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpeDlBw() {
        return cpeDlBw;
    }

    /**
     * Sets the value of the cpeDlBw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpeDlBw(JAXBElement<Integer> value) {
        this.cpeDlBw = value;
    }

    /**
     * Gets the value of the cpeUlBw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpeUlBw() {
        return cpeUlBw;
    }

    /**
     * Sets the value of the cpeUlBw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpeUlBw(JAXBElement<Integer> value) {
        this.cpeUlBw = value;
    }

    /**
     * Gets the value of the delta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDelta() {
        return delta;
    }

    /**
     * Sets the value of the delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDelta(JAXBElement<Integer> value) {
        this.delta = value;
    }

    /**
     * Gets the value of the dlMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMeasurement() {
        return dlMeasurement;
    }

    /**
     * Sets the value of the dlMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMeasurement(JAXBElement<Integer> value) {
        this.dlMeasurement = value;
    }

    /**
     * Gets the value of the mbrRequestedBw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbrRequestedBw() {
        return mbrRequestedBw;
    }

    /**
     * Sets the value of the mbrRequestedBw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbrRequestedBw(JAXBElement<Integer> value) {
        this.mbrRequestedBw = value;
    }

    /**
     * Gets the value of the mbrRequestedCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMbrRequestedCalls() {
        return mbrRequestedCalls;
    }

    /**
     * Sets the value of the mbrRequestedCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMbrRequestedCalls(JAXBElement<Integer> value) {
        this.mbrRequestedCalls = value;
    }

    /**
     * Gets the value of the ulMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlMeasurement() {
        return ulMeasurement;
    }

    /**
     * Sets the value of the ulMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlMeasurement(JAXBElement<Integer> value) {
        this.ulMeasurement = value;
    }

    /**
     * Gets the value of the volteBh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getVolteBh() {
        return volteBh;
    }

    /**
     * Sets the value of the volteBh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setVolteBh(JAXBElement<EnabledDisabledStates> value) {
        this.volteBh = value;
    }

    /**
     * Gets the value of the ftpIPAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ftpIPAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFtpIPAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FtpIpAddressStatusWs }
     * 
     * 
     */
    public List<FtpIpAddressStatusWs> getFtpIPAddress() {
        if (ftpIPAddress == null) {
            ftpIPAddress = new ArrayList<FtpIpAddressStatusWs>();
        }
        return this.ftpIPAddress;
    }

    /**
     * Gets the value of the serverIPAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverIPAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerIPAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerIPAddressListStatusWs }
     * 
     * 
     */
    public List<ServerIPAddressListStatusWs> getServerIPAddress() {
        if (serverIPAddress == null) {
            serverIPAddress = new ArrayList<ServerIPAddressListStatusWs>();
        }
        return this.serverIPAddress;
    }

}
