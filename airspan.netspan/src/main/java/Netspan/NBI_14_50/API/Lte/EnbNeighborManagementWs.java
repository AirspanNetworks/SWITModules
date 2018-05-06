
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbNeighborManagementWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbNeighborManagementWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X2GuardPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="X2GuardPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2MaxConnectionsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="X2MaxConnections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbNeighborManagementWs", propOrder = {
    "x2GuardPeriodIsDefault",
    "x2GuardPeriod",
    "x2MaxConnectionsIsDefault",
    "x2MaxConnections"
})
public class EnbNeighborManagementWs {

    @XmlElementRef(name = "X2GuardPeriodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> x2GuardPeriodIsDefault;
    @XmlElementRef(name = "X2GuardPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2GuardPeriod;
    @XmlElementRef(name = "X2MaxConnectionsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> x2MaxConnectionsIsDefault;
    @XmlElementRef(name = "X2MaxConnections", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2MaxConnections;

    /**
     * Gets the value of the x2GuardPeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getX2GuardPeriodIsDefault() {
        return x2GuardPeriodIsDefault;
    }

    /**
     * Sets the value of the x2GuardPeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setX2GuardPeriodIsDefault(JAXBElement<Boolean> value) {
        this.x2GuardPeriodIsDefault = value;
    }

    /**
     * Gets the value of the x2GuardPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2GuardPeriod() {
        return x2GuardPeriod;
    }

    /**
     * Sets the value of the x2GuardPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2GuardPeriod(JAXBElement<Integer> value) {
        this.x2GuardPeriod = value;
    }

    /**
     * Gets the value of the x2MaxConnectionsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getX2MaxConnectionsIsDefault() {
        return x2MaxConnectionsIsDefault;
    }

    /**
     * Sets the value of the x2MaxConnectionsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setX2MaxConnectionsIsDefault(JAXBElement<Boolean> value) {
        this.x2MaxConnectionsIsDefault = value;
    }

    /**
     * Gets the value of the x2MaxConnections property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2MaxConnections() {
        return x2MaxConnections;
    }

    /**
     * Sets the value of the x2MaxConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2MaxConnections(JAXBElement<Integer> value) {
        this.x2MaxConnections = value;
    }

}
