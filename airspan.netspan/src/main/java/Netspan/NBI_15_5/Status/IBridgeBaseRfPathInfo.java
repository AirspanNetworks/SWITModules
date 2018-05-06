
package Netspan.NBI_15_5.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeBaseRfPathInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeBaseRfPathInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaConfiguredStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfiguredTxPowerDbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfiguredRxGain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusInformation" type="{http://Airspan.Netspan.WebServices}IBridgeBaseRfStatusInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeBaseRfPathInfo", propOrder = {
    "rfNumber",
    "paConfiguredStatus",
    "operationalStatus",
    "configuredTxPowerDbm",
    "configuredRxGain",
    "statusInformation"
})
public class IBridgeBaseRfPathInfo {

    @XmlElement(name = "RfNumber")
    protected String rfNumber;
    @XmlElement(name = "PaConfiguredStatus")
    protected String paConfiguredStatus;
    @XmlElement(name = "OperationalStatus")
    protected String operationalStatus;
    @XmlElement(name = "ConfiguredTxPowerDbm")
    protected String configuredTxPowerDbm;
    @XmlElement(name = "ConfiguredRxGain")
    protected String configuredRxGain;
    @XmlElement(name = "StatusInformation")
    protected List<IBridgeBaseRfStatusInfo> statusInformation;

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
     * Gets the value of the paConfiguredStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaConfiguredStatus() {
        return paConfiguredStatus;
    }

    /**
     * Sets the value of the paConfiguredStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaConfiguredStatus(String value) {
        this.paConfiguredStatus = value;
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
     * Gets the value of the configuredRxGain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguredRxGain() {
        return configuredRxGain;
    }

    /**
     * Sets the value of the configuredRxGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguredRxGain(String value) {
        this.configuredRxGain = value;
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
     * {@link IBridgeBaseRfStatusInfo }
     * 
     * 
     */
    public List<IBridgeBaseRfStatusInfo> getStatusInformation() {
        if (statusInformation == null) {
            statusInformation = new ArrayList<IBridgeBaseRfStatusInfo>();
        }
        return this.statusInformation;
    }

}
