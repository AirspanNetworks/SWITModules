
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FiltercoefficientRsrpIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FiltercoefficientRsrp" type="{http://Airspan.Netspan.WebServices}FilterCoefficient" minOccurs="0"/>
 *         &lt;element name="FiltercoefficientRsrqIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FiltercoefficientRsrq" type="{http://Airspan.Netspan.WebServices}FilterCoefficient" minOccurs="0"/>
 *         &lt;element name="MaxReportCellsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxReportCells" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReportAmountIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReportAmount" type="{http://Airspan.Netspan.WebServices}MobilityReportAmount" minOccurs="0"/>
 *         &lt;element name="QosMobilityTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="QosMobilityTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityWs", propOrder = {
    "filtercoefficientRsrpIsDefault",
    "filtercoefficientRsrp",
    "filtercoefficientRsrqIsDefault",
    "filtercoefficientRsrq",
    "maxReportCellsIsDefault",
    "maxReportCells",
    "reportAmountIsDefault",
    "reportAmount",
    "qosMobilityTimerIsDefault",
    "qosMobilityTimer"
})
public class MobilityWs {

    @XmlElementRef(name = "FiltercoefficientRsrpIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> filtercoefficientRsrpIsDefault;
    @XmlElementRef(name = "FiltercoefficientRsrp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filtercoefficientRsrp;
    @XmlElementRef(name = "FiltercoefficientRsrqIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> filtercoefficientRsrqIsDefault;
    @XmlElementRef(name = "FiltercoefficientRsrq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filtercoefficientRsrq;
    @XmlElementRef(name = "MaxReportCellsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxReportCellsIsDefault;
    @XmlElementRef(name = "MaxReportCells", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxReportCells;
    @XmlElementRef(name = "ReportAmountIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reportAmountIsDefault;
    @XmlElementRef(name = "ReportAmount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportAmount;
    @XmlElement(name = "QosMobilityTimerIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean qosMobilityTimerIsDefault;
    @XmlElement(name = "QosMobilityTimer", required = true, type = Integer.class, nillable = true)
    protected Integer qosMobilityTimer;

    /**
     * Gets the value of the filtercoefficientRsrpIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFiltercoefficientRsrpIsDefault() {
        return filtercoefficientRsrpIsDefault;
    }

    /**
     * Sets the value of the filtercoefficientRsrpIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFiltercoefficientRsrpIsDefault(JAXBElement<Boolean> value) {
        this.filtercoefficientRsrpIsDefault = value;
    }

    /**
     * Gets the value of the filtercoefficientRsrp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiltercoefficientRsrp() {
        return filtercoefficientRsrp;
    }

    /**
     * Sets the value of the filtercoefficientRsrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiltercoefficientRsrp(JAXBElement<String> value) {
        this.filtercoefficientRsrp = value;
    }

    /**
     * Gets the value of the filtercoefficientRsrqIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFiltercoefficientRsrqIsDefault() {
        return filtercoefficientRsrqIsDefault;
    }

    /**
     * Sets the value of the filtercoefficientRsrqIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFiltercoefficientRsrqIsDefault(JAXBElement<Boolean> value) {
        this.filtercoefficientRsrqIsDefault = value;
    }

    /**
     * Gets the value of the filtercoefficientRsrq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiltercoefficientRsrq() {
        return filtercoefficientRsrq;
    }

    /**
     * Sets the value of the filtercoefficientRsrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiltercoefficientRsrq(JAXBElement<String> value) {
        this.filtercoefficientRsrq = value;
    }

    /**
     * Gets the value of the maxReportCellsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxReportCellsIsDefault() {
        return maxReportCellsIsDefault;
    }

    /**
     * Sets the value of the maxReportCellsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxReportCellsIsDefault(JAXBElement<Boolean> value) {
        this.maxReportCellsIsDefault = value;
    }

    /**
     * Gets the value of the maxReportCells property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxReportCells() {
        return maxReportCells;
    }

    /**
     * Sets the value of the maxReportCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxReportCells(JAXBElement<Integer> value) {
        this.maxReportCells = value;
    }

    /**
     * Gets the value of the reportAmountIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReportAmountIsDefault() {
        return reportAmountIsDefault;
    }

    /**
     * Sets the value of the reportAmountIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReportAmountIsDefault(JAXBElement<Boolean> value) {
        this.reportAmountIsDefault = value;
    }

    /**
     * Gets the value of the reportAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportAmount() {
        return reportAmount;
    }

    /**
     * Sets the value of the reportAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportAmount(JAXBElement<String> value) {
        this.reportAmount = value;
    }

    /**
     * Gets the value of the qosMobilityTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQosMobilityTimerIsDefault() {
        return qosMobilityTimerIsDefault;
    }

    /**
     * Sets the value of the qosMobilityTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQosMobilityTimerIsDefault(Boolean value) {
        this.qosMobilityTimerIsDefault = value;
    }

    /**
     * Gets the value of the qosMobilityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQosMobilityTimer() {
        return qosMobilityTimer;
    }

    /**
     * Sets the value of the qosMobilityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQosMobilityTimer(Integer value) {
        this.qosMobilityTimer = value;
    }

}
