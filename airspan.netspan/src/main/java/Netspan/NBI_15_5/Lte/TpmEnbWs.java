
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for TpmEnbWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpmEnbWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MroMetricIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MroMetric" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="NlPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NlPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpmEnbWs", propOrder = {
    "mroMetricIsDefault",
    "mroMetric",
    "nlPeriodIsDefault",
    "nlPeriod"
})
public class TpmEnbWs {

    @XmlElementRef(name = "MroMetricIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mroMetricIsDefault;
    @XmlElementRef(name = "MroMetric", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> mroMetric;
    @XmlElementRef(name = "NlPeriodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlPeriodIsDefault;
    @XmlElementRef(name = "NlPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlPeriod;

    /**
     * Gets the value of the mroMetricIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMroMetricIsDefault() {
        return mroMetricIsDefault;
    }

    /**
     * Sets the value of the mroMetricIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMroMetricIsDefault(JAXBElement<Boolean> value) {
        this.mroMetricIsDefault = value;
    }

    /**
     * Gets the value of the mroMetric property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getMroMetric() {
        return mroMetric;
    }

    /**
     * Sets the value of the mroMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setMroMetric(JAXBElement<EnabledDisabledStates> value) {
        this.mroMetric = value;
    }

    /**
     * Gets the value of the nlPeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlPeriodIsDefault() {
        return nlPeriodIsDefault;
    }

    /**
     * Sets the value of the nlPeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlPeriodIsDefault(JAXBElement<Boolean> value) {
        this.nlPeriodIsDefault = value;
    }

    /**
     * Gets the value of the nlPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlPeriod() {
        return nlPeriod;
    }

    /**
     * Sets the value of the nlPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlPeriod(JAXBElement<Integer> value) {
        this.nlPeriod = value;
    }

}
