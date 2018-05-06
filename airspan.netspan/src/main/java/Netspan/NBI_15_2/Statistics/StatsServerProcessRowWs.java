
package Netspan.NBI_15_2.Statistics;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StatsServerProcessRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsServerProcessRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SystemCpuAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SystemMemoryMbAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EventServCpuAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EventServMemoryMbAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProvisioningServCpuAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProvisioningServMemoryMbAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscoveryServCpuAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscoveryServMemoryMbAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SwMngrServCpuAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SwMngrServMemoryMbAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ArchiveServCpuAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ArchiveServMemoryMbAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StatsServCpuAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StatsServMemoryMbAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ManagementServCpuAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ManagementMemoryMbAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SqlCpuAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SqlMemoryMbAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsServerProcessRowWs", propOrder = {
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "systemCpuAverage",
    "systemMemoryMbAverage",
    "eventServCpuAverage",
    "eventServMemoryMbAverage",
    "provisioningServCpuAverage",
    "provisioningServMemoryMbAverage",
    "discoveryServCpuAverage",
    "discoveryServMemoryMbAverage",
    "swMngrServCpuAverage",
    "swMngrServMemoryMbAverage",
    "archiveServCpuAverage",
    "archiveServMemoryMbAverage",
    "statsServCpuAverage",
    "statsServMemoryMbAverage",
    "managementServCpuAverage",
    "managementMemoryMbAverage",
    "sqlCpuAverage",
    "sqlMemoryMbAverage"
})
public class StatsServerProcessRowWs {

    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "GranularityPeriod")
    protected int granularityPeriod;
    @XmlElementRef(name = "SystemCpuAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> systemCpuAverage;
    @XmlElementRef(name = "SystemMemoryMbAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> systemMemoryMbAverage;
    @XmlElementRef(name = "EventServCpuAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> eventServCpuAverage;
    @XmlElementRef(name = "EventServMemoryMbAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> eventServMemoryMbAverage;
    @XmlElementRef(name = "ProvisioningServCpuAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> provisioningServCpuAverage;
    @XmlElementRef(name = "ProvisioningServMemoryMbAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> provisioningServMemoryMbAverage;
    @XmlElementRef(name = "DiscoveryServCpuAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> discoveryServCpuAverage;
    @XmlElementRef(name = "DiscoveryServMemoryMbAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> discoveryServMemoryMbAverage;
    @XmlElementRef(name = "SwMngrServCpuAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> swMngrServCpuAverage;
    @XmlElementRef(name = "SwMngrServMemoryMbAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> swMngrServMemoryMbAverage;
    @XmlElementRef(name = "ArchiveServCpuAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> archiveServCpuAverage;
    @XmlElementRef(name = "ArchiveServMemoryMbAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> archiveServMemoryMbAverage;
    @XmlElementRef(name = "StatsServCpuAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> statsServCpuAverage;
    @XmlElementRef(name = "StatsServMemoryMbAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> statsServMemoryMbAverage;
    @XmlElementRef(name = "ManagementServCpuAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> managementServCpuAverage;
    @XmlElementRef(name = "ManagementMemoryMbAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> managementMemoryMbAverage;
    @XmlElementRef(name = "SqlCpuAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sqlCpuAverage;
    @XmlElementRef(name = "SqlMemoryMbAverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sqlMemoryMbAverage;

    /**
     * Gets the value of the dateAndTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeStart() {
        return dateAndTimeStart;
    }

    /**
     * Sets the value of the dateAndTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeStart(XMLGregorianCalendar value) {
        this.dateAndTimeStart = value;
    }

    /**
     * Gets the value of the dateAndTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeEnd() {
        return dateAndTimeEnd;
    }

    /**
     * Sets the value of the dateAndTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeEnd(XMLGregorianCalendar value) {
        this.dateAndTimeEnd = value;
    }

    /**
     * Gets the value of the granularityPeriod property.
     * 
     */
    public int getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     */
    public void setGranularityPeriod(int value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the systemCpuAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSystemCpuAverage() {
        return systemCpuAverage;
    }

    /**
     * Sets the value of the systemCpuAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSystemCpuAverage(JAXBElement<BigDecimal> value) {
        this.systemCpuAverage = value;
    }

    /**
     * Gets the value of the systemMemoryMbAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSystemMemoryMbAverage() {
        return systemMemoryMbAverage;
    }

    /**
     * Sets the value of the systemMemoryMbAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSystemMemoryMbAverage(JAXBElement<BigDecimal> value) {
        this.systemMemoryMbAverage = value;
    }

    /**
     * Gets the value of the eventServCpuAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEventServCpuAverage() {
        return eventServCpuAverage;
    }

    /**
     * Sets the value of the eventServCpuAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEventServCpuAverage(JAXBElement<BigDecimal> value) {
        this.eventServCpuAverage = value;
    }

    /**
     * Gets the value of the eventServMemoryMbAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEventServMemoryMbAverage() {
        return eventServMemoryMbAverage;
    }

    /**
     * Sets the value of the eventServMemoryMbAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEventServMemoryMbAverage(JAXBElement<BigDecimal> value) {
        this.eventServMemoryMbAverage = value;
    }

    /**
     * Gets the value of the provisioningServCpuAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProvisioningServCpuAverage() {
        return provisioningServCpuAverage;
    }

    /**
     * Sets the value of the provisioningServCpuAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProvisioningServCpuAverage(JAXBElement<BigDecimal> value) {
        this.provisioningServCpuAverage = value;
    }

    /**
     * Gets the value of the provisioningServMemoryMbAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProvisioningServMemoryMbAverage() {
        return provisioningServMemoryMbAverage;
    }

    /**
     * Sets the value of the provisioningServMemoryMbAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProvisioningServMemoryMbAverage(JAXBElement<BigDecimal> value) {
        this.provisioningServMemoryMbAverage = value;
    }

    /**
     * Gets the value of the discoveryServCpuAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDiscoveryServCpuAverage() {
        return discoveryServCpuAverage;
    }

    /**
     * Sets the value of the discoveryServCpuAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDiscoveryServCpuAverage(JAXBElement<BigDecimal> value) {
        this.discoveryServCpuAverage = value;
    }

    /**
     * Gets the value of the discoveryServMemoryMbAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDiscoveryServMemoryMbAverage() {
        return discoveryServMemoryMbAverage;
    }

    /**
     * Sets the value of the discoveryServMemoryMbAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDiscoveryServMemoryMbAverage(JAXBElement<BigDecimal> value) {
        this.discoveryServMemoryMbAverage = value;
    }

    /**
     * Gets the value of the swMngrServCpuAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSwMngrServCpuAverage() {
        return swMngrServCpuAverage;
    }

    /**
     * Sets the value of the swMngrServCpuAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSwMngrServCpuAverage(JAXBElement<BigDecimal> value) {
        this.swMngrServCpuAverage = value;
    }

    /**
     * Gets the value of the swMngrServMemoryMbAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSwMngrServMemoryMbAverage() {
        return swMngrServMemoryMbAverage;
    }

    /**
     * Sets the value of the swMngrServMemoryMbAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSwMngrServMemoryMbAverage(JAXBElement<BigDecimal> value) {
        this.swMngrServMemoryMbAverage = value;
    }

    /**
     * Gets the value of the archiveServCpuAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getArchiveServCpuAverage() {
        return archiveServCpuAverage;
    }

    /**
     * Sets the value of the archiveServCpuAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setArchiveServCpuAverage(JAXBElement<BigDecimal> value) {
        this.archiveServCpuAverage = value;
    }

    /**
     * Gets the value of the archiveServMemoryMbAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getArchiveServMemoryMbAverage() {
        return archiveServMemoryMbAverage;
    }

    /**
     * Sets the value of the archiveServMemoryMbAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setArchiveServMemoryMbAverage(JAXBElement<BigDecimal> value) {
        this.archiveServMemoryMbAverage = value;
    }

    /**
     * Gets the value of the statsServCpuAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStatsServCpuAverage() {
        return statsServCpuAverage;
    }

    /**
     * Sets the value of the statsServCpuAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStatsServCpuAverage(JAXBElement<BigDecimal> value) {
        this.statsServCpuAverage = value;
    }

    /**
     * Gets the value of the statsServMemoryMbAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStatsServMemoryMbAverage() {
        return statsServMemoryMbAverage;
    }

    /**
     * Sets the value of the statsServMemoryMbAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStatsServMemoryMbAverage(JAXBElement<BigDecimal> value) {
        this.statsServMemoryMbAverage = value;
    }

    /**
     * Gets the value of the managementServCpuAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getManagementServCpuAverage() {
        return managementServCpuAverage;
    }

    /**
     * Sets the value of the managementServCpuAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setManagementServCpuAverage(JAXBElement<BigDecimal> value) {
        this.managementServCpuAverage = value;
    }

    /**
     * Gets the value of the managementMemoryMbAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getManagementMemoryMbAverage() {
        return managementMemoryMbAverage;
    }

    /**
     * Sets the value of the managementMemoryMbAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setManagementMemoryMbAverage(JAXBElement<BigDecimal> value) {
        this.managementMemoryMbAverage = value;
    }

    /**
     * Gets the value of the sqlCpuAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSqlCpuAverage() {
        return sqlCpuAverage;
    }

    /**
     * Sets the value of the sqlCpuAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSqlCpuAverage(JAXBElement<BigDecimal> value) {
        this.sqlCpuAverage = value;
    }

    /**
     * Gets the value of the sqlMemoryMbAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSqlMemoryMbAverage() {
        return sqlMemoryMbAverage;
    }

    /**
     * Sets the value of the sqlMemoryMbAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSqlMemoryMbAverage(JAXBElement<BigDecimal> value) {
        this.sqlMemoryMbAverage = value;
    }

}
