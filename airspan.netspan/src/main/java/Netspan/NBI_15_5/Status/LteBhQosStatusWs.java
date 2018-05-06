
package Netspan.NBI_15_5.Status;

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
    "ipAddressIndex"
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

}
