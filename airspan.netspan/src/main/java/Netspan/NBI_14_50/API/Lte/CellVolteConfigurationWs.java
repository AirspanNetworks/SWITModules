
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellVolteConfigurationWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellVolteConfigurationWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DlaAckStepDownFactorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DlaAckStepDownFactor" type="{http://Airspan.Netspan.WebServices}DlAck" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellVolteConfigurationWs", propOrder = {
    "dlaAckStepDownFactorIsDefault",
    "dlaAckStepDownFactor"
})
public class CellVolteConfigurationWs {

    @XmlElementRef(name = "DlaAckStepDownFactorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dlaAckStepDownFactorIsDefault;
    @XmlElementRef(name = "DlaAckStepDownFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dlaAckStepDownFactor;

    /**
     * Gets the value of the dlaAckStepDownFactorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDlaAckStepDownFactorIsDefault() {
        return dlaAckStepDownFactorIsDefault;
    }

    /**
     * Sets the value of the dlaAckStepDownFactorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDlaAckStepDownFactorIsDefault(JAXBElement<Boolean> value) {
        this.dlaAckStepDownFactorIsDefault = value;
    }

    /**
     * Gets the value of the dlaAckStepDownFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDlaAckStepDownFactor() {
        return dlaAckStepDownFactor;
    }

    /**
     * Sets the value of the dlaAckStepDownFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDlaAckStepDownFactor(JAXBElement<String> value) {
        this.dlaAckStepDownFactor = value;
    }

}
