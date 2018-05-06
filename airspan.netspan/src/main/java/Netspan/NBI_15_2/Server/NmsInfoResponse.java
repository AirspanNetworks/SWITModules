
package Netspan.NBI_15_2.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NmsInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NmsInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="OperatingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatabaseEngine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IISVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NMSSoftwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhysicalMemory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NmsInfoResponse", propOrder = {
    "operatingSystem",
    "databaseEngine",
    "iisVersion",
    "nmsSoftwareVersion",
    "physicalMemory",
    "machineName"
})
public class NmsInfoResponse
    extends WsResponse
{

    @XmlElement(name = "OperatingSystem")
    protected String operatingSystem;
    @XmlElement(name = "DatabaseEngine")
    protected String databaseEngine;
    @XmlElement(name = "IISVersion")
    protected String iisVersion;
    @XmlElement(name = "NMSSoftwareVersion")
    protected String nmsSoftwareVersion;
    @XmlElement(name = "PhysicalMemory")
    protected String physicalMemory;
    @XmlElement(name = "MachineName")
    protected String machineName;

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystem(String value) {
        this.operatingSystem = value;
    }

    /**
     * Gets the value of the databaseEngine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseEngine() {
        return databaseEngine;
    }

    /**
     * Sets the value of the databaseEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseEngine(String value) {
        this.databaseEngine = value;
    }

    /**
     * Gets the value of the iisVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIISVersion() {
        return iisVersion;
    }

    /**
     * Sets the value of the iisVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIISVersion(String value) {
        this.iisVersion = value;
    }

    /**
     * Gets the value of the nmsSoftwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMSSoftwareVersion() {
        return nmsSoftwareVersion;
    }

    /**
     * Sets the value of the nmsSoftwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMSSoftwareVersion(String value) {
        this.nmsSoftwareVersion = value;
    }

    /**
     * Gets the value of the physicalMemory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalMemory() {
        return physicalMemory;
    }

    /**
     * Sets the value of the physicalMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalMemory(String value) {
        this.physicalMemory = value;
    }

    /**
     * Gets the value of the machineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineName() {
        return machineName;
    }

    /**
     * Sets the value of the machineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineName(String value) {
        this.machineName = value;
    }

}
