
package Netspan.NBI_15_2.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteIpThroughputQciWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteIpThroughputQciWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Qci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActiveUeDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActiveUeUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IpThroughputKbpsDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IpThroughputKbpsUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdcpTrafficKbpsDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdcpTrafficKbpsUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MacTrafficKbpsDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MacTrafficKbpsUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteIpThroughputQciWs", propOrder = {
    "qci",
    "activeUeDl",
    "activeUeUl",
    "ipThroughputKbpsDl",
    "ipThroughputKbpsUl",
    "pdcpTrafficKbpsDl",
    "pdcpTrafficKbpsUl",
    "macTrafficKbpsDl",
    "macTrafficKbpsUl"
})
public class LteIpThroughputQciWs {

    @XmlElementRef(name = "Qci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qci;
    @XmlElementRef(name = "ActiveUeDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> activeUeDl;
    @XmlElementRef(name = "ActiveUeUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> activeUeUl;
    @XmlElementRef(name = "IpThroughputKbpsDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipThroughputKbpsDl;
    @XmlElementRef(name = "IpThroughputKbpsUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipThroughputKbpsUl;
    @XmlElementRef(name = "PdcpTrafficKbpsDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdcpTrafficKbpsDl;
    @XmlElementRef(name = "PdcpTrafficKbpsUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdcpTrafficKbpsUl;
    @XmlElementRef(name = "MacTrafficKbpsDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> macTrafficKbpsDl;
    @XmlElementRef(name = "MacTrafficKbpsUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> macTrafficKbpsUl;

    /**
     * Gets the value of the qci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQci() {
        return qci;
    }

    /**
     * Sets the value of the qci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQci(JAXBElement<Integer> value) {
        this.qci = value;
    }

    /**
     * Gets the value of the activeUeDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActiveUeDl() {
        return activeUeDl;
    }

    /**
     * Sets the value of the activeUeDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActiveUeDl(JAXBElement<Integer> value) {
        this.activeUeDl = value;
    }

    /**
     * Gets the value of the activeUeUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActiveUeUl() {
        return activeUeUl;
    }

    /**
     * Sets the value of the activeUeUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActiveUeUl(JAXBElement<Integer> value) {
        this.activeUeUl = value;
    }

    /**
     * Gets the value of the ipThroughputKbpsDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIpThroughputKbpsDl() {
        return ipThroughputKbpsDl;
    }

    /**
     * Sets the value of the ipThroughputKbpsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIpThroughputKbpsDl(JAXBElement<Integer> value) {
        this.ipThroughputKbpsDl = value;
    }

    /**
     * Gets the value of the ipThroughputKbpsUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIpThroughputKbpsUl() {
        return ipThroughputKbpsUl;
    }

    /**
     * Sets the value of the ipThroughputKbpsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIpThroughputKbpsUl(JAXBElement<Integer> value) {
        this.ipThroughputKbpsUl = value;
    }

    /**
     * Gets the value of the pdcpTrafficKbpsDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdcpTrafficKbpsDl() {
        return pdcpTrafficKbpsDl;
    }

    /**
     * Sets the value of the pdcpTrafficKbpsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdcpTrafficKbpsDl(JAXBElement<Integer> value) {
        this.pdcpTrafficKbpsDl = value;
    }

    /**
     * Gets the value of the pdcpTrafficKbpsUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdcpTrafficKbpsUl() {
        return pdcpTrafficKbpsUl;
    }

    /**
     * Sets the value of the pdcpTrafficKbpsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdcpTrafficKbpsUl(JAXBElement<Integer> value) {
        this.pdcpTrafficKbpsUl = value;
    }

    /**
     * Gets the value of the macTrafficKbpsDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMacTrafficKbpsDl() {
        return macTrafficKbpsDl;
    }

    /**
     * Sets the value of the macTrafficKbpsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMacTrafficKbpsDl(JAXBElement<Integer> value) {
        this.macTrafficKbpsDl = value;
    }

    /**
     * Gets the value of the macTrafficKbpsUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMacTrafficKbpsUl() {
        return macTrafficKbpsUl;
    }

    /**
     * Sets the value of the macTrafficKbpsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMacTrafficKbpsUl(JAXBElement<Integer> value) {
        this.macTrafficKbpsUl = value;
    }

}
