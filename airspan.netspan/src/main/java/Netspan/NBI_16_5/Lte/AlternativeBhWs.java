
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for AlternativeBhWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternativeBhWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutdoorSectorOperationIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OutdoorSectorOperation" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeBhWs", propOrder = {
    "outdoorSectorOperationIsDefault",
    "outdoorSectorOperation"
})
public class AlternativeBhWs {

    @XmlElementRef(name = "OutdoorSectorOperationIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> outdoorSectorOperationIsDefault;
    @XmlElementRef(name = "OutdoorSectorOperation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> outdoorSectorOperation;

    /**
     * Gets the value of the outdoorSectorOperationIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOutdoorSectorOperationIsDefault() {
        return outdoorSectorOperationIsDefault;
    }

    /**
     * Sets the value of the outdoorSectorOperationIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOutdoorSectorOperationIsDefault(JAXBElement<Boolean> value) {
        this.outdoorSectorOperationIsDefault = value;
    }

    /**
     * Gets the value of the outdoorSectorOperation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getOutdoorSectorOperation() {
        return outdoorSectorOperation;
    }

    /**
     * Sets the value of the outdoorSectorOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setOutdoorSectorOperation(JAXBElement<EnabledStates> value) {
        this.outdoorSectorOperation = value;
    }

}
