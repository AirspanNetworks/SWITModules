
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionControlWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionControlWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="T300IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="T300" type="{http://Airspan.Netspan.WebServices}RrcT300" minOccurs="0"/&gt;
 *         &lt;element name="T301IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="T301" type="{http://Airspan.Netspan.WebServices}RrcT300" minOccurs="0"/&gt;
 *         &lt;element name="T304IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="T304" type="{http://Airspan.Netspan.WebServices}RrcT304" minOccurs="0"/&gt;
 *         &lt;element name="T310IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="T310" type="{http://Airspan.Netspan.WebServices}RrcT310" minOccurs="0"/&gt;
 *         &lt;element name="T311IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="T311" type="{http://Airspan.Netspan.WebServices}RrcT311" minOccurs="0"/&gt;
 *         &lt;element name="T320IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="T320" type="{http://Airspan.Netspan.WebServices}RrcT320" minOccurs="0"/&gt;
 *         &lt;element name="N310IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="N310" type="{http://Airspan.Netspan.WebServices}RrcN310" minOccurs="0"/&gt;
 *         &lt;element name="N311IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="N311" type="{http://Airspan.Netspan.WebServices}RrcN311" minOccurs="0"/&gt;
 *         &lt;element name="RrcProcedureTimeoutIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcProcedureTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionControlWs", propOrder = {
    "t300IsDefault",
    "t300",
    "t301IsDefault",
    "t301",
    "t304IsDefault",
    "t304",
    "t310IsDefault",
    "t310",
    "t311IsDefault",
    "t311",
    "t320IsDefault",
    "t320",
    "n310IsDefault",
    "n310",
    "n311IsDefault",
    "n311",
    "rrcProcedureTimeoutIsDefault",
    "rrcProcedureTimeout"
})
public class ConnectionControlWs {

    @XmlElementRef(name = "T300IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> t300IsDefault;
    @XmlElementRef(name = "T300", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> t300;
    @XmlElementRef(name = "T301IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> t301IsDefault;
    @XmlElementRef(name = "T301", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> t301;
    @XmlElementRef(name = "T304IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> t304IsDefault;
    @XmlElementRef(name = "T304", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> t304;
    @XmlElementRef(name = "T310IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> t310IsDefault;
    @XmlElementRef(name = "T310", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> t310;
    @XmlElementRef(name = "T311IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> t311IsDefault;
    @XmlElementRef(name = "T311", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> t311;
    @XmlElementRef(name = "T320IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> t320IsDefault;
    @XmlElementRef(name = "T320", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> t320;
    @XmlElementRef(name = "N310IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> n310IsDefault;
    @XmlElementRef(name = "N310", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> n310;
    @XmlElementRef(name = "N311IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> n311IsDefault;
    @XmlElementRef(name = "N311", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> n311;
    @XmlElementRef(name = "RrcProcedureTimeoutIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcProcedureTimeoutIsDefault;
    @XmlElementRef(name = "RrcProcedureTimeout", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcProcedureTimeout;

    /**
     * Gets the value of the t300IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getT300IsDefault() {
        return t300IsDefault;
    }

    /**
     * Sets the value of the t300IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setT300IsDefault(JAXBElement<Boolean> value) {
        this.t300IsDefault = value;
    }

    /**
     * Gets the value of the t300 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getT300() {
        return t300;
    }

    /**
     * Sets the value of the t300 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setT300(JAXBElement<String> value) {
        this.t300 = value;
    }

    /**
     * Gets the value of the t301IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getT301IsDefault() {
        return t301IsDefault;
    }

    /**
     * Sets the value of the t301IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setT301IsDefault(JAXBElement<Boolean> value) {
        this.t301IsDefault = value;
    }

    /**
     * Gets the value of the t301 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getT301() {
        return t301;
    }

    /**
     * Sets the value of the t301 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setT301(JAXBElement<String> value) {
        this.t301 = value;
    }

    /**
     * Gets the value of the t304IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getT304IsDefault() {
        return t304IsDefault;
    }

    /**
     * Sets the value of the t304IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setT304IsDefault(JAXBElement<Boolean> value) {
        this.t304IsDefault = value;
    }

    /**
     * Gets the value of the t304 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getT304() {
        return t304;
    }

    /**
     * Sets the value of the t304 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setT304(JAXBElement<String> value) {
        this.t304 = value;
    }

    /**
     * Gets the value of the t310IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getT310IsDefault() {
        return t310IsDefault;
    }

    /**
     * Sets the value of the t310IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setT310IsDefault(JAXBElement<Boolean> value) {
        this.t310IsDefault = value;
    }

    /**
     * Gets the value of the t310 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getT310() {
        return t310;
    }

    /**
     * Sets the value of the t310 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setT310(JAXBElement<String> value) {
        this.t310 = value;
    }

    /**
     * Gets the value of the t311IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getT311IsDefault() {
        return t311IsDefault;
    }

    /**
     * Sets the value of the t311IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setT311IsDefault(JAXBElement<Boolean> value) {
        this.t311IsDefault = value;
    }

    /**
     * Gets the value of the t311 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getT311() {
        return t311;
    }

    /**
     * Sets the value of the t311 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setT311(JAXBElement<String> value) {
        this.t311 = value;
    }

    /**
     * Gets the value of the t320IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getT320IsDefault() {
        return t320IsDefault;
    }

    /**
     * Sets the value of the t320IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setT320IsDefault(JAXBElement<Boolean> value) {
        this.t320IsDefault = value;
    }

    /**
     * Gets the value of the t320 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getT320() {
        return t320;
    }

    /**
     * Sets the value of the t320 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setT320(JAXBElement<String> value) {
        this.t320 = value;
    }

    /**
     * Gets the value of the n310IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getN310IsDefault() {
        return n310IsDefault;
    }

    /**
     * Sets the value of the n310IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setN310IsDefault(JAXBElement<Boolean> value) {
        this.n310IsDefault = value;
    }

    /**
     * Gets the value of the n310 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getN310() {
        return n310;
    }

    /**
     * Sets the value of the n310 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setN310(JAXBElement<String> value) {
        this.n310 = value;
    }

    /**
     * Gets the value of the n311IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getN311IsDefault() {
        return n311IsDefault;
    }

    /**
     * Sets the value of the n311IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setN311IsDefault(JAXBElement<Boolean> value) {
        this.n311IsDefault = value;
    }

    /**
     * Gets the value of the n311 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getN311() {
        return n311;
    }

    /**
     * Sets the value of the n311 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setN311(JAXBElement<String> value) {
        this.n311 = value;
    }

    /**
     * Gets the value of the rrcProcedureTimeoutIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcProcedureTimeoutIsDefault() {
        return rrcProcedureTimeoutIsDefault;
    }

    /**
     * Sets the value of the rrcProcedureTimeoutIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcProcedureTimeoutIsDefault(JAXBElement<Boolean> value) {
        this.rrcProcedureTimeoutIsDefault = value;
    }

    /**
     * Gets the value of the rrcProcedureTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcProcedureTimeout() {
        return rrcProcedureTimeout;
    }

    /**
     * Sets the value of the rrcProcedureTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcProcedureTimeout(JAXBElement<Integer> value) {
        this.rrcProcedureTimeout = value;
    }

}
