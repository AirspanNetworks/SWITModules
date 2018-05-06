
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellNeighborManagementWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellNeighborManagementWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HoAttemptsThIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HoAttemptsTh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellNeighborManagementWs", propOrder = {
    "hoAttemptsThIsDefault",
    "hoAttemptsTh"
})
public class CellNeighborManagementWs {

    @XmlElementRef(name = "HoAttemptsThIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hoAttemptsThIsDefault;
    @XmlElementRef(name = "HoAttemptsTh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoAttemptsTh;

    /**
     * Gets the value of the hoAttemptsThIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHoAttemptsThIsDefault() {
        return hoAttemptsThIsDefault;
    }

    /**
     * Sets the value of the hoAttemptsThIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHoAttemptsThIsDefault(JAXBElement<Boolean> value) {
        this.hoAttemptsThIsDefault = value;
    }

    /**
     * Gets the value of the hoAttemptsTh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoAttemptsTh() {
        return hoAttemptsTh;
    }

    /**
     * Sets the value of the hoAttemptsTh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoAttemptsTh(JAXBElement<Integer> value) {
        this.hoAttemptsTh = value;
    }

}
