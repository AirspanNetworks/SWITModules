
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftFreqReuseWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoftFreqReuseWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="McsHysteresisIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="McsHysteresis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PaCellCenterUesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaCellCenterUes" type="{http://Airspan.Netspan.WebServices}PaHysteresis" minOccurs="0"/&gt;
 *         &lt;element name="PaCellEdgeUesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaCellEdgeUes" type="{http://Airspan.Netspan.WebServices}PaHysteresis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftFreqReuseWs", propOrder = {
    "mcsHysteresisIsDefault",
    "mcsHysteresis",
    "paCellCenterUesIsDefault",
    "paCellCenterUes",
    "paCellEdgeUesIsDefault",
    "paCellEdgeUes"
})
public class SoftFreqReuseWs {

    @XmlElementRef(name = "McsHysteresisIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mcsHysteresisIsDefault;
    @XmlElementRef(name = "McsHysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mcsHysteresis;
    @XmlElementRef(name = "PaCellCenterUesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> paCellCenterUesIsDefault;
    @XmlElementRef(name = "PaCellCenterUes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paCellCenterUes;
    @XmlElementRef(name = "PaCellEdgeUesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> paCellEdgeUesIsDefault;
    @XmlElementRef(name = "PaCellEdgeUes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paCellEdgeUes;

    /**
     * Gets the value of the mcsHysteresisIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMcsHysteresisIsDefault() {
        return mcsHysteresisIsDefault;
    }

    /**
     * Sets the value of the mcsHysteresisIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMcsHysteresisIsDefault(JAXBElement<Boolean> value) {
        this.mcsHysteresisIsDefault = value;
    }

    /**
     * Gets the value of the mcsHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMcsHysteresis() {
        return mcsHysteresis;
    }

    /**
     * Sets the value of the mcsHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMcsHysteresis(JAXBElement<Integer> value) {
        this.mcsHysteresis = value;
    }

    /**
     * Gets the value of the paCellCenterUesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPaCellCenterUesIsDefault() {
        return paCellCenterUesIsDefault;
    }

    /**
     * Sets the value of the paCellCenterUesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPaCellCenterUesIsDefault(JAXBElement<Boolean> value) {
        this.paCellCenterUesIsDefault = value;
    }

    /**
     * Gets the value of the paCellCenterUes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaCellCenterUes() {
        return paCellCenterUes;
    }

    /**
     * Sets the value of the paCellCenterUes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaCellCenterUes(JAXBElement<String> value) {
        this.paCellCenterUes = value;
    }

    /**
     * Gets the value of the paCellEdgeUesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPaCellEdgeUesIsDefault() {
        return paCellEdgeUesIsDefault;
    }

    /**
     * Sets the value of the paCellEdgeUesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPaCellEdgeUesIsDefault(JAXBElement<Boolean> value) {
        this.paCellEdgeUesIsDefault = value;
    }

    /**
     * Gets the value of the paCellEdgeUes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaCellEdgeUes() {
        return paCellEdgeUes;
    }

    /**
     * Sets the value of the paCellEdgeUes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaCellEdgeUes(JAXBElement<String> value) {
        this.paCellEdgeUes = value;
    }

}
