
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronisationWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchronisationWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WimaxCoexistenceFrameShiftIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WimaxCoexistenceFrameShift" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronisationWs", propOrder = {
    "wimaxCoexistenceFrameShiftIsDefault",
    "wimaxCoexistenceFrameShift"
})
public class SynchronisationWs {

    @XmlElementRef(name = "WimaxCoexistenceFrameShiftIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> wimaxCoexistenceFrameShiftIsDefault;
    @XmlElementRef(name = "WimaxCoexistenceFrameShift", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wimaxCoexistenceFrameShift;

    /**
     * Gets the value of the wimaxCoexistenceFrameShiftIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWimaxCoexistenceFrameShiftIsDefault() {
        return wimaxCoexistenceFrameShiftIsDefault;
    }

    /**
     * Sets the value of the wimaxCoexistenceFrameShiftIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWimaxCoexistenceFrameShiftIsDefault(JAXBElement<Boolean> value) {
        this.wimaxCoexistenceFrameShiftIsDefault = value;
    }

    /**
     * Gets the value of the wimaxCoexistenceFrameShift property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWimaxCoexistenceFrameShift() {
        return wimaxCoexistenceFrameShift;
    }

    /**
     * Sets the value of the wimaxCoexistenceFrameShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWimaxCoexistenceFrameShift(JAXBElement<Integer> value) {
        this.wimaxCoexistenceFrameShift = value;
    }

}
