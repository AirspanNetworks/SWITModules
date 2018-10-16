
package Netspan.NBI_16_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EthernetPerPortStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EthernetPerPortStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxEthFrames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxEthBytes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxEthErrFrames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RxEthFrames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RxEthBytes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RxEthErrFrames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxErrorRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxErrorRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxLinkUsage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxLinkUsage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EthernetPerPortStatusWs", propOrder = {
    "portName",
    "txEthFrames",
    "txEthBytes",
    "txEthErrFrames",
    "rxEthFrames",
    "rxEthBytes",
    "rxEthErrFrames",
    "txErrorRate",
    "rxErrorRate",
    "txLinkUsage",
    "rxLinkUsage"
})
public class EthernetPerPortStatusWs {

    @XmlElement(name = "PortName")
    protected String portName;
    @XmlElementRef(name = "TxEthFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txEthFrames;
    @XmlElementRef(name = "TxEthBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txEthBytes;
    @XmlElementRef(name = "TxEthErrFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txEthErrFrames;
    @XmlElementRef(name = "RxEthFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxEthFrames;
    @XmlElementRef(name = "RxEthBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxEthBytes;
    @XmlElementRef(name = "RxEthErrFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxEthErrFrames;
    @XmlElementRef(name = "TxErrorRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txErrorRate;
    @XmlElementRef(name = "RxErrorRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxErrorRate;
    @XmlElementRef(name = "TxLinkUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txLinkUsage;
    @XmlElementRef(name = "RxLinkUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxLinkUsage;

    /**
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortName(String value) {
        this.portName = value;
    }

    /**
     * Gets the value of the txEthFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxEthFrames() {
        return txEthFrames;
    }

    /**
     * Sets the value of the txEthFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxEthFrames(JAXBElement<Integer> value) {
        this.txEthFrames = value;
    }

    /**
     * Gets the value of the txEthBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxEthBytes() {
        return txEthBytes;
    }

    /**
     * Sets the value of the txEthBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxEthBytes(JAXBElement<Integer> value) {
        this.txEthBytes = value;
    }

    /**
     * Gets the value of the txEthErrFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxEthErrFrames() {
        return txEthErrFrames;
    }

    /**
     * Sets the value of the txEthErrFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxEthErrFrames(JAXBElement<Integer> value) {
        this.txEthErrFrames = value;
    }

    /**
     * Gets the value of the rxEthFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxEthFrames() {
        return rxEthFrames;
    }

    /**
     * Sets the value of the rxEthFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxEthFrames(JAXBElement<Integer> value) {
        this.rxEthFrames = value;
    }

    /**
     * Gets the value of the rxEthBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxEthBytes() {
        return rxEthBytes;
    }

    /**
     * Sets the value of the rxEthBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxEthBytes(JAXBElement<Integer> value) {
        this.rxEthBytes = value;
    }

    /**
     * Gets the value of the rxEthErrFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxEthErrFrames() {
        return rxEthErrFrames;
    }

    /**
     * Sets the value of the rxEthErrFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxEthErrFrames(JAXBElement<Integer> value) {
        this.rxEthErrFrames = value;
    }

    /**
     * Gets the value of the txErrorRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxErrorRate() {
        return txErrorRate;
    }

    /**
     * Sets the value of the txErrorRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxErrorRate(JAXBElement<Double> value) {
        this.txErrorRate = value;
    }

    /**
     * Gets the value of the rxErrorRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxErrorRate() {
        return rxErrorRate;
    }

    /**
     * Sets the value of the rxErrorRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxErrorRate(JAXBElement<Double> value) {
        this.rxErrorRate = value;
    }

    /**
     * Gets the value of the txLinkUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxLinkUsage() {
        return txLinkUsage;
    }

    /**
     * Sets the value of the txLinkUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxLinkUsage(JAXBElement<Double> value) {
        this.txLinkUsage = value;
    }

    /**
     * Gets the value of the rxLinkUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxLinkUsage() {
        return rxLinkUsage;
    }

    /**
     * Sets the value of the rxLinkUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxLinkUsage(JAXBElement<Double> value) {
        this.rxLinkUsage = value;
    }

}
