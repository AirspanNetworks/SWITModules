
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSUeTraceEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSUeTraceEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TceIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TcePort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TceUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TcePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSUeTraceEntry", propOrder = {
    "tceName",
    "tceId",
    "tceIpAddress",
    "tcePort",
    "tceUser",
    "tcePassword"
})
public class WSUeTraceEntry {

    @XmlElement(name = "TceName")
    protected String tceName;
    @XmlElementRef(name = "TceId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tceId;
    @XmlElement(name = "TceIpAddress")
    protected String tceIpAddress;
    @XmlElementRef(name = "TcePort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tcePort;
    @XmlElement(name = "TceUser")
    protected String tceUser;
    @XmlElement(name = "TcePassword")
    protected String tcePassword;

    /**
     * Gets the value of the tceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTceName() {
        return tceName;
    }

    /**
     * Sets the value of the tceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTceName(String value) {
        this.tceName = value;
    }

    /**
     * Gets the value of the tceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTceId() {
        return tceId;
    }

    /**
     * Sets the value of the tceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTceId(JAXBElement<Integer> value) {
        this.tceId = value;
    }

    /**
     * Gets the value of the tceIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTceIpAddress() {
        return tceIpAddress;
    }

    /**
     * Sets the value of the tceIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTceIpAddress(String value) {
        this.tceIpAddress = value;
    }

    /**
     * Gets the value of the tcePort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTcePort() {
        return tcePort;
    }

    /**
     * Sets the value of the tcePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTcePort(JAXBElement<Integer> value) {
        this.tcePort = value;
    }

    /**
     * Gets the value of the tceUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTceUser() {
        return tceUser;
    }

    /**
     * Sets the value of the tceUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTceUser(String value) {
        this.tceUser = value;
    }

    /**
     * Gets the value of the tcePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcePassword() {
        return tcePassword;
    }

    /**
     * Sets the value of the tcePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcePassword(String value) {
        this.tcePassword = value;
    }

}
