
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsonMroWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EsonMroWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HoReportEvaluationTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HoReportEvaluationTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoKpiReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HoKpiReportInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsonMroWs", propOrder = {
    "hoReportEvaluationTimerIsDefault",
    "hoReportEvaluationTimer",
    "hoKpiReportIntervalIsDefault",
    "hoKpiReportInterval"
})
public class EsonMroWs {

    @XmlElementRef(name = "HoReportEvaluationTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hoReportEvaluationTimerIsDefault;
    @XmlElementRef(name = "HoReportEvaluationTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoReportEvaluationTimer;
    @XmlElementRef(name = "HoKpiReportIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hoKpiReportIntervalIsDefault;
    @XmlElementRef(name = "HoKpiReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoKpiReportInterval;

    /**
     * Gets the value of the hoReportEvaluationTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHoReportEvaluationTimerIsDefault() {
        return hoReportEvaluationTimerIsDefault;
    }

    /**
     * Sets the value of the hoReportEvaluationTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHoReportEvaluationTimerIsDefault(JAXBElement<Boolean> value) {
        this.hoReportEvaluationTimerIsDefault = value;
    }

    /**
     * Gets the value of the hoReportEvaluationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoReportEvaluationTimer() {
        return hoReportEvaluationTimer;
    }

    /**
     * Sets the value of the hoReportEvaluationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoReportEvaluationTimer(JAXBElement<Integer> value) {
        this.hoReportEvaluationTimer = value;
    }

    /**
     * Gets the value of the hoKpiReportIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHoKpiReportIntervalIsDefault() {
        return hoKpiReportIntervalIsDefault;
    }

    /**
     * Sets the value of the hoKpiReportIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHoKpiReportIntervalIsDefault(JAXBElement<Boolean> value) {
        this.hoKpiReportIntervalIsDefault = value;
    }

    /**
     * Gets the value of the hoKpiReportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoKpiReportInterval() {
        return hoKpiReportInterval;
    }

    /**
     * Sets the value of the hoKpiReportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoKpiReportInterval(JAXBElement<Integer> value) {
        this.hoKpiReportInterval = value;
    }

}
