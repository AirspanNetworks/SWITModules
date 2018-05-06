
package Netspan.NBI_15_1.Status;

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
 * &lt;complexType name="LteRfStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfiguredTxPowerDbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualTxPowerDbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeasuredVswr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusInformation" type="{http://Airspan.Netspan.WebServices}LteRfStatusInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
