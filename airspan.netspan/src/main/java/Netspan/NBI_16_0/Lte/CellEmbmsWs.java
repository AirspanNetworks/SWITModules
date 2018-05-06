
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellEmbmsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellEmbmsWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationOffsetIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NotificationOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NotificationRepetitionCoeffIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NotificationRepetitionCoeff" type="{http://Airspan.Netspan.WebServices}CoeffType" minOccurs="0"/>
 *         &lt;element name="NotificationSfIndexIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NotificationSfIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangeNotificationIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChangeNotificationInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellEmbmsWs", propOrder = {
    "notificationOffsetIsDefault",
    "notificationOffset",
    "notificationRepetitionCoeffIsDefault",
    "notificationRepetitionCoeff",
    "notificationSfIndexIsDefault",
    "notificationSfIndex",
    "changeNotificationIntervalIsDefault",
    "changeNotificationInterval"
})
public class CellEmbmsWs {

    @XmlElementRef(name = "NotificationOffsetIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> notificationOffsetIsDefault;
    @XmlElementRef(name = "NotificationOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> notificationOffset;
    @XmlElementRef(name = "NotificationRepetitionCoeffIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> notificationRepetitionCoeffIsDefault;
    @XmlElementRef(name = "NotificationRepetitionCoeff", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationRepetitionCoeff;
    @XmlElementRef(name = "NotificationSfIndexIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> notificationSfIndexIsDefault;
    @XmlElementRef(name = "NotificationSfIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> notificationSfIndex;
    @XmlElementRef(name = "ChangeNotificationIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> changeNotificationIntervalIsDefault;
    @XmlElementRef(name = "ChangeNotificationInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> changeNotificationInterval;

    /**
     * Gets the value of the notificationOffsetIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNotificationOffsetIsDefault() {
        return notificationOffsetIsDefault;
    }

    /**
     * Sets the value of the notificationOffsetIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNotificationOffsetIsDefault(JAXBElement<Boolean> value) {
        this.notificationOffsetIsDefault = value;
    }

    /**
     * Gets the value of the notificationOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNotificationOffset() {
        return notificationOffset;
    }

    /**
     * Sets the value of the notificationOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNotificationOffset(JAXBElement<Integer> value) {
        this.notificationOffset = value;
    }

    /**
     * Gets the value of the notificationRepetitionCoeffIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNotificationRepetitionCoeffIsDefault() {
        return notificationRepetitionCoeffIsDefault;
    }

    /**
     * Sets the value of the notificationRepetitionCoeffIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNotificationRepetitionCoeffIsDefault(JAXBElement<Boolean> value) {
        this.notificationRepetitionCoeffIsDefault = value;
    }

    /**
     * Gets the value of the notificationRepetitionCoeff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationRepetitionCoeff() {
        return notificationRepetitionCoeff;
    }

    /**
     * Sets the value of the notificationRepetitionCoeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationRepetitionCoeff(JAXBElement<String> value) {
        this.notificationRepetitionCoeff = value;
    }

    /**
     * Gets the value of the notificationSfIndexIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNotificationSfIndexIsDefault() {
        return notificationSfIndexIsDefault;
    }

    /**
     * Sets the value of the notificationSfIndexIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNotificationSfIndexIsDefault(JAXBElement<Boolean> value) {
        this.notificationSfIndexIsDefault = value;
    }

    /**
     * Gets the value of the notificationSfIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNotificationSfIndex() {
        return notificationSfIndex;
    }

    /**
     * Sets the value of the notificationSfIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNotificationSfIndex(JAXBElement<Integer> value) {
        this.notificationSfIndex = value;
    }

    /**
     * Gets the value of the changeNotificationIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getChangeNotificationIntervalIsDefault() {
        return changeNotificationIntervalIsDefault;
    }

    /**
     * Sets the value of the changeNotificationIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setChangeNotificationIntervalIsDefault(JAXBElement<Boolean> value) {
        this.changeNotificationIntervalIsDefault = value;
    }

    /**
     * Gets the value of the changeNotificationInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChangeNotificationInterval() {
        return changeNotificationInterval;
    }

    /**
     * Sets the value of the changeNotificationInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChangeNotificationInterval(JAXBElement<Integer> value) {
        this.changeNotificationInterval = value;
    }

}
