
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsonWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EsonWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EsonConnectionRetryTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EsonConnectionRetryTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConnectionLostMaxRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConnectionLostMaxRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsonWs", propOrder = {
    "esonConnectionRetryTimerIsDefault",
    "esonConnectionRetryTimer",
    "connectionLostMaxRetriesIsDefault",
    "connectionLostMaxRetries"
})
public class EsonWs {

    @XmlElementRef(name = "EsonConnectionRetryTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> esonConnectionRetryTimerIsDefault;
    @XmlElementRef(name = "EsonConnectionRetryTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> esonConnectionRetryTimer;
    @XmlElementRef(name = "ConnectionLostMaxRetriesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> connectionLostMaxRetriesIsDefault;
    @XmlElementRef(name = "ConnectionLostMaxRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectionLostMaxRetries;

    /**
     * Gets the value of the esonConnectionRetryTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEsonConnectionRetryTimerIsDefault() {
        return esonConnectionRetryTimerIsDefault;
    }

    /**
     * Sets the value of the esonConnectionRetryTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEsonConnectionRetryTimerIsDefault(JAXBElement<Boolean> value) {
        this.esonConnectionRetryTimerIsDefault = value;
    }

    /**
     * Gets the value of the esonConnectionRetryTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEsonConnectionRetryTimer() {
        return esonConnectionRetryTimer;
    }

    /**
     * Sets the value of the esonConnectionRetryTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEsonConnectionRetryTimer(JAXBElement<Integer> value) {
        this.esonConnectionRetryTimer = value;
    }

    /**
     * Gets the value of the connectionLostMaxRetriesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getConnectionLostMaxRetriesIsDefault() {
        return connectionLostMaxRetriesIsDefault;
    }

    /**
     * Sets the value of the connectionLostMaxRetriesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setConnectionLostMaxRetriesIsDefault(JAXBElement<Boolean> value) {
        this.connectionLostMaxRetriesIsDefault = value;
    }

    /**
     * Gets the value of the connectionLostMaxRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectionLostMaxRetries() {
        return connectionLostMaxRetries;
    }

    /**
     * Sets the value of the connectionLostMaxRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectionLostMaxRetries(JAXBElement<Integer> value) {
        this.connectionLostMaxRetries = value;
    }

}
