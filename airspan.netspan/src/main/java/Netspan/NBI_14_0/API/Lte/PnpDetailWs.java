
package Netspan.NBI_14_0.API.Lte;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.SnmpAgentVersion;


/**
 * <p>Java class for PnpDetailWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnpDetailWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hardware" type="{http://Airspan.Netspan.WebServices}PnpHardwareTypes"/>
 *         &lt;element name="PnpHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnpLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PnpLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PnpLatLongRadius" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PnpSwImageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SnmpPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SnmpTimeoutInMilliSec" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SnmpVersion" type="{http://Airspan.Netspan.WebServices}SnmpAgentVersion"/>
 *         &lt;element name="SnmpReadContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SnmpWriteContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Snmpv3Access" type="{http://Airspan.Netspan.WebServices}Snmpv3AccessTypes"/>
 *         &lt;element name="Snmpv3Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnpDetailWs", propOrder = {
    "hardware",
    "pnpHardwareId",
    "pnpLatitude",
    "pnpLongitude",
    "pnpLatLongRadius",
    "pnpSwImageName",
    "snmpPort",
    "snmpTimeoutInMilliSec",
    "snmpVersion",
    "snmpReadContext",
    "snmpWriteContext",
    "snmpv3Access",
    "snmpv3Password"
})
public class PnpDetailWs {

    @XmlElement(name = "Hardware", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected PnpHardwareTypes hardware;
    @XmlElement(name = "PnpHardwareId")
    protected String pnpHardwareId;
    @XmlElement(name = "PnpLatitude", required = true, nillable = true)
    protected BigDecimal pnpLatitude;
    @XmlElement(name = "PnpLongitude", required = true, nillable = true)
    protected BigDecimal pnpLongitude;
    @XmlElement(name = "PnpLatLongRadius", required = true, type = Integer.class, nillable = true)
    protected Integer pnpLatLongRadius;
    @XmlElement(name = "PnpSwImageName")
    protected String pnpSwImageName;
    @XmlElement(name = "SnmpPort", required = true, type = Integer.class, nillable = true)
    protected Integer snmpPort;
    @XmlElement(name = "SnmpTimeoutInMilliSec", required = true, type = Double.class, nillable = true)
    protected Double snmpTimeoutInMilliSec;
    @XmlElement(name = "SnmpVersion", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected SnmpAgentVersion snmpVersion;
    @XmlElement(name = "SnmpReadContext")
    protected String snmpReadContext;
    @XmlElement(name = "SnmpWriteContext")
    protected String snmpWriteContext;
    @XmlElement(name = "Snmpv3Access", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected Snmpv3AccessTypes snmpv3Access;
    @XmlElement(name = "Snmpv3Password")
    protected String snmpv3Password;

    /**
     * Gets the value of the hardware property.
     * 
     * @return
     *     possible object is
     *     {@link PnpHardwareTypes }
     *     
     */
    public PnpHardwareTypes getHardware() {
        return hardware;
    }

    /**
     * Sets the value of the hardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnpHardwareTypes }
     *     
     */
    public void setHardware(PnpHardwareTypes value) {
        this.hardware = value;
    }

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
     * Gets the value of the pnpLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPnpLatitude() {
        return pnpLatitude;
    }

    /**
     * Sets the value of the pnpLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPnpLatitude(BigDecimal value) {
        this.pnpLatitude = value;
    }

    /**
     * Gets the value of the pnpLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPnpLongitude() {
        return pnpLongitude;
    }

    /**
     * Sets the value of the pnpLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPnpLongitude(BigDecimal value) {
        this.pnpLongitude = value;
    }

    /**
     * Gets the value of the pnpLatLongRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPnpLatLongRadius() {
        return pnpLatLongRadius;
    }

    /**
     * Sets the value of the pnpLatLongRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPnpLatLongRadius(Integer value) {
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
     * Gets the value of the snmpPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSnmpPort() {
        return snmpPort;
    }

    /**
     * Sets the value of the snmpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSnmpPort(Integer value) {
        this.snmpPort = value;
    }

    /**
     * Gets the value of the snmpTimeoutInMilliSec property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSnmpTimeoutInMilliSec() {
        return snmpTimeoutInMilliSec;
    }

    /**
     * Sets the value of the snmpTimeoutInMilliSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSnmpTimeoutInMilliSec(Double value) {
        this.snmpTimeoutInMilliSec = value;
    }

    /**
     * Gets the value of the snmpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpAgentVersion }
     *     
     */
    public SnmpAgentVersion getSnmpVersion() {
        return snmpVersion;
    }

    /**
     * Sets the value of the snmpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpAgentVersion }
     *     
     */
    public void setSnmpVersion(SnmpAgentVersion value) {
        this.snmpVersion = value;
    }

    /**
     * Gets the value of the snmpReadContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpReadContext() {
        return snmpReadContext;
    }

    /**
     * Sets the value of the snmpReadContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpReadContext(String value) {
        this.snmpReadContext = value;
    }

    /**
     * Gets the value of the snmpWriteContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpWriteContext() {
        return snmpWriteContext;
    }

    /**
     * Sets the value of the snmpWriteContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpWriteContext(String value) {
        this.snmpWriteContext = value;
    }

    /**
     * Gets the value of the snmpv3Access property.
     * 
     * @return
     *     possible object is
     *     {@link Snmpv3AccessTypes }
     *     
     */
    public Snmpv3AccessTypes getSnmpv3Access() {
        return snmpv3Access;
    }

    /**
     * Sets the value of the snmpv3Access property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snmpv3AccessTypes }
     *     
     */
    public void setSnmpv3Access(Snmpv3AccessTypes value) {
        this.snmpv3Access = value;
    }

    /**
     * Gets the value of the snmpv3Password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpv3Password() {
        return snmpv3Password;
    }

    /**
     * Sets the value of the snmpv3Password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpv3Password(String value) {
        this.snmpv3Password = value;
    }

}
