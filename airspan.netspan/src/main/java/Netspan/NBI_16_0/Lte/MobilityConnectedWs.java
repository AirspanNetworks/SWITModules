
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for MobilityConnectedWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PresenceAntennaPort1IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PresenceAntennaPort1" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="NeighCellConfigIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NeighCellConfig" type="{http://Airspan.Netspan.WebServices}NeighbourCellConfig" minOccurs="0"/>
 *         &lt;element name="MaxReportCellsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxReportCells" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReportAmountIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReportAmount" type="{http://Airspan.Netspan.WebServices}MobilityReportAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedWs", propOrder = {
    "presenceAntennaPort1IsDefault",
    "presenceAntennaPort1",
    "neighCellConfigIsDefault",
    "neighCellConfig",
    "maxReportCellsIsDefault",
    "maxReportCells",
    "reportAmountIsDefault",
    "reportAmount"
})
@XmlSeeAlso({
    MobilityConnectedInterWs.class
})
public class MobilityConnectedWs {

    @XmlElementRef(name = "PresenceAntennaPort1IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> presenceAntennaPort1IsDefault;
    @XmlElementRef(name = "PresenceAntennaPort1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> presenceAntennaPort1;
    @XmlElementRef(name = "NeighCellConfigIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> neighCellConfigIsDefault;
    @XmlElementRef(name = "NeighCellConfig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neighCellConfig;
    @XmlElementRef(name = "MaxReportCellsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxReportCellsIsDefault;
    @XmlElementRef(name = "MaxReportCells", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxReportCells;
    @XmlElementRef(name = "ReportAmountIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reportAmountIsDefault;
    @XmlElementRef(name = "ReportAmount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportAmount;

    /**
     * Gets the value of the presenceAntennaPort1IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPresenceAntennaPort1IsDefault() {
        return presenceAntennaPort1IsDefault;
    }

    /**
     * Sets the value of the presenceAntennaPort1IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPresenceAntennaPort1IsDefault(JAXBElement<Boolean> value) {
        this.presenceAntennaPort1IsDefault = value;
    }

    /**
     * Gets the value of the presenceAntennaPort1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getPresenceAntennaPort1() {
        return presenceAntennaPort1;
    }

    /**
     * Sets the value of the presenceAntennaPort1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setPresenceAntennaPort1(JAXBElement<EnabledDisabledStates> value) {
        this.presenceAntennaPort1 = value;
    }

    /**
     * Gets the value of the neighCellConfigIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNeighCellConfigIsDefault() {
        return neighCellConfigIsDefault;
    }

    /**
     * Sets the value of the neighCellConfigIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNeighCellConfigIsDefault(JAXBElement<Boolean> value) {
        this.neighCellConfigIsDefault = value;
    }

    /**
     * Gets the value of the neighCellConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeighCellConfig() {
        return neighCellConfig;
    }

    /**
     * Sets the value of the neighCellConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeighCellConfig(JAXBElement<String> value) {
        this.neighCellConfig = value;
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

}
