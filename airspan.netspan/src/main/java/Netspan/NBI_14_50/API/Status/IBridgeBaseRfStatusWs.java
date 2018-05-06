
package Netspan.NBI_14_50.API.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeBaseRfStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeBaseRfStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalCombinedConfiguredTxPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FemStatusInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TiltStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TiltAngle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaImbalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RfStatusPath" type="{http://Airspan.Netspan.WebServices}IBridgeBaseRfPathInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeBaseRfStatusWs", propOrder = {
    "totalCombinedConfiguredTxPower",
    "femStatus",
    "femStatusInformation",
    "tiltStatus",
    "tiltAngle",
    "antennaType",
    "antennaImbalance",
    "antennaInformation",
    "rfStatusPath"
})
public class IBridgeBaseRfStatusWs {

    @XmlElement(name = "TotalCombinedConfiguredTxPower")
    protected String totalCombinedConfiguredTxPower;
    @XmlElement(name = "FemStatus")
    protected String femStatus;
    @XmlElement(name = "FemStatusInformation")
    protected String femStatusInformation;
    @XmlElement(name = "TiltStatus")
    protected String tiltStatus;
    @XmlElement(name = "TiltAngle")
    protected String tiltAngle;
    @XmlElement(name = "AntennaType")
    protected String antennaType;
    @XmlElement(name = "AntennaImbalance")
    protected String antennaImbalance;
    @XmlElement(name = "AntennaInformation")
    protected String antennaInformation;
    @XmlElement(name = "RfStatusPath")
    protected List<IBridgeBaseRfPathInfo> rfStatusPath;

    /**
     * Gets the value of the totalCombinedConfiguredTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCombinedConfiguredTxPower() {
        return totalCombinedConfiguredTxPower;
    }

    /**
     * Sets the value of the totalCombinedConfiguredTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCombinedConfiguredTxPower(String value) {
        this.totalCombinedConfiguredTxPower = value;
    }

    /**
     * Gets the value of the femStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFemStatus() {
        return femStatus;
    }

    /**
     * Sets the value of the femStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFemStatus(String value) {
        this.femStatus = value;
    }

    /**
     * Gets the value of the femStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFemStatusInformation() {
        return femStatusInformation;
    }

    /**
     * Sets the value of the femStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFemStatusInformation(String value) {
        this.femStatusInformation = value;
    }

    /**
     * Gets the value of the tiltStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiltStatus() {
        return tiltStatus;
    }

    /**
     * Sets the value of the tiltStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiltStatus(String value) {
        this.tiltStatus = value;
    }

    /**
     * Gets the value of the tiltAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiltAngle() {
        return tiltAngle;
    }

    /**
     * Sets the value of the tiltAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiltAngle(String value) {
        this.tiltAngle = value;
    }

    /**
     * Gets the value of the antennaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaType() {
        return antennaType;
    }

    /**
     * Sets the value of the antennaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaType(String value) {
        this.antennaType = value;
    }

    /**
     * Gets the value of the antennaImbalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaImbalance() {
        return antennaImbalance;
    }

    /**
     * Sets the value of the antennaImbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaImbalance(String value) {
        this.antennaImbalance = value;
    }

    /**
     * Gets the value of the antennaInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaInformation() {
        return antennaInformation;
    }

    /**
     * Sets the value of the antennaInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaInformation(String value) {
        this.antennaInformation = value;
    }

    /**
     * Gets the value of the rfStatusPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfStatusPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfStatusPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeBaseRfPathInfo }
     * 
     * 
     */
    public List<IBridgeBaseRfPathInfo> getRfStatusPath() {
        if (rfStatusPath == null) {
            rfStatusPath = new ArrayList<IBridgeBaseRfPathInfo>();
        }
        return this.rfStatusPath;
    }

}
