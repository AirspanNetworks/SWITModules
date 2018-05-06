
package Netspan.NBI_14_0.API.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteIpThroughputQciWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteIpThroughputQciWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Qci" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ActiveUeDl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ActiveUeUl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IpThroughputKbpsDl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IpThroughputKbpsUl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpTrafficKbpsDl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpTrafficKbpsUl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MacTrafficKbpsDl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MacTrafficKbpsUl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    @XmlElement(name = "Qci", required = true, type = Integer.class, nillable = true)
    protected Integer qci;
    @XmlElement(name = "ActiveUeDl", required = true, type = Integer.class, nillable = true)
    protected Integer activeUeDl;
    @XmlElement(name = "ActiveUeUl", required = true, type = Integer.class, nillable = true)
    protected Integer activeUeUl;
    @XmlElement(name = "IpThroughputKbpsDl", required = true, type = Integer.class, nillable = true)
    protected Integer ipThroughputKbpsDl;
    @XmlElement(name = "IpThroughputKbpsUl", required = true, type = Integer.class, nillable = true)
    protected Integer ipThroughputKbpsUl;
    @XmlElement(name = "PdcpTrafficKbpsDl", required = true, type = Integer.class, nillable = true)
    protected Integer pdcpTrafficKbpsDl;
    @XmlElement(name = "PdcpTrafficKbpsUl", required = true, type = Integer.class, nillable = true)
    protected Integer pdcpTrafficKbpsUl;
    @XmlElement(name = "MacTrafficKbpsDl", required = true, type = Integer.class, nillable = true)
    protected Integer macTrafficKbpsDl;
    @XmlElement(name = "MacTrafficKbpsUl", required = true, type = Integer.class, nillable = true)
    protected Integer macTrafficKbpsUl;

    /**
     * Gets the value of the qci property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQci() {
        return qci;
    }

    /**
     * Sets the value of the qci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQci(Integer value) {
        this.qci = value;
    }

    /**
     * Gets the value of the activeUeDl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActiveUeDl() {
        return activeUeDl;
    }

    /**
     * Sets the value of the activeUeDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActiveUeDl(Integer value) {
        this.activeUeDl = value;
    }

    /**
     * Gets the value of the activeUeUl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActiveUeUl() {
        return activeUeUl;
    }

    /**
     * Sets the value of the activeUeUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActiveUeUl(Integer value) {
        this.activeUeUl = value;
    }

    /**
     * Gets the value of the ipThroughputKbpsDl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpThroughputKbpsDl() {
        return ipThroughputKbpsDl;
    }

    /**
     * Sets the value of the ipThroughputKbpsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpThroughputKbpsDl(Integer value) {
        this.ipThroughputKbpsDl = value;
    }

    /**
     * Gets the value of the ipThroughputKbpsUl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpThroughputKbpsUl() {
        return ipThroughputKbpsUl;
    }

    /**
     * Sets the value of the ipThroughputKbpsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpThroughputKbpsUl(Integer value) {
        this.ipThroughputKbpsUl = value;
    }

    /**
     * Gets the value of the pdcpTrafficKbpsDl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdcpTrafficKbpsDl() {
        return pdcpTrafficKbpsDl;
    }

    /**
     * Sets the value of the pdcpTrafficKbpsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdcpTrafficKbpsDl(Integer value) {
        this.pdcpTrafficKbpsDl = value;
    }

    /**
     * Gets the value of the pdcpTrafficKbpsUl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdcpTrafficKbpsUl() {
        return pdcpTrafficKbpsUl;
    }

    /**
     * Sets the value of the pdcpTrafficKbpsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdcpTrafficKbpsUl(Integer value) {
        this.pdcpTrafficKbpsUl = value;
    }

    /**
     * Gets the value of the macTrafficKbpsDl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMacTrafficKbpsDl() {
        return macTrafficKbpsDl;
    }

    /**
     * Sets the value of the macTrafficKbpsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMacTrafficKbpsDl(Integer value) {
        this.macTrafficKbpsDl = value;
    }

    /**
     * Gets the value of the macTrafficKbpsUl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMacTrafficKbpsUl() {
        return macTrafficKbpsUl;
    }

    /**
     * Sets the value of the macTrafficKbpsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMacTrafficKbpsUl(Integer value) {
        this.macTrafficKbpsUl = value;
    }

}
