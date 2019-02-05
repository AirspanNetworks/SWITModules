
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for SynchronizationWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchronizationWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WimaxCoexistenceFrameShiftNsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WimaxCoexistenceFrameShiftNs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastUlSymSuppressionIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastUlSymSuppression" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizationWs", propOrder = {
    "wimaxCoexistenceFrameShiftNsIsDefault",
    "wimaxCoexistenceFrameShiftNs",
    "lastUlSymSuppressionIsDefault",
    "lastUlSymSuppression"
})
public class SynchronizationWs {

    @XmlElementRef(name = "WimaxCoexistenceFrameShiftNsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> wimaxCoexistenceFrameShiftNsIsDefault;
    @XmlElementRef(name = "WimaxCoexistenceFrameShiftNs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wimaxCoexistenceFrameShiftNs;
    @XmlElementRef(name = "LastUlSymSuppressionIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> lastUlSymSuppressionIsDefault;
    @XmlElementRef(name = "LastUlSymSuppression", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> lastUlSymSuppression;

    /**
     * Gets the value of the wimaxCoexistenceFrameShiftNsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWimaxCoexistenceFrameShiftNsIsDefault() {
        return wimaxCoexistenceFrameShiftNsIsDefault;
    }

    /**
     * Sets the value of the wimaxCoexistenceFrameShiftNsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWimaxCoexistenceFrameShiftNsIsDefault(JAXBElement<Boolean> value) {
        this.wimaxCoexistenceFrameShiftNsIsDefault = value;
    }

    /**
     * Gets the value of the wimaxCoexistenceFrameShiftNs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWimaxCoexistenceFrameShiftNs() {
        return wimaxCoexistenceFrameShiftNs;
    }

    /**
     * Sets the value of the wimaxCoexistenceFrameShiftNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWimaxCoexistenceFrameShiftNs(JAXBElement<Integer> value) {
        this.wimaxCoexistenceFrameShiftNs = value;
    }

    /**
     * Gets the value of the lastUlSymSuppressionIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLastUlSymSuppressionIsDefault() {
        return lastUlSymSuppressionIsDefault;
    }

    /**
     * Sets the value of the lastUlSymSuppressionIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLastUlSymSuppressionIsDefault(JAXBElement<Boolean> value) {
        this.lastUlSymSuppressionIsDefault = value;
    }

    /**
     * Gets the value of the lastUlSymSuppression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getLastUlSymSuppression() {
        return lastUlSymSuppression;
    }

    /**
     * Sets the value of the lastUlSymSuppression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setLastUlSymSuppression(JAXBElement<EnabledStates> value) {
        this.lastUlSymSuppression = value;
    }

}
