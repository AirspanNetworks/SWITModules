
package Netspan.NBI_18_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteRfStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRfStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfiguredTxPowerDbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualTxPowerDbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasuredVswr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VswrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfiguredTxPowerDbmCell1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualTxPowerDbmCell1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfiguredTxPowerDbmCell2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualTxPowerDbmCell2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusInformation" type="{http://Airspan.Netspan.WebServices}LteRfStatusInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRfStatusWs", propOrder = {
    "rfNumber",
    "operationalStatus",
    "configuredTxPowerDbm",
    "actualTxPowerDbm",
    "measuredVswr",
    "vswrStatus",
    "configuredTxPowerDbmCell1",
    "actualTxPowerDbmCell1",
    "configuredTxPowerDbmCell2",
    "actualTxPowerDbmCell2",
    "statusInformation"
})
public class LteRfStatusWs {

    @XmlElement(name = "RfNumber")
    protected String rfNumber;
    @XmlElement(name = "OperationalStatus")
    protected String operationalStatus;
    @XmlElement(name = "ConfiguredTxPowerDbm")
    protected String configuredTxPowerDbm;
    @XmlElement(name = "ActualTxPowerDbm")
    protected String actualTxPowerDbm;
    @XmlElement(name = "MeasuredVswr")
    protected String measuredVswr;
    @XmlElement(name = "VswrStatus")
    protected String vswrStatus;
    @XmlElement(name = "ConfiguredTxPowerDbmCell1")
    protected String configuredTxPowerDbmCell1;
    @XmlElement(name = "ActualTxPowerDbmCell1")
    protected String actualTxPowerDbmCell1;
    @XmlElement(name = "ConfiguredTxPowerDbmCell2")
    protected String configuredTxPowerDbmCell2;
    @XmlElement(name = "ActualTxPowerDbmCell2")
    protected String actualTxPowerDbmCell2;
    @XmlElement(name = "StatusInformation")
    protected List<LteRfStatusInfo> statusInformation;

    /**
     * Gets the value of the rfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfNumber() {
        return rfNumber;
    }

    /**
     * Sets the value of the rfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfNumber(String value) {
        this.rfNumber = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalStatus(String value) {
        this.operationalStatus = value;
    }

    /**
     * Gets the value of the configuredTxPowerDbm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguredTxPowerDbm() {
        return configuredTxPowerDbm;
    }

    /**
     * Sets the value of the configuredTxPowerDbm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguredTxPowerDbm(String value) {
        this.configuredTxPowerDbm = value;
    }

    /**
     * Gets the value of the actualTxPowerDbm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualTxPowerDbm() {
        return actualTxPowerDbm;
    }

    /**
     * Sets the value of the actualTxPowerDbm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualTxPowerDbm(String value) {
        this.actualTxPowerDbm = value;
    }

    /**
     * Gets the value of the measuredVswr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasuredVswr() {
        return measuredVswr;
    }

    /**
     * Sets the value of the measuredVswr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasuredVswr(String value) {
        this.measuredVswr = value;
    }

    /**
     * Gets the value of the vswrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVswrStatus() {
        return vswrStatus;
    }

    /**
     * Sets the value of the vswrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVswrStatus(String value) {
        this.vswrStatus = value;
    }

    /**
     * Gets the value of the configuredTxPowerDbmCell1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguredTxPowerDbmCell1() {
        return configuredTxPowerDbmCell1;
    }

    /**
     * Sets the value of the configuredTxPowerDbmCell1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguredTxPowerDbmCell1(String value) {
        this.configuredTxPowerDbmCell1 = value;
    }

    /**
     * Gets the value of the actualTxPowerDbmCell1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualTxPowerDbmCell1() {
        return actualTxPowerDbmCell1;
    }

    /**
     * Sets the value of the actualTxPowerDbmCell1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualTxPowerDbmCell1(String value) {
        this.actualTxPowerDbmCell1 = value;
    }

    /**
     * Gets the value of the configuredTxPowerDbmCell2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguredTxPowerDbmCell2() {
        return configuredTxPowerDbmCell2;
    }

    /**
     * Sets the value of the configuredTxPowerDbmCell2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguredTxPowerDbmCell2(String value) {
        this.configuredTxPowerDbmCell2 = value;
    }

    /**
     * Gets the value of the actualTxPowerDbmCell2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualTxPowerDbmCell2() {
        return actualTxPowerDbmCell2;
    }

    /**
     * Sets the value of the actualTxPowerDbmCell2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualTxPowerDbmCell2(String value) {
        this.actualTxPowerDbmCell2 = value;
    }

    /**
     * Gets the value of the statusInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteRfStatusInfo }
     * 
     * 
     */
    public List<LteRfStatusInfo> getStatusInformation() {
        if (statusInformation == null) {
            statusInformation = new ArrayList<LteRfStatusInfo>();
        }
        return this.statusInformation;
    }

}