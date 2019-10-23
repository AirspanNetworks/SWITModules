
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteCSonEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCSonEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsCSonConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CSonIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CSonServerPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCSonEntryWs", propOrder = {
    "isCSonConfigured",
    "cSonIpAddress",
    "cSonServerPort"
})
public class LteCSonEntryWs {

    @XmlElementRef(name = "IsCSonConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCSonConfigured;
    @XmlElement(name = "CSonIpAddress")
    protected String cSonIpAddress;
    @XmlElementRef(name = "CSonServerPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cSonServerPort;

    /**
     * Gets the value of the isCSonConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCSonConfigured() {
        return isCSonConfigured;
    }

    /**
     * Sets the value of the isCSonConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCSonConfigured(JAXBElement<Boolean> value) {
        this.isCSonConfigured = value;
    }

    /**
     * Gets the value of the cSonIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSonIpAddress() {
        return cSonIpAddress;
    }

    /**
     * Sets the value of the cSonIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSonIpAddress(String value) {
        this.cSonIpAddress = value;
    }

    /**
     * Gets the value of the cSonServerPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCSonServerPort() {
        return cSonServerPort;
    }

    /**
     * Sets the value of the cSonServerPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCSonServerPort(JAXBElement<Integer> value) {
        this.cSonServerPort = value;
    }

}
