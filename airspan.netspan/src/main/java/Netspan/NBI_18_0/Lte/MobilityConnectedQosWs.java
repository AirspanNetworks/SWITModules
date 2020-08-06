
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityConnectedQosWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedQosWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxReportCellsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxReportCells" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReportAmountIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportAmount" type="{http://Airspan.Netspan.WebServices}MobilityReportAmount" minOccurs="0"/&gt;
 *         &lt;element name="QosBasedMobilityTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QosBasedMobilityTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedQosWs", propOrder = {
    "maxReportCellsIsDefault",
    "maxReportCells",
    "reportAmountIsDefault",
    "reportAmount",
    "qosBasedMobilityTimerIsDefault",
    "qosBasedMobilityTimer"
})
public class MobilityConnectedQosWs {

    @XmlElementRef(name = "MaxReportCellsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxReportCellsIsDefault;
    @XmlElementRef(name = "MaxReportCells", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxReportCells;
    @XmlElementRef(name = "ReportAmountIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reportAmountIsDefault;
    @XmlElementRef(name = "ReportAmount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportAmount;
    @XmlElementRef(name = "QosBasedMobilityTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qosBasedMobilityTimerIsDefault;
    @XmlElementRef(name = "QosBasedMobilityTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qosBasedMobilityTimer;

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
     * Gets the value of the qosBasedMobilityTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQosBasedMobilityTimerIsDefault() {
        return qosBasedMobilityTimerIsDefault;
    }

    /**
     * Sets the value of the qosBasedMobilityTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQosBasedMobilityTimerIsDefault(JAXBElement<Boolean> value) {
        this.qosBasedMobilityTimerIsDefault = value;
    }

    /**
     * Gets the value of the qosBasedMobilityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQosBasedMobilityTimer() {
        return qosBasedMobilityTimer;
    }

    /**
     * Sets the value of the qosBasedMobilityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQosBasedMobilityTimer(JAXBElement<Integer> value) {
        this.qosBasedMobilityTimer = value;
    }

}
